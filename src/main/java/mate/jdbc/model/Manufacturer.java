package mate.jdbc.model;

import java.util.Objects;

public class Manufacturer {
    private Long id;
    private String name;
    private String country;

    public Manufacturer() {

    }

    public Manufacturer(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object manufacturer) {
        if (this == manufacturer) {
            return true;
        }
        if (!(manufacturer instanceof Manufacturer)) {
            return false;
        }
        Manufacturer that = (Manufacturer) manufacturer;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(),
                that.getName()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCountry());
    }

    @Override
    public String toString() {
        return "Manufacturer{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", country='" + country + '\''
                + '}';
    }
}