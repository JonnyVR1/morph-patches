package p149l;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class dhd0 {

    /* JADX INFO: renamed from: a */
    public int f86274a = 1;

    /* JADX INFO: renamed from: b */
    public C16376a[] f86275b;

    /* JADX INFO: renamed from: l.dhd0$a */
    public static class C16376a {

        /* JADX INFO: renamed from: a */
        public float f86276a;

        /* JADX INFO: renamed from: b */
        public float f86277b;

        /* JADX INFO: renamed from: c */
        public float f86278c;

        /* JADX INFO: renamed from: d */
        public float f86279d;

        public C16376a(float f, float f2, float f3, float f4) {
            this.f86276a = f3;
            this.f86277b = f4;
            this.f86278c = f;
            this.f86279d = f2;
        }
    }

    public dhd0() {
        m111819b(0);
    }

    /* JADX INFO: renamed from: a */
    public FrameLayout.LayoutParams m111818a(int i) {
        if (i < 1 || i > this.f86274a) {
            return null;
        }
        C16376a c16376a = this.f86275b[i - 1];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) c16376a.f86276a, (int) c16376a.f86277b);
        layoutParams.topMargin = (int) c16376a.f86279d;
        layoutParams.leftMargin = (int) c16376a.f86278c;
        return layoutParams;
    }

    /* JADX INFO: renamed from: b */
    public void m111819b(int i) {
        if (i == 0) {
            this.f86274a = 1;
            this.f86275b = new C16376a[]{new C16376a(0.0f, 0.0f, -1.0f, -1.0f)};
        } else {
            if (i != 1) {
                return;
            }
            this.f86274a = 2;
            int i2 = eat.f90243a;
            this.f86275b = new C16376a[]{new C16376a(0.0f, i2, uep0.m193329p() * 0.5f, uep0.m193329p() * 0.5f * 1.488f), new C16376a(uep0.m193329p() / 2, i2, uep0.m193329p() * 0.5f, uep0.m193329p() * 0.5f * 1.488f)};
        }
    }
}
