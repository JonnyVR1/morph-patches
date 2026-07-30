package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class yty0 extends yuy0 {

    /* JADX INFO: renamed from: a */
    public String f201555a;

    /* JADX INFO: renamed from: b */
    public boolean f201556b;

    /* JADX INFO: renamed from: c */
    public int f201557c;

    /* JADX INFO: renamed from: d */
    public byte f201558d;

    @Override // p153l.yuy0
    /* JADX INFO: renamed from: a */
    public final yuy0 mo217349a(boolean z) {
        this.f201556b = true;
        this.f201558d = (byte) (1 | this.f201558d);
        return this;
    }

    @Override // p153l.yuy0
    /* JADX INFO: renamed from: b */
    public final yuy0 mo217350b(int i) {
        this.f201557c = 1;
        this.f201558d = (byte) (this.f201558d | 2);
        return this;
    }

    @Override // p153l.yuy0
    /* JADX INFO: renamed from: c */
    public final avy0 mo217351c() {
        String str;
        auy0 auy0Var = null;
        if (this.f201558d == 3 && (str = this.f201555a) != null) {
            return new cuy0(str, this.f201556b, this.f201557c, auy0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f201555a == null) {
            sb.append(" libraryName");
        }
        if ((this.f201558d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f201558d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final yuy0 m217352d(String str) {
        this.f201555a = "common";
        return this;
    }
}
