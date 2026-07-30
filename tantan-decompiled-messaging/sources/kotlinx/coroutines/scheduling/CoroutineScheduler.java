package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC17712j8;
import p149l.C17950k8;
import p149l.dfi0;
import p149l.faq0;
import p149l.hck0;
import p149l.j6f;
import p149l.kei0;
import p149l.mvc0;
import p149l.o8c;
import p149l.pce0;
import p149l.s1k;
import p149l.ufi0;
import p149l.vei0;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0003CFZB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010\u0013J)\u0010)\u001a\u00020\u00192\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020\u00192\n\u0010/\u001a\u00060-j\u0002`.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u00020\u00192\n\u00107\u001a\u00060-j\u0002`.2\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\f2\n\u00107\u001a\u00060-j\u0002`.2\u0006\u00109\u001a\u000208¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0019¢\u0006\u0004\b>\u00103J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001e\u0010R\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000O8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bS\u0010 R\u000b\u0010U\u001a\u00020T8\u0002X\u0082\u0004R\u000b\u0010W\u001a\u00020V8\u0002X\u0082\u0004R\u000b\u0010X\u001a\u00020V8\u0002X\u0082\u0004¨\u0006["}, m87232d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Ll/kei0;", "task", "", "m", "(Ll/kei0;)Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "M", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "worker", "J", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)I", "stateSnapshot", "skipUnpark", "", "Y", "(JZ)V", "state", "d0", "(J)Z", "h0", "()Z", "n", "()I", "tailDispatch", "c0", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;Ll/kei0;Z)Ll/kei0;", Constants.KEY_T, "oldIndex", "newIndex", "Q", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;II)V", "N", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", CommandMessage.COMMAND, "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", j6f.GPS_DIRECTION_TRUE, "(J)V", "block", "Ll/vei0;", "taskContext", "u", "(Ljava/lang/Runnable;Ll/vei0;Z)V", "q", "(Ljava/lang/Runnable;Ll/vei0;)Ll/kei0;", "Z", "toString", "()Ljava/lang/String;", j6f.LATITUDE_SOUTH, "(Ll/kei0;)V", "a", "I", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "Ll/s1k;", "e", "Ll/s1k;", "globalCpuQueue", "f", "globalBlockingQueue", "Ll/mvc0;", "g", "Ll/mvc0;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "Companion", "WorkerState", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f66925h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f66926i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66927j = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final yfh0 f66928k = new yfh0("NOT_IN_STACK");
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
    public final s1k globalCpuQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final s1k globalBlockingQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final mvc0<C15492c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<WorkerState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public /* synthetic */ class C15491b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66936a;

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
            f66936a = iArr;
        }
    }

    public CoroutineScheduler(int i, int i2, long j, @NotNull String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i < 1) {
            pce0.m168340a("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            hck0.m130443a("Max pool size ", i2, " should be greater than or equals to core pool size ", i);
            throw null;
        }
        if (i2 > 2097150) {
            pce0.m168340a("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.globalCpuQueue = new s1k();
        this.globalBlockingQueue = new s1k();
        this.workers = new mvc0<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicLongFieldUpdater m94250F() {
        return f66926i;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m94253g0(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f66926i.get(coroutineScheduler);
        }
        return coroutineScheduler.m94265d0(j);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m94255v(CoroutineScheduler coroutineScheduler, Runnable runnable, vei0 vei0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            vei0Var = ufi0.f176263g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.m94271u(runnable, vei0Var, z);
    }

    /* JADX INFO: renamed from: J */
    public final int m94256J(C15492c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f66928k) {
            if (nextParkedWorker == null) {
                return 0;
            }
            C15492c c15492c = (C15492c) nextParkedWorker;
            int indexInArray = c15492c.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = c15492c.getNextParkedWorker();
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final C15492c m94257M() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66925h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C15492c c15492cM156479b = this.workers.m156479b((int) (2097151 & j));
            if (c15492cM156479b == null) {
                return null;
            }
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int iM94256J = this.m94256J(c15492cM156479b);
            if (iM94256J >= 0) {
                CoroutineScheduler coroutineScheduler = this;
                if (f66925h.compareAndSet(coroutineScheduler, j, ((long) iM94256J) | j2)) {
                    c15492cM156479b.m94289r(f66928k);
                    return c15492cM156479b;
                }
                this = coroutineScheduler;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m94258N(@NotNull C15492c worker) {
        if (worker.getNextParkedWorker() != f66928k) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66925h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int indexInArray = worker.getIndexInArray();
            worker.m94289r(this.workers.m156479b((int) (2097151 & j)));
            long j3 = j2 | ((long) indexInArray);
            CoroutineScheduler coroutineScheduler = this;
            if (f66925h.compareAndSet(coroutineScheduler, j, j3)) {
                return true;
            }
            this = coroutineScheduler;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m94259Q(@NotNull C15492c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f66925h;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iM94256J = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (iM94256J == oldIndex) {
                iM94256J = newIndex == 0 ? this.m94256J(worker) : newIndex;
            }
            if (iM94256J >= 0) {
                CoroutineScheduler coroutineScheduler = this;
                if (f66925h.compareAndSet(coroutineScheduler, j, j2 | ((long) iM94256J))) {
                    return;
                } else {
                    this = coroutineScheduler;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m94260S(@NotNull kei0 task) {
        try {
            task.run();
            AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
            if (abstractC17712j8 != null) {
                abstractC17712j8.m140178e();
            }
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC17712j8 abstractC17712j9 = C17950k8.f121709a;
                if (abstractC17712j9 != null) {
                    abstractC17712j9.m140178e();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: T */
    public final void m94261T(long timeout) throws InterruptedException {
        int i;
        kei0 kei0VarM118525e;
        if (f66927j.compareAndSet(this, 0, 1)) {
            C15492c c15492cM94270t = m94270t();
            synchronized (this.workers) {
                i = (int) (m94250F().get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C15492c c15492cM156479b = this.workers.m156479b(i2);
                    c15492cM156479b.getClass();
                    C15492c c15492c = c15492cM156479b;
                    if (c15492c != c15492cM94270t) {
                        while (c15492c.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c15492c);
                            c15492c.join(timeout);
                        }
                        c15492c.localQueue.m120287j(this.globalBlockingQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.m118523b();
            this.globalCpuQueue.m118523b();
            while (true) {
                if (c15492cM94270t == null) {
                    kei0VarM118525e = this.globalCpuQueue.m118525e();
                    if (kei0VarM118525e == null && (kei0VarM118525e = this.globalBlockingQueue.m118525e()) == null) {
                        break;
                    }
                } else {
                    kei0VarM118525e = c15492cM94270t.m94279g(true);
                    if (kei0VarM118525e == null) {
                        kei0VarM118525e = this.globalCpuQueue.m118525e();
                        if (kei0VarM118525e == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                m94260S(kei0VarM118525e);
            }
            if (c15492cM94270t != null) {
                c15492cM94270t.m94292u(WorkerState.TERMINATED);
            }
            f66925h.set(this, 0L);
            f66926i.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m94262Y(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || m94266h0() || m94265d0(stateSnapshot)) {
            return;
        }
        m94266h0();
    }

    /* JADX INFO: renamed from: Z */
    public final void m94263Z() {
        if (m94266h0() || m94253g0(this, 0L, 1, null)) {
            return;
        }
        m94266h0();
    }

    /* JADX INFO: renamed from: c0 */
    public final kei0 m94264c0(C15492c c15492c, kei0 kei0Var, boolean z) {
        if (c15492c == null || c15492c.state == WorkerState.TERMINATED) {
            return kei0Var;
        }
        if (kei0Var.taskContext.getTaskMode() == 0 && c15492c.state == WorkerState.BLOCKING) {
            return kei0Var;
        }
        c15492c.mayHaveLocalTasks = true;
        return c15492c.localQueue.m120282a(kei0Var, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m94261T(10000L);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m94265d0(long state) {
        if (C15167a.m87596b(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iM94268n = m94268n();
            if (iM94268n == 1 && this.corePoolSize > 1) {
                m94268n();
            }
            if (iM94268n > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        m94255v(this, command, null, false, 6, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m94266h0() {
        C15492c c15492cM94257M;
        do {
            c15492cM94257M = m94257M();
            if (c15492cM94257M == null) {
                return false;
            }
        } while (!C15492c.f66937i.compareAndSet(c15492cM94257M, -1, 0));
        LockSupport.unpark(c15492cM94257M);
        return true;
    }

    public final boolean isTerminated() {
        return f66927j.get(this) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m94267m(kei0 task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.m118522a(task) : this.globalCpuQueue.m118522a(task);
    }

    /* JADX INFO: renamed from: n */
    public final int m94268n() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j = f66926i.get(this);
                int i = (int) (j & 2097151);
                int iM87596b = C15167a.m87596b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (iM87596b >= this.corePoolSize) {
                    return 0;
                }
                if (i >= this.maxPoolSize) {
                    return 0;
                }
                int i2 = ((int) (m94250F().get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.workers.m156479b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C15492c c15492c = new C15492c(this, i2);
                this.workers.m156480c(i2, c15492c);
                if (i2 != ((int) (2097151 & f66926i.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = iM87596b + 1;
                c15492c.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final kei0 m94269q(@NotNull Runnable block, @NotNull vei0 taskContext) {
        long jMo94764a = ufi0.f176262f.mo94764a();
        if (!(block instanceof kei0)) {
            return new dfi0(block, jMo94764a, taskContext);
        }
        kei0 kei0Var = (kei0) block;
        kei0Var.submissionTime = jMo94764a;
        kei0Var.taskContext = taskContext;
        return kei0Var;
    }

    /* JADX INFO: renamed from: t */
    public final C15492c m94270t() {
        Thread threadCurrentThread = Thread.currentThread();
        C15492c c15492c = threadCurrentThread instanceof C15492c ? (C15492c) threadCurrentThread : null;
        if (c15492c == null || !Intrinsics.m87488d(CoroutineScheduler.this, this)) {
            return null;
        }
        return c15492c;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM156478a = this.workers.m156478a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM156478a; i6++) {
            C15492c c15492cM156479b = this.workers.m156479b(i6);
            if (c15492cM156479b != null) {
                int iM120286i = c15492cM156479b.localQueue.m120286i();
                int i7 = C15491b.f66936a[c15492cM156479b.state.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM120286i);
                    sb.append(Constants.INAPP_POSITION_BOTTOM);
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM120286i);
                    sb2.append(Constants.INAPP_POSITION_CENTER);
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM120286i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM120286i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = f66926i.get(this);
        return this.schedulerName + '@' + o8c.m163112b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.m118524c() + ", global blocking queue size = " + this.globalBlockingQueue.m118524c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: u */
    public final void m94271u(@NotNull Runnable block, @NotNull vei0 taskContext, boolean tailDispatch) {
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        if (abstractC17712j8 != null) {
            abstractC17712j8.m140177d();
        }
        kei0 kei0VarM94269q = m94269q(block, taskContext);
        boolean z = false;
        boolean z2 = kei0VarM94269q.taskContext.getTaskMode() == 1;
        long jAddAndGet = z2 ? f66926i.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        C15492c c15492cM94270t = m94270t();
        kei0 kei0VarM94264c0 = m94264c0(c15492cM94270t, kei0VarM94269q, tailDispatch);
        if (kei0VarM94264c0 != null && !m94267m(kei0VarM94264c0)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (tailDispatch && c15492cM94270t != null) {
            z = true;
        }
        if (z2) {
            m94262Y(jAddAndGet, z);
        } else {
            if (z) {
                return;
            }
            m94263Z();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    @Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010#\u001a\u0004\u0018\u00010\u000f2\n\u0010\"\u001a\u00060\u0004j\u0002`!H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u0015\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u001fR*\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0015R\u0014\u00107\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00109R\u0016\u0010<\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010>R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0016\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010IR\b\u0010K\u001a\u00020J8\u0006¨\u0006L"}, m87232d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "", FirebaseAnalytics.Param.INDEX, "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Z", "", "p", "()V", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44444l, "Ll/kei0;", "task", Constants.INAPP_DATA_TAG, "(Ll/kei0;)V", "taskMode", "c", "(I)V", "b", "n", "w", "mode", "k", "f", "()Ll/kei0;", "scanLocalQueue", "e", "(Z)Ll/kei0;", "o", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", ResourceDirection.f38808v, "(I)Ll/kei0;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "u", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "run", "upperBound", "m", "(I)I", "mayHaveLocalTasks", "g", "indexInArray", "I", "h", "()I", "q", "Ll/faq0;", "a", "Ll/faq0;", "localQueue", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTask", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C15492c extends Thread {

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f66937i = AtomicIntegerFieldUpdater.newUpdater(C15492c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final faq0 localQueue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Ref.ObjectRef<kei0> stolenTask;

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

        public C15492c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new faq0();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f66928k;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        public final void m94274b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            CoroutineScheduler.m94250F().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m94275c(int taskMode) {
            if (taskMode != 0 && m94292u(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.m94263Z();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m94276d(kei0 task) {
            int taskMode = task.taskContext.getTaskMode();
            m94282k(taskMode);
            m94275c(taskMode);
            CoroutineScheduler.this.m94260S(task);
            m94274b(taskMode);
        }

        /* JADX INFO: renamed from: e */
        public final kei0 m94277e(boolean scanLocalQueue) {
            kei0 kei0VarM94286o;
            kei0 kei0VarM94286o2;
            if (scanLocalQueue) {
                boolean z = m94284m(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z && (kei0VarM94286o2 = m94286o()) != null) {
                    return kei0VarM94286o2;
                }
                kei0 kei0VarM120288k = this.localQueue.m120288k();
                if (kei0VarM120288k != null) {
                    return kei0VarM120288k;
                }
                if (!z && (kei0VarM94286o = m94286o()) != null) {
                    return kei0VarM94286o;
                }
            } else {
                kei0 kei0VarM94286o3 = m94286o();
                if (kei0VarM94286o3 != null) {
                    return kei0VarM94286o3;
                }
            }
            return m94293v(3);
        }

        /* JADX INFO: renamed from: f */
        public final kei0 m94278f() {
            kei0 kei0VarM120289l = this.localQueue.m120289l();
            return (kei0VarM120289l == null && (kei0VarM120289l = CoroutineScheduler.this.globalBlockingQueue.m118525e()) == null) ? m94293v(1) : kei0VarM120289l;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final kei0 m94279g(boolean mayHaveLocalTasks) {
            return m94290s() ? m94277e(mayHaveLocalTasks) : m94278f();
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
        public final void m94282k(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        /* JADX INFO: renamed from: l */
        public final boolean m94283l() {
            return this.nextParkedWorker != CoroutineScheduler.f66928k;
        }

        /* JADX INFO: renamed from: m */
        public final int m94284m(int upperBound) {
            int i = this.rngState;
            int i2 = i ^ (i << 13);
            int i3 = i2 ^ (i2 >> 17);
            int i4 = i3 ^ (i3 << 5);
            this.rngState = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i5 & i4 : (Integer.MAX_VALUE & i4) % upperBound;
        }

        /* JADX INFO: renamed from: n */
        public final void m94285n() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                m94294w();
            }
        }

        /* JADX INFO: renamed from: o */
        public final kei0 m94286o() {
            int iM94284m = m94284m(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iM94284m == 0) {
                kei0 kei0VarM118525e = coroutineScheduler.globalCpuQueue.m118525e();
                return kei0VarM118525e != null ? kei0VarM118525e : CoroutineScheduler.this.globalBlockingQueue.m118525e();
            }
            kei0 kei0VarM118525e2 = coroutineScheduler.globalBlockingQueue.m118525e();
            return kei0VarM118525e2 != null ? kei0VarM118525e2 : CoroutineScheduler.this.globalCpuQueue.m118525e();
        }

        /* JADX INFO: renamed from: p */
        public final void m94287p() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    kei0 kei0VarM94279g = m94279g(this.mayHaveLocalTasks);
                    if (kei0VarM94279g != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        m94276d(kei0VarM94279g);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        m94291t();
                    } else {
                        if (z) {
                            m94292u(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            m94292u(WorkerState.TERMINATED);
        }

        /* JADX INFO: renamed from: q */
        public final void m94288q(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* JADX INFO: renamed from: r */
        public final void m94289r(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m94287p();
        }

        /* JADX INFO: renamed from: s */
        public final boolean m94290s() {
            long j;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM94250F = CoroutineScheduler.m94250F();
            do {
                j = atomicLongFieldUpdaterM94250F.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.m94250F().compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: t */
        public final void m94291t() {
            if (!m94283l()) {
                CoroutineScheduler.this.m94258N(this);
                return;
            }
            f66937i.set(this, -1);
            while (m94283l() && f66937i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                m94292u(WorkerState.PARKING);
                Thread.interrupted();
                m94285n();
            }
        }

        /* JADX INFO: renamed from: u */
        public final boolean m94292u(@NotNull WorkerState newState) {
            WorkerState workerState = this.state;
            boolean z = workerState == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.m94250F().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        /* JADX INFO: renamed from: v */
        public final kei0 m94293v(int stealingMode) {
            int i = (int) (CoroutineScheduler.m94250F().get(CoroutineScheduler.this) & 2097151);
            if (i < 2) {
                return null;
            }
            int iM94284m = m94284m(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iM94284m++;
                if (iM94284m > i) {
                    iM94284m = 1;
                }
                C15492c c15492cM156479b = coroutineScheduler.workers.m156479b(iM94284m);
                if (c15492cM156479b != null && c15492cM156479b != this) {
                    long jM120295r = c15492cM156479b.localQueue.m120295r(stealingMode, this.stolenTask);
                    if (jM120295r == -1) {
                        Ref.ObjectRef<kei0> objectRef = this.stolenTask;
                        kei0 kei0Var = objectRef.element;
                        objectRef.element = null;
                        return kei0Var;
                    }
                    if (jM120295r > 0) {
                        jMin = Math.min(jMin, jM120295r);
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
        public final void m94294w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.m94250F().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (f66937i.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        m94288q(0);
                        coroutineScheduler.m94259Q(this, i, 0);
                        int andDecrement = (int) (CoroutineScheduler.m94250F().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i) {
                            C15492c c15492cM156479b = coroutineScheduler.workers.m156479b(andDecrement);
                            c15492cM156479b.getClass();
                            C15492c c15492c = c15492cM156479b;
                            coroutineScheduler.workers.m156480c(i, c15492c);
                            c15492c.m94288q(i);
                            coroutineScheduler.m94259Q(c15492c, andDecrement, i);
                        }
                        coroutineScheduler.workers.m156480c(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C15492c(CoroutineScheduler coroutineScheduler, int i) {
            this();
            m94288q(i);
        }
    }
}
