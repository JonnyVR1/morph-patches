package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.w4f;

/* JADX INFO: renamed from: kotlinx.coroutines.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lkotlinx/coroutines/l;", "Ll/w4f;", "<init>", "()V", "", "p0", "", "now", "Lkotlinx/coroutines/k$c;", "delayedTask", "o0", "(JLkotlinx/coroutines/k$c;)V", "Ljava/lang/Thread;", "n0", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class AbstractC15590l extends w4f {
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public abstract Thread getThread();

    /* JADX INFO: renamed from: o0 */
    public void mo95077o0(long now, @NotNull AbstractC15589k.c delayedTask) {
        RunnableC15583g.INSTANCE.m95118B0(now, delayedTask);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m95135p0() {
        Unit unit;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
            if (abstractC16728e8 != null) {
                abstractC16728e8.m119786f(thread);
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
