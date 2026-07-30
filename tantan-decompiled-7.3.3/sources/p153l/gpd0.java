package p153l;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class gpd0 {

    /* JADX INFO: renamed from: a */
    public int f105454a = 1;

    /* JADX INFO: renamed from: b */
    public C17270a[] f105455b;

    /* JADX INFO: renamed from: l.gpd0$a */
    public static class C17270a {

        /* JADX INFO: renamed from: a */
        public float f105456a;

        /* JADX INFO: renamed from: b */
        public float f105457b;

        /* JADX INFO: renamed from: c */
        public float f105458c;

        /* JADX INFO: renamed from: d */
        public float f105459d;

        public C17270a(float f, float f2, float f3, float f4) {
            this.f105456a = f3;
            this.f105457b = f4;
            this.f105458c = f;
            this.f105459d = f2;
        }
    }

    public gpd0() {
        m131255b(0);
    }

    /* JADX INFO: renamed from: a */
    public FrameLayout.LayoutParams m131254a(int i) {
        if (i < 1 || i > this.f105454a) {
            return null;
        }
        C17270a c17270a = this.f105455b[i - 1];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) c17270a.f105456a, (int) c17270a.f105457b);
        layoutParams.topMargin = (int) c17270a.f105459d;
        layoutParams.leftMargin = (int) c17270a.f105458c;
        return layoutParams;
    }

    /* JADX INFO: renamed from: b */
    public void m131255b(int i) {
        if (i == 0) {
            this.f105454a = 1;
            this.f105455b = new C17270a[]{new C17270a(0.0f, 0.0f, -1.0f, -1.0f)};
        } else {
            if (i != 1) {
                return;
            }
            this.f105454a = 2;
            int i2 = fct.f98261a;
            this.f105455b = new C17270a[]{new C17270a(0.0f, i2, ynp0.m216939p() * 0.5f, ynp0.m216939p() * 0.5f * 1.488f), new C17270a(ynp0.m216939p() / 2, i2, ynp0.m216939p() * 0.5f, ynp0.m216939p() * 0.5f * 1.488f)};
        }
    }
}
