/**
 * PhoneBookMain
 */
public class PhoneBookMain {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Алиса", 111L);
        phoneBook.addEntry("Боб", 222L);
        phoneBook.addEntry("Боб", 333L);
        phoneBook.addEntry("Владимир", 444L);
        phoneBook.addEntry("Владимир", 555L);
        phoneBook.addEntry("Владимир", 666L);
        phoneBook.addEntry("Георгий", 777L);
        phoneBook.addEntry("Георгий", 888L);
        phoneBook.addEntry("Георгий", 999L);
        phoneBook.addEntry("Георгий", 101L);

        phoneBook.print();
    }
}