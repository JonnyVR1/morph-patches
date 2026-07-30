package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class q7k {

    /* JADX INFO: renamed from: a */
    private t7k f155966a;

    /* JADX INFO: renamed from: b */
    private s7k f155967b;

    /* JADX INFO: renamed from: l.q7k$a */
    public class C19533a implements v7k {
        public C19533a() {
        }

        @Override // p153l.v7k
        public void getRenderTime(double d) {
            q7k.this.f155967b.getGpuBenmark(d);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m175659b() {
        this.f155966a = new t7k();
        this.f155966a.m195768a(new afj(512, 512));
    }

    /* JADX INFO: renamed from: c */
    public void m175660c() {
        t7k t7kVar = this.f155966a;
        if (t7kVar != null) {
            t7kVar.m195771i();
            this.f155966a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m175661d(s7k s7kVar) {
        this.f155967b = s7kVar;
    }

    /* JADX INFO: renamed from: e */
    public void m175662e() {
        m175659b();
        this.f155966a.m189622n(new C19533a());
        this.f155966a.m195773l();
        this.f155966a.m195772k();
    }
}
