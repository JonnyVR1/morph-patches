package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u000b\u00105\u001a\u0002038\u0002X\u0082\u0004R\u0013\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004068\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002038\u0002X\u0082\u0004¨\u00069"}, m88121d2 = {"Ll/kjq0;", "", "<init>", "()V", "Ll/kni0;", "task", "b", "(Ll/kni0;)Ll/kni0;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Ll/kni0;", "", "onlyBlocking", "o", "(Z)Ll/kni0;", FirebaseAnalytics.Param.INDEX, "q", "(IZ)Ll/kni0;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", BLiveStormDanmakuGiftResourceType.f45294s, "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "Ll/k4k;", "queue", "n", "(Ll/k4k;)Z", "m", "()Ll/kni0;", "", "c", "(Ll/kni0;)V", "k", "fair", "a", "(Ll/kni0;Z)Ll/kni0;", "r", BLiveStormDanmakuGiftResourceType.f45292l, "globalQueue", "j", "(Ll/k4k;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", RXScreenCaptureService.KEY_INDEX, "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class kjq0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f127130b = AtomicReferenceFieldUpdater.newUpdater(kjq0.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f127131c = AtomicIntegerFieldUpdater.newUpdater(kjq0.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f127132d = AtomicIntegerFieldUpdater.newUpdater(kjq0.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f127133e = AtomicIntegerFieldUpdater.newUpdater(kjq0.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<kni0> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final kni0 m150057a(@NotNull kni0 task, boolean fair) {
        if (fair) {
            return m150058b(task);
        }
        kni0 kni0Var = (kni0) f127130b.getAndSet(this, task);
        if (kni0Var == null) {
            return null;
        }
        return m150058b(kni0Var);
    }

    /* JADX INFO: renamed from: b */
    public final kni0 m150058b(kni0 task) {
        if (m150060e() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            f127133e.incrementAndGet(this);
        }
        int i = f127131c.get(this) & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        f127131c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m150059c(kni0 kni0Var) {
        if (kni0Var == null || kni0Var.taskContext.getTaskMode() != 1) {
            return;
        }
        f127133e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m150060e() {
        return f127131c.get(this) - f127132d.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final int m150061i() {
        Object obj = f127130b.get(this);
        int iM150060e = m150060e();
        return obj != null ? iM150060e + 1 : iM150060e;
    }

    /* JADX INFO: renamed from: j */
    public final void m150062j(@NotNull k4k globalQueue) {
        kni0 kni0Var = (kni0) f127130b.getAndSet(this, null);
        if (kni0Var != null) {
            globalQueue.m128132a(kni0Var);
        }
        while (m150066n(globalQueue)) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final kni0 m150063k() {
        kni0 kni0Var = (kni0) f127130b.getAndSet(this, null);
        return kni0Var == null ? m150065m() : kni0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final kni0 m150064l() {
        return m150067o(true);
    }

    /* JADX INFO: renamed from: m */
    public final kni0 m150065m() {
        kni0 andSet;
        while (true) {
            int i = f127132d.get(this);
            if (i - f127131c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f127132d.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i2, null)) != null) {
                m150059c(andSet);
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m150066n(k4k queue) {
        kni0 kni0VarM150065m = m150065m();
        if (kni0VarM150065m == null) {
            return false;
        }
        queue.m128132a(kni0VarM150065m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final kni0 m150067o(boolean onlyBlocking) {
        kni0 kni0Var;
        do {
            kni0Var = (kni0) f127130b.get(this);
            if (kni0Var != null) {
                if ((kni0Var.taskContext.getTaskMode() == 1) == onlyBlocking) {
                }
            }
            int i = f127132d.get(this);
            int i2 = f127131c.get(this);
            while (i != i2) {
                if (onlyBlocking && f127133e.get(this) == 0) {
                    return null;
                }
                i2--;
                kni0 kni0VarM150069q = m150069q(i2, onlyBlocking);
                if (kni0VarM150069q != null) {
                    return kni0VarM150069q;
                }
            }
            return null;
        } while (!C20511u7.m194801a(f127130b, this, kni0Var, null));
        return kni0Var;
    }

    /* JADX INFO: renamed from: p */
    public final kni0 m150068p(int stealingMode) {
        int i = f127132d.get(this);
        int i2 = f127131c.get(this);
        boolean z = stealingMode == 1;
        while (i != i2) {
            if (z && f127133e.get(this) == 0) {
                return null;
            }
            int i3 = i + 1;
            kni0 kni0VarM150069q = m150069q(i, z);
            if (kni0VarM150069q != null) {
                return kni0VarM150069q;
            }
            i = i3;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final kni0 m150069q(int index, boolean onlyBlocking) {
        int i = index & 127;
        kni0 kni0Var = this.buffer.get(i);
        if (kni0Var != null) {
            if ((kni0Var.taskContext.getTaskMode() == 1) == onlyBlocking && ss4.m187688a(this.buffer, i, kni0Var, null)) {
                if (onlyBlocking) {
                    f127133e.decrementAndGet(this);
                }
                return kni0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final long m150070r(int stealingMode, @NotNull Ref.ObjectRef<kni0> stolenTaskRef) {
        kni0 kni0VarM150068p;
        T t;
        kni0 kni0VarM150065m;
        if (stealingMode == 3) {
            kni0VarM150065m = m150065m();
        } else {
            kni0VarM150068p = m150068p(stealingMode);
        }
        if (t == 0) {
            t = kni0VarM150068p;
            t = kni0VarM150065m;
            return m150071s(stealingMode, stolenTaskRef);
        }
        t = kni0VarM150068p;
        t = kni0VarM150065m;
        stolenTaskRef.element = t;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, l.kni0] */
    /* JADX INFO: renamed from: s */
    public final long m150071s(int stealingMode, Ref.ObjectRef<kni0> stolenTaskRef) {
        ?? r0;
        do {
            r0 = (kni0) f127130b.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.taskContext.getTaskMode() != 1 ? 2 : 1) & stealingMode) == 0) {
                return -2L;
            }
            long jMo139423a = uoi0.f180094f.mo139423a() - r0.submissionTime;
            long j = uoi0.f180090b;
            if (jMo139423a < j) {
                return j - jMo139423a;
            }
        } while (!C20511u7.m194801a(f127130b, this, r0, null));
        stolenTaskRef.element = r0;
        return -1L;
    }
}
