package pattern.chain_of_responsibility_pattern.code;

/**
 * @author: newjiang
 * @date: 2019/9/28 10:20
 * @description: todo
 **/
public class Father extends Handler {

    // 父亲只处理女儿的请求
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    // 父亲的答复
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
