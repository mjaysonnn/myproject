import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFileChooser;

public class CountLine {
        public static void main( String[] args ) throws IOException
        {

           int count=0;

           String line;
            BufferedReader reader = new BufferedReader(new FileReader("/Users/mj/Downloads/Test_noun_frequency.txt"));
            while ((line = reader.readLine()) != null)
            {
           count++;

            }
         
        System.out.println(count);
    }
}