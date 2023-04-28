package gayals.cli;

import io.ballerina.cli.BLauncherCmd;
import picocli.CommandLine;

import java.io.PrintStream;
import java.util.List;

@CommandLine.Command(name = "gayals", description = "POC sub tool")
public class GayalsCommand implements BLauncherCmd {
    private final PrintStream printStream;

    @CommandLine.Option(names = {"--help", "-h", "?"}, usageHelp = true)
    private boolean helpFlag;

    @CommandLine.Parameters(description = "User name")
    private List<String> argList;

    public GayalsCommand() {
        this.printStream = System.out;
    }

    public GayalsCommand(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        if (helpFlag) {
            StringBuilder builder = new StringBuilder();
            builder.append("Sample tool for bal tool testing\n\n");
            builder.append("bal gayals [args]\n\n");
            builder.append("--args--\n");
            builder.append("  <name>\n");
            builder.append("    greets with a hello <name>\n\n");
            printStream.println(builder);
            return;
        }
        printStream.println("gayals command is executing\n");
        if (argList == null || argList.size() != 1) {
            printStream.println("Invalid number of arguments recieved!\n try bal gayals --help for more information.");
            return;
        }
        printStream.println("Hello " + argList.get(0) + "!");
    }

    @Override
    public String getName() {
        return "gayals";
    }

    @Override
    public void printLongDesc(StringBuilder out) {
    }

    @Override
    public void printUsage(StringBuilder out) {
    }

    @Override
    public void setParentCmdParser(CommandLine parentCmdParser) {
    }
}
