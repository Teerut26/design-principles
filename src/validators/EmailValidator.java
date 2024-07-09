// 6510405601 Teerut Srithongdee
package validators;

import interfaces.Validator;
import modals.User;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    @Override
    public boolean validate(User user) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(user.getEmail()).matches()) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        List<String> notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");
        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
        return true;
    }
}
