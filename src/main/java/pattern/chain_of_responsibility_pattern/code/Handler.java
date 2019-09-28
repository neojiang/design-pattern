package pattern.chain_of_responsibility_pattern.code;

/**
 * @author: newjiang
 * @date: 2019/9/28 10:19
 * @description: todo
 **/
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个人责任人是谁
    private Handler nextHandler;

    // 每个类都要说明一下自己能处理哪些请求
    public Handler(int level) {
        this.level = level;
    }

    /*
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    // 有请示那当然要回应
    protected abstract void response(IWomen women);


    // 一个女性(女儿、妻子或者是母亲)要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

}
