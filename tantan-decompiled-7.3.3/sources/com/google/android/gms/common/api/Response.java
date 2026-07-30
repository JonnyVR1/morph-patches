package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes6.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response(@NonNull T t) {
        this.zza = t;
    }

    @NonNull
    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t) {
        this.zza = t;
    }

    public Response() {
    }
}
