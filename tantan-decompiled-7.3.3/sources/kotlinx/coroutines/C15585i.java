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
import p153l.m5e;
import p153l.mbe0;
import p153l.npq;
import p153l.p7f;
import p153l.to5;
import p153l.uyp;
import p153l.wo5;
import p153l.wtq0;

/* JADX INFO: renamed from: kotlinx.coroutines.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¨\u0006\u0017"}, m88121d2 = {"Lkotlinx/coroutines/i;", p7f.GPS_DIRECTION_TRUE, "Ll/mbe0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "k1", "()Z", "j1", "", "state", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;)V", "d1", "h1", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
public final class C15585i<T> extends mbe0<T> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67573e = AtomicIntegerFieldUpdater.newUpdater(C15585i.class, "_decision$volatile");

    @JvmField
    private volatile /* synthetic */ int _decision$volatile;

    public C15585i(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    /* JADX INFO: renamed from: j1 */
    private final boolean m95082j1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f67573e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                wtq0.m207906a("Already resumed");
                return false;
            }
        } while (!f67573e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: k1 */
    private final boolean m95083k1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f67573e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                wtq0.m207906a("Already suspended");
                return false;
            }
        } while (!f67573e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p153l.mbe0, kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: V */
    public void mo94559V(@Nullable Object state) {
        mo94623d1(state);
    }

    @Override // p153l.mbe0, kotlinx.coroutines.AbstractC15510a
    /* JADX INFO: renamed from: d1 */
    public void mo94623d1(@Nullable Object state) {
        if (m95082j1()) {
            return;
        }
        m5e.m157102c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(this.uCont), wo5.m207260a(state, this.uCont), null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: h1 */
    public final Object m95084h1() {
        if (m95083k1()) {
            return uyp.m198688e();
        }
        Object objM164243h = npq.m164243h(m94591r0());
        if (objM164243h instanceof to5) {
            throw ((to5) objM164243h).cause;
        }
        return objM164243h;
    }
}
