package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import p149l.AbstractC17712j8;
import p149l.C17950k8;
import p149l.s3f;

/* JADX INFO: renamed from: kotlinx.coroutines.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lkotlinx/coroutines/l;", "Ll/s3f;", "<init>", "()V", "", "o0", "", "now", "Lkotlinx/coroutines/k$c;", "delayedTask", "n0", "(JLkotlinx/coroutines/k$c;)V", "Ljava/lang/Thread;", "m0", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class AbstractC15483l extends s3f {
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public abstract Thread getThread();

    /* JADX INFO: renamed from: n0 */
    public void mo94184n0(long now, @NotNull AbstractC15482k.c delayedTask) {
        RunnableC15476g.INSTANCE.m94224A0(now, delayedTask);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m94242o0() {
        Unit unit;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
            if (abstractC17712j8 != null) {
                abstractC17712j8.m140179f(thread);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}
