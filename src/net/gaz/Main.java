package net.gaz;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*Map<String, String> env = System.getenv();

        for(String envName: env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }*/

        for(String env : args) {
            String value = System.getenv(env);
            if(value != null ) {
                System.out.println(env + ": " + value);
            } else {
                System.out.println(env + ": NOT DEFINED");
            }
        }
    }
}
