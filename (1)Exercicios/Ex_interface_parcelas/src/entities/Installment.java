package entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate date;
    private Double amount;

    public Installment(){

    }

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[date=" + date + ", amount=" + amount + "]";
    }


    
    

}
