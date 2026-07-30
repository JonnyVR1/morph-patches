package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15592n;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u000b\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¨\u0006\u001e"}, m88121d2 = {"Ll/fyi0;", "Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/o;", "job", "<init>", "(Lkotlinx/coroutines/o;)V", "", "e", "()V", "b", "", "cause", "a", "(Ljava/lang/Throwable;)V", "", "state", "", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/Void;", "Lkotlinx/coroutines/o;", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Ll/z5e;", "c", "Ll/z5e;", "cancelHandle", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class fyi0 implements InterfaceC15592n {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f101384d = AtomicIntegerFieldUpdater.newUpdater(fyi0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15593o job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Thread targetThread = Thread.currentThread();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public z5e cancelHandle;

    public fyi0(@NotNull InterfaceC15593o interfaceC15593o) {
        this.job = interfaceC15593o;
    }

    @Override // kotlinx.coroutines.InterfaceC15592n
    /* JADX INFO: renamed from: a */
    public void mo94601a(@Nullable Throwable cause) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f101384d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m128099d(i);
                throw new KotlinNothingValueException();
            }
        } while (!f101384d.compareAndSet(this, i, 2));
        this.targetThread.interrupt();
        f101384d.set(this, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m128098b() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f101384d;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m128099d(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f101384d.compareAndSet(this, i, 1)) {
                z5e z5eVar = this.cancelHandle;
                if (z5eVar != null) {
                    z5eVar.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Void m128099d(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m128100e() {
        int i;
        this.cancelHandle = fpq.m126714m(this.job, true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f101384d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                m128099d(i);
                throw new KotlinNothingValueException();
            }
        } while (!f101384d.compareAndSet(this, i, 0));
    }
}
