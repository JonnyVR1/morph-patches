package com.google.android.datatransport.runtime.retries;

/* JADX INFO: loaded from: classes6.dex */
public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult retry(int i, TInput tinput, Function<TInput, TResult, TException> function, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        TResult tresultApply;
        if (i < 1) {
            return function.apply(tinput);
        }
        do {
            tresultApply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return tresultApply;
    }
}
