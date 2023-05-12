import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PopulationCounter {
    public static void main(String[] args) throws Exception {
        
        String path = args[0];
        int sum = 0;
        
        // for(int i = 1; i < lines.size(); i++) {
        //     String line = lines.get(i);
        //     String[] terms = line.split(",");
        //     String popText = terms[4];
        //     if(popText.length() == 0) {
        //         continue;
        //     }
        //     long population = Integer.parseInt(popText);
        //     sum += population;
        // }
        String num = NumberFormat.getInstance(Locale.getDefault()).format(sum);
        System.out.printf("World population is: %s\n", num);
    }
}
