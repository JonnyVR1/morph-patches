package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class uyx0 extends d0y0 {

    /* JADX INFO: renamed from: a */
    public String f178925a;

    /* JADX INFO: renamed from: b */
    public boolean f178926b;

    /* JADX INFO: renamed from: c */
    public int f178927c;

    /* JADX INFO: renamed from: d */
    public byte f178928d;

    @Override // p149l.d0y0
    /* JADX INFO: renamed from: a */
    public final d0y0 mo109557a(boolean z) {
        this.f178926b = true;
        this.f178928d = (byte) (1 | this.f178928d);
        return this;
    }

    @Override // p149l.d0y0
    /* JADX INFO: renamed from: b */
    public final d0y0 mo109558b(int i) {
        this.f178927c = 1;
        this.f178928d = (byte) (this.f178928d | 2);
        return this;
    }

    @Override // p149l.d0y0
    /* JADX INFO: renamed from: c */
    public final h0y0 mo109559c() {
        String str;
        yyx0 yyx0Var = null;
        if (this.f178928d == 3 && (str = this.f178925a) != null) {
            return new czx0(str, this.f178926b, this.f178927c, yyx0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f178925a == null) {
            sb.append(" libraryName");
        }
        if ((this.f178928d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f178928d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final d0y0 m196376d(String str) {
        this.f178925a = str;
        return this;
    }
}
