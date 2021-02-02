import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

//Main zipcode class
public class ZipCode {
    public static void main(String[] args) throws Exception {
        readFile();
    }

    // Use JFileChooser to select file
    public static void readFile() throws Exception {
        JFileChooser picker = new JFileChooser();
        int files = picker.showOpenDialog(null);
        if (files == JFileChooser.APPROVE_OPTION) {
            File filechoose = picker.getSelectedFile();
            Scanner scan = new Scanner(new FileReader(filechoose));


            // iterate through each line of file, invoke getBarCode() for each
            PrintWriter textfileoutput = new PrintWriter ("labels.txt");
            while (scan.hasNext()) {
                String line = scan.nextLine();

                String[] address = line.split(",");
                String name = address[0];
                String street = address[1];
                String city = address[2];
                String state = address[3];
                String zipcode = address[4];
                String result = getBarCode(zipcode);

                //print output
                System.out.println(name);
                System.out.println(street);
                System.out.println(city+ " " +state+ " "+zipcode);

                //Printing the results on the new line
                System.out.println(result+'\n');


                //printing the txt file
//
                textfileoutput.println(name);
                textfileoutput.println(street +" " + city + " " + state +  " "+zipcode);
                textfileoutput.println(result+'\n');
            }

            scan.close();
            textfileoutput.close ();
        }
    }


    static String[] codes = { "||:::", ":::||", "::|:|", "::||:", ":|::|",
            ":|:|:", ":||::", "|:::|", "|::|:", "|:|::" };

    // compute bar-code for each zip code
    public static String getBarCode(String zipcode) {
        String result = "|";
        int sum = 0;
        for (char character : zipcode.toCharArray()) {
            if (Character.isDigit(character)) {
                int num = Integer.parseInt(character + "");
                sum += num;
                result += codes[num];
            }
        }
        //Checksum loop
        int checksum;
        if (sum % 10 == 0)
            checksum = 0;
        else
            checksum = 10 - (sum % 10);
        result += codes[checksum];
        result += "|";
        return result;

    }
}