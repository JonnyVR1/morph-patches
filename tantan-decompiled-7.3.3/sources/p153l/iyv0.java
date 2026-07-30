package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class iyv0<TResult, TContinuationResult> implements to50<TContinuationResult>, fm50, ol50, xqy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f117641a;

    /* JADX INFO: renamed from: b */
    public final s26 f117642b;

    /* JADX INFO: renamed from: c */
    public final m1z0 f117643c;

    public iyv0(@NonNull Executor executor, @NonNull s26 s26Var, @NonNull m1z0 m1z0Var) {
        this.f117641a = executor;
        this.f117642b = s26Var;
        this.f117643c = m1z0Var;
    }

    @Override // p153l.xqy0
    /* JADX INFO: renamed from: a */
    public final void mo115836a(@NonNull Task task) {
        this.f117641a.execute(new x1v0(this, task));
    }

    @Override // p153l.ol50
    public final void onCanceled() {
        this.f117643c.m156731u();
    }

    @Override // p153l.fm50
    public final void onFailure(@NonNull Exception exc) {
        this.f117643c.m156729s(exc);
    }

    @Override // p153l.to50
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f117643c.m156730t(tcontinuationresult);
    }
}
