package p149l;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C2081a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: loaded from: classes6.dex */
public final class ksy0 extends uhy0 {

    /* JADX INFO: renamed from: a */
    public final Context f124523a;

    public ksy0(Context context) {
        this.f124523a = context;
    }

    @Override // p149l.ujy0
    public final void zzm() {
        zzp();
        jxf0 jxf0VarM143783b = jxf0.m143783b(this.f124523a);
        GoogleSignInAccount googleSignInAccountM143786c = jxf0VarM143783b.m143786c();
        GoogleSignInOptions googleSignInOptionsM143787d = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (googleSignInAccountM143786c != null) {
            googleSignInOptionsM143787d = jxf0VarM143783b.m143787d();
        }
        p4k p4kVarM12441a = C2081a.m12441a(this.f124523a, googleSignInOptionsM143787d);
        if (googleSignInAccountM143786c != null) {
            p4kVarM12441a.m167391c();
        } else {
            p4kVarM12441a.m167392d();
        }
    }

    @Override // p149l.ujy0
    public final void zzn() {
        zzp();
        uby0.m192973c(this.f124523a).m192975a();
    }

    public final void zzp() {
        if (UidVerifier.isGooglePlayServicesUid(this.f124523a, Binder.getCallingUid())) {
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
