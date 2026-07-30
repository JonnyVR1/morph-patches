package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cqb implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f10726a;

    /* JADX INFO: renamed from: b */
    public int f10727b = 0;

    /* JADX INFO: renamed from: c */
    public int f10728c;

    /* JADX INFO: renamed from: d */
    public e30<Long> f10729d;

    public cqb(int i, int i2, e30<Long> e30Var) {
        this.f10726a = i;
        this.f10728c = i2;
        this.f10729d = e30Var;
    }

    /* JADX INFO: renamed from: a */
    public void m12760a() {
        e51.G(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f10727b;
        int i2 = this.f10726a;
        if (i < i2 * 1000) {
            this.f10729d.call(Long.valueOf((((long) i2) * 1000) - ((long) i)));
            int i3 = this.f10727b;
            int i4 = this.f10728c;
            this.f10727b = i3 + i4;
            e51.H(CoreModule.b, this, i4);
        }
    }

    public void stop() {
        e51.J(this);
    }
}
