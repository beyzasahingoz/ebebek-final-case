package com.mycompany.javacase;

import ex.notebook;
import ex.phone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class PatikaStore {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> Brand = new ArrayList<>();
        Map<Integer, Phone> productPhone = new HashMap();
        Map<Integer, Notebook> productNotebook = new HashMap<>();
        ArrayList<Phone> listProductPhone = new ArrayList<>();
        ArrayList<Notebook> listProductNotebook = new ArrayList<>();

        Brand.add("Samsung");
        Brand.add("Lenovo");
        Brand.add("Apple");
        Brand.add("Huawei,");
        Brand.add("Casper");
        Brand.add("Asus");
        Brand.add("HP");
        Brand.add("Xiaomi");
        Brand.add("Monster");

        Collections.sort(Brand);

        Phone SAMSUNG_A51 = new Phone(1, "SAMSUNG GALAXY A51", 3199.0, "Samsung ", 128, 6.5, 32, 4000.0, 6, "Siyah");
        Phone iPhone_11_64 = new Phone(2, "iPhone 11 64 GB ", 7379.0, "Apple ", 64, 6.1, 5, 3046.0, 6, "mavi");
        Phone Redmi_Note_10_pro = new Phone(3, "Redmi Note 10 Pro 8GB ", 4012.0, "Xiaomi", 128, 6.5, 35, 4000.0, 12, "Beyaz");
        Notebook HUAWEI_Matebook = new Notebook(1, "HUAWEI Matebook 14", 7000.0, "Huawei", 512, 14.0, 16);
        Notebook LENOVO_V14 = new Notebook(2, "LENOVO V14 IGL", 3699.0, "Lenovo", 1024, 14.0, 8);
        Notebook ASUS_Tuf = new Notebook(3, "ASUS Tuf Gaming ", 8199.0, "Asus", 2048, 15.6, 32);

        productPhone.put(SAMSUNG_A51.getId(), SAMSUNG_A51);
        productPhone.put(iPhone_11_64.getId(), iPhone_11_64);
        productPhone.put(Redmi_Note_10_pro.getId(), Redmi_Note_10_pro);
        productNotebook.put(HUAWEI_Matebook.getId(), HUAWEI_Matebook);
        productNotebook.put(LENOVO_V14.getId(), LENOVO_V14);
        productNotebook.put(ASUS_Tuf.getId(), ASUS_Tuf);

        listProductPhone.add(SAMSUNG_A51);
        listProductPhone.add(iPhone_11_64);
        listProductPhone.add(Redmi_Note_10_pro);

        listProductNotebook.add(HUAWEI_Matebook);
        listProductNotebook.add(LENOVO_V14);
        listProductNotebook.add(ASUS_Tuf);

        int choice;
        do {

            System.out.println("Welcome to the PATIKA STORE!");
            System.out.println(" 1-Notebook\n 2-Mobile Phone\n 3-Brand List\n 4-Other Operations\n 5-Exit");

            System.out.print("Choice:\n");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println(" | ID  | Product Name      | Price      | Brand     | Memory  |  Screen  |   RAM      |");
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    for (Notebook i : productNotebook.values()) {

                        i.print();

                    }

                    System.out.println("------------------------------------------------------------------------------------------------------");

                    break;

                case 2:
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID    |  Product Name       | Price      | Brand     | Memory  | Screen   | Canera  | Battery  | RAM   | Color           |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    for (Phone i : productPhone.values()) {

                        i.print();
                    }

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:

                    System.out.println("Enter the name of brand");
                    System.out.println("-Apple \n - Asus \n - Casper \n - HP  \n- Huawei  \n- Lenovo \n "
                            + "- Monster \n - Samsung  \n- Xiaomi");
                    String choiceBrand = input.next();

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID    |  Product Name     | Price     | Brand     | Memory  | Screen     | Camera    | Battery  | RAM   | Color            |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

                    for (int i = 0; i < listProductPhone.size(); i++) {
                        if (listProductPhone.get(i).getBrand().equals(choiceBrand)) {
                            listProductPhone.get(i).print();
                        }
                        if (listProductNotebook.get(i).getBrand().equals(choiceBrand)) {
                            listProductNotebook.get(i).print();
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                case 4:

                    System.out.println("1-Add Product\n2-Delete Product");
                    int choiceOperation = input.nextInt();
                    if (choiceOperation == 1) {
                        System.out.println("To which category do you want to add?");
                        System.out.println("1-Notebook\n2-Phone");
                        int choiceAddCategory = input.nextInt();
                        if (choiceAddCategory == 1) {

                            System.out.println("Product ID,  Name, Price, Brand, Memory, Screen, Ram (Enter the values in order)");
                            Notebook comp = new Notebook(input.nextInt(), input.next(),
                                    input.nextDouble(), input.next(), input.nextInt(), input.nextDouble(), input.nextInt());

                            productNotebook.put(comp.getId(), comp);
                        } else {

                            System.out.println("Product ID,  Name, Price, Brand, Memory, Screen, Camera, Battery, Ram, Color (Enter the values in order)");
                            Phone phone = new Phone(input.nextInt(), input.next(), input.nextDouble(), input.next(), input.nextInt(),
                                    input.nextDouble(), input.nextInt(), input.nextDouble(), input.nextInt(), input.next());

                            productPhone.put(phone.getId(), phone);
                        }
                    } else {
                        System.out.println("To which category do you want to delete?");
                        System.out.println("1-Notebook\n2-Phone");
                        int choiceDeleteCategory = input.nextInt();
                        if (choiceDeleteCategory == 1) {

                            System.out.println("Enter the product's ID:");
                            productNotebook.keySet().remove(input.nextInt());

                        } else {

                            System.out.println("Enter the product's ID:");
                            productPhone.keySet().remove(input.nextInt());

                        }

                    }

                    break;

                case 5:

                    System.out.println("Thanks, see you!");
                    System.exit(0);
            }

        } while (true);

    }
}
