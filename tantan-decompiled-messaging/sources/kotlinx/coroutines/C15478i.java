package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.i3e0;
import p149l.j6f;
import p149l.onq;
import p149l.pn5;
import p149l.qkq0;
import p149l.sn5;
import p149l.uwp;
import p149l.y3e;

/* JADX INFO: renamed from: kotlinx.coroutines.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¨\u0006\u0017"}, m87232d2 = {"Lkotlinx/coroutines/i;", j6f.GPS_DIRECTION_TRUE, "Ll/i3e0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "k1", "()Z", "j1", "", "state", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;)V", "d1", "h1", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
public final class C15478i<T> extends i3e0<T> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66899e = AtomicIntegerFieldUpdater.newUpdater(C15478i.class, "_decision$volatile");

    @JvmField
    private volatile /* synthetic */ int _decision$volatile;

    public C15478i(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    /* JADX INFO: renamed from: j1 */
    private final boolean m94189j1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66899e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                qkq0.m175383a("Already resumed");
                return false;
            }
        } while (!f66899e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: k1 */
    private final boolean m94190k1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66899e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                qkq0.m175383a("Already suspended");
                return false;
            }
        } while (!f66899e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p149l.i3e0, kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: V */
    public void mo93668V(@Nullable Object state) {
        mo93731d1(state);
    }

    @Override // p149l.i3e0, kotlinx.coroutines.AbstractC15403a
    /* JADX INFO: renamed from: d1 */
    public void mo93731d1(@Nullable Object state) {
        if (m94189j1()) {
            return;
        }
        y3e.m212799c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(this.uCont), sn5.m185031a(state, this.uCont), null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: h1 */
    public final Object m94191h1() {
        if (m94190k1()) {
            return uwp.m196133e();
        }
        Object objM165223h = onq.m165223h(m93700r0());
        if (objM165223h instanceof pn5) {
            throw ((pn5) objM165223h).cause;
        }
        return objM165223h;
    }
}
