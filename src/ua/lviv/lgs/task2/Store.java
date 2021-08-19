package ua.lviv.lgs.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Store {
    ArrayList<Commodity> store = new ArrayList<Commodity>();

    public void addCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of goods");
        String nameOfGoods = scanner.next();
        System.out.println("Enter length of goods");
        double lengthOfGoods = scanner.nextDouble ();
        System.out.println("Enter width of goods");
        double widthOfGoods = scanner.nextDouble();
        System.out.println("Enter weight of goods");
        double weightOfGoods = scanner.nextDouble();

        Commodity commodity = new Commodity(nameOfGoods, lengthOfGoods, widthOfGoods, weightOfGoods);

        store.add(commodity);
        System.out.println("Goods " + commodity.toString() + " successfully added to the store!");
    }

    public void removeCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of goods");
        String nameOfGoods = scanner.next();
        System.out.println("Enter length of goods");
        double lengthOfGoods = scanner.nextDouble ();
        System.out.println("Enter width of goods");
        double widthOfGoods = scanner.nextDouble();
        System.out.println("Enter weight of goods");
        double weightOfGoods = scanner.nextDouble();

        boolean goodsCorrect = isCommodityExists(store, nameOfGoods, lengthOfGoods, widthOfGoods, weightOfGoods);

        if (goodsCorrect) {

            Iterator<Commodity> iterator = store.iterator();

            while (iterator.hasNext()) {
                Commodity nextCommodity = iterator.next();

                if (nextCommodity.getNameOfGoods ().equalsIgnoreCase(nameOfGoods)
                    && nextCommodity.getLengthOfGoods () == lengthOfGoods
                    && nextCommodity.getWidthOfGoods () == widthOfGoods
                    && nextCommodity.getWeightOfGoods () == weightOfGoods) {
                    iterator.remove();
                    System.out.println("Goods " + nextCommodity.toString() + " successfully removed from the store");
                }
            }

        } else {
            System.out.println("The entered goods are not in the store");
        }
    }

    public void replaceGoods () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of goods");
        String nameOfGoods = scanner.next();
        System.out.println("Enter length of goods");
        double lengthOfGoods = scanner.nextDouble ();
        System.out.println("Enter width of goods");
        double widthOfGoods = scanner.nextDouble();
        System.out.println("Enter weight of goods");
        double weightOfGoods = scanner.nextDouble();

        boolean goodsCorrect = isCommodityExists(store, nameOfGoods, lengthOfGoods, widthOfGoods, weightOfGoods);

        if (goodsCorrect) {
            for (Commodity commodity : store) {
                if (commodity.getNameOfGoods ().equalsIgnoreCase(nameOfGoods)
                    && commodity.getLengthOfGoods () == lengthOfGoods
                    && commodity.getWidthOfGoods () == widthOfGoods
                    && commodity.getWeightOfGoods () == weightOfGoods) {
                    System.out.println("Enter new name of goods");
                    String newNameOfGoods = scanner.next();
                    System.out.println("Enter new length of goods");
                    double newLengthOfGoods = scanner.nextDouble ();
                    System.out.println("Enter new width of goods");
                    double newWidthOfGoods = scanner.nextDouble();
                    System.out.println("Enter new weight of goods");
                    double newWeightOfGoods = scanner.nextDouble();
                    commodity.setNameOfGoods(newNameOfGoods);
                    commodity.setLengthOfGoods (newLengthOfGoods);
                    commodity.setWidthOfGoods(newWidthOfGoods);
                    commodity.setWeightOfGoods(newWeightOfGoods);
                    System.out.println("The entered goods was successfully replaced by " + commodity.toString() );
                }
            }
        } else {
            System.out.println("The entered goods are not in the store");
        }
    }

    static boolean isCommodityExists(ArrayList<Commodity> store, String nameOfGoods, double lengthOfGoods,
                                     double widthOfGoods, double weightOfGoods) {
        boolean flag = false;

        for (Commodity commodity : store) {
            if (commodity.getNameOfGoods ().equalsIgnoreCase(nameOfGoods)
                && commodity.getLengthOfGoods () == lengthOfGoods
                && commodity.getWidthOfGoods () == widthOfGoods
                && commodity.getWeightOfGoods () == weightOfGoods) {

                flag = true;
            }
        }

        return flag;
    }

    public void sortByName() {
        System.out.println("Before sorting: ");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }

        Collections.sort ( store, new CommodityNameComparator() );
        System.out.println("After sorting by name:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }
    }

    public void sortByLength() {
        System.out.println("Before sorting:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }

        Collections.sort(store, new CommodityLengthComparator());
        System.out.println("After sorting by length:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }
    }

    public void sortByWidth() {
        System.out.println("Before sorting:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }

        Collections.sort(store, new CommodityWidthComparator());
        System.out.println("After sorting by width:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }
    }

    public void sortByWeight() {
        System.out.println("Before sorting:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }

        Collections.sort(store, new CommodityWeightComparator());
        System.out.println("After sorting by weight:");
        for (Commodity commodity : store) {
            System.out.println(commodity);
        }
    }

    public void getCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the serial number of the goods in the store");
        int i = scanner.nextInt();

        if (i < 0 || i > (store.size() - 1)) {
            System.out.println("There is no goods with this serial number in the store");
        } else {
            System.out.println( i + " is the serial number of the " + store.get(i).toString());
        }
    }
}
