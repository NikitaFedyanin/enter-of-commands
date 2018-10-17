import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class EnterCommands {
    Map<String, String> commandsDescription;

    public EnterCommands() {
        commandsDescription = new HashMap<>();
        commandsDescription.put("EXIT", "exit of project");
        commandsDescription.put("RUN", "run test environment");
        commandsDescription.put("REGISTRATION", "registration this machine");
        commandsDescription.put("PROJECT", "project worc");
    }
    
    public void start() throws IOException {
        System.out.println("enter command");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String s;
            while (!((s=reader.readLine().toUpperCase()).equals("EXIT"))){
                if (s.equals("HELP")){
                    for (Map.Entry<String, String> stringStringEntry : commandsDescription.entrySet()) {
                        System.out.println(stringStringEntry.getKey()+" "+stringStringEntry.getValue());
                    }
                }


                for (Map.Entry<String, String> stringEntry : commandsDescription.entrySet()) {
                    if (s.equals(stringEntry.getKey())){
                        System.out.println(stringEntry.getValue());
                    }
                }
            }
        }
    }
}
