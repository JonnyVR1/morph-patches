package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class hoy0<TResult, TContinuationResult> implements to50<TContinuationResult>, fm50, ol50, xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f110967a;

    /* JADX INFO: renamed from: b */
    public final zdg0 f110968b;

    /* JADX INFO: renamed from: c */
    public final m1z0 f110969c;

    public hoy0(@NonNull Executor executor, @NonNull zdg0 zdg0Var, @NonNull m1z0 m1z0Var) {
        this.f110967a = executor;
        this.f110968b = zdg0Var;
        this.f110969c = m1z0Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        this.f110967a.execute(new uky0(this, task));
    }

    @Override // p153l.ol50
    public final void onCanceled() {
        this.f110969c.m156731u();
    }

    @Override // p153l.fm50
    public final void onFailure(@NonNull Exception exc) {
        this.f110969c.m156729s(exc);
    }

    @Override // p153l.to50
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f110969c.m156730t(tcontinuationresult);
    }
}
