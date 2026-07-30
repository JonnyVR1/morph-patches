package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class aly0 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public static aly0 f72170d;

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public t5g0 f72171a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public GoogleSignInAccount f72172b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @VisibleForTesting
    public GoogleSignInOptions f72173c;

    public aly0(Context context) {
        t5g0 t5g0VarM189389b = t5g0.m189389b(context);
        this.f72171a = t5g0VarM189389b;
        this.f72172b = t5g0VarM189389b.m189392c();
        this.f72173c = this.f72171a.m189393d();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized aly0 m98768c(@NonNull Context context) {
        return m98769d(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: d */
    public static synchronized aly0 m98769d(Context context) {
        aly0 aly0Var = f72170d;
        if (aly0Var != null) {
            return aly0Var;
        }
        aly0 aly0Var2 = new aly0(context);
        f72170d = aly0Var2;
        return aly0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m98770a() {
        this.f72171a.m189391a();
        this.f72172b = null;
        this.f72173c = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m98771b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f72171a.m189395f(googleSignInAccount, googleSignInOptions);
        this.f72172b = googleSignInAccount;
        this.f72173c = googleSignInOptions;
    }
}
