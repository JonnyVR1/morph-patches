package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class ffx {
    /* JADX INFO: renamed from: a */
    public static int m121198a(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static int m121199b(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    /* JADX INFO: renamed from: c */
    public static int m121200c(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* JADX INFO: renamed from: d */
    public static int m121201d(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m121202e() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
