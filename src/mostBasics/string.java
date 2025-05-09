package mostBasics;

public class string {
    public string(){
        String name = "Pal Sachin";
        //gives the ASCII value for int and character for char
        char letter = name.charAt(0);
        //System.out.println(letter);

        //gives the length of the string including spaces
        int length = name.length();
//        System.out.println(length);

        //gives the first index value of a particular char
        int index = name.indexOf("a");
        //System.out.println(index);

        //gives the first index value of a particular char
        int lastIndex = name.lastIndexOf("a");
        //System.out.println(lastIndex);

        //name = name.toUpperCase();
        name = name.toLowerCase();
        System.out.println(name);

    }
}
