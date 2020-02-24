import java.io.*;
import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                    new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
            writer = new BufferedWriter(
                    new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
        }catch(Exception e){
                System.out.println(e);
        }
            URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");

            EncodingModule encodingModule = new EncodingModule(reader,writer,url);
            encodingModule.encodeWithFiles();
            encodingModule.encodeBasedOnNetworkAndDatabase();

    }
}
