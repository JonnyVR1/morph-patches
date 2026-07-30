package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p149l.hd50;
import p149l.n16;
import p149l.ng50;
import p149l.r5g0;
import p149l.yd50;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Task<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> mo15362a(@NonNull Executor executor, @NonNull hd50 hd50Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<TResult> mo15363b(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract Task<TResult> mo15364c(@NonNull Executor executor, @NonNull yd50 yd50Var);

    @NonNull
    /* JADX INFO: renamed from: d */
    public abstract Task<TResult> mo15365d(@NonNull yd50 yd50Var);

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract Task<TResult> mo15366e(@NonNull Executor executor, @NonNull ng50<? super TResult> ng50Var);

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract Task<TResult> mo15367f(@NonNull ng50<? super TResult> ng50Var);

    @NonNull
    /* JADX INFO: renamed from: g */
    public <TContinuationResult> Task<TContinuationResult> mo15368g(@NonNull Executor executor, @NonNull n16<TResult, TContinuationResult> n16Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo15369h(@NonNull n16<TResult, TContinuationResult> n16Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo15370i(@NonNull Executor executor, @NonNull n16<TResult, Task<TContinuationResult>> n16Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo15371j(@NonNull n16<TResult, Task<TContinuationResult>> n16Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract Exception mo15372k();

    /* JADX INFO: renamed from: l */
    public abstract TResult mo15373l();

    /* JADX INFO: renamed from: m */
    public abstract <X extends Throwable> TResult mo15374m(@NonNull Class<X> cls) throws Throwable;

    /* JADX INFO: renamed from: n */
    public abstract boolean mo15375n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo15376o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo15377p();

    @NonNull
    /* JADX INFO: renamed from: q */
    public <TContinuationResult> Task<TContinuationResult> mo15378q(@NonNull Executor executor, @NonNull r5g0<TResult, TContinuationResult> r5g0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public <TContinuationResult> Task<TContinuationResult> mo15379r(@NonNull r5g0<TResult, TContinuationResult> r5g0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
