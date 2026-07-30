package p149l;

import android.content.Context;
import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes6.dex */
public final class a4x0 extends ejx0 {

    /* JADX INFO: renamed from: a */
    public final Context f67575a;

    /* JADX INFO: renamed from: b */
    public final tyg0<Optional<hgx0>> f67576b;

    public a4x0(Context context, tyg0<Optional<hgx0>> tyg0Var) {
        if (context == null) {
            jfd0.m141176a("Null context");
            throw null;
        }
        this.f67575a = context;
        this.f67576b = tyg0Var;
    }

    @Override // p149l.ejx0
    /* JADX INFO: renamed from: a */
    public final Context mo94946a() {
        return this.f67575a;
    }

    @Override // p149l.ejx0
    /* JADX INFO: renamed from: b */
    public final tyg0<Optional<hgx0>> mo94947b() {
        return this.f67576b;
    }

    public final boolean equals(Object obj) {
        tyg0<Optional<hgx0>> tyg0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejx0) {
            ejx0 ejx0Var = (ejx0) obj;
            if (this.f67575a.equals(ejx0Var.mo94946a()) && ((tyg0Var = this.f67576b) != null ? tyg0Var.equals(ejx0Var.mo94947b()) : ejx0Var.mo94947b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f67575a.hashCode() ^ 1000003) * 1000003;
        tyg0<Optional<hgx0>> tyg0Var = this.f67576b;
        return (tyg0Var == null ? 0 : tyg0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f67575a) + ", hermeticFileOverrides=" + String.valueOf(this.f67576b) + "}";
    }
}
