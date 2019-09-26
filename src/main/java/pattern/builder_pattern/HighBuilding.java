package pattern.builder_pattern;

/**
 * @author: newjiang
 * @date: 2019/9/26 11:22
 * @description: todo
 **/
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("HighBuilding...buildBasic...");
        house.setBaise("200M");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighBuilding...buildWalls...");
        house.setWall("1M");
    }

    @Override
    public void roofed() {
        System.out.println("HighBuilding...roofed...");
        house.setRoofed("0.5M");
    }
}
