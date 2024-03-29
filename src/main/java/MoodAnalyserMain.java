
/**
 * Purpose -Welcome message
 * 
 * @author Ajit Vibhute
 * @since - 02-04-2022
 *
 */

/**
 * create a class name as MoodAnalyserMain
 */
public class MoodAnalyserMain {
    private String message;

    /**
     * create a default constructor name as MoodAnalyserMain
     */

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (Exception e) {
            if (message == null)
                throw new MoodAnalysisException("Please provide valid mood, dont provide null in arguments",
                        MoodAnalysisException.Exception_Type.NULL);
            else
                throw new MoodAnalysisException("Please provide valid mood, dont keep empty in arguments",
                        MoodAnalysisException.Exception_Type.EMPTY);
        }
    }
}