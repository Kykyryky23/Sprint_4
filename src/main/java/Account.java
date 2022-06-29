public class Account {

    private final String name;

    public Account(String name) {

        this.name = name;

    }

    public boolean checkNameToEmboss() {

        String firstСharacter = Character.toString(name.charAt(0));
        String secondСharacter = Character.toString(name.charAt(name.length()-1));
        int countSpaces = name.length() - name.replace(" ", "").length();

        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        else if (firstСharacter.equals(" ") || secondСharacter.equals(" ")) {
            return false;
        }

        else if (countSpaces != 1) {
            return false;
        }

        else {
            return true;
        }
    }
}