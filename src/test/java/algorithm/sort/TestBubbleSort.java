package algorithm.sort;

import org.junit.Test;
import util.GetArray;
import util.PrintData;

/**
 * 冒泡排序单元测试
 * Created by zhangkai on 16-10-29.
 */
public class TestBubbleSort {

    @Test
    public void test() {
        int[] array = GetArray.getIntArray(true, 10);
        Sort sortTest = new BubbleSort();
        System.out.println("before sort:");
        PrintData.printIntArray(array);
        sortTest.sort(array);
        System.out.println("after sort:");
        PrintData.printIntArray(array);
    }
}
