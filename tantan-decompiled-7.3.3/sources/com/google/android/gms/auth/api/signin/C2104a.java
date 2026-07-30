package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import p153l.h7k;
import p153l.i7k;
import p153l.jrw0;
import p153l.toi0;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2104a {
    /* JADX INFO: renamed from: a */
    public static h7k m12495a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new h7k(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    /* JADX INFO: renamed from: b */
    public static Task<GoogleSignInAccount> m12496b(@Nullable Intent intent) {
        i7k i7kVarM146823a = jrw0.m146823a(intent);
        if (i7kVarM146823a == null) {
            return toi0.m192067e(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }
        GoogleSignInAccount googleSignInAccountM138963a = i7kVarM146823a.m138963a();
        return (!i7kVarM146823a.getStatus().isSuccess() || googleSignInAccountM138963a == null) ? toi0.m192067e(ApiExceptionUtil.fromStatus(i7kVarM146823a.getStatus())) : toi0.m192068f(googleSignInAccountM138963a);
    }
}
