import java.util.LinkedList;
import java.util.Queue;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;
    private String specialization;

    public Mechanic(String name, String company, String specialization) {
        this.name = name;
        this.company = company;
        this.specialization = specialization;
    }

    private Queue<T> queue = new LinkedList<>();

    public void addTechnic(T transport) {
        queue.offer(transport);
    }

    public void performMaintenance() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Механик " + name + " " + company + " провел техосмотр " + transport);
            performMaintenance();
        }else {
            System.out.println("Произведен технический осмотр всей техники");
        }
    }

    public void repairOfEquipment() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Механик " + name + " " + company + " провел ремонт " + transport);
            repairOfEquipment();
        }else {
            System.out.println("Произведен ремонт всей техники");
        }
    }
    public int queueSize(){
        return queue.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
