package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class equ0 extends bjs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f92854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f92855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f92856c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l4w0 f92857d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ n3t0 f92858e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ fqu0 f92859f;

    public equ0(fqu0 fqu0Var, Object obj, String str, long j, l4w0 l4w0Var, n3t0 n3t0Var) {
        this.f92854a = obj;
        this.f92855b = str;
        this.f92856c = j;
        this.f92857d = l4w0Var;
        this.f92858e = n3t0Var;
        this.f92859f = fqu0Var;
    }

    @Override // p149l.cjs0
    /* JADX INFO: renamed from: c */
    public final void mo97009c(String str) {
        synchronized (this.f92854a) {
            this.f92859f.m122767v(this.f92855b, false, str, (int) (vny0.m199064b().elapsedRealtime() - this.f92856c));
            this.f92859f.f98855l.m102985b(this.f92855b, "error");
            this.f92859f.f98858o.mo132586b(this.f92855b, "error");
            b5w0 b5w0Var = this.f92859f.f98859p;
            l4w0 l4w0Var = this.f92857d;
            l4w0Var.zzc(str);
            l4w0Var.mo129461S(false);
            b5w0Var.m100344b(l4w0Var.zzl());
            this.f92858e.m157774b(Boolean.FALSE);
        }
    }

    @Override // p149l.cjs0
    public final void zzf() {
        synchronized (this.f92854a) {
            this.f92859f.m122767v(this.f92855b, true, "", (int) (vny0.m199064b().elapsedRealtime() - this.f92856c));
            this.f92859f.f98855l.m102987d(this.f92855b);
            this.f92859f.f98858o.mo132587z(this.f92855b);
            b5w0 b5w0Var = this.f92859f.f98859p;
            l4w0 l4w0Var = this.f92857d;
            l4w0Var.mo129461S(true);
            b5w0Var.m100344b(l4w0Var.zzl());
            this.f92858e.m157774b(Boolean.TRUE);
        }
    }
}
