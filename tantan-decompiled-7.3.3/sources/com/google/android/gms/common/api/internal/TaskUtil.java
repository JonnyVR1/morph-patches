package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull sni0<ResultT> sni0Var) {
        if (status.isSuccess()) {
            sni0Var.m186941c(resultt);
        } else {
            sni0Var.m186940b(ApiExceptionUtil.fromStatus(status));
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@NonNull Task<Boolean> task) {
        return task.mo15423h(new zacx());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull sni0<ResultT> sni0Var) {
        return status.isSuccess() ? sni0Var.m186943e(resultt) : sni0Var.m186942d(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull sni0<Void> sni0Var) {
        setResultOrApiException(status, null, sni0Var);
    }
}
