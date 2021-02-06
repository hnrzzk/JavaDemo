package priv.net.nio;

import java.io.Serializable;

/**
 * Created by zhangkai on 2018/4/26.
 */
public class Test {

}

class Single implements Serializable{
    private static Single instance = new Single();

    public static Single getInstance() {
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
