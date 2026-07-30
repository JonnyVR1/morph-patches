package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class bfy0<TResult, TContinuationResult> implements ng50<TContinuationResult>, yd50, hd50, rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f75388a;

    /* JADX INFO: renamed from: b */
    public final r5g0 f75389b;

    /* JADX INFO: renamed from: c */
    public final gsy0 f75390c;

    public bfy0(@NonNull Executor executor, @NonNull r5g0 r5g0Var, @NonNull gsy0 gsy0Var) {
        this.f75388a = executor;
        this.f75389b = r5g0Var;
        this.f75390c = gsy0Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        this.f75388a.execute(new oby0(this, task));
    }

    @Override // p149l.hd50
    public final void onCanceled() {
        this.f75390c.m127861u();
    }

    @Override // p149l.yd50
    public final void onFailure(@NonNull Exception exc) {
        this.f75390c.m127859s(exc);
    }

    @Override // p149l.ng50
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f75390c.m127860t(tcontinuationresult);
    }
}
