package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class v2x0 extends gyw0 {

    /* JADX INFO: renamed from: a */
    public final String f182128a;

    /* JADX INFO: renamed from: b */
    public final t2x0 f182129b;

    /* JADX INFO: renamed from: c */
    public final gyw0 f182130c;

    public /* synthetic */ v2x0(String str, t2x0 t2x0Var, gyw0 gyw0Var, u2x0 u2x0Var) {
        this.f182128a = str;
        this.f182129b = t2x0Var;
        this.f182130c = gyw0Var;
    }

    @Override // p153l.lxw0
    /* JADX INFO: renamed from: a */
    public final boolean mo101510a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final gyw0 m199157b() {
        return this.f182130c;
    }

    /* JADX INFO: renamed from: c */
    public final String m199158c() {
        return this.f182128a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v2x0)) {
            return false;
        }
        v2x0 v2x0Var = (v2x0) obj;
        return v2x0Var.f182129b.equals(this.f182129b) && v2x0Var.f182130c.equals(this.f182130c) && v2x0Var.f182128a.equals(this.f182128a);
    }

    public final int hashCode() {
        return Objects.hash(v2x0.class, this.f182128a, this.f182129b, this.f182130c);
    }

    public final String toString() {
        gyw0 gyw0Var = this.f182130c;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f182128a + ", dekParsingStrategy: " + String.valueOf(this.f182129b) + ", dekParametersForNewKeys: " + String.valueOf(gyw0Var) + ")";
    }
}
