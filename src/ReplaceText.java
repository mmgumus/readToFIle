import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ReplaceText {
    // This is a example to show how to use Scanner and PrinterWriter classes
// and how to use try-with-resources
    public static void main(String[] args) {
        try {
            File file = new File("brand_values.txt");
            Scanner scanner = new Scanner(file);
            String pattern = ".+";
//            while (scanner.hasNextLine()) {
//                String data = scanner.nextLine();
//                System.out.println(data);
//            }
            while(scanner.hasNext()){
                System.out.println(scanner.next(pattern));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }



//
//    public static void replaceTextWithAutoClose() throws FileNotFoundException{
//        File sourceFile = new File("brand_values.txt");
//        File targetFile = new File("output.txt");
//        if(!sourceFile.exists())
//            System.out.println("Source file does not exist");
//        if(targetFile.exists())
//            System.out.println("Target file already exists");
//
//        //try-with resources
//        try(Scanner scanner = new Scanner(sourceFile);          // create Scanner object
//            PrintWriter writer = new PrintWriter(targetFile)){  //create PrintWriter object
//            String line, newLine;
//            while(scanner.hasNext()){           //has next line
//                line = scanner.nextLine();      //read line
//                newLine = line.replaceAll("adidas", "nike");  //modify line
//                writer.println(newLine);        //write line to the target file
//            }
//        }// Scanner and PrintWriter objects closed automatically
//    }

}