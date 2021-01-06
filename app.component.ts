import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { GridApi, GridOptions, IDatasource, IGetRowsParams } from 'ag-grid-community';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'agGridExamples';
  gridApi: GridApi;

  private filterText;



  columnDefs = [
    {
      field: '-',
      hide: true,
      lockVisible: true,
      filter: "agTextColumnFilter",
      filterParams: {
        newRowsAction: "keep"
      }
    },

    {
      headerName: "Name",
      field: "athlete",
      suppressFilter: true
    },
    {
      headerName: "Status",
      field: "age",
      suppressFilter: true
    },
    {
      headerName: "Country",
      field: "country",
      suppressFilter: true
    }
  ];


  gridOptions: GridOptions = {
    // pagination: true,
    rowBuffer: 0,
    rowSelection: "multiple",
    rowModelType: "infinite",
    cacheOverflowSize: 2,
    maxConcurrentDatasourceRequests: 2,
    infiniteInitialRowCount: 1000,
    // maxBlocksInCache: 2,
    paginationAutoPageSize: false,
    paginationPageSize: 50,
    pagination: false,
    cacheBlockSize: 50
  };




  dataSource: IDatasource = {
    getRows: (params: IGetRowsParams) => {
      console.log('params', params);
      this.apiService().subscribe(data => {
        console.log('this.gridApi.pagination', this.gridApi.paginationGetCurrentPage());
        params.successCallback(
          data,
          101
        );
      })
    }
  }


  constructor(private httpclient: HttpClient) {
  }


  /**
   * This is where you call your server,
   * you can pass your start page and end page
   */
  apiService(): Observable<any> {
    return this.httpclient.get('https://raw.githubusercontent.com/ag-grid/ag-grid/master/packages/ag-grid-docs/src/olympicWinners.json')
  }


  onGridReady(params: any) {
    this.gridApi = params.api;
    this.gridApi.sizeColumnsToFit();

    this.apiService().subscribe(data => {
      var dataSource = {
        rowCount: null,
        getRows: function (params) {
          console.log("asking for " + params.startRow + " to " + params.endRow);
          setTimeout(function () {
            var dataAfterSortingAndFiltering = sortAndFilter(data, params.sortModel, params.filterModel);
            var rowsThisPage = dataAfterSortingAndFiltering.slice(params.startRow, params.endRow);

            // var rowsThisPage = data.slice(params.startRow, params.endRow);
            var lastRow = -1;
            //debugger;
            if (dataAfterSortingAndFiltering.length <= params.endRow) {
              lastRow = dataAfterSortingAndFiltering.length;
            }
          
            params.successCallback(rowsThisPage, lastRow);
          }, 500);
        }
      };
      this.gridApi.setDatasource(dataSource);
    });
  }

  applyFilter() {
    this.gridApi.setFilterModel({ "-": { filter: this.filterText } })
  }

}
function sortAndFilter(allOfTheData, sortModel, filterModel) {
  return sortData(sortModel, filterData(filterModel, allOfTheData));
}

function sortData(sortModel, data) {
  var sortPresent = sortModel && sortModel.length > 0;
  if (!sortPresent) {
    return data;
  }
  var resultOfSort = data.slice();
  resultOfSort.sort(function (a, b) {
    for (var k = 0; k < sortModel.length; k++) {
      var sortColModel = sortModel[k];
      var valueA = a[sortColModel.colId];
      var valueB = b[sortColModel.colId];
      if (valueA == valueB) {
        continue;
      }
      var sortDirection = sortColModel.sort === "asc" ? 1 : -1;
      if (valueA > valueB) {
        return sortDirection;
      } else {
        return sortDirection * -1;
      }
    }
    return 0;
  });
  return resultOfSort;
}

function filterData(filterModel, data) {
 // console.log('filterData', filterModel)
  var filterPresent = filterModel && Object.keys(filterModel).length > 0;
  if (!filterPresent) {
    return data;
  }
  data = data.filter(i => {
    if (Object.keys(i).some(k => i[k] && i[k].toString().toLowerCase().includes(filterModel['-'].filter)))
      return i;
  })
  return data;
}



