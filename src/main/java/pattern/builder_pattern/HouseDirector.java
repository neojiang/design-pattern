package pattern.builder_pattern;

import lombok.Setter;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: todo
 **/
public class HouseDirector {

    @Setter
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

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
