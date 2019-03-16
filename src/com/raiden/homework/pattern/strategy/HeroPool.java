package com.raiden.homework.pattern.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/16
 */
public class HeroPool {
   public static String[] getHeros(HeroType type) {
        String[] result = null;
        switch (type) {
            case Assassin:
                result = new String[]{"阿珂", "兰陵王", "李白"};
                break;
            case Tank:
                result = new String[]{"程咬金", "兰陵王", "盾山"};
                break;
            case Warrior:
                result = new String[]{"典韦", "吕布", "凯"};
                break;
            case Shooter:
                result = new String[]{"鲁班", "后裔", "狄仁杰"};
                break;

        }
        return result;
    }
}
