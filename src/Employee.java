public class Employee {
    private static int count = 0;
    private String fullName;
    private int department;
    private int salary;
    private int id;
 public Employee (String fullName,int department,int salary ){
     this.fullName = fullName;
     this.department = department;
     this.salary = salary;
     this.id = count++;//счетчик
 }
public String toString1(){
   return  "ФИО:"+fullName +","+ "Отдел:"+department+","+"Заработная плата:"+salary;
}
    public String toString() {
        return "ФИО:" + fullName;
    }
    public static int id(int i){
 i++;
 return i;
 }
public String getFullName(){
       return this.fullName;
}
public int getDepartment(){
       return this.department;
}
public int getSalary(){
       return this.salary;
}
public int setSalary(){
       return this.salary;
}
@Override
public boolean equals(Object obj){
     if (this == obj) return true;
     if (obj==null||getClass()!=obj.getClass()) return false;
     Employee other = (Employee)obj;
     return fullName.equals(other.fullName)&&department==(other.department)&&salary==(other.salary)&&id==(other.id);
}
@Override
    public int hashCode(){
     return java.util.Objects.hash(fullName,department,salary,id);
}













}
