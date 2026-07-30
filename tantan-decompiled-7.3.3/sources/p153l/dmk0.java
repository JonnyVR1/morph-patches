package p153l;

import android.graphics.Point;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public class dmk0 {

    /* JADX INFO: renamed from: l.dmk0$a */
    public static class C16572a<T> {

        /* JADX INFO: renamed from: a */
        public long f89637a = 0;

        /* JADX INFO: renamed from: b */
        public y20<T> f89638b;

        public C16572a(final int i, final y20<T> y20Var) {
            this.f89638b = new y20() { // from class: l.xlk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194995a.m116967b(i, y20Var, obj);
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m116967b(int i, y20 y20Var, Object obj) {
            if (SystemClock.uptimeMillis() >= this.f89637a + ((long) i)) {
                y20Var.call(obj);
                this.f89637a = SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> y20<T> m116962a(int i, y20<T> y20Var) {
        return new C16572a(i, y20Var).f89638b;
    }

    /* JADX INFO: renamed from: b */
    public static Point m116963b(int i, Point point) {
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
    public static boolean m116964c(Throwable th, Class cls) {
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
    public static int m116965d(int i, int i2) {
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
