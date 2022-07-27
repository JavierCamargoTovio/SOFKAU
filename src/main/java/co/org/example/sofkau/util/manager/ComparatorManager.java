package co.org.example.sofkau.util.manager;

import net.serenitybdd.core.Serenity;

public class ComparatorManager {

    private static final String REPORT_TITLE = "Report";

    private ComparatorManager() {
    }


    public static boolean compareDifferences(String expected, String founded) {
        boolean result = false;

        if (expected!= null){
            result = expected.equalsIgnoreCase(founded);
        }else{
            result = false;
        }
        return result;
    }

    public static void generatedReport(String reportTitle) {
        Serenity.recordReportData().withTitle(reportTitle).andContents(Serenity.sessionVariableCalled(REPORT_TITLE));

    }
}
