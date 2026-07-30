package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15403a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/w33;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Ll/s3f;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Ll/s3f;)V", "", "state", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;)V", "h1", "()Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Ljava/lang/Thread;", "e", "Ll/s3f;", "", "y0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class w33<T> extends AbstractC15403a<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Thread blockedThread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final s3f eventLoop;

    public w33(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable s3f s3fVar) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = s3fVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: V */
    public void mo93668V(@Nullable Object state) {
        Unit unit;
        if (Intrinsics.m87488d(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public final T m201250h1() throws Throwable {
        Unit unit;
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        if (abstractC17712j8 != null) {
            abstractC17712j8.m140176c();
        }
        try {
            s3f s3fVar = this.eventLoop;
            if (s3fVar != null) {
                s3f.m182150g0(s3fVar, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    s3f s3fVar2 = this.eventLoop;
                    long jMo94230j0 = s3fVar2 != null ? s3fVar2.mo94230j0() : Long.MAX_VALUE;
                    if (mo93693m()) {
                        s3f s3fVar3 = this.eventLoop;
                        if (s3fVar3 != null) {
                            s3f.m182151j(s3fVar3, false, 1, null);
                        }
                        AbstractC17712j8 abstractC17712j9 = C17950k8.f121709a;
                        if (abstractC17712j9 != null) {
                            abstractC17712j9.m140180g();
                        }
                        T t = (T) onq.m165223h(m93700r0());
                        pn5 pn5Var = t instanceof pn5 ? (pn5) t : null;
                        if (pn5Var == null) {
                            return t;
                        }
                        throw pn5Var.cause;
                    }
                    AbstractC17712j8 abstractC17712j10 = C17950k8.f121709a;
                    if (abstractC17712j10 != null) {
                        abstractC17712j10.m140175b(this, jMo94230j0);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, jMo94230j0);
                    }
                } catch (Throwable th) {
                    s3f s3fVar4 = this.eventLoop;
                    if (s3fVar4 != null) {
                        s3f.m182151j(s3fVar4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m93673Y(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC17712j8 abstractC17712j11 = C17950k8.f121709a;
            if (abstractC17712j11 != null) {
                abstractC17712j11.m140180g();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: y0 */
    public boolean mo93706y0() {
        return true;
    }
}
