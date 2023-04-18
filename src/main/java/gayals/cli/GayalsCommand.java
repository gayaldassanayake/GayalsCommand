package gayals.cli;

import io.ballerina.cli.BLauncherCmd;
import picocli.CommandLine;

@CommandLine.Command(name = "gayals", description = "POC sub tool")
public class GayalsCommand implements BLauncherCmd {

    @Override
    public void execute() {
        System.out.println("GayalsCommand is executing");
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
