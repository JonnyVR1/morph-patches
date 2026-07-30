package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class npd0 implements aqd0 {

    /* JADX INFO: renamed from: h */
    public static final int[] f143088h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i */
    public static final int[] f143089i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a */
    public final zpd0 f143090a;

    /* JADX INFO: renamed from: b */
    public final boolean f143091b;

    /* JADX INFO: renamed from: c */
    public final int f143092c;

    /* JADX INFO: renamed from: d */
    public qfj0 f143093d;

    /* JADX INFO: renamed from: e */
    public long f143094e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public int f143096g = -1;

    /* JADX INFO: renamed from: f */
    public long f143095f = 0;

    public npd0(zpd0 zpd0Var) {
        this.f143090a = zpd0Var;
        this.f143091b = "audio/amr-wb".equals(w11.m204369e(zpd0Var.f205455c.f7785l));
        this.f143092c = zpd0Var.f205454b;
    }

    /* JADX INFO: renamed from: e */
    public static int m164225e(int i, boolean z) {
        boolean z2 = (i >= 0 && i <= 8) || i == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(z ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        w11.m204366b(z2, sb.toString());
        return z ? f143089i[i] : f143088h[i];
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f143094e = j;
        this.f143095f = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        int iM207434b;
        w11.m204373i(this.f143093d);
        int i2 = this.f143096g;
        if (i2 != -1 && i != (iM207434b = wpd0.m207434b(i2))) {
            kyv.m152151i("RtpAmrReader", bmk0.m105071D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iM207434b), Integer.valueOf(i)));
        }
        ig60Var.m139809V(1);
        int iM164225e = m164225e((ig60Var.m139820j() >> 3) & 15, this.f143091b);
        int iM139811a = ig60Var.m139811a();
        w11.m204366b(iM139811a == iM164225e, "compound payload not supported currently");
        this.f143093d.m176370d(ig60Var, iM139811a);
        this.f143093d.mo11163a(cqd0.m111889a(this.f143095f, j, this.f143094e, this.f143092c), 1, iM139811a, 0, null);
        this.f143096g = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        this.f143094e = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 1);
        this.f143093d = qfj0VarMo11416b;
        qfj0VarMo11416b.mo11164b(this.f143090a.f205455c);
    }
}
