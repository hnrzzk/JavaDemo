package algorithm.sort;

import util.PrintData;

/**
 * Created by zhangkai on 16-10-31.
 */
public class ProxySort extends Sort {

    Sort sort;

    public ProxySort(Sort sort) {
        this.sort = sort;
    }

    void sort() {
        String before = String.format("Before sort:\n %s", PrintData.arrayToString(sort.array));
        System.out.println(before);
        sort.sort();
        String after = String.format("After sort:\n %s", PrintData.arrayToString(sort.array));
        System.out.println(after);
    }


}
