package edu.detectortroyano.com.tipcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by detectortroyano on 12/06/2016.
 */
public class TipRecord {
    private Double bill;
    private int tipPercentaje;
    private Date timestap;

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }

    public int getTipPercentaje() {
        return tipPercentaje;
    }

    public void setTipPercentaje(int tipPercentaje) {
        this.tipPercentaje = tipPercentaje;
    }

    public Date getTimestap() {
        return timestap;
    }

    public void setTimestap(Date timestap) {
        this.timestap = timestap;
    }

    public Double getTip(){
        return bill*(tipPercentaje/100d);
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:MM");
        return simpleDateFormat.format(timestap);
    }

}
