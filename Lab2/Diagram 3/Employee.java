public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public boolean doTask(Task task) {
        System.out.println(name + " is performing the task: " + task.getName());
        return true;
    }
}
