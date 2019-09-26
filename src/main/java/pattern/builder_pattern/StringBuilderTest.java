package pattern.builder_pattern;

/**
 * @author: neojiang
 * @date:  2019/9/26
 * @description: StringBuilder的测试类
 *
 * JDK中StringBuilder是使用了建造者模式设计的。
 *
 **/
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder);
    }
}
/*
1.  //todo StringBuilder的构造函数

    public StringBuilder(String str) {
        super(str.length() + 16);
        append(str);
    }

2.  //todo AbstractStringBuilder的append(String str)方法

    public AbstractStringBuilder append(String str) {
        if (str == null)
            return appendNull();
        int len = str.length();
        ensureCapacityInternal(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

3.  //todo StringBuilder继承于AbstractStringBuilder

    public final class StringBuilder extends AbstractStringBuilder
                     implements java.io.Serializable, CharSequence

*/

