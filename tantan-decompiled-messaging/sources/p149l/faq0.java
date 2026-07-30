package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u000b\u00105\u001a\u0002038\u0002X\u0082\u0004R\u0013\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004068\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002038\u0002X\u0082\u0004¨\u00069"}, m87232d2 = {"Ll/faq0;", "", "<init>", "()V", "Ll/kei0;", "task", "b", "(Ll/kei0;)Ll/kei0;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Ll/kei0;", "", "onlyBlocking", "o", "(Z)Ll/kei0;", FirebaseAnalytics.Param.INDEX, "q", "(IZ)Ll/kei0;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", BLiveStormDanmakuGiftResourceType.f44446s, "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "Ll/s1k;", "queue", "n", "(Ll/s1k;)Z", "m", "()Ll/kei0;", "", "c", "(Ll/kei0;)V", "k", "fair", "a", "(Ll/kei0;Z)Ll/kei0;", "r", BLiveStormDanmakuGiftResourceType.f44444l, "globalQueue", "j", "(Ll/s1k;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", RXScreenCaptureService.KEY_INDEX, "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class faq0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f96647b = AtomicReferenceFieldUpdater.newUpdater(faq0.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96648c = AtomicIntegerFieldUpdater.newUpdater(faq0.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96649d = AtomicIntegerFieldUpdater.newUpdater(faq0.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f96650e = AtomicIntegerFieldUpdater.newUpdater(faq0.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<kei0> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final kei0 m120282a(@NotNull kei0 task, boolean fair) {
        if (fair) {
            return m120283b(task);
        }
        kei0 kei0Var = (kei0) f96647b.getAndSet(this, task);
        if (kei0Var == null) {
            return null;
        }
        return m120283b(kei0Var);
    }

    /* JADX INFO: renamed from: b */
    public final kei0 m120283b(kei0 task) {
        if (m120285e() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            f96650e.incrementAndGet(this);
        }
        int i = f96648c.get(this) & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        f96648c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m120284c(kei0 kei0Var) {
        if (kei0Var == null || kei0Var.taskContext.getTaskMode() != 1) {
            return;
        }
        f96650e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m120285e() {
        return f96648c.get(this) - f96649d.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final int m120286i() {
        Object obj = f96647b.get(this);
        int iM120285e = m120285e();
        return obj != null ? iM120285e + 1 : iM120285e;
    }

    /* JADX INFO: renamed from: j */
    public final void m120287j(@NotNull s1k globalQueue) {
        kei0 kei0Var = (kei0) f96647b.getAndSet(this, null);
        if (kei0Var != null) {
            globalQueue.m118522a(kei0Var);
        }
        while (m120291n(globalQueue)) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final kei0 m120288k() {
        kei0 kei0Var = (kei0) f96647b.getAndSet(this, null);
        return kei0Var == null ? m120290m() : kei0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final kei0 m120289l() {
        return m120292o(true);
    }

    /* JADX INFO: renamed from: m */
    public final kei0 m120290m() {
        kei0 andSet;
        while (true) {
            int i = f96649d.get(this);
            if (i - f96648c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f96649d.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i2, null)) != null) {
                m120284c(andSet);
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m120291n(s1k queue) {
        kei0 kei0VarM120290m = m120290m();
        if (kei0VarM120290m == null) {
            return false;
        }
        queue.m118522a(kei0VarM120290m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final kei0 m120292o(boolean onlyBlocking) {
        kei0 kei0Var;
        do {
            kei0Var = (kei0) f96647b.get(this);
            if (kei0Var != null) {
                if ((kei0Var.taskContext.getTaskMode() == 1) == onlyBlocking) {
                }
            }
            int i = f96649d.get(this);
            int i2 = f96648c.get(this);
            while (i != i2) {
                if (onlyBlocking && f96650e.get(this) == 0) {
                    return null;
                }
                i2--;
                kei0 kei0VarM120294q = m120294q(i2, onlyBlocking);
                if (kei0VarM120294q != null) {
                    return kei0VarM120294q;
                }
            }
            return null;
        } while (!C21643z7.m217426a(f96647b, this, kei0Var, null));
        return kei0Var;
    }

    /* JADX INFO: renamed from: p */
    public final kei0 m120293p(int stealingMode) {
        int i = f96649d.get(this);
        int i2 = f96648c.get(this);
        boolean z = stealingMode == 1;
        while (i != i2) {
            if (z && f96650e.get(this) == 0) {
                return null;
            }
            int i3 = i + 1;
            kei0 kei0VarM120294q = m120294q(i, z);
            if (kei0VarM120294q != null) {
                return kei0VarM120294q;
            }
            i = i3;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final kei0 m120294q(int index, boolean onlyBlocking) {
        int i = index & 127;
        kei0 kei0Var = this.buffer.get(i);
        if (kei0Var != null) {
            if ((kei0Var.taskContext.getTaskMode() == 1) == onlyBlocking && tr4.m190366a(this.buffer, i, kei0Var, null)) {
                if (onlyBlocking) {
                    f96650e.decrementAndGet(this);
                }
                return kei0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final long m120295r(int stealingMode, @NotNull Ref.ObjectRef<kei0> stolenTaskRef) {
        kei0 kei0VarM120293p;
        T t;
        kei0 kei0VarM120290m;
        if (stealingMode == 3) {
            kei0VarM120290m = m120290m();
        } else {
            kei0VarM120293p = m120293p(stealingMode);
        }
        if (t == 0) {
            t = kei0VarM120293p;
            t = kei0VarM120290m;
            return m120296s(stealingMode, stolenTaskRef);
        }
        t = kei0VarM120293p;
        t = kei0VarM120290m;
        stolenTaskRef.element = t;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, l.kei0] */
    /* JADX INFO: renamed from: s */
    public final long m120296s(int stealingMode, Ref.ObjectRef<kei0> stolenTaskRef) {
        ?? r0;
        do {
            r0 = (kei0) f96647b.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.taskContext.getTaskMode() != 1 ? 2 : 1) & stealingMode) == 0) {
                return -2L;
            }
            long jMo94764a = ufi0.f176262f.mo94764a() - r0.submissionTime;
            long j = ufi0.f176258b;
            if (jMo94764a < j) {
                return j - jMo94764a;
            }
        } while (!C21643z7.m217426a(f96647b, this, r0, null));
        stolenTaskRef.element = r0;
        return -1L;
    }
}
