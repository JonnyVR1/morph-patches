package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface RetryStrategy<TInput, TResult> {
    @Nullable
    TInput shouldRetry(TInput tinput, TResult tresult);
}
