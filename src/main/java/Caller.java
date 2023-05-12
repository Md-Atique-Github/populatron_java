
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.base.Optional;

import java.io.IOException;

public class Caller{
    // public long getAllPopulation(String path) {
    // try{
    //     long sum = 0;
    //     List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);

    //      sum = lines.stream()
    //             .skip(1) // skip the first line
    //             .map(line -> line.split(","))
    //             .mapToLong(terms -> {
    //                 String popText = terms[4];
    //                 if (popText.isEmpty()) {
    //                     return 0;
    //                 } else {
    //                     return Long.parseLong(popText);
    //                 }
    //             })
    //             .sum();

    // }
    // catch(IOException e){
        
    // }

    public List<String> fileCall(String path) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
        return lines;
    }

    public List<String> fileParse(List<String> lines){
        // return 
        List<String> data = lines.stream()
        .skip(1).map(n -> n.split(","))
        .map(n -> n[4]).collect(Collectors.toList());
        return data;
    }
}