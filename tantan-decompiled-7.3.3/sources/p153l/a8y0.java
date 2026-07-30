package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class a8y0 extends j9y0 {

    /* JADX INFO: renamed from: a */
    public String f68972a;

    /* JADX INFO: renamed from: b */
    public boolean f68973b;

    /* JADX INFO: renamed from: c */
    public int f68974c;

    /* JADX INFO: renamed from: d */
    public byte f68975d;

    @Override // p153l.j9y0
    /* JADX INFO: renamed from: a */
    public final j9y0 mo96500a(boolean z) {
        this.f68973b = true;
        this.f68975d = (byte) (1 | this.f68975d);
        return this;
    }

    @Override // p153l.j9y0
    /* JADX INFO: renamed from: b */
    public final j9y0 mo96501b(int i) {
        this.f68974c = 1;
        this.f68975d = (byte) (this.f68975d | 2);
        return this;
    }

    @Override // p153l.j9y0
    /* JADX INFO: renamed from: c */
    public final n9y0 mo96502c() {
        String str;
        e8y0 e8y0Var = null;
        if (this.f68975d == 3 && (str = this.f68972a) != null) {
            return new i8y0(str, this.f68973b, this.f68974c, e8y0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f68972a == null) {
            sb.append(" libraryName");
        }
        if ((this.f68975d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f68975d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final j9y0 m96503d(String str) {
        this.f68972a = str;
        return this;
    }
}
