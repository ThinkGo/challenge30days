package kr0ger.p4;

public class BaseA {
    String instanceId;

    public BaseA(String instanceId) {
        this.instanceId = instanceId;
    }

    public void printInstanceName() {
        System.out.println(this.instanceId);
    }
}
