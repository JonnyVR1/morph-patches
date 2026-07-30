package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15510a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/m43;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Ll/w4f;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Ll/w4f;)V", "", "state", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;)V", "h1", "()Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Ljava/lang/Thread;", "e", "Ll/w4f;", "", "y0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m43<T> extends AbstractC15510a<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final w4f eventLoop;

    public m43(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable w4f w4fVar) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = w4fVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: V */
    public void mo94559V(@Nullable Object state) {
        Unit unit;
        if (Intrinsics.m88377d(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public final T m156978h1() throws Throwable {
        Unit unit;
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        if (abstractC16728e8 != null) {
            abstractC16728e8.m119783c();
        }
        try {
            w4f w4fVar = this.eventLoop;
            if (w4fVar != null) {
                w4f.m204874h0(w4fVar, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    w4f w4fVar2 = this.eventLoop;
                    long jMo95124k0 = w4fVar2 != null ? w4fVar2.mo95124k0() : Long.MAX_VALUE;
                    if (mo94584m()) {
                        w4f w4fVar3 = this.eventLoop;
                        if (w4fVar3 != null) {
                            w4f.m204875j(w4fVar3, false, 1, null);
                        }
                        AbstractC16728e8 abstractC16728e9 = C16923f8.f97691a;
                        if (abstractC16728e9 != null) {
                            abstractC16728e9.m119787g();
                        }
                        T t = (T) npq.m164243h(m94591r0());
                        to5 to5Var = t instanceof to5 ? (to5) t : null;
                        if (to5Var == null) {
                            return t;
                        }
                        throw to5Var.cause;
                    }
                    AbstractC16728e8 abstractC16728e10 = C16923f8.f97691a;
                    if (abstractC16728e10 != null) {
                        abstractC16728e10.m119782b(this, jMo95124k0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, jMo95124k0);
                    }
                } catch (Throwable th) {
                    w4f w4fVar4 = this.eventLoop;
                    if (w4fVar4 != null) {
                        w4f.m204875j(w4fVar4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m94564Y(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC16728e8 abstractC16728e11 = C16923f8.f97691a;
            if (abstractC16728e11 != null) {
                abstractC16728e11.m119787g();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: y0 */
    public boolean mo94597y0() {
        return true;
    }
}
