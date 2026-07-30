package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class psh0 {
    /* JADX INFO: renamed from: a */
    public static int m173642a(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(m173643b(i, i2), 1073741824);
    }

    /* JADX INFO: renamed from: b */
    public static int m173643b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || size <= 0 || size2 <= 0) {
            return ((mode != 1073741824 || size <= 0) && ((mode2 == 1073741824 && size2 > 0) || size >= size2)) ? size2 : size;
        }
        return Math.min(size, size2);
    }
}
