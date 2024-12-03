package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleCommands {
    private static Map<String,String> commands = new HashMap<>();
    static {
        commands.put("help","Die ganze Liste von Befehlen anzeigen");
        commands.put("exit","Das Programm beenden");
        commands.put("version","Die aktuelle version anzeigen");
        commands.put("add","Ein buch zur Bibliothek hinzufügen");
        commands.put("list","Die Liste der Bücher anzeigen");
        commands.put("loeschen","Ein Buch aus der Bibliothek entfernen");
    }

    public void showCommands() {
        System.out.println("\n Liste von verfügbaren Befehlen:");
        System.out.println("===============================");

        int maxLength = getMaximumLength(commands);
        commands.forEach((command,description) -> {
            String paddedCommand = String.format("%-" + (maxLength + 4) + "s", command);
            System.out.println(paddedCommand + description);
        });
    }

    protected static String readUserInput(Scanner scanner, String prompt) {
        System.out.print(prompt + ":");
        String input = scanner.nextLine().trim();

        while (input.isEmpty()) {
            System.out.println(prompt + " darf nicht leer sein. Bitte erneut eingeben:");
            input = scanner.nextLine().trim();
        }
        return input;

    }

    public int getMaximumLength(Map<String,String> commands) {
       int maxLength = 0;
       for (Map.Entry<String,String> entry : commands.entrySet()) {
            String command = entry.getKey();
            if (command.length() > maxLength) {
                maxLength = command.length();
            }
       }
       return maxLength;
    }
}
