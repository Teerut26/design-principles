package validators;

import interfaces.Validator;
import modals.User;

public class AgeValidator implements Validator {
    @Override
    public boolean validate(User user) {
        if (user.getAge() < 20) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
        return true;
    }
}
