package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class lvt0 implements rhy0 {

    /* JADX INFO: renamed from: a */
    public final Executor f130195a;

    /* JADX INFO: renamed from: b */
    public final n16 f130196b;

    /* JADX INFO: renamed from: c */
    public final gsy0 f130197c;

    public lvt0(@NonNull Executor executor, @NonNull n16 n16Var, @NonNull gsy0 gsy0Var) {
        this.f130195a = executor;
        this.f130196b = n16Var;
        this.f130197c = gsy0Var;
    }

    @Override // p149l.rhy0
    /* JADX INFO: renamed from: a */
    public final void mo101617a(@NonNull Task task) {
        this.f130195a.execute(new zws0(this, task));
    }
}
