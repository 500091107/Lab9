public class Calls {
    String type;
    int duration;

    public Calls(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public String toString() {
        return "Type: " + type + ", Duration: " + duration;
    }

    public int calculateCharges() {
        return duration * 15;
    }
}

class Ordinary extends Calls {
    public Ordinary(String type, int duration) {
        super(type, duration);
    }

    public int calculateCharges() {
        return super.calculateCharges();
    }
}

class Urgent extends Calls {
    public Urgent(String type, int duration) {
        super(type, duration);
    }

    public int calculateCharges() {
        return super.duration * 25;
    }
}

class Lightning extends Calls {
    public Lightning(String type, int duration) {
        super(type, duration);
    }

    public int calculateCharges() {
        return super.duration * 30;
    }
}

class Main {
    public static void main(String[] args) {
        Calls[] calls = new Calls[3];
        calls[0] = new Ordinary("Ordinary", 5);
        calls[1] = new Urgent("Urgent", 5);
        calls[2] = new Lightning("Lightning", 5);

        for (Calls call : calls) {
            System.out.println(call);
            System.out.println("Charges: " + call.calculateCharges());
        }
    }
}
