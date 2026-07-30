package p009l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.bud0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class jei0<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public jei0<TResult> mo16956a(@NonNull gd50 gd50Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract jei0<TResult> mo16957b(@NonNull zd50 zd50Var);

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract jei0<TResult> mo16958c(@NonNull og50<? super TResult> og50Var);

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TContinuationResult> jei0<TContinuationResult> mo16959d(@NonNull bud0 bud0Var, @NonNull o16<TResult, TContinuationResult> o16Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <TContinuationResult> jei0<TContinuationResult> mo16960e(bud0 bud0Var, @NonNull o16<TResult, jei0<TContinuationResult>> o16Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract Exception mo16961f();

    /* JADX INFO: renamed from: g */
    public abstract TResult mo16962g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo16963h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo16964i();

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> jei0<TContinuationResult> mo16965j(bud0 bud0Var, q5g0<TResult, TContinuationResult> q5g0Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
