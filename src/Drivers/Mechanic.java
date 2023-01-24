package Drivers;
import transport.Competitor;
import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic <T extends Transport & Competitor> {
    private String fullName;
    private String company;
    private List<Class<? extends Transport>> classList = new ArrayList<>();
    public Mechanic (String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }
    public String getFullName() {
        return fullName;
    }
    public String getCompany() {
        return company;
    }
    public List<Class<? extends Transport>> getClassList() {
        return classList;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return fullName +" " + company;
    }
    public void carryOutMaintenance(T transport) {
        if (classList.contains(transport.getClass())) {
            System.out.println("Carry out maintenance " + transport.getBrand() + " " + transport.getModel());
        } else {
            System.out.println("Mechanic " + fullName + " doesn`t work with " + transport.getClass().getSimpleName());
        }
    }
    public void repair(T transport) {
        if (classList.contains(transport.getClass())) {
            System.out.println("Repair " + transport.getBrand() + " " + transport.getModel());
        } else {
            System.out.println("Mechanic " + fullName + " doesn`t work with " + transport.getClass().getSimpleName());
        }
    }
    public void addTransportClass (Class <? extends Transport> transportClass) {
        classList.add(transportClass);
    }

}