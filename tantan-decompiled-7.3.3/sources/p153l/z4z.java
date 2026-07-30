package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes12.dex */
public class z4z implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f202990a;

    /* JADX INFO: renamed from: b */
    public int f202991b = 0;

    /* JADX INFO: renamed from: c */
    public int f202992c;

    /* JADX INFO: renamed from: d */
    public y20<Long> f202993d;

    public z4z(int i, int i2, y20<Long> y20Var) {
        this.f202990a = i;
        this.f202992c = i2;
        this.f202993d = y20Var;
    }

    /* JADX INFO: renamed from: a */
    public void m218617a() {
        l51.m152887G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f202991b;
        int i2 = this.f202990a;
        if (i < i2 * 1000) {
            this.f202993d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f202991b;
            int i4 = this.f202992c;
            this.f202991b = i3 + i4;
            l51.m152888H(CoreModule.f18263b, this, i4);
        }
    }

    public void stop() {
        l51.m152890J(this);
    }
}
