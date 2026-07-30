package p153l;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
public class ad4 {
    /* JADX INFO: renamed from: a */
    public static Rect m97009a(float f, float f2, Rect rect, boolean z) {
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
        return new Rect(hhx.m135081a(i, -1000, 1000), hhx.m135081a(i2, -1000, 1000), hhx.m135081a(i3, -1000, 1000), hhx.m135081a((int) ((((f - f3) * 2000.0f) / f) - 1000.0f), -1000, 1000));
    }

    /* JADX INFO: renamed from: b */
    public static Rect m97010b(float f, float f2, Rect rect) {
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
    public static crf0 m97011c(crf0 crf0Var, crf0 crf0Var2, int i) {
        int iM112049a;
        int iM112049a2;
        if (i == 90 || i == 270) {
            int iM112050b = crf0Var.m112050b();
            iM112049a = crf0Var.m112049a();
            iM112049a2 = iM112050b;
        } else {
            iM112049a = crf0Var.m112050b();
            iM112049a2 = crf0Var.m112049a();
        }
        float fM112050b = crf0Var2.m112050b();
        float f = (iM112049a * 1.0f) / fM112050b;
        float fM112049a = crf0Var2.m112049a();
        float f2 = (iM112049a2 * 1.0f) / fM112049a;
        if (f >= f2) {
            f = f2;
        }
        return new crf0((int) (fM112050b * f), (int) (fM112049a * f));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m97012d(Rect rect, Rect rect2, int i) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fWidth2 = rect2.width();
        float fHeight2 = rect2.height();
        float fAbs = Math.abs(fWidth2 - fWidth);
        float f = i;
        return fAbs > f || Math.abs(fHeight2 - fHeight) > f || Math.abs(rect.left - rect2.left) > i || Math.abs(rect.right - rect2.right) > i || Math.abs(rect.top - rect2.top) > i || Math.abs(rect.bottom - rect2.bottom) > i;
    }

    /* JADX INFO: renamed from: e */
    public static crf0 m97013e(crf0 crf0Var, crf0 crf0Var2, int i) {
        if (i == 90 || i == 270) {
            crf0Var = new crf0(crf0Var.m112049a(), crf0Var.m112050b());
        }
        crf0 crf0VarM97011c = m97011c(crf0Var, crf0Var2, 0);
        return new crf0((crf0VarM97011c.m112050b() >> 4) << 4, (crf0VarM97011c.m112049a() >> 4) << 4);
    }

    /* JADX INFO: renamed from: f */
    public static crf0 m97014f(crf0 crf0Var, int i, crf0 crf0Var2, boolean z) {
        if (i == 90 || i == 270) {
            crf0Var = new crf0(crf0Var.m112049a(), crf0Var.m112050b());
        }
        if (!z) {
            return m97011c(crf0Var, crf0Var2, 0);
        }
        crf0 crf0VarM97011c = m97011c(crf0Var, crf0Var2, 0);
        return new crf0((crf0VarM97011c.m112050b() >> 4) << 4, (crf0VarM97011c.m112049a() >> 4) << 4);
    }
}
