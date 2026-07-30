package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jei0<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public jei0<TResult> mo141136a(@NonNull gd50 gd50Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract jei0<TResult> mo141137b(@NonNull zd50 zd50Var);

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract jei0<TResult> mo141138c(@NonNull og50<? super TResult> og50Var);

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TContinuationResult> jei0<TContinuationResult> mo141139d(@NonNull bud0 bud0Var, @NonNull o16<TResult, TContinuationResult> o16Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <TContinuationResult> jei0<TContinuationResult> mo141140e(bud0 bud0Var, @NonNull o16<TResult, jei0<TContinuationResult>> o16Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Exception mo141141f();

    /* JADX INFO: renamed from: g */
    public abstract TResult mo141142g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo141143h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo141144i();

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> jei0<TContinuationResult> mo141145j(bud0 bud0Var, q5g0<TResult, TContinuationResult> q5g0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
