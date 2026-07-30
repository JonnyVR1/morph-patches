package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"RestrictedApi"})
public final class umw0 {

    /* JADX INFO: renamed from: c */
    public static final cnw0 f179682c = new cnw0("OverlayDisplayService");

    /* JADX INFO: renamed from: d */
    public static final Intent f179683d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final snw0 f179684a;

    /* JADX INFO: renamed from: b */
    public final String f179685b;

    public umw0(Context context) {
        if (unw0.m196957a(context)) {
            this.f179684a = new snw0(context.getApplicationContext(), f179682c, "OverlayDisplayService", f179683d, pmw0.f153239a, null);
        } else {
            this.f179684a = null;
        }
        this.f179685b = context.getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public final void m196810c() {
        if (this.f179684a == null) {
            return;
        }
        f179682c.m111556c("unbind LMD display overlay service", new Object[0]);
        this.f179684a.m187025u();
    }

    /* JADX INFO: renamed from: d */
    public final void m196811d(lmw0 lmw0Var, zmw0 zmw0Var) {
        if (this.f179684a == null) {
            f179682c.m111554a("error: %s", "Play Store not found.");
        } else {
            sni0 sni0Var = new sni0();
            this.f179684a.m187023s(new rmw0(this, sni0Var, lmw0Var, zmw0Var, sni0Var), sni0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m196812e(wmw0 wmw0Var, zmw0 zmw0Var) {
        if (this.f179684a == null) {
            f179682c.m111554a("error: %s", "Play Store not found.");
            return;
        }
        if (wmw0Var.mo98871g() != null) {
            sni0 sni0Var = new sni0();
            this.f179684a.m187023s(new qmw0(this, sni0Var, wmw0Var, zmw0Var, sni0Var), sni0Var);
        } else {
            f179682c.m111554a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            xmw0 xmw0VarM216740c = ymw0.m216740c();
            xmw0VarM216740c.mo105274b(8160);
            zmw0Var.mo209122a(xmw0VarM216740c.mo105275c());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m196813f(bnw0 bnw0Var, zmw0 zmw0Var, int i) {
        if (this.f179684a == null) {
            f179682c.m111554a("error: %s", "Play Store not found.");
        } else {
            sni0 sni0Var = new sni0();
            this.f179684a.m187023s(new smw0(this, sni0Var, bnw0Var, i, zmw0Var, sni0Var), sni0Var);
        }
    }
}
