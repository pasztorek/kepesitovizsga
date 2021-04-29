package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output){

        if(contacts==null || output == null){
            throw new IllegalArgumentException();
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {

            for (Map.Entry<String, String> entry: contacts.entrySet()) {

                 if(contacts.size()>1) {
                    String line = entry.getKey() + ": " + entry.getValue() + ", ";

                }

                else {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                }

            }




        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }


    }


}
