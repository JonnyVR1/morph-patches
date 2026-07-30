package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import p149l.diw0;
import p149l.p4k;
import p149l.q4k;
import p149l.tfi0;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2081a {
    /* JADX INFO: renamed from: a */
    public static p4k m12441a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new p4k(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    /* JADX INFO: renamed from: b */
    public static Task<GoogleSignInAccount> m12442b(@Nullable Intent intent) {
        q4k q4kVarM111930a = diw0.m111930a(intent);
        if (q4kVarM111930a == null) {
            return tfi0.m188733e(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
        }
        GoogleSignInAccount googleSignInAccountM172942a = q4kVarM111930a.m172942a();
        return (!q4kVarM111930a.getStatus().isSuccess() || googleSignInAccountM172942a == null) ? tfi0.m188733e(ApiExceptionUtil.fromStatus(q4kVarM111930a.getStatus())) : tfi0.m188734f(googleSignInAccountM172942a);
    }
}
