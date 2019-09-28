package pattern.builder_pattern;

import pattern.builder_pattern.code.CommonBuilding;
import pattern.builder_pattern.code.HighBuilding;
import pattern.builder_pattern.code.House;
import pattern.builder_pattern.code.HouseDirector;

/**
 * @author: newjiang
 * @date: 2019/9/28 10:47
 * @description: 构造者模式
 **/
public class BuilderPattern {

    public static void main(String[] args) {

        HouseDirector commonDirector = new HouseDirector(new CommonBuilding());
        House common = commonDirector.constructHouse();
        System.out.println(common);
        System.out.println();
        HouseDirector highDirector = new HouseDirector(new HighBuilding());
        House high = highDirector.constructHouse();
        System.out.println(high);
    }
}
