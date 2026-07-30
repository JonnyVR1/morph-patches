package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class sky0 extends sly0 {

    /* JADX INFO: renamed from: a */
    public String f165041a;

    /* JADX INFO: renamed from: b */
    public boolean f165042b;

    /* JADX INFO: renamed from: c */
    public int f165043c;

    /* JADX INFO: renamed from: d */
    public byte f165044d;

    @Override // p149l.sly0
    /* JADX INFO: renamed from: a */
    public final sly0 mo184622a(boolean z) {
        this.f165042b = true;
        this.f165044d = (byte) (1 | this.f165044d);
        return this;
    }

    @Override // p149l.sly0
    /* JADX INFO: renamed from: b */
    public final sly0 mo184623b(int i) {
        this.f165043c = 1;
        this.f165044d = (byte) (this.f165044d | 2);
        return this;
    }

    @Override // p149l.sly0
    /* JADX INFO: renamed from: c */
    public final uly0 mo184624c() {
        String str;
        uky0 uky0Var = null;
        if (this.f165044d == 3 && (str = this.f165041a) != null) {
            return new wky0(str, this.f165042b, this.f165043c, uky0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f165041a == null) {
            sb.append(" libraryName");
        }
        if ((this.f165044d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f165044d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final sly0 m184625d(String str) {
        this.f165041a = "common";
        return this;
    }
}
