package p153l;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
public class bd4 {
    /* JADX INFO: renamed from: a */
    public static boolean m103591a(Rect rect, Rect rect2, int i) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fWidth2 = rect2.width();
        float fHeight2 = rect2.height();
        float fAbs = Math.abs(fWidth2 - fWidth);
        float f = i;
        return fAbs > f || Math.abs(fHeight2 - fHeight) > f || Math.abs(rect.left - rect2.left) > i || Math.abs(rect.right - rect2.right) > i || Math.abs(rect.top - rect2.top) > i || Math.abs(rect.bottom - rect2.bottom) > i;
    }
}
