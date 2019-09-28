package pattern.chain_of_responsibility_pattern;

import pattern.chain_of_responsibility_pattern.code.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: neojiang
 * @date: 2019/09/28
 * @description: 责任链模式
 *
 **/
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        Random rand = new Random();
        List<IWomen> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }

        // 定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        // 设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : list) {
            father.HandleMessage(women);
        }
    }
}
