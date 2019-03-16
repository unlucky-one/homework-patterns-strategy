import com.raiden.homework.pattern.strategy.HeroPool;
import com.raiden.homework.pattern.strategy.HeroType;

public class Main {

    public static void main(String[] args) {

        String[] heros=HeroPool.getHeros(HeroType.Assassin);
        for (String hero:heros){
            System.out.println(hero);
        }

    }
}
