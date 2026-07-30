package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.doi0;
import p153l.goh0;
import p153l.k4k;
import p153l.kjq0;
import p153l.kni0;
import p153l.nlk0;
import p153l.p3d0;
import p153l.p7f;
import p153l.u9c;
import p153l.uke0;
import p153l.uoi0;
import p153l.vni0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0003CFZB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010\u0013J)\u0010)\u001a\u00020\u00192\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020\u00192\n\u0010/\u001a\u00060-j\u0002`.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u00020\u00192\n\u00107\u001a\u00060-j\u0002`.2\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\f2\n\u00107\u001a\u00060-j\u0002`.2\u0006\u00109\u001a\u000208¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0019¢\u0006\u0004\b>\u00103J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001e\u0010R\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000O8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bS\u0010 R\u000b\u0010U\u001a\u00020T8\u0002X\u0082\u0004R\u000b\u0010W\u001a\u00020V8\u0002X\u0082\u0004R\u000b\u0010X\u001a\u00020V8\u0002X\u0082\u0004¨\u0006["}, m88121d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Ll/kni0;", "task", "", "m", "(Ll/kni0;)Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "M", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "worker", "J", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)I", "stateSnapshot", "skipUnpark", "", "Z", "(JZ)V", "state", "e0", "(J)Z", "i0", "()Z", "n", "()I", "tailDispatch", "d0", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;Ll/kni0;Z)Ll/kni0;", Constants.KEY_T, "oldIndex", "newIndex", "Q", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;II)V", "N", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", CommandMessage.COMMAND, "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "U", "(J)V", "block", "Ll/vni0;", "taskContext", "u", "(Ljava/lang/Runnable;Ll/vni0;Z)V", "q", "(Ljava/lang/Runnable;Ll/vni0;)Ll/kni0;", "a0", "toString", "()Ljava/lang/String;", p7f.LATITUDE_SOUTH, "(Ll/kni0;)V", "a", "I", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "Ll/k4k;", "e", "Ll/k4k;", "globalCpuQueue", "f", "globalBlockingQueue", "Ll/p3d0;", "g", "Ll/p3d0;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "Companion", "WorkerState", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f67599h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f67600i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67601j = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final goh0 f67602k = new goh0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int corePoolSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int maxPoolSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final k4k globalCpuQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final k4k globalBlockingQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final p3d0<C15599c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<WorkerState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public /* synthetic */ class C15598b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67610a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f67610a = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, @NotNull String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i < 1) {
            uke0.m196486a("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            nlk0.m163726a("Max pool size ", i2, " should be greater than or equals to core pool size ", i);
            throw null;
        }
        if (i2 > 2097150) {
            uke0.m196486a("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.globalCpuQueue = new k4k();
        this.globalBlockingQueue = new k4k();
        this.workers = new p3d0<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicLongFieldUpdater m95143F() {
        return f67600i;
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ boolean m95146h0(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f67600i.get(coroutineScheduler);
        }
        return coroutineScheduler.m95158e0(j);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m95148v(CoroutineScheduler coroutineScheduler, Runnable runnable, vni0 vni0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            vni0Var = uoi0.f180095g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.m95164u(runnable, vni0Var, z);
    }

    /* JADX INFO: renamed from: J */
    public final int m95149J(C15599c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f67602k) {
            if (nextParkedWorker == null) {
                return 0;
            }
            C15599c c15599c = (C15599c) nextParkedWorker;
            int indexInArray = c15599c.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = c15599c.getNextParkedWorker();
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final C15599c m95150M() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67599h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C15599c c15599cM170487b = this.workers.m170487b((int) (2097151 & j));
            if (c15599cM170487b == null) {
                return null;
            }
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int iM95149J = this.m95149J(c15599cM170487b);
            if (iM95149J >= 0) {
                CoroutineScheduler coroutineScheduler = this;
                if (f67599h.compareAndSet(coroutineScheduler, j, ((long) iM95149J) | j2)) {
                    c15599cM170487b.m95182r(f67602k);
                    return c15599cM170487b;
                }
                this = coroutineScheduler;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m95151N(@NotNull C15599c worker) {
        if (worker.getNextParkedWorker() != f67602k) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67599h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int indexInArray = worker.getIndexInArray();
            worker.m95182r(this.workers.m170487b((int) (2097151 & j)));
            long j3 = j2 | ((long) indexInArray);
            CoroutineScheduler coroutineScheduler = this;
            if (f67599h.compareAndSet(coroutineScheduler, j, j3)) {
                return true;
            }
            this = coroutineScheduler;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m95152Q(@NotNull C15599c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f67599h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iM95149J = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (iM95149J == oldIndex) {
                iM95149J = newIndex == 0 ? this.m95149J(worker) : newIndex;
            }
            if (iM95149J >= 0) {
                CoroutineScheduler coroutineScheduler = this;
                if (f67599h.compareAndSet(coroutineScheduler, j, j2 | ((long) iM95149J))) {
                    return;
                } else {
                    this = coroutineScheduler;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m95153S(@NotNull kni0 task) {
        try {
            task.run();
            AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
            if (abstractC16728e8 != null) {
                abstractC16728e8.m119785e();
            }
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC16728e8 abstractC16728e9 = C16923f8.f97691a;
                if (abstractC16728e9 != null) {
                    abstractC16728e9.m119785e();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: U */
    public final void m95154U(long timeout) throws InterruptedException {
        int i;
        kni0 kni0VarM128135e;
        if (f67601j.compareAndSet(this, 0, 1)) {
            C15599c c15599cM95163t = m95163t();
            synchronized (this.workers) {
                i = (int) (m95143F().get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C15599c c15599cM170487b = this.workers.m170487b(i2);
                    c15599cM170487b.getClass();
                    C15599c c15599c = c15599cM170487b;
                    if (c15599c != c15599cM95163t) {
                        while (c15599c.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c15599c);
                            c15599c.join(timeout);
                        }
                        c15599c.localQueue.m150062j(this.globalBlockingQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.m128133b();
            this.globalCpuQueue.m128133b();
            while (true) {
                if (c15599cM95163t == null) {
                    kni0VarM128135e = this.globalCpuQueue.m128135e();
                    if (kni0VarM128135e == null && (kni0VarM128135e = this.globalBlockingQueue.m128135e()) == null) {
                        break;
                    }
                } else {
                    kni0VarM128135e = c15599cM95163t.m95172g(true);
                    if (kni0VarM128135e == null) {
                        kni0VarM128135e = this.globalCpuQueue.m128135e();
                        if (kni0VarM128135e == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                m95153S(kni0VarM128135e);
            }
            if (c15599cM95163t != null) {
                c15599cM95163t.m95185u(WorkerState.TERMINATED);
            }
            f67599h.set(this, 0L);
            f67600i.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m95155Z(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || m95159i0() || m95158e0(stateSnapshot)) {
            return;
        }
        m95159i0();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m95156a0() {
        if (m95159i0() || m95146h0(this, 0L, 1, null)) {
            return;
        }
        m95159i0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m95154U(10000L);
    }

    /* JADX INFO: renamed from: d0 */
    public final kni0 m95157d0(C15599c c15599c, kni0 kni0Var, boolean z) {
        if (c15599c == null || c15599c.state == WorkerState.TERMINATED) {
            return kni0Var;
        }
        if (kni0Var.taskContext.getTaskMode() == 0 && c15599c.state == WorkerState.BLOCKING) {
            return kni0Var;
        }
        c15599c.mayHaveLocalTasks = true;
        return c15599c.localQueue.m150057a(kni0Var, z);
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m95158e0(long state) {
        if (C15274a.m88486b(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iM95161n = m95161n();
            if (iM95161n == 1 && this.corePoolSize > 1) {
                m95161n();
            }
            if (iM95161n > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        m95148v(this, command, null, false, 6, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m95159i0() {
        C15599c c15599cM95150M;
        do {
            c15599cM95150M = m95150M();
            if (c15599cM95150M == null) {
                return false;
            }
        } while (!C15599c.f67611i.compareAndSet(c15599cM95150M, -1, 0));
        LockSupport.unpark(c15599cM95150M);
        return true;
    }

    public final boolean isTerminated() {
        return f67601j.get(this) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m95160m(kni0 task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.m128132a(task) : this.globalCpuQueue.m128132a(task);
    }

    /* JADX INFO: renamed from: n */
    public final int m95161n() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j = f67600i.get(this);
                int i = (int) (j & 2097151);
                int iM88486b = C15274a.m88486b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (iM88486b >= this.corePoolSize) {
                    return 0;
                }
                if (i >= this.maxPoolSize) {
                    return 0;
                }
                int i2 = ((int) (m95143F().get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.workers.m170487b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C15599c c15599c = new C15599c(this, i2);
                this.workers.m170488c(i2, c15599c);
                if (i2 != ((int) (2097151 & f67600i.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = iM88486b + 1;
                c15599c.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final kni0 m95162q(@NotNull Runnable block, @NotNull vni0 taskContext) {
        long jMo139423a = uoi0.f180094f.mo139423a();
        if (!(block instanceof kni0)) {
            return new doi0(block, jMo139423a, taskContext);
        }
        kni0 kni0Var = (kni0) block;
        kni0Var.submissionTime = jMo139423a;
        kni0Var.taskContext = taskContext;
        return kni0Var;
    }

    /* JADX INFO: renamed from: t */
    public final C15599c m95163t() {
        Thread threadCurrentThread = Thread.currentThread();
        C15599c c15599c = threadCurrentThread instanceof C15599c ? (C15599c) threadCurrentThread : null;
        if (c15599c == null || !Intrinsics.m88377d(CoroutineScheduler.this, this)) {
            return null;
        }
        return c15599c;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM170486a = this.workers.m170486a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM170486a; i6++) {
            C15599c c15599cM170487b = this.workers.m170487b(i6);
            if (c15599cM170487b != null) {
                int iM150061i = c15599cM170487b.localQueue.m150061i();
                int i7 = C15598b.f67610a[c15599cM170487b.state.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM150061i);
                    sb.append(Constants.INAPP_POSITION_BOTTOM);
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM150061i);
                    sb2.append(Constants.INAPP_POSITION_CENTER);
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM150061i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM150061i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = f67600i.get(this);
        return this.schedulerName + '@' + u9c.m195087b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.m128134c() + ", global blocking queue size = " + this.globalBlockingQueue.m128134c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: u */
    public final void m95164u(@NotNull Runnable block, @NotNull vni0 taskContext, boolean tailDispatch) {
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        if (abstractC16728e8 != null) {
            abstractC16728e8.m119784d();
        }
        kni0 kni0VarM95162q = m95162q(block, taskContext);
        boolean z = false;
        boolean z2 = kni0VarM95162q.taskContext.getTaskMode() == 1;
        long jAddAndGet = z2 ? f67600i.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        C15599c c15599cM95163t = m95163t();
        kni0 kni0VarM95157d0 = m95157d0(c15599cM95163t, kni0VarM95162q, tailDispatch);
        if (kni0VarM95157d0 != null && !m95160m(kni0VarM95157d0)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (tailDispatch && c15599cM95163t != null) {
            z = true;
        }
        if (z2) {
            m95155Z(jAddAndGet, z);
        } else {
            if (z) {
                return;
            }
            m95156a0();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    @Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010#\u001a\u0004\u0018\u00010\u000f2\n\u0010\"\u001a\u00060\u0004j\u0002`!H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u0015\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u001fR*\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0015R\u0014\u00107\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R\u0016\u0010<\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010>R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0016\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010IR\b\u0010K\u001a\u00020J8\u0006¨\u0006L"}, m88121d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "", FirebaseAnalytics.Param.INDEX, "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Z", "", "p", "()V", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kni0;", "task", Constants.INAPP_DATA_TAG, "(Ll/kni0;)V", "taskMode", "c", "(I)V", "b", "n", "w", "mode", "k", "f", "()Ll/kni0;", "scanLocalQueue", "e", "(Z)Ll/kni0;", "o", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", ResourceDirection.f39656v, "(I)Ll/kni0;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "u", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "run", "upperBound", "m", "(I)I", "mayHaveLocalTasks", "g", "indexInArray", "I", "h", "()I", "q", "Ll/kjq0;", "a", "Ll/kjq0;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C15599c extends Thread {

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f67611i = AtomicIntegerFieldUpdater.newUpdater(C15599c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final kjq0 localQueue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Ref.ObjectRef<kni0> stolenTask;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public WorkerState state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long terminationDeadline;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int rngState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C15599c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new kjq0();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f67602k;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        public final void m95167b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            CoroutineScheduler.m95143F().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m95168c(int taskMode) {
            if (taskMode != 0 && m95185u(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.m95156a0();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m95169d(kni0 task) {
            int taskMode = task.taskContext.getTaskMode();
            m95175k(taskMode);
            m95168c(taskMode);
            CoroutineScheduler.this.m95153S(task);
            m95167b(taskMode);
        }

        /* JADX INFO: renamed from: e */
        public final kni0 m95170e(boolean scanLocalQueue) {
            kni0 kni0VarM95179o;
            kni0 kni0VarM95179o2;
            if (scanLocalQueue) {
                boolean z = m95177m(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z && (kni0VarM95179o2 = m95179o()) != null) {
                    return kni0VarM95179o2;
                }
                kni0 kni0VarM150063k = this.localQueue.m150063k();
                if (kni0VarM150063k != null) {
                    return kni0VarM150063k;
                }
                if (!z && (kni0VarM95179o = m95179o()) != null) {
                    return kni0VarM95179o;
                }
            } else {
                kni0 kni0VarM95179o3 = m95179o();
                if (kni0VarM95179o3 != null) {
                    return kni0VarM95179o3;
                }
            }
            return m95186v(3);
        }

        /* JADX INFO: renamed from: f */
        public final kni0 m95171f() {
            kni0 kni0VarM150064l = this.localQueue.m150064l();
            return (kni0VarM150064l == null && (kni0VarM150064l = CoroutineScheduler.this.globalBlockingQueue.m128135e()) == null) ? m95186v(1) : kni0VarM150064l;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final kni0 m95172g(boolean mayHaveLocalTasks) {
            return m95183s() ? m95170e(mayHaveLocalTasks) : m95171f();
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: k */
        public final void m95175k(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        /* JADX INFO: renamed from: l */
        public final boolean m95176l() {
            return this.nextParkedWorker != CoroutineScheduler.f67602k;
        }

        /* JADX INFO: renamed from: m */
        public final int m95177m(int upperBound) {
            int i = this.rngState;
            int i2 = i ^ (i << 13);
            int i3 = i2 ^ (i2 >> 17);
            int i4 = i3 ^ (i3 << 5);
            this.rngState = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i5 & i4 : (Integer.MAX_VALUE & i4) % upperBound;
        }

        /* JADX INFO: renamed from: n */
        public final void m95178n() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                m95187w();
            }
        }

        /* JADX INFO: renamed from: o */
        public final kni0 m95179o() {
            int iM95177m = m95177m(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iM95177m == 0) {
                kni0 kni0VarM128135e = coroutineScheduler.globalCpuQueue.m128135e();
                return kni0VarM128135e != null ? kni0VarM128135e : CoroutineScheduler.this.globalBlockingQueue.m128135e();
            }
            kni0 kni0VarM128135e2 = coroutineScheduler.globalBlockingQueue.m128135e();
            return kni0VarM128135e2 != null ? kni0VarM128135e2 : CoroutineScheduler.this.globalCpuQueue.m128135e();
        }

        /* JADX INFO: renamed from: p */
        public final void m95180p() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    kni0 kni0VarM95172g = m95172g(this.mayHaveLocalTasks);
                    if (kni0VarM95172g != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        m95169d(kni0VarM95172g);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        m95184t();
                    } else {
                        if (z) {
                            m95185u(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            m95185u(WorkerState.TERMINATED);
        }

        /* JADX INFO: renamed from: q */
        public final void m95181q(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* JADX INFO: renamed from: r */
        public final void m95182r(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m95180p();
        }

        /* JADX INFO: renamed from: s */
        public final boolean m95183s() {
            long j;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM95143F = CoroutineScheduler.m95143F();
            do {
                j = atomicLongFieldUpdaterM95143F.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.m95143F().compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: t */
        public final void m95184t() {
            if (!m95176l()) {
                CoroutineScheduler.this.m95151N(this);
                return;
            }
            f67611i.set(this, -1);
            while (m95176l() && f67611i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                m95185u(WorkerState.PARKING);
                Thread.interrupted();
                m95178n();
            }
        }

        /* JADX INFO: renamed from: u */
        public final boolean m95185u(@NotNull WorkerState newState) {
            WorkerState workerState = this.state;
            boolean z = workerState == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.m95143F().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        /* JADX INFO: renamed from: v */
        public final kni0 m95186v(int stealingMode) {
            int i = (int) (CoroutineScheduler.m95143F().get(CoroutineScheduler.this) & 2097151);
            if (i < 2) {
                return null;
            }
            int iM95177m = m95177m(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iM95177m++;
                if (iM95177m > i) {
                    iM95177m = 1;
                }
                C15599c c15599cM170487b = coroutineScheduler.workers.m170487b(iM95177m);
                if (c15599cM170487b != null && c15599cM170487b != this) {
                    long jM150070r = c15599cM170487b.localQueue.m150070r(stealingMode, this.stolenTask);
                    if (jM150070r == -1) {
                        Ref.ObjectRef<kni0> objectRef = this.stolenTask;
                        kni0 kni0Var = objectRef.element;
                        objectRef.element = null;
                        return kni0Var;
                    }
                    if (jM150070r > 0) {
                        jMin = Math.min(jMin, jM150070r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        /* JADX INFO: renamed from: w */
        public final void m95187w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.m95143F().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (f67611i.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        m95181q(0);
                        coroutineScheduler.m95152Q(this, i, 0);
                        int andDecrement = (int) (CoroutineScheduler.m95143F().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i) {
                            C15599c c15599cM170487b = coroutineScheduler.workers.m170487b(andDecrement);
                            c15599cM170487b.getClass();
                            C15599c c15599c = c15599cM170487b;
                            coroutineScheduler.workers.m170488c(i, c15599c);
                            c15599c.m95181q(i);
                            coroutineScheduler.m95152Q(c15599c, andDecrement, i);
                        }
                        coroutineScheduler.workers.m170488c(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C15599c(CoroutineScheduler coroutineScheduler, int i) {
            this();
            m95181q(i);
        }
    }
}
