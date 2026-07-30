package p153l;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C2104a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: loaded from: classes6.dex */
public final class q1z0 extends ary0 {

    /* JADX INFO: renamed from: a */
    public final Context f155240a;

    public q1z0(Context context) {
        this.f155240a = context;
    }

    @Override // p153l.aty0
    public final void zzm() {
        zzp();
        t5g0 t5g0VarM189389b = t5g0.m189389b(this.f155240a);
        GoogleSignInAccount googleSignInAccountM189392c = t5g0VarM189389b.m189392c();
        GoogleSignInOptions googleSignInOptionsM189393d = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (googleSignInAccountM189392c != null) {
            googleSignInOptionsM189393d = t5g0VarM189389b.m189393d();
        }
        h7k h7kVarM12495a = C2104a.m12495a(this.f155240a, googleSignInOptionsM189393d);
        if (googleSignInAccountM189392c != null) {
            h7kVarM12495a.m133800c();
        } else {
            h7kVarM12495a.m133801d();
        }
    }

    @Override // p153l.aty0
    public final void zzn() {
        zzp();
        aly0.m98768c(this.f155240a).m98770a();
    }

    public final void zzp() {
        if (UidVerifier.isGooglePlayServicesUid(this.f155240a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
