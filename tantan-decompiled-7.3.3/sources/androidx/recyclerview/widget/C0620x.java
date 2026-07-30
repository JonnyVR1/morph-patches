package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x */
/* JADX INFO: loaded from: classes.dex */
public class C0620x {

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
        public void m3867a(int i) {
            this.f2928a = i | this.f2928a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3868b() {
            int i = this.f2928a;
            if ((i & 7) != 0 && (i & m3869c(this.f2931d, this.f2929b)) == 0) {
                return false;
            }
            int i2 = this.f2928a;
            if ((i2 & 112) != 0 && (i2 & (m3869c(this.f2931d, this.f2930c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2928a;
            if ((i3 & 1792) != 0 && (i3 & (m3869c(this.f2932e, this.f2929b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2928a;
            return (i4 & 28672) == 0 || ((m3869c(this.f2932e, this.f2930c) << 12) & i4) != 0;
        }

        /* JADX INFO: renamed from: c */
        public int m3869c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* JADX INFO: renamed from: d */
        public void m3870d() {
            this.f2928a = 0;
        }

        /* JADX INFO: renamed from: e */
        public void m3871e(int i, int i2, int i3, int i4) {
            this.f2929b = i;
            this.f2930c = i2;
            this.f2931d = i3;
            this.f2932e = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.x$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo3410a(int i);

        /* JADX INFO: renamed from: b */
        int mo3411b();

        /* JADX INFO: renamed from: c */
        int mo3412c();

        /* JADX INFO: renamed from: d */
        int mo3413d(View view);

        /* JADX INFO: renamed from: e */
        int mo3414e(View view);
    }

    public C0620x(b bVar) {
        this.f2926a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public View m3865a(int i, int i2, int i3, int i4) {
        int iMo3411b = this.f2926a.mo3411b();
        int iMo3412c = this.f2926a.mo3412c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo3410a = this.f2926a.mo3410a(i);
            this.f2927b.m3871e(iMo3411b, iMo3412c, this.f2926a.mo3413d(viewMo3410a), this.f2926a.mo3414e(viewMo3410a));
            if (i3 != 0) {
                this.f2927b.m3870d();
                this.f2927b.m3867a(i3);
                if (this.f2927b.m3868b()) {
                    return viewMo3410a;
                }
            }
            if (i4 != 0) {
                this.f2927b.m3870d();
                this.f2927b.m3867a(i4);
                if (this.f2927b.m3868b()) {
                    view = viewMo3410a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3866b(View view, int i) {
        this.f2927b.m3871e(this.f2926a.mo3411b(), this.f2926a.mo3412c(), this.f2926a.mo3413d(view), this.f2926a.mo3414e(view));
        if (i == 0) {
            return false;
        }
        this.f2927b.m3870d();
        this.f2927b.m3867a(i);
        return this.f2927b.m3868b();
    }
}
