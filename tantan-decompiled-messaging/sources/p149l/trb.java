package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class trb extends ifi0<yrb> {

    /* JADX INFO: renamed from: h */
    public orb f171798h;

    /* JADX INFO: renamed from: i */
    public Runnable f171799i;

    /* JADX INFO: renamed from: l.trb$a */
    public class RunnableC20259a implements Runnable {
        public RunnableC20259a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (trb.this.m135926o()) {
                float fM175982b = qrb.m175982b();
                if (trb.this.m190370w(fM175982b)) {
                    rrb rrbVar = new rrb(fM175982b, nt2.m160815f());
                    rrbVar.m116070a(trb.this.mo81141j());
                    trb.this.m135927q(rrbVar);
                }
                n21.m157542c(this, trb.this.f171798h.m165534g());
            }
        }
    }

    public trb() {
        this.f171799i = new RunnableC20259a();
        this.f171798h = new orb();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: c */
    public long mo81136c() {
        return this.f171798h.m165537j();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: d */
    public int mo81137d() {
        return this.f171798h.m165538k();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: e */
    public long mo81138e() {
        return this.f171798h.m165539l();
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: j */
    public String mo81141j() {
        return "cpu";
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: k */
    public o3m mo81142k() {
        return new xrb(mo81141j());
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: l */
    public uei0 mo81143l() {
        return this.f171798h;
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: p */
    public int mo81145p() {
        return 30;
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: r */
    public void mo81146r() {
        n21.m157542c(this.f171799i, this.f171798h.m165536i());
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public yrb mo81139f() {
        return new yrb(qrb.m175982b());
    }

    /* JADX INFO: renamed from: w */
    public final boolean m190370w(float f) {
        return f > ((float) this.f171798h.m165535h()) && f <= 100.0f;
    }

    public trb(@NonNull orb orbVar) {
        this.f171799i = new RunnableC20259a();
        this.f171798h = orbVar;
    }
}
