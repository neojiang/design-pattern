package pattern.builder_pattern;

/**
 * @author: newjiang
 * @date: 2019/9/26 11:24
 * @description: todo
 **/
public class CommonBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("CommonHouse...buildBasic...");
        house.setBaise("10M");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse...buildWalls...");
        house.setWall("0.5M");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse...roofed...");
        house.setRoofed("0.3M");
    }
}
