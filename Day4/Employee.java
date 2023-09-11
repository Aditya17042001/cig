package Day4;

public class Employee {
    private String ename;
     private int eid;
    private String dept;
    public Employee(String ename, int eid, String dept) {
        this.ename = ename;
        this.eid = eid;
        this.dept = dept;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
        result = prime * result + eid;
        result = prime * result + ((dept == null) ? 0 : dept.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (ename == null) {
            if (other.ename != null)
                return false;
        } else if (!ename.equals(other.ename))
            return false;
        if (eid != other.eid)
            return false;
        if (dept == null) {
            if (other.dept != null)
                return false;
        } else if (!dept.equals(other.dept))
            return false;
        return true;
    }
   
    
//  Hashing is a Computer Science concept that maps an object or entity to an integer.
// The hash value of an object is an integer value that is computed using the properties of that object.
// Every object in Java inherits the hashCode() and equals() method.
// Hash codes of two equal objects must be the same. However, the hash codes of two unequal objects need not be distinct.
// An efficient hashing algorithm generates distinct hashcodes for unequal objects.
// The hashCode method should be consistent in its implementation of the equals() function.
// hashCode() and hashCode(int value) methods, defined in the Integer class, compute the hash codes of integer objects or values in Java.
}
