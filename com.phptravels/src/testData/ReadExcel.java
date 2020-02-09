//package testData;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.Iterator;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
////import statements
//public class ReadExcel 
//{
//  public static void main(String[] args) 
//  {
//      try
//      {
//          FileInputStream file = new FileInputStream(new File("ExportExcel.xlsx"));
//          XSSFWorkbook workbook = new XSSFWorkbook(file);
//          XSSFSheet sheet = workbook.getSheetAt(0);
//          Iterator<Row> rowIterator = sheet.iterator();
//          while (rowIterator.hasNext()) 
//          {
//              Row row = rowIterator.next();
//              //For each row, iterate through all the columns
//              Iterator<Cell> cellIterator = row.cellIterator();
//               
//              while (cellIterator.hasNext()) 
//              {
//                  Cell cell = cellIterator.next();
//                  //Check the cell type and format accordingly
//                  switch (cell.getCellType()) 
//                  {
//                      case Cell.CELL_TYPE_STRING:
//                          System.out.print(cell.getStringCellValue() + "t");
//                          break;
//                      case Cell.CELL_TYPE_STRING:
//                          System.out.print(cell.getStringCellValue() + "t");
//                          break;
//                  }
//              }
//              System.out.println("value");
//          }
//          file.close();
//      } 
//      catch (Exception e) 
//      {
//          e.printStackTrace();
//      }
//  }
//}