package example.model;

/**
 * Employee entity.
 * 
 * @author nevenc
 *
 */
public class Employee {

    private Integer id;
    private String name;
    private String email;

    public Employee() {
    }

    public Employee(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
		return email;
    }
    public void setEmail(String email) {
		this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Employee [id=%s, name=%s, email=%s]", id, name, email);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!(object instanceof Employee)) return false;

        Employee other = (Employee) object;

        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) {
            return false;
        }

        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) {
            return false;
        }

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }

        return true;
    }

}
