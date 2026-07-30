package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class PendingResultUtil {
    private static final zas zaa = new zao();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @Nullable
        @KeepForSdk
        T convert(@NonNull R r);
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@NonNull PendingResult<R> pendingResult, @NonNull T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@NonNull PendingResult<R> pendingResult, @NonNull ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        sni0 sni0Var = new sni0();
        pendingResult.addStatusListener(new zap(pendingResult, sni0Var, resultConverter, zasVar));
        return sni0Var.m186939a();
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@NonNull PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}
