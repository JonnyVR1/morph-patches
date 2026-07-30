package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p153l.fm50;
import p153l.ol50;
import p153l.s26;
import p153l.to50;
import p153l.zdg0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Task<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> mo15416a(@NonNull Executor executor, @NonNull ol50 ol50Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<TResult> mo15417b(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract Task<TResult> mo15418c(@NonNull Executor executor, @NonNull fm50 fm50Var);

    @NonNull
    /* JADX INFO: renamed from: d */
    public abstract Task<TResult> mo15419d(@NonNull fm50 fm50Var);

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract Task<TResult> mo15420e(@NonNull Executor executor, @NonNull to50<? super TResult> to50Var);

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract Task<TResult> mo15421f(@NonNull to50<? super TResult> to50Var);

    @NonNull
    /* JADX INFO: renamed from: g */
    public <TContinuationResult> Task<TContinuationResult> mo15422g(@NonNull Executor executor, @NonNull s26<TResult, TContinuationResult> s26Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo15423h(@NonNull s26<TResult, TContinuationResult> s26Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo15424i(@NonNull Executor executor, @NonNull s26<TResult, Task<TContinuationResult>> s26Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo15425j(@NonNull s26<TResult, Task<TContinuationResult>> s26Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public abstract Exception mo15426k();

    /* JADX INFO: renamed from: l */
    public abstract TResult mo15427l();

    /* JADX INFO: renamed from: m */
    public abstract <X extends Throwable> TResult mo15428m(@NonNull Class<X> cls) throws Throwable;

    /* JADX INFO: renamed from: n */
    public abstract boolean mo15429n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo15430o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo15431p();

    @NonNull
    /* JADX INFO: renamed from: q */
    public <TContinuationResult> Task<TContinuationResult> mo15432q(@NonNull Executor executor, @NonNull zdg0<TResult, TContinuationResult> zdg0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public <TContinuationResult> Task<TContinuationResult> mo15433r(@NonNull zdg0<TResult, TContinuationResult> zdg0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
