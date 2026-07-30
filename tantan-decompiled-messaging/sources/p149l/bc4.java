package p149l;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
public class bc4 {
    /* JADX INFO: renamed from: a */
    public static Rect m101040a(float f, float f2, Rect rect, boolean z) {
        int i;
        int i2;
        int i3;
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        if (z) {
            i = (int) ((f2 - ((f4 * 2000.0f) / f2)) - 1000.0f);
            i2 = (int) (((f - (f5 * 2000.0f)) / f) - 1000.0f);
            i3 = (int) ((f2 - ((f6 * 2000.0f) / f2)) - 1000.0f);
        } else {
            i = (int) (((f4 * 2000.0f) / f2) - 1000.0f);
            i2 = (int) (((f - (f5 * 2000.0f)) / f) - 1000.0f);
            i3 = (int) (((f6 * 2000.0f) / f2) - 1000.0f);
        }
        return new Rect(iex.m135820a(i, -1000, 1000), iex.m135820a(i2, -1000, 1000), iex.m135820a(i3, -1000, 1000), iex.m135820a((int) ((((f - f3) * 2000.0f) / f) - 1000.0f), -1000, 1000));
    }

    /* JADX INFO: renamed from: b */
    public static Rect m101041b(float f, float f2, Rect rect) {
        float f3 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        if (f4 <= 0.0f) {
            f4 = 0.0f;
        }
        if (f5 > f) {
            f5 = f;
        }
        if (f6 > f2) {
            f6 = f2;
        }
        return new Rect((int) (((f3 * 2000.0f) / f) - 1000.0f), (int) (((f4 * 2000.0f) / f2) - 1000.0f), (int) (((f5 * 2000.0f) / f) - 1000.0f), (int) (((f6 * 2000.0f) / f2) - 1000.0f));
    }

    /* JADX INFO: renamed from: c */
    public static tif0 m101042c(tif0 tif0Var, tif0 tif0Var2, int i) {
        int iM189183a;
        int iM189183a2;
        if (i == 90 || i == 270) {
            int iM189184b = tif0Var.m189184b();
            iM189183a = tif0Var.m189183a();
            iM189183a2 = iM189184b;
        } else {
            iM189183a = tif0Var.m189184b();
            iM189183a2 = tif0Var.m189183a();
        }
        float fM189184b = tif0Var2.m189184b();
        float f = (iM189183a * 1.0f) / fM189184b;
        float fM189183a = tif0Var2.m189183a();
        float f2 = (iM189183a2 * 1.0f) / fM189183a;
        if (f >= f2) {
            f = f2;
        }
        return new tif0((int) (fM189184b * f), (int) (fM189183a * f));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m101043d(Rect rect, Rect rect2, int i) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fWidth2 = rect2.width();
        float fHeight2 = rect2.height();
        float fAbs = Math.abs(fWidth2 - fWidth);
        float f = i;
        return fAbs > f || Math.abs(fHeight2 - fHeight) > f || Math.abs(rect.left - rect2.left) > i || Math.abs(rect.right - rect2.right) > i || Math.abs(rect.top - rect2.top) > i || Math.abs(rect.bottom - rect2.bottom) > i;
    }

    /* JADX INFO: renamed from: e */
    public static tif0 m101044e(tif0 tif0Var, tif0 tif0Var2, int i) {
        if (i == 90 || i == 270) {
            tif0Var = new tif0(tif0Var.m189183a(), tif0Var.m189184b());
        }
        tif0 tif0VarM101042c = m101042c(tif0Var, tif0Var2, 0);
        return new tif0((tif0VarM101042c.m189184b() >> 4) << 4, (tif0VarM101042c.m189183a() >> 4) << 4);
    }

    /* JADX INFO: renamed from: f */
    public static tif0 m101045f(tif0 tif0Var, int i, tif0 tif0Var2, boolean z) {
        if (i == 90 || i == 270) {
            tif0Var = new tif0(tif0Var.m189183a(), tif0Var.m189184b());
        }
        if (!z) {
            return m101042c(tif0Var, tif0Var2, 0);
        }
        tif0 tif0VarM101042c = m101042c(tif0Var, tif0Var2, 0);
        return new tif0((tif0VarM101042c.m189184b() >> 4) << 4, (tif0VarM101042c.m189183a() >> 4) << 4);
    }
}
