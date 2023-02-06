package transport;

import java.util.LinkedList;
import java.util.Queue;

public class STO {
    private final Queue <Transport> transportQueue = new LinkedList<>();
    public void addTransportToQueue (Transport transport) {
        if(!(transport instanceof Bus)){
            transportQueue.add(transport);
        }
    }
    public void runTO (){
        Transport transport = transportQueue.poll();
        if (transport != null){
            System.out.print("Mechanic " + transport.getMechanics().get(0).getFullName() + " ");
            transport.getMechanics().get(0).carryOutMaintenance(transport);
        }
    }
}
