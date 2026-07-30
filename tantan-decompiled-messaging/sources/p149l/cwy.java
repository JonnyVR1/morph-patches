package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class cwy implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f82817a;

    /* JADX INFO: renamed from: b */
    public int f82818b = 0;

    /* JADX INFO: renamed from: c */
    public int f82819c;

    /* JADX INFO: renamed from: d */
    public e30<Long> f82820d;

    public cwy(int i, int i2, e30<Long> e30Var) {
        this.f82817a = i;
        this.f82819c = i2;
        this.f82820d = e30Var;
    }

    /* JADX INFO: renamed from: a */
    public void m109078a() {
        e51.m114742G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f82818b;
        int i2 = this.f82817a;
        if (i < i2 * 1000) {
            this.f82820d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f82818b;
            int i4 = this.f82819c;
            this.f82818b = i3 + i4;
            e51.m114743H(CoreModule.f17544b, this, i4);
        }
    }

    public void stop() {
        e51.m114745J(this);
    }
}
