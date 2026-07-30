package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull sei0<ResultT> sei0Var) {
        if (status.isSuccess()) {
            sei0Var.m183659c(resultt);
        } else {
            sei0Var.m183658b(ApiExceptionUtil.fromStatus(status));
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@NonNull Task<Boolean> task) {
        return task.mo15369h(new zacx());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull sei0<ResultT> sei0Var) {
        return status.isSuccess() ? sei0Var.m183661e(resultt) : sei0Var.m183660d(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull sei0<Void> sei0Var) {
        setResultOrApiException(status, null, sei0Var);
    }
}
