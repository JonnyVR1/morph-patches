package p149l;

import android.graphics.Point;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public class xck0 {

    /* JADX INFO: renamed from: l.xck0$a */
    public static class C21084a<T> {

        /* JADX INFO: renamed from: a */
        public long f192239a = 0;

        /* JADX INFO: renamed from: b */
        public e30<T> f192240b;

        public C21084a(final int i, final e30<T> e30Var) {
            this.f192240b = new e30() { // from class: l.rck0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158778a.m208125b(i, e30Var, obj);
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m208125b(int i, e30 e30Var, Object obj) {
            if (SystemClock.uptimeMillis() >= this.f192239a + ((long) i)) {
                e30Var.call(obj);
                this.f192239a = SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> e30<T> m208120a(int i, e30<T> e30Var) {
        return new C21084a(i, e30Var).f192240b;
    }

    /* JADX INFO: renamed from: b */
    public static Point m208121b(int i, Point point) {
        float fMax = i / Math.max(point.x, point.y);
        float f = point.x * fMax;
        float f2 = point.y * fMax;
        if (f * 2.7f < f2) {
            f = f2 / 2.7f;
        } else if (f2 * 2.7f < f) {
            f2 = f / 2.7f;
        }
        return new Point((int) f, (int) f2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m208122c(Throwable th, Class cls) {
        int i = 0;
        while (th != null && i <= 10) {
            if (th.getClass() == cls) {
                return true;
            }
            i++;
            th = th.getCause();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m208123d(int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        int i3 = 1;
        if (i <= 2) {
            return 1;
        }
        int i4 = 0;
        int i5 = 1;
        while (i3 < i) {
            int i6 = i4 + i5;
            if (i6 >= i2) {
                return i6;
            }
            i3++;
            i4 = i5;
            i5 = i6;
        }
        return i5;
    }
}
