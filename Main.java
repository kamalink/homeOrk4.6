package module4.homeOrk6;

import module4.homeOrk2.Currency;
import module4.homeOrk3.ChinaBank;
import module4.homeOrk3.EUBank;
import module4.homeOrk3.USBank;
import module4.homeOrk4.User;
import module4.homeOrk5.BankSystemImp;

public class Main {
    public static void main(String[] args) {

        USBank usbank = new USBank(8739523239l, "USA", Currency.USD, 54675, 3500, 29, 25000000000l);
        EUBank europeanCentralBank = new EUBank(1472005819l, "GER", Currency.EUR, 43407, 3100, 44, 4000000000l);
        ChinaBank bankOfChina = new ChinaBank(5490372984l, "PRC", Currency.USD, 135604, 1300, 20, 12400000000l);

        BankSystemImp bankSystem = new BankSystemImp();

        User user1 = new User(3782094l, "Mark", -228, 1, "eBaptism", 800, usbank);
        User user2 = new User(9302857l, "Blizzard", 59052, 27, "CASTPOST", 4450, europeanCentralBank);
        User user3 = new User(3094850l, "Molly", 1586, 0, "Nokia", 650, usbank);
        User user4 = new User(3784920l, "Gansu", 11829, 69, "Toyota", 900, bankOfChina);
        User user5 = new User(9385673l, "Victoria", 3522, 13, "BudLight", 1450, europeanCentralBank);
        User user6 = new User(3945783l, "Jiangxi", 247, 78, "McDonald's", 250, bankOfChina);

        bankSystem.fundUser(user1, 229);
        bankSystem.transferMoney(user1, user3, 228);
        bankSystem.paySalary(user4);
        bankSystem.withdrawOfUser(user5, 2000);

        System.out.println(user1.getName() + " is fund his balance by 229");
        System.out.println(user3.getName() + " is transfer 228 to " + user1.getName());
        System.out.println(user4.getName());
        System.out.println(user5.getName() + " is take from her balance 2000");
    }
}
