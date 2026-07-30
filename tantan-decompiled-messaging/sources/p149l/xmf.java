package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class xmf {

    /* JADX INFO: renamed from: a */
    public final boolean f193549a;

    /* JADX INFO: renamed from: b */
    public final i4c f193550b;

    /* JADX INFO: renamed from: c */
    public final i4c f193551c;

    /* JADX INFO: renamed from: d */
    public final nli f193552d;

    public xmf(i4c i4cVar, i4c i4cVar2, nli nliVar, boolean z) {
        this.f193550b = i4cVar;
        this.f193551c = i4cVar2;
        this.f193552d = nliVar;
        this.f193549a = z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m210120a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: e */
    public static int m210121e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: b */
    public nli m210122b() {
        return this.f193552d;
    }

    /* JADX INFO: renamed from: c */
    public i4c m210123c() {
        return this.f193550b;
    }

    /* JADX INFO: renamed from: d */
    public i4c m210124d() {
        return this.f193551c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xmf)) {
            return false;
        }
        xmf xmfVar = (xmf) obj;
        return m210120a(this.f193550b, xmfVar.f193550b) && m210120a(this.f193551c, xmfVar.f193551c) && m210120a(this.f193552d, xmfVar.f193552d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m210125f() {
        return this.f193551c == null;
    }

    public int hashCode() {
        return m210121e(this.f193552d) ^ (m210121e(this.f193550b) ^ m210121e(this.f193551c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f193550b);
        sb.append(" , ");
        sb.append(this.f193551c);
        sb.append(" : ");
        nli nliVar = this.f193552d;
        sb.append(nliVar == null ? "null" : Integer.valueOf(nliVar.m160057c()));
        sb.append(" ]");
        return sb.toString();
    }
}
