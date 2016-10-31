package algorithm.sort;

/**
 * 排序算法demo的基类 模板方法
 * Created by zhangkai on 16-10-29.
 */
public abstract class Sort {
    public abstract void sort(int[] array);

    /**
     * 将数组中的x与y交换
     *
     * @param array 要交换打数组
     * @param x
     * @param y
     */
    protected void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
