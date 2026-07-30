package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class y4k {

    /* JADX INFO: renamed from: a */
    private b5k f196302a;

    /* JADX INFO: renamed from: b */
    private a5k f196303b;

    /* JADX INFO: renamed from: l.y4k$a */
    public class C21307a implements d5k {
        public C21307a() {
        }

        @Override // p149l.d5k
        public void getRenderTime(double d) {
            y4k.this.f196303b.getGpuBenmark(d);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m212919b() {
        this.f196302a = new b5k();
        this.f196302a.m95806a(new gcj(512, 512));
    }

    /* JADX INFO: renamed from: c */
    public void m212920c() {
        b5k b5kVar = this.f196302a;
        if (b5kVar != null) {
            b5kVar.m95813i();
            this.f196302a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m212921d(a5k a5kVar) {
        this.f196303b = a5kVar;
    }

    /* JADX INFO: renamed from: e */
    public void m212922e() {
        m212919b();
        this.f196302a.m100341n(new C21307a());
        this.f196302a.m95815l();
        this.f196302a.m95814k();
    }
}
