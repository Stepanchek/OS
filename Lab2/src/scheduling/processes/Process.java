package scheduling.processes;

public class Process implements Comparable{
    public int cputime;
    public int ioblocking;
    public int priority;
    public int cpudone;
    public int ionext;
    public int numblocked;

    public int usedQuantumOfTime;
    public int processIndex;
    public static int index;
    public ProcessDeque queue;

    static {
        index = 0;
    }

    public Process(int cputime, int ioblocking, int priority, int cpudone, int ionext, int numblocked) {
        this.cputime = cputime;
        this.ioblocking = ioblocking;
        this.priority = priority;
        this.cpudone = cpudone;
        this.ionext = ionext;
        this.numblocked = numblocked;

        this.usedQuantumOfTime = 0;
        this.processIndex = index++;
    }

    @Override
    public int compareTo(Object o){
        Process otherProcess = (Process)o;
        return (otherProcess.priority - this.priority);
    }
}
