public class employee {
    String name;
    int age;

    public static void main(String[] args) {
        employee e = new employee();
        e.name = "sde";
        e.age = 60;
        try {
            Integer.parseInt(e.name);
            throw new nameException("Name cannot be a number");
        } catch (NumberFormatException | nameException err) {
            System.out.println(err);
        }
        try {
            if (e.age > 50) {
                throw new ageException("Age should be less than 50");
            }
        } catch (ageException err) {
            System.out.println(err);
        }
    }
}

class nameException extends Exception {
    public nameException(String msg) {
        super(msg);
    }
}

class ageException extends Exception {
    public ageException(String msg) {
        super(msg);
    }
}