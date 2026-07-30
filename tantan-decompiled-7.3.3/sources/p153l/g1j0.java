package p153l;

import androidx.work.impl.WorkerWrapperKt;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/g1j0;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Ll/hpr;", "futureToObserve", "Ll/ag4;", "continuation", "<init>", "(Ll/hpr;Ll/ag4;)V", "", "run", "()V", "a", "Ll/hpr;", "getFutureToObserve", "()Ll/hpr;", "b", "Ll/ag4;", "getContinuation", "()Ll/ag4;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class g1j0<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final hpr<T> futureToObserve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ag4<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public g1j0(@NotNull hpr<T> hprVar, @NotNull ag4<? super T> ag4Var) {
        hprVar.getClass();
        ag4Var.getClass();
        this.futureToObserve = hprVar;
        this.continuation = ag4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsCancelled = this.futureToObserve.isCancelled();
        ag4<T> ag4Var = this.continuation;
        if (zIsCancelled) {
            ag4.C15705a.m97576a(ag4Var, null, 1, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ag4Var.resumeWith(Result.m225066constructorimpl(WorkerWrapperKt.m4507e(this.futureToObserve)));
        } catch (ExecutionException e) {
            ag4<T> ag4Var2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            ag4Var2.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(WorkerWrapperKt.m4508f(e))));
        }
    }
}
