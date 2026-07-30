package p149l;

import androidx.work.impl.WorkerWrapperKt;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/dsi0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Ll/gnr;", "futureToObserve", "Ll/bf4;", "continuation", "<init>", "(Ll/gnr;Ll/bf4;)V", "", "run", "()V", "a", "Ll/gnr;", "getFutureToObserve", "()Ll/gnr;", "b", "Ll/bf4;", "getContinuation", "()Ll/bf4;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class dsi0<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gnr<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bf4<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public dsi0(@NotNull gnr<T> gnrVar, @NotNull bf4<? super T> bf4Var) {
        gnrVar.getClass();
        bf4Var.getClass();
        this.futureToObserve = gnrVar;
        this.continuation = bf4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsCancelled = this.futureToObserve.isCancelled();
        bf4<T> bf4Var = this.continuation;
        if (zIsCancelled) {
            bf4.C15848a.m101511a(bf4Var, null, 1, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            bf4Var.resumeWith(Result.m223820constructorimpl(WorkerWrapperKt.m4505e(this.futureToObserve)));
        } catch (ExecutionException e) {
            bf4<T> bf4Var2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            bf4Var2.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(WorkerWrapperKt.m4506f(e))));
        }
    }
}
