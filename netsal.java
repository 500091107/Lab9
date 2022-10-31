public class netsal {
    String name;
    int basesal;
    String Jobstatus;
    double grosssal;
    double IT;

    netsal(String name, int basesal, String Jobstatus) {
        this.name = name;
        this.basesal = basesal;
        this.Jobstatus = Jobstatus;
    }

    public void Salary() {

        if (Jobstatus.equals("Permanant")) {
            double HRA = (basesal * 10) / 100;
            double DA = basesal * 0.5;
            double TA = 0.05;
            int specialallowance = 6000;
            grosssal = basesal + HRA + DA + TA + specialallowance;
        } else if (Jobstatus.equals("Probidant")) {
            double TA = 0.05;
            grosssal = basesal + TA;
        }

        if (grosssal > 100000) {
            IT = grosssal * 0.3;
        } else if (grosssal > 50000 && grosssal < 100000) {
            IT = grosssal * 0.1;
        } else if (grosssal < 50000) {
            IT = 0;
        }
        double pf = grosssal * .12;
        double netsalary = grosssal - IT - pf;
        System.out.println("Netsalary - " + netsalary);
    }

    public static void main(String[] args) {
        netsal n1 = new netsal("A", 90000, "Permanant");
        netsal n2 = new netsal("B", 200000, "Probidant");
        System.out.println("Name - A");
        System.out.println("Basesal - 90000");
        System.out.println("Job status - Permnant");
        n1.Salary();
        System.out.println("Name - B");
        System.out.println("Basesal - 200000");
        System.out.println("Job status - Probidant");
        n2.Salary();
    }
}
