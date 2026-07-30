package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class htb extends ioi0<mtb> {

    /* JADX INFO: renamed from: h */
    public ctb f111516h;

    /* JADX INFO: renamed from: i */
    public Runnable f111517i;

    /* JADX INFO: renamed from: l.htb$a */
    public class RunnableC17577a implements Runnable {
        public RunnableC17577a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (htb.this.m141316o()) {
                float fM122431b = etb.m122431b();
                if (htb.this.m137072w(fM122431b)) {
                    ftb ftbVar = new ftb(fM122431b, du2.m118046f());
                    ftbVar.m121751a(htb.this.mo82324j());
                    htb.this.m141317q(ftbVar);
                }
                u21.m194239c(this, htb.this.f111516h.m112453g());
            }
        }
    }

    public htb() {
        this.f111517i = new RunnableC17577a();
        this.f111516h = new ctb();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: c */
    public long mo82319c() {
        return this.f111516h.m112456j();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: d */
    public int mo82320d() {
        return this.f111516h.m112457k();
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: e */
    public long mo82321e() {
        return this.f111516h.m112458l();
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: j */
    public String mo82324j() {
        return "cpu";
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: k */
    public f6m mo82325k() {
        return new ltb(mo82324j());
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: l */
    public uni0 mo82326l() {
        return this.f111516h;
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: p */
    public int mo82328p() {
        return 30;
    }

    @Override // p153l.ioi0
    /* JADX INFO: renamed from: r */
    public void mo82329r() {
        u21.m194239c(this.f111517i, this.f111516h.m112455i());
    }

    @Override // p153l.qzl
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public mtb mo82322f() {
        return new mtb(etb.m122431b());
    }

    /* JADX INFO: renamed from: w */
    public final boolean m137072w(float f) {
        return f > ((float) this.f111516h.m112454h()) && f <= 100.0f;
    }

    public htb(@NonNull ctb ctbVar) {
        this.f111517i = new RunnableC17577a();
        this.f111516h = ctbVar;
    }
}
