package algorithm;

import algorithm.sort.*;
import org.junit.Test;
import util.GetArray;

/**
 * 冒泡排序单元测试
 * Created by zhangkai on 16-10-29.
 */
public class TestSort {

    @Test
    public void test() {
        Sort sortTest = getSortClass(10);

        run(sortTest);
    }

    Sort getSortClass(int arrayLength) {
        int[] array = GetArray.getIntArray(true, arrayLength);
        Sort sortTest = new QuickSort();
        sortTest.setArray(array);
        return sortTest;
    }

    void run(Sort sort) {
        ProxySort proxySort = new ProxySort(sort);

        ProxyAlgorithm proxyAlgorithm = new ProxyAlgorithm(proxySort);

        proxyAlgorithm.run();
    }
}
