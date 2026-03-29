import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;



public class File {
    public static void main(String[] args) throws IOException
    
    {
       BufferedReader reader = new BufferedReader(new FileReader("Seats.txt"));
       

       FileWriter fw = new FileWriter("seatsRev.txt");


        int line;
        
        // System.out.println();
        // System.out.println("Seats Available : \n\n");

        // while ((line = reader.readLine()) != null) 
        // {  
        //      System.out.println(line);
        // } 



       
        int count=0;

         while ((line = reader.read()) != -1) 
        {  
            count++;
            
        } 

       BufferedReader r1 = new BufferedReader(new FileReader("Seats.txt"));

       BufferedReader r2 = new BufferedReader(new FileReader("Seats.txt"));
       BufferedReader r3 = new BufferedReader(new FileReader("Seats.txt"));

        
       String ip="68"; 
        System.out.println(count);

        String tmp="";

        // for(int i = 0; i < count; i++)
        // {
        //     if(Integer.parseInt(r2.read()+r2.read()) == Integer.parseInt(ip))
        //         {
                    
        //             fw.write(" ");
        //             fw.write(" ");
        //             tmp =r1.read();
                    
            
        //         }
        //     else
        //         {
        //             fw.write(r1.read());
                    
        //         }
        
         
        // }
        



        fw.close();
        r1.close();
        r2.close();
        r3.close();
        reader.close();
    }
}

