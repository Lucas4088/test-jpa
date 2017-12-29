package persistentObjects;

import javax.persistence.*;

@Entity
@Table(name="CAGE")
public class CageEntity {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private int capacity;
    @Column(unique = true, nullable = false)
    private boolean occupied;

    public CageEntity(int capacity, boolean occupied) {
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
