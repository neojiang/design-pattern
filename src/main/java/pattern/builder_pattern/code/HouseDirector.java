package pattern.builder_pattern.code;

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

}
