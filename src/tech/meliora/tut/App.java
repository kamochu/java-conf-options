package tech.meliora.tut;

/**
 *
 * @author kamochu
 */
public class App {

    public static void main(String args[]) {

        /**
         * Option 1: Environment variables
         *
         * Getting configurations from environment variable. Useful for setting
         * values such as instance or node IDs in case you have more than one
         * node or instance running the same service.
         */
        System.out.println("#Environment Variables Option: \n");
        String env = System.getenv("CAVEMAN");
        System.out.println("CAVEMAN: " + env);
        String env2 = System.getenv("TEST_ENV");
        System.out.println("TEST_ENV: " + env2);

        /**
         * Option 2: -D properties
         *
         * -D is an important switch that allows you to set properties.
         *
         * You can call the following from anywhere in the code to read the
         * properties given on the command line:
         *
         * String value = System.getProperty("key", "defaultvalue");
         */
        System.out.println("\n\n#Environment Variables Option: \n");
        String etcFolder;
        etcFolder = System.getProperty("caveman.etc.folder", "/etc/caveman");
        System.out.println("-D property caveman.etc.folder: " + etcFolder);

        /**
         * Option 3: Command line arguments
         */
        System.out.println("\n\n#Command Line Arguments Option: \n");
        for (String arg : args) {
            System.out.println("Argument " + arg);
        }

        System.out.println("\n\n#Command Line Arguments Continued: \n");
        if (args != null && args.length == 3) {
            String ipAddress = args[0];
            String port = args[1];
            String data = args[2];

            System.out.println("Ip address  : " + ipAddress);
            System.out.println("Port        : " + port);
            System.out.println("Message     : " + data);

        } else {
            System.out.println("We expected 3 command line arguments IP_ADDRESS PORT MESSAGE_TO_SEND");
        }

    }

}
