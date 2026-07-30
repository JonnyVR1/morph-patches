package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class uby0 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public static uby0 f175772d;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public jxf0 f175773a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public GoogleSignInAccount f175774b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @VisibleForTesting
    public GoogleSignInOptions f175775c;

    public uby0(Context context) {
        jxf0 jxf0VarM143783b = jxf0.m143783b(context);
        this.f175773a = jxf0VarM143783b;
        this.f175774b = jxf0VarM143783b.m143786c();
        this.f175775c = this.f175773a.m143787d();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized uby0 m192973c(@NonNull Context context) {
        return m192974d(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: d */
    public static synchronized uby0 m192974d(Context context) {
        uby0 uby0Var = f175772d;
        if (uby0Var != null) {
            return uby0Var;
        }
        uby0 uby0Var2 = new uby0(context);
        f175772d = uby0Var2;
        return uby0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m192975a() {
        this.f175773a.m143785a();
        this.f175774b = null;
        this.f175775c = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m192976b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f175773a.m143789f(googleSignInAccount, googleSignInOptions);
        this.f175774b = googleSignInAccount;
        this.f175775c = googleSignInOptions;
    }
}
