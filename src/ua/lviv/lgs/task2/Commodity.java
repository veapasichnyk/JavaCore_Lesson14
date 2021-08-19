package ua.lviv.lgs.task2;

import java.util.Objects;

public class Commodity {
    String nameOfGoods;
    double weightOfGoods;
    double widthOfGoods;
    double lengthOfGoods;

    public Commodity ( String nameOfGoods, double lengthOfGoods, double widthOfGoods, double weightOfGoods) {
        this.nameOfGoods = nameOfGoods;
        this.weightOfGoods = weightOfGoods;
        this.widthOfGoods = widthOfGoods;
        this.lengthOfGoods = lengthOfGoods;
    }

    public void setNameOfGoods ( String nameOfGoods ) {
        this.nameOfGoods = nameOfGoods;
    }

    public void setWeightOfGoods ( double weightOfGoods ) {
        this.weightOfGoods = weightOfGoods;
    }

    public void setLengthOfGoods ( double lengthOfGoods ) {
        this.lengthOfGoods = lengthOfGoods;
    }

    public void setWidthOfGoods ( double widthOfGoods ) {
        this.widthOfGoods = widthOfGoods;
    }

    public String getNameOfGoods ( ) {
        return nameOfGoods;
    }

    public double getWeightOfGoods ( ) {
        return weightOfGoods;
    }

    public double getWidthOfGoods ( ) {
        return widthOfGoods;
    }

    public double getLengthOfGoods ( ) {
        return lengthOfGoods;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Commodity commodity = (Commodity) o;
        return Double.compare ( commodity.weightOfGoods , weightOfGoods ) == 0 && Double.compare ( commodity.widthOfGoods , widthOfGoods ) == 0 && Double.compare ( commodity.lengthOfGoods , lengthOfGoods ) == 0 && nameOfGoods.equals ( commodity.nameOfGoods );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( nameOfGoods , weightOfGoods , widthOfGoods , lengthOfGoods );
    }

    @Override
    public String toString ( ) {
        return "Commodity{" +
               "nameOfGoods='" + nameOfGoods + '\'' +
               ", weightOfGoods=" + weightOfGoods +
               ", widthOfGoods=" + widthOfGoods +
               ", lengthOfGoods=" + lengthOfGoods +
               '}';
    }
}
