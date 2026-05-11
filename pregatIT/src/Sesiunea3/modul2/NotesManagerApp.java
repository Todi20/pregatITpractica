package Sesiunea3.modul2;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class NotesManagerApp {
    private static final String FIlE_NAME = "notes.txt";

        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    saveNote();
                    break;
                case 2:
                    readNote();
                    break;
                case 3:
                    searchNote();
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5: 
                    AppendNote();
                    break;
                    
                case 0:
                    System.out.println("Exiting the application...");
                default:
                    System.out.println("Invalid option");
            }
        }
        while (option != 0);
    }

    private static void AppendNote() {
        System.out.println("Enter file name:");
        String fileName = scanner.nextLine();

        System.out.println("Enter new text content:");
        String newContent = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName, true);

            writer.write(newContent + "\n");

            writer.close();

            System.out.println("Text append successfully");
        }
        catch(IOException e){
            System.out.println("An error occurred");

        }
    }

    private static void deleteNote() {
        File file = new File(FIlE_NAME);
        if (file.exists()){
            file.delete();
            System.out.println("All notes were deleted");
        }else {
            System.out.println("There are no notes to be deleted");
        }
    }

    private static void searchNote() {
    }

    private static void readNote() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(FIlE_NAME));
            String line;

            System.out.println("\n ----- Saved notes -----");

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Please add a note first.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally{
            try{
                if(reader != null) {
                    reader.close();

                }
            } catch (IOException e) {
                System.out.println("Error closeing file.");
            }


        }
    }

    private static void saveNote() {
        System.out.println("Introduceti notita");
        String note = scanner.nextLine();


        FileWriter writer = null;

        try {
            writer = new FileWriter(FIlE_NAME, true);
            writer.write(note + "\n");
            System.out.println("Note saved!");

        } catch (IOException e) {
            System.out.println("Error writing to file: + " + FIlE_NAME);
            ;

        } finally {
            try {
                if (writer != null) {
                    writer.close();

                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + FIlE_NAME);

            }
        }


    }


    private static void displayMenu() {
        System.out.println("=== Student notes manager ===");
        System.out.println("1. Save note");
        System.out.println("2. Read notes");
        System.out.println("3. Search notes");
        System.out.println("4. Delete notes");
        System.out.println("5. Append file");
        System.out.println("0. Exit the application");
        System.out.println("Choose an option: ");
    }
}




