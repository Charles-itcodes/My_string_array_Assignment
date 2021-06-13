package org.example;

public class NameRepository {

    private static String[]names= {"Charles","Rudahusha"};

    public static void main(String[] args) {


        String[]names= new String[] {"Erik","Svensson"};
        setNames(names);
        String[] fullname = getFullname();
        for(int i=0;i<fullname.length;i++) {

            System.out.println(fullname[i]);
        }


    }
    public static String [] getFullname() {
        String[]names = {"Erik"+"  "+ "Svensson"};

        return names;

    }
    public static int getSize(String[]names) {

        return names.length;
    }

    public static String updateName(String name ) {
        return name;

    }
    public static String[] setNames(String[] names) {


        return names;
    }
    public static boolean[] clear(){
        String[]names= new String[] {"Erik","Svensson"};
        names=null;

        return new boolean[0];
    }
    public static boolean add(final String fullName){
        String[] array= new String[] {"Erik","Svensson"};

        int currentSize = array.length;
        int newSize = currentSize + 1;
        String[] tempArray = new String[ newSize ];
        for (int i=0; i < currentSize; i++)
        {
            tempArray[i] = array [i];
            if(array[i].equals(fullName)){
                return false;
            }
            else{
                tempArray[newSize- 1] = fullName;

            }

        }
        return true;
    }
    public static String find(final String fullName){
        String[] array= new String[] {"Erik","Svensson"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(fullName)){
                return fullName;
            }

        }
        return null;
    }
    public static String[] findAll(){
        String[] array= new String[] {"Erik","Svensson"};
        String[] newarray= new String[array.length];
        newarray= array;
        return newarray;
    }
}


