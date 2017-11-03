package portfolio;

public class Util {
	
    public static final String FILE_PATH = "C:\\Users\\Alex\\Documents\\Selenium\\GURU\\testData.xls"; 
    public static final String SHEET_NAME = "Data"; 
    public static final String TABLE_NAME = "testData"; 

    public static final int WAIT_TIME = 10; 
					    
    public static final String BASE_URL = "http://www.demo.guru99.com/V4/";
    public static final String PASSWD = "ezyvesu";
    public static final String USER_NAME = "mngr103462";
    
    
    public static final String EXPECT_TITLE = "Welcome To Manager's Page of Guru99 Bank";
    public static final String EXPECT_ERROR = "User or Password is not valid";
    public static final String EXPECT_CSS_MAIN_PAGE = "Manger Id : " + USER_NAME;
    public static final String EXPECT_addNewCustomerPageCheck = "Add New Customer";
      
    public static final String FIREFOX_PATH = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

    
    
//  public static String[][] getDataFromExcel(String xlFilePath,
//			String sheetName, String tableName) throws Exception {
//		String[][] tabArray = null;
//
//		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
//		Sheet sheet = workbook.getSheet(sheetName);
//
//		int startRow, startCol, endRow, endCol, ci, cj;
//
//		Cell tableStart = sheet.findCell(tableName);
//		startRow = tableStart.getRow();
//		startCol = tableStart.getColumn();
//
//		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1,
//				100, 64000, false);
//		endRow = tableEnd.getRow();
//		endCol = tableEnd.getColumn();
//
//		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
//		ci = 0;
//
//		for (int i = startRow + 1; i < endRow; i++, ci++) {
//			cj = 0;
//			for (int j = startCol + 1; j < endCol; j++, cj++) {
//				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
//			}
//		}
//
//		return (tabArray);
//	}


}
