package p149l;

import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uck0 {
    /* JADX INFO: renamed from: a */
    public static final FrameLayout.LayoutParams m193082a(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static final FrameLayout.LayoutParams m193083b() {
        return m193082a(-1, -1);
    }

    /* JADX INFO: renamed from: c */
    public static final FrameLayout.LayoutParams m193084c() {
        return m193082a(-1, -2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m193085d(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
