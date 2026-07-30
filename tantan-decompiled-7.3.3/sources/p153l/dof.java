package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class dof {

    /* JADX INFO: renamed from: a */
    public final boolean f89918a;

    /* JADX INFO: renamed from: b */
    public final q5c f89919b;

    /* JADX INFO: renamed from: c */
    public final q5c f89920c;

    /* JADX INFO: renamed from: d */
    public final joi f89921d;

    public dof(q5c q5cVar, q5c q5cVar2, joi joiVar, boolean z) {
        this.f89919b = q5cVar;
        this.f89920c = q5cVar2;
        this.f89921d = joiVar;
        this.f89918a = z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m117194a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: e */
    public static int m117195e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: b */
    public joi m117196b() {
        return this.f89921d;
    }

    /* JADX INFO: renamed from: c */
    public q5c m117197c() {
        return this.f89919b;
    }

    /* JADX INFO: renamed from: d */
    public q5c m117198d() {
        return this.f89920c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dof)) {
            return false;
        }
        dof dofVar = (dof) obj;
        return m117194a(this.f89919b, dofVar.f89919b) && m117194a(this.f89920c, dofVar.f89920c) && m117194a(this.f89921d, dofVar.f89921d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m117199f() {
        return this.f89920c == null;
    }

    public int hashCode() {
        return m117195e(this.f89921d) ^ (m117195e(this.f89919b) ^ m117195e(this.f89920c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f89919b);
        sb.append(" , ");
        sb.append(this.f89920c);
        sb.append(" : ");
        joi joiVar = this.f89921d;
        sb.append(joiVar == null ? "null" : Integer.valueOf(joiVar.m146462c()));
        sb.append(" ]");
        return sb.toString();
    }
}
