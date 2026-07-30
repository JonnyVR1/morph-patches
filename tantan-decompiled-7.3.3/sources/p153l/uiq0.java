package p153l;

import androidx.work.WorkerParameters;
import androidx.work.impl.C0775a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/uiq0;", "Ll/siq0;", "Landroidx/work/impl/a;", "processor", "Ll/zni0;", "workTaskExecutor", "<init>", "(Landroidx/work/impl/a;Ll/zni0;)V", "Ll/e3g0;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "", "e", "(Ll/e3g0;Landroidx/work/WorkerParameters$a;)V", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ll/e3g0;I)V", "a", "Landroidx/work/impl/a;", "getProcessor", "()Landroidx/work/impl/a;", "b", "Ll/zni0;", "getWorkTaskExecutor", "()Ll/zni0;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class uiq0 implements siq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0775a processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zni0 workTaskExecutor;

    public uiq0(@NotNull C0775a c0775a, @NotNull zni0 zni0Var) {
        c0775a.getClass();
        zni0Var.getClass();
        this.processor = c0775a;
        this.workTaskExecutor = zni0Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m196299f(uiq0 uiq0Var, e3g0 e3g0Var, WorkerParameters.C0762a c0762a) {
        uiq0Var.processor.m4524p(e3g0Var, c0762a);
    }

    @Override // p153l.siq0
    /* JADX INFO: renamed from: d */
    public void mo186033d(@NotNull e3g0 workSpecId, int reason) {
        workSpecId.getClass();
        this.workTaskExecutor.m220600b(new r5g0(this.processor, workSpecId, false, reason));
    }

    @Override // p153l.siq0
    /* JADX INFO: renamed from: e */
    public void mo186034e(@NotNull final e3g0 workSpecId, @Nullable final WorkerParameters.C0762a runtimeExtras) {
        workSpecId.getClass();
        this.workTaskExecutor.m220600b(new Runnable() { // from class: l.tiq0
            @Override // java.lang.Runnable
            public final void run() {
                uiq0.m196299f(this.f174495a, workSpecId, runtimeExtras);
            }
        });
    }
}
