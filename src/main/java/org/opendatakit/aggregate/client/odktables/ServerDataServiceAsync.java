package org.opendatakit.aggregate.client.odktables;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async server side.
 *
 * @author sudar.sam@gmail.com
 *
 */
public interface ServerDataServiceAsync {

  void getRows(String tableId, AsyncCallback<List<RowClient>> callback);

  void getRow(String tableId, String rowId,
      AsyncCallback<TableContentsClient> callback);

  void createOrUpdateRow(String tableId, String rowId, RowClient row,
      AsyncCallback<RowClient> callback);

  void deleteRow(String tableId, String rowId, AsyncCallback<Void> callback);

  void getColumnNames(String tableId, AsyncCallback<List<String>> callback);

  void getNonMediaFiles(String tableId,
      AsyncCallback<List<FileSummaryClient>> callback);

  void getFileRowInfoColumnNames(AsyncCallback<List<String>> callback);

  void getTableContents(String tableId,
      AsyncCallback<TableContentsClient> callback);

  void getFileInfoContents(String tableId,
      AsyncCallback<TableContentsForFilesClient> callback);

  void deleteTableFile(String tableId, String rowId,
      AsyncCallback<Void> callback);

  void getMedialFilesKey(String tableId, String key,
      AsyncCallback<List<FileSummaryClient>> callback);

}
