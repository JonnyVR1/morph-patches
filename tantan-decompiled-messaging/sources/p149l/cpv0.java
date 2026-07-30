package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class cpv0<TResult, TContinuationResult> implements ng50<TContinuationResult>, yd50, hd50, rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f81999a;

    /* JADX INFO: renamed from: b */
    public final n16 f82000b;

    /* JADX INFO: renamed from: c */
    public final gsy0 f82001c;

    public cpv0(@NonNull Executor executor, @NonNull n16 n16Var, @NonNull gsy0 gsy0Var) {
        this.f81999a = executor;
        this.f82000b = n16Var;
        this.f82001c = gsy0Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        this.f81999a.execute(new rsu0(this, task));
    }

    @Override // p149l.hd50
    public final void onCanceled() {
        this.f82001c.m127861u();
    }

    @Override // p149l.yd50
    public final void onFailure(@NonNull Exception exc) {
        this.f82001c.m127859s(exc);
    }

    @Override // p149l.ng50
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f82001c.m127860t(tcontinuationresult);
    }
}
