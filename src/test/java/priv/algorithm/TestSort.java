package priv.algorithm;

import priv.algorithm.sort.MergeSort;
import priv.algorithm.sort.ProxySort;
import priv.algorithm.sort.Sort;
import org.junit.Test;
import priv.util.GetArray;

/**
 * 冒泡排序单元测试
 * Created by zhangkai on 16-10-29.
 */
public class TestSort {

    @Test
    public void test() {
        Sort sortTest = getSortClass(10000);

        run(sortTest);
    }

    Sort getSortClass(int arrayLength) {
        int[] array = GetArray.getIntArray(true, arrayLength);
        Sort sortTest = new MergeSort();
        sortTest.setArray(array);
        return sortTest;
    }

    void run(Sort sort) {
        ProxySort proxySort = new ProxySort(sort);

        proxySort.run();
    }
}
