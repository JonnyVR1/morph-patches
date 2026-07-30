package p149l;

import androidx.work.WorkerParameters;
import androidx.work.impl.C0773a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/p9q0;", "Ll/n9q0;", "Landroidx/work/impl/a;", "processor", "Ll/zei0;", "workTaskExecutor", "<init>", "(Landroidx/work/impl/a;Ll/zei0;)V", "Ll/vuf0;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "", "e", "(Ll/vuf0;Landroidx/work/WorkerParameters$a;)V", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ll/vuf0;I)V", "a", "Landroidx/work/impl/a;", "getProcessor", "()Landroidx/work/impl/a;", "b", "Ll/zei0;", "getWorkTaskExecutor", "()Ll/zei0;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class p9q0 implements n9q0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0773a processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zei0 workTaskExecutor;

    public p9q0(@NotNull C0773a c0773a, @NotNull zei0 zei0Var) {
        c0773a.getClass();
        zei0Var.getClass();
        this.processor = c0773a;
        this.workTaskExecutor = zei0Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m167877f(p9q0 p9q0Var, vuf0 vuf0Var, WorkerParameters.C0760a c0760a) {
        p9q0Var.processor.m4522p(vuf0Var, c0760a);
    }

    @Override // p149l.n9q0
    /* JADX INFO: renamed from: d */
    public void mo158562d(@NotNull vuf0 workSpecId, int reason) {
        workSpecId.getClass();
        this.workTaskExecutor.m218342b(new hxf0(this.processor, workSpecId, false, reason));
    }

    @Override // p149l.n9q0
    /* JADX INFO: renamed from: e */
    public void mo158563e(@NotNull final vuf0 workSpecId, @Nullable final WorkerParameters.C0760a runtimeExtras) {
        workSpecId.getClass();
        this.workTaskExecutor.m218342b(new Runnable() { // from class: l.o9q0
            @Override // java.lang.Runnable
            public final void run() {
                p9q0.m167877f(this.f142736a, workSpecId, runtimeExtras);
            }
        });
    }
}
