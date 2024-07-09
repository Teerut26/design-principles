package validators;

import interfaces.Validator;
import modals.User;

public class NameValidator implements Validator {
    @Override
    public boolean validate(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }

        if (user.getEmail() == null || user.getEmail().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }

        if (!user.getName().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name is wrong format");
        }

        return true;
    }
}
