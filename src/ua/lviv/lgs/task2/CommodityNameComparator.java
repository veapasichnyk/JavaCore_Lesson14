package ua.lviv.lgs.task2;

import java.util.Comparator;

public class CommodityNameComparator implements Comparator<Commodity> {
    @Override
    public int compare ( Commodity o1 , Commodity o2 ) {
        return o1.getNameOfGoods ().compareTo ( o2.getNameOfGoods () );
    }
}
