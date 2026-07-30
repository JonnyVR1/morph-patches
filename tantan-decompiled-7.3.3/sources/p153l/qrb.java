package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class qrb implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f159082a;

    /* JADX INFO: renamed from: b */
    public int f159083b = 0;

    /* JADX INFO: renamed from: c */
    public int f159084c;

    /* JADX INFO: renamed from: d */
    public y20<Long> f159085d;

    public qrb(int i, int i2, y20<Long> y20Var) {
        this.f159082a = i;
        this.f159084c = i2;
        this.f159085d = y20Var;
    }

    /* JADX INFO: renamed from: a */
    public void m177533a() {
        l51.m152887G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f159083b;
        int i2 = this.f159082a;
        if (i < i2 * 1000) {
            this.f159085d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f159083b;
            int i4 = this.f159084c;
            this.f159083b = i3 + i4;
            l51.m152888H(CoreModule.f18263b, this, i4);
        }
    }

    public void stop() {
        l51.m152890J(this);
    }
}
