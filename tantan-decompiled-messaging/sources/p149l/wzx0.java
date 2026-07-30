package p149l;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zzg;

/* JADX INFO: loaded from: classes6.dex */
public final class wzx0 {

    /* JADX INFO: renamed from: a */
    public final Application f188771a;

    /* JADX INFO: renamed from: b */
    public final nhr0 f188772b;

    public wzx0(Application application, nhr0 nhr0Var) {
        this.f188771a = application;
        this.f188772b = nhr0Var;
    }

    /* JADX INFO: renamed from: c */
    public final w3t0 m206319c(Activity activity, rw5 rw5Var) throws zzg {
        pw5 pw5VarM181375a = rw5Var.m181375a();
        if (pw5VarM181375a == null) {
            pw5VarM181375a = new pw5.C19350a(this.f188771a).m171707a();
        }
        return q7y0.m173316a(new q7y0(this, activity, pw5VarM181375a, rw5Var, null));
    }
}
