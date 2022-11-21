package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	private LocalDate date;
	private Double amount;
	//contrutor padr�o
	public Installment() {	
	}
	//contrutor com argumentos
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	//metodos gets e sets
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	
	
}
