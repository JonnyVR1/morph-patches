package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"RestrictedApi"})
public final class odw0 {

    /* JADX INFO: renamed from: c */
    public static final wdw0 f143249c = new wdw0("OverlayDisplayService");

    /* JADX INFO: renamed from: d */
    public static final Intent f143250d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final mew0 f143251a;

    /* JADX INFO: renamed from: b */
    public final String f143252b;

    public odw0(Context context) {
        if (oew0.m164034a(context)) {
            this.f143251a = new mew0(context.getApplicationContext(), f143249c, "OverlayDisplayService", f143250d, jdw0.f117445a, null);
        } else {
            this.f143251a = null;
        }
        this.f143252b = context.getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public final void m163729c() {
        if (this.f143251a == null) {
            return;
        }
        f143249c.m202813c("unbind LMD display overlay service", new Object[0]);
        this.f143251a.m154336u();
    }

    /* JADX INFO: renamed from: d */
    public final void m163730d(fdw0 fdw0Var, tdw0 tdw0Var) {
        if (this.f143251a == null) {
            f143249c.m202811a("error: %s", "Play Store not found.");
        } else {
            sei0 sei0Var = new sei0();
            this.f143251a.m154334s(new ldw0(this, sei0Var, fdw0Var, tdw0Var, sei0Var), sei0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m163731e(qdw0 qdw0Var, tdw0 tdw0Var) {
        if (this.f143251a == null) {
            f143249c.m202811a("error: %s", "Play Store not found.");
            return;
        }
        if (qdw0Var.mo174129g() != null) {
            sei0 sei0Var = new sei0();
            this.f143251a.m154334s(new kdw0(this, sei0Var, qdw0Var, tdw0Var, sei0Var), sei0Var);
        } else {
            f143249c.m202811a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            rdw0 rdw0VarM183572c = sdw0.m183572c();
            rdw0VarM183572c.mo179017b(8160);
            tdw0Var.mo180747a(rdw0VarM183572c.mo179018c());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m163732f(vdw0 vdw0Var, tdw0 tdw0Var, int i) {
        if (this.f143251a == null) {
            f143249c.m202811a("error: %s", "Play Store not found.");
        } else {
            sei0 sei0Var = new sei0();
            this.f143251a.m154334s(new mdw0(this, sei0Var, vdw0Var, i, tdw0Var, sei0Var), sei0Var);
        }
    }
}
