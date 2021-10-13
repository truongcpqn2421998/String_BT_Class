import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX="^[CPA][0-9]{4}[GHIKLM]$";
    public ValidateClass(){
        pattern=Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
