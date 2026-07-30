package p153l;

import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class amk0 {
    /* JADX INFO: renamed from: a */
    public static final FrameLayout.LayoutParams m98844a(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static final FrameLayout.LayoutParams m98845b() {
        return m98844a(-1, -1);
    }

    /* JADX INFO: renamed from: c */
    public static final FrameLayout.LayoutParams m98846c() {
        return m98844a(-1, -2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m98847d(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
