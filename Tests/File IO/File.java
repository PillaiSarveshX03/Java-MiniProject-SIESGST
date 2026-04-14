import java.io.*;
import java.io.BufferedReader;



public class File {
    public static void main(String[] args) throws IOException
    
    {
       BufferedReader reader = new BufferedReader(new FileReader("Movie.txt"));
        
       String line;
       
        int ch = reader.read();
        int mov = ch - '0'; 

        System.out.println(mov);

             System.out.println("Now Showing : \n");

    
        while ((line = reader.readLine()) != null) 
        {  
             System.out.println(line);
        }

       

        reader.close();
    }
}

