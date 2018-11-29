package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SyncronBinary {


    public static void main(String[] args) throws IOException {

        SyncronBinary syncronBinary = new SyncronBinary();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String binary = Integer.toBinaryString(Integer.valueOf(br.readLine()));

        Integer answer = syncronBinary.convertBintoDecReversed(binary);
        System.out.println(answer);

    }


    public Integer convertBintoDecReversed(String binary) {
        System.out.println("Initial: " + binary);

        if (binary.length() > 1) {
            while (binary.length() % 2 != 0) {
                StringBuilder builder = new StringBuilder(binary);
                builder.insert(0, "0");
                binary = builder.toString();
            }
        }

        System.out.println("Even: " + binary);

        StringBuilder reversed = new StringBuilder();

        for (char sign : binary.toCharArray()) {
            if (sign == '1') {
                reversed.append("0");
            } else if (sign == '0') {
                reversed.append("1");
            }
        }

        System.out.println("Reversed: " + reversed.toString());


        return Integer.parseInt(reversed.toString(), 2);
    }
}
