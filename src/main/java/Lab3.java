

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
*
*
* @author Charlie Jung
*
*/
public class Lab3 {
    /**
     *
     * @int z
     */
    private static int z = 0;
    /**
     *
     * @param args arguments
     *
     */
    public static void main(final String[] args) {
        //int z = 0;
        String content = urlToString("http://erdani.com/tdpl/hamlet.txt");
        //System.out.println(content);

    }


/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public static String urlToString(final String url) {
    int count = 0;
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    while (urlScanner.hasNext()) {
        String temp = urlScanner.nextLine();
        System.out.println("temp: " + temp);
        count = count + 1;
    }
    System.out.println("Word Count: " + count);
    //System.out.println("line: " + contents);
    //String[] wordArray;
    //System.out.println("Count of Words: " + count);


    urlScanner.close();

    return contents;

}
}
