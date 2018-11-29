package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class SyncronStringsUsingLambdas {
    public static void main(String[] args) {
        SyncronStringsUsingLambdas syncronStringsUsingLambdas = new SyncronStringsUsingLambdas();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = "";
        String secondLine = "";

        try {
            firstLine = br.readLine();
            secondLine = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Deque<String> deque1 = firstLine.codePoints().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.toCollection(ArrayDeque::new));
        Deque<String> deque2 = secondLine.codePoints().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.toCollection(ArrayDeque::new));


        System.out.println(syncronStringsUsingLambdas.convertIntoOneList.apply(deque1, deque2));
    }

    public BiFunction<Deque<String>, Deque<String>, String> convertIntoOneList = (x, y) -> {
        ArrayList<String> finalList = new ArrayList<>();
        while (!x.isEmpty() || !y.isEmpty()) {
            if (!x.isEmpty()) {
                finalList.add(x.getFirst());
                x.pop();
            }
            if (!y.isEmpty()) {
                finalList.add(y.getFirst());
                y.pop();
            }
        }

        return finalList.stream().map(Object::toString).collect(Collectors.joining(""));
    };
}
