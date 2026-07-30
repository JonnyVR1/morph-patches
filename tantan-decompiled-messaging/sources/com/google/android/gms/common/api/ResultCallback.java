package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes6.dex */
public interface ResultCallback<R extends Result> {
    void onResult(@NonNull R r);
}
