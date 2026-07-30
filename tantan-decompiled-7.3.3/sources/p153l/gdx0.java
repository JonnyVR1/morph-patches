package p153l;

import android.content.Context;
import com.google.common.base.Optional;

/* JADX INFO: loaded from: classes6.dex */
public final class gdx0 extends ksx0 {

    /* JADX INFO: renamed from: a */
    public final Context f103750a;

    /* JADX INFO: renamed from: b */
    public final b7h0<Optional<npx0>> f103751b;

    public gdx0(Context context, b7h0<Optional<npx0>> b7h0Var) {
        if (context == null) {
            mnd0.m159157a("Null context");
            throw null;
        }
        this.f103750a = context;
        this.f103751b = b7h0Var;
    }

    @Override // p153l.ksx0
    /* JADX INFO: renamed from: a */
    public final Context mo129957a() {
        return this.f103750a;
    }

    @Override // p153l.ksx0
    /* JADX INFO: renamed from: b */
    public final b7h0<Optional<npx0>> mo129958b() {
        return this.f103751b;
    }

    public final boolean equals(Object obj) {
        b7h0<Optional<npx0>> b7h0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksx0) {
            ksx0 ksx0Var = (ksx0) obj;
            if (this.f103750a.equals(ksx0Var.mo129957a()) && ((b7h0Var = this.f103751b) != null ? b7h0Var.equals(ksx0Var.mo129958b()) : ksx0Var.mo129958b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f103750a.hashCode() ^ 1000003) * 1000003;
        b7h0<Optional<npx0>> b7h0Var = this.f103751b;
        return (b7h0Var == null ? 0 : b7h0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f103750a) + ", hermeticFileOverrides=" + String.valueOf(this.f103751b) + "}";
    }
}
