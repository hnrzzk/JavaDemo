package util;

import java.util.Map;
import java.util.Random;

/**
 * Created by zhangkai on 16-10-30.
 */
public class GetRandom {

    public static int getInt(int start,int end){
        return start+(int)(Math.random()*(end-start));
    }
}
