package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x */
/* JADX INFO: loaded from: classes.dex */
public class C0618x {

    /* JADX INFO: renamed from: a */
    public final b f2926a;

    /* JADX INFO: renamed from: b */
    public a f2927b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.x$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f2928a = 0;

        /* JADX INFO: renamed from: b */
        public int f2929b;

        /* JADX INFO: renamed from: c */
        public int f2930c;

        /* JADX INFO: renamed from: d */
        public int f2931d;

        /* JADX INFO: renamed from: e */
        public int f2932e;

        /* JADX INFO: renamed from: a */
        public void m3866a(int i) {
            this.f2928a = i | this.f2928a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3867b() {
            int i = this.f2928a;
            if ((i & 7) != 0 && (i & m3868c(this.f2931d, this.f2929b)) == 0) {
                return false;
            }
            int i2 = this.f2928a;
            if ((i2 & 112) != 0 && (i2 & (m3868c(this.f2931d, this.f2930c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2928a;
            if ((i3 & 1792) != 0 && (i3 & (m3868c(this.f2932e, this.f2929b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2928a;
            return (i4 & 28672) == 0 || ((m3868c(this.f2932e, this.f2930c) << 12) & i4) != 0;
        }

        /* JADX INFO: renamed from: c */
        public int m3868c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* JADX INFO: renamed from: d */
        public void m3869d() {
            this.f2928a = 0;
        }

        /* JADX INFO: renamed from: e */
        public void m3870e(int i, int i2, int i3, int i4) {
            this.f2929b = i;
            this.f2930c = i2;
            this.f2931d = i3;
            this.f2932e = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.x$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo3401a(int i);

        /* JADX INFO: renamed from: b */
        int mo3402b();

        /* JADX INFO: renamed from: c */
        int mo3403c();

        /* JADX INFO: renamed from: d */
        int mo3404d(View view);

        /* JADX INFO: renamed from: e */
        int mo3405e(View view);
    }

    public C0618x(b bVar) {
        this.f2926a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public View m3864a(int i, int i2, int i3, int i4) {
        int iMo3402b = this.f2926a.mo3402b();
        int iMo3403c = this.f2926a.mo3403c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo3401a = this.f2926a.mo3401a(i);
            this.f2927b.m3870e(iMo3402b, iMo3403c, this.f2926a.mo3404d(viewMo3401a), this.f2926a.mo3405e(viewMo3401a));
            if (i3 != 0) {
                this.f2927b.m3869d();
                this.f2927b.m3866a(i3);
                if (this.f2927b.m3867b()) {
                    return viewMo3401a;
                }
            }
            if (i4 != 0) {
                this.f2927b.m3869d();
                this.f2927b.m3866a(i4);
                if (this.f2927b.m3867b()) {
                    view = viewMo3401a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3865b(View view, int i) {
        this.f2927b.m3870e(this.f2926a.mo3402b(), this.f2926a.mo3403c(), this.f2926a.mo3404d(view), this.f2926a.mo3405e(view));
        if (i == 0) {
            return false;
        }
        this.f2927b.m3869d();
        this.f2927b.m3866a(i);
        return this.f2927b.m3867b();
    }
}
