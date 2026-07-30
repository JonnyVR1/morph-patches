package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class zhw0 extends whw0 {

    /* JADX INFO: renamed from: a */
    public String f204465a;

    /* JADX INFO: renamed from: b */
    public boolean f204466b;

    /* JADX INFO: renamed from: c */
    public boolean f204467c;

    /* JADX INFO: renamed from: d */
    public byte f204468d;

    @Override // p153l.whw0
    /* JADX INFO: renamed from: a */
    public final whw0 mo206520a(String str) {
        if (str != null) {
            this.f204465a = str;
            return this;
        }
        mnd0.m159157a("Null clientVersion");
        return null;
    }

    @Override // p153l.whw0
    /* JADX INFO: renamed from: b */
    public final whw0 mo206521b(boolean z) {
        this.f204467c = true;
        this.f204468d = (byte) (this.f204468d | 2);
        return this;
    }

    @Override // p153l.whw0
    /* JADX INFO: renamed from: c */
    public final whw0 mo206522c(boolean z) {
        this.f204466b = z;
        this.f204468d = (byte) (this.f204468d | 1);
        return this;
    }

    @Override // p153l.whw0
    /* JADX INFO: renamed from: d */
    public final xhw0 mo206523d() {
        String str;
        aiw0 aiw0Var = null;
        if (this.f204468d == 3 && (str = this.f204465a) != null) {
            return new biw0(str, this.f204466b, this.f204467c, aiw0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f204465a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f204468d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f204468d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
