package ua.lviv.lgs.task1;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main ( String[] args ) {

       Set<Cat> cats = new HashSet <> (  );

        cats.add ( new Cat ( "Marko", 6  ) );
        cats.add ( new Cat ( "Masya", 3  ) );
        cats.add ( new Cat ( "Sonya", 2  ) );
        cats.add ( new Cat ( "Mau", 8  ) );
        cats.add ( new Cat ( "Riko", 6  ) );
        cats.add ( new Cat ( "Burko", 1  ) );

        System.out.println ("HashSet виводить у випадковому порядку" );
        for ( Object o:
              cats ) {
            System.out.println ( o );
        }

        Set<Cat> cats1 = new TreeSet<Cat>( new CatNameComparator());

        cats1.add ( new Cat ( "Marko", 6  ) );
        cats1.add ( new Cat ( "Masya", 3  ) );
        cats1.add ( new Cat ( "Sonya", 2  ) );
        cats1.add ( new Cat ( "Mau", 8  ) );
        cats1.add ( new Cat ( "Riko", 6  ) );
        cats1.add ( new Cat ( "Burko", 1  ) );

        System.out.println ("\nВідсортовано за ім'ям" );
        for ( Object o:
                cats1 ) {
            System.out.println ( o );
        }

        Set<Cat> cats2 = new TreeSet<Cat>();

        cats2.add ( new Cat ( "Marko", 6  ) );
        cats2.add ( new Cat ( "Masya", 3  ) );
        cats2.add ( new Cat ( "Sonya", 2  ) );
        cats2.add ( new Cat ( "Mau", 8  ) );
        cats2.add ( new Cat ( "Riko", 6  ) );
        cats2.add ( new Cat ( "Burko", 1  ) );

        System.out.println ("\nВідсортовано за віком" );
        for ( Object o:
                cats2 ) {
            System.out.println ( o );
        }



    }
}
