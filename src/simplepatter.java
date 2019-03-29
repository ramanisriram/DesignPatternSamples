import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simplepatter {
	public static void main(String args[]) {
		System.out.println("start");
		String pathInfo = "/owner";
		// Accommodate two requests, one for all resources, another for a
		// specific resource
		Pattern regExAllPattern = Pattern.compile("/owner");
		Pattern regExIdPattern = Pattern.compile("/owner/([0-9]*)");

		Integer id;

		// regex parse pathInfo
		Matcher matcher;

		// Check for ID case first, since the All pattern would also match
		matcher = regExIdPattern.matcher(pathInfo);
		if (matcher.find()) {
			id = Integer.parseInt(matcher.group(1));
			System.out.println("id:"+id);
			return;
		}

		matcher = regExAllPattern.matcher(pathInfo);
		if (matcher.find())
			return;

	}
}