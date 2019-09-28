package pattern.builder_pattern.code;

/**
 * @author: neojiang
 * @date: 2019/9/26
 * @description: todo
 **/
public abstract class HouseBuilder {

    protected House house = new House();

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
