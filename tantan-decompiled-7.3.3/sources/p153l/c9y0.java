package p153l;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class c9y0 {

    /* JADX INFO: renamed from: a */
    public final Application f80535a;

    /* JADX INFO: renamed from: b */
    public final tqr0 f80536b;

    public c9y0(Application application, tqr0 tqr0Var) {
        this.f80535a = application;
        this.f80536b = tqr0Var;
    }

    /* JADX INFO: renamed from: c */
    public final cdt0 m108462c(Activity activity, wx5 wx5Var) throws zzg {
        ux5 ux5VarM208366a = wx5Var.m208366a();
        if (ux5VarM208366a == null) {
            ux5VarM208366a = new ux5.C20689a(this.f80535a).m198401a();
        }
        return wgy0.m206330a(new wgy0(this, activity, ux5VarM208366a, wx5Var, null));
    }
}
