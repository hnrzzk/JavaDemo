package algorithm.sort;

import algorithm.ProxyAlgorithm;
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
        sortTest.setArray(array);

        ProxySort proxySort=new ProxySort(sortTest);

        ProxyAlgorithm proxyAlgorithm=new ProxyAlgorithm(proxySort);

        proxyAlgorithm.run();
    }
}
