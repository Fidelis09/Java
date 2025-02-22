package entities;

import java.util.Date;
import entities.Status;


public class Order {

    private Integer id; 
    private Date moment;
    private Status status;

    public Order() {
    }

    public Order(Integer id, Date moment, Status status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
    
}
