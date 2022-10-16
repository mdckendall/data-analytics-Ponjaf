import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;

class Main {
 static void mytext() {
  System.out.println("Press 1 to learn about salary.");
  System.out.println("Press 2 to learn about the job.");
  System.out.println("Press 3 to learn about demand.");
  System.out.println("Press 4 to view current students.");
  System.out.println("Press 5 to quit.");
}
  public static void main(String[] args) throws FileNotFoundException {
    
    int num;
    Scanner sc = new Scanner(System.in);
    
    do{
      
    mytext();
    num = sc.nextInt();

    if(num == 1){
      System.out.println("$98,345 average salary in South Florida!");
    }
    if(num == 2){
      System.out.println("US News - 100 Best Jobs!");
    }
    if(num == 3){
      System.out.println("Top 10 Forbes In-Demand Jobs!");
    }
    if(num == 4){
      System.out.println("Current Students:");
      ArrayList<String> arrayList = new ArrayList<>();
      try{
		    FileReader fr = new FileReader("names.txt");
		    Scanner fileScanner = new Scanner(fr);
        while(fileScanner.hasNextLine()){
          //first,Last
          String [] curLine = fileScanner.nextLine().split(",");
          for(String names : curLine){
            System.out.println(names);
          }
        }
      }
      catch (FileNotFoundException f){ 
      }
    }
  }while(num != 5);
} 
}