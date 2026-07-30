package p002l;

import android.widget.FrameLayout;
import l.eat;
import l.uep0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dhd0 {

    /* JADX INFO: renamed from: a */
    public int f9270a = 1;

    /* JADX INFO: renamed from: b */
    public C0530a[] f9271b;

    /* JADX INFO: renamed from: l.dhd0$a */
    public static class C0530a {

        /* JADX INFO: renamed from: a */
        public float f9272a;

        /* JADX INFO: renamed from: b */
        public float f9273b;

        /* JADX INFO: renamed from: c */
        public float f9274c;

        /* JADX INFO: renamed from: d */
        public float f9275d;

        public C0530a(float f, float f2, float f3, float f4) {
            this.f9272a = f3;
            this.f9273b = f4;
            this.f9274c = f;
            this.f9275d = f2;
        }
    }

    public dhd0() {
        m11888b(0);
    }

    /* JADX INFO: renamed from: a */
    public FrameLayout.LayoutParams m11887a(int i) {
        if (i < 1 || i > this.f9270a) {
            return null;
        }
        C0530a c0530a = this.f9271b[i - 1];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) c0530a.f9272a, (int) c0530a.f9273b);
        layoutParams.topMargin = (int) c0530a.f9275d;
        layoutParams.leftMargin = (int) c0530a.f9274c;
        return layoutParams;
    }

    /* JADX INFO: renamed from: b */
    public void m11888b(int i) {
        if (i == 0) {
            this.f9270a = 1;
            this.f9271b = new C0530a[]{new C0530a(0.0f, 0.0f, -1.0f, -1.0f)};
        } else {
            if (i != 1) {
                return;
            }
            this.f9270a = 2;
            int i2 = eat.a;
            this.f9271b = new C0530a[]{new C0530a(0.0f, i2, uep0.p() * 0.5f, uep0.p() * 0.5f * 1.488f), new C0530a(uep0.p() / 2, i2, uep0.p() * 0.5f, uep0.p() * 0.5f * 1.488f)};
        }
    }
}
