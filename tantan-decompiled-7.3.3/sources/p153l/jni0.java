package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jni0<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public jni0<TResult> mo121506a(@NonNull nl50 nl50Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract jni0<TResult> mo121507b(@NonNull gm50 gm50Var);

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract jni0<TResult> mo121508c(@NonNull uo50<? super TResult> uo50Var);

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TContinuationResult> jni0<TContinuationResult> mo121509d(@NonNull f2e0 f2e0Var, @NonNull t26<TResult, TContinuationResult> t26Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <TContinuationResult> jni0<TContinuationResult> mo121510e(f2e0 f2e0Var, @NonNull t26<TResult, jni0<TContinuationResult>> t26Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Exception mo121511f();

    /* JADX INFO: renamed from: g */
    public abstract TResult mo121512g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo121513h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo121514i();

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> jni0<TContinuationResult> mo121515j(f2e0 f2e0Var, ydg0<TResult, TContinuationResult> ydg0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
