package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class cqb implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f82055a;

    /* JADX INFO: renamed from: b */
    public int f82056b = 0;

    /* JADX INFO: renamed from: c */
    public int f82057c;

    /* JADX INFO: renamed from: d */
    public e30<Long> f82058d;

    public cqb(int i, int i2, e30<Long> e30Var) {
        this.f82055a = i;
        this.f82057c = i2;
        this.f82058d = e30Var;
    }

    /* JADX INFO: renamed from: a */
    public void m108245a() {
        e51.m114742G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f82056b;
        int i2 = this.f82055a;
        if (i < i2 * 1000) {
            this.f82058d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f82056b;
            int i4 = this.f82057c;
            this.f82056b = i3 + i4;
            e51.m114743H(CoreModule.f17544b, this, i4);
        }
    }

    public void stop() {
        e51.m114745J(this);
    }
}
