import ll.Console;

import ll.Output;

public class trytry

{

    private Output output;

    public trytry(Output output)

    {

        this.output = output;

    }

    public static void main(String[] args)

    {

        new trytry(new Console()).start();

    }

    public void start()

    {
        String content = "--------\n"+
                         "|   x  |\n"+
                         "|   X  |\n"+
                         "--------\n";

        output.print(content);
    }
}
