package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC17712j8;
import p149l.C17950k8;
import p149l.C21643z7;
import p149l.api0;
import p149l.bf4;
import p149l.bpi0;
import p149l.df4;
import p149l.fwv;
import p149l.ig3;
import p149l.l4e;
import p149l.nl40;
import p149l.qkq0;
import p149l.toi0;
import p149l.u3f;

/* JADX INFO: renamed from: kotlinx.coroutines.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004?@ABB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u0004R$\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u000b\u0010<\u001a\u00020;8\u0002X\u0082\u0004R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=088\u0002X\u0082\u0004¨\u0006C"}, m87232d2 = {"Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/h;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "t0", "(Ljava/lang/Runnable;)Z", "r0", "()Ljava/lang/Runnable;", "", "q0", "Lkotlinx/coroutines/k$c;", "E0", "(Lkotlinx/coroutines/k$c;)Z", "", "now", "delayedTask", "", "B0", "(JLkotlinx/coroutines/k$c;)I", "y0", "shutdown", "timeMillis", "Ll/bf4;", "continuation", "scheduleResumeAfterDelay", "(JLl/bf4;)V", "block", "Ll/l4e;", "C0", "(JLjava/lang/Runnable;)Ll/l4e;", "j0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "s0", "(Ljava/lang/Runnable;)V", "A0", "(JLkotlinx/coroutines/k$c;)V", "z0", "value", "m", "()Z", "D0", "(Z)V", "isCompleted", "x0", "isEmpty", "c0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/k$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "a", "b", "c", Constants.INAPP_DATA_TAG, "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class AbstractC15482k extends AbstractC15483l implements InterfaceC15477h {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66910d = AtomicReferenceFieldUpdater.newUpdater(AbstractC15482k.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66911e = AtomicReferenceFieldUpdater.newUpdater(AbstractC15482k.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66912f = AtomicIntegerFieldUpdater.newUpdater(AbstractC15482k.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.k$a */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lkotlinx/coroutines/k$a;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ll/bf4;", "", "cont", "<init>", "(Lkotlinx/coroutines/k;JLl/bf4;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ll/bf4;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final bf4<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j, bf4<? super Unit> bf4Var) {
            super(j);
            this.cont = bf4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.mo93743B(AbstractC15482k.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.AbstractC15482k.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$b */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlinx/coroutines/k$b;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Runnable block;

        public b(long j, @NotNull Runnable runnable) {
            super(j);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.AbstractC15482k.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$c */
    @Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010-\"\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Lkotlinx/coroutines/k$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Ll/l4e;", "Ll/bpi0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "g", "(Lkotlinx/coroutines/k$c;)I", "now", "", RXScreenCaptureService.KEY_INDEX, "(J)Z", "Lkotlinx/coroutines/k$d;", "delayed", "Lkotlinx/coroutines/k;", "eventLoop", "h", "(JLkotlinx/coroutines/k$d;Lkotlinx/coroutines/k;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "a", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Ll/api0;", "value", "()Ll/api0;", "f", "(Ll/api0;)V", "heap", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static abstract class c implements Runnable, Comparable<c>, l4e, bpi0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public long nanoTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index = -1;

        public c(long j) {
            this.nanoTime = j;
        }

        @Override // p149l.bpi0
        @Nullable
        /* JADX INFO: renamed from: a */
        public api0<?> mo94237a() {
            Object obj = this._heap;
            if (obj instanceof api0) {
                return (api0) obj;
            }
            return null;
        }

        @Override // p149l.l4e
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == u3f.f173605a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m98131h(this);
                    }
                    this._heap = u3f.f173605a;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.bpi0
        /* JADX INFO: renamed from: f */
        public void mo94238f(@Nullable api0<?> api0Var) {
            if (this._heap != u3f.f173605a) {
                this._heap = api0Var;
            } else {
                ig3.m135964a("Failed requirement.");
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            long j = this.nanoTime - other.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // p149l.bpi0
        public int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: h */
        public final int m94240h(long now, @NotNull d delayed, @NotNull AbstractC15482k eventLoop) {
            synchronized (this) {
                if (this._heap == u3f.f173605a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarM98126b = delayed.m98126b();
                        if (eventLoop.m94219m()) {
                            return 1;
                        }
                        if (cVarM98126b == null) {
                            delayed.timeNow = now;
                        } else {
                            long j = cVarM98126b.nanoTime;
                            if (j - now < 0) {
                                now = j;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j2 = this.nanoTime;
                        long j3 = delayed.timeNow;
                        if (j2 - j3 < 0) {
                            this.nanoTime = j3;
                        }
                        delayed.m98125a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m94241i(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // p149l.bpi0
        public void setIndex(int i) {
            this.index = i;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$d */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlinx/coroutines/k$d;", "Ll/api0;", "Lkotlinx/coroutines/k$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class d extends api0<c> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public long timeNow;

        public d(long j) {
            this.timeNow = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final boolean m94219m() {
        return f66912f.get(this) != 0;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m94224A0(long now, @NotNull c delayedTask) {
        int iM94225B0 = m94225B0(now, delayedTask);
        if (iM94225B0 == 0) {
            if (m94228E0(delayedTask)) {
                m94242o0();
            }
        } else if (iM94225B0 == 1) {
            mo94184n0(now, delayedTask);
        } else {
            if (iM94225B0 == 2) {
                return;
            }
            qkq0.m175383a("unexpected result");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final int m94225B0(long now, c delayedTask) {
        if (m94219m()) {
            return 1;
        }
        d dVar = (d) f66911e.get(this);
        if (dVar == null) {
            C21643z7.m217426a(f66911e, this, null, new d(now));
            Object obj = f66911e.get(this);
            obj.getClass();
            dVar = (d) obj;
        }
        return delayedTask.m94240h(now, dVar, this);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public final l4e m94226C0(long timeMillis, @NotNull Runnable block) {
        long jM191573d = u3f.m191573d(timeMillis);
        if (jM191573d >= 4611686018427387903L) {
            return nl40.INSTANCE;
        }
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        long jM140174a = abstractC17712j8 != null ? abstractC17712j8.m140174a() : System.nanoTime();
        b bVar = new b(jM191573d + jM140174a, block);
        m94224A0(jM140174a, bVar);
        return bVar;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m94227D0(boolean z) {
        f66912f.set(this, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m94228E0(c task) {
        d dVar = (d) f66911e.get(this);
        return (dVar != null ? dVar.m98129f() : null) == task;
    }

    @Override // p149l.s3f
    /* JADX INFO: renamed from: c0 */
    public long mo94229c0() {
        c cVarM98129f;
        if (super.mo94229c0() == 0) {
            return 0L;
        }
        Object obj = f66910d.get(this);
        if (obj != null) {
            if (!(obj instanceof fwv)) {
                return obj == u3f.f173606b ? Long.MAX_VALUE : 0L;
            }
            if (!((fwv) obj).m123568j()) {
                return 0L;
            }
        }
        d dVar = (d) f66911e.get(this);
        if (dVar == null || (cVarM98129f = dVar.m98129f()) == null) {
            return Long.MAX_VALUE;
        }
        long j = cVarM98129f.nanoTime;
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        return C15167a.m87597c(j - (abstractC17712j8 != null ? abstractC17712j8.m140174a() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        mo94185s0(block);
    }

    @NotNull
    public l4e invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC15477h.a.m94187b(this, j, runnable, coroutineContext);
    }

    @Override // p149l.s3f
    /* JADX INFO: renamed from: j0 */
    public long mo94230j0() {
        c cVarM98132i;
        if (m182158k0()) {
            return 0L;
        }
        d dVar = (d) f66911e.get(this);
        if (dVar != null && !dVar.m98128e()) {
            AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
            long jM140174a = abstractC17712j8 != null ? abstractC17712j8.m140174a() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarM98126b = dVar.m98126b();
                        cVarM98132i = null;
                        if (cVarM98126b != null) {
                            c cVar = cVarM98126b;
                            cVarM98132i = cVar.m94241i(jM140174a) ? m94233t0(cVar) : false ? dVar.m98132i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVarM98132i != null);
        }
        Runnable runnableM94232r0 = m94232r0();
        if (runnableM94232r0 == null) {
            return mo94229c0();
        }
        runnableM94232r0.run();
        return 0L;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m94231q0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66910d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C21643z7.m217426a(f66910d, this, null, u3f.f173606b)) {
                    return;
                }
            } else if (obj instanceof fwv) {
                ((fwv) obj).m123564d();
                return;
            } else {
                if (obj == u3f.f173606b) {
                    return;
                }
                fwv fwvVar = new fwv(8, true);
                fwvVar.m123561a((Runnable) obj);
                if (C21643z7.m217426a(f66910d, this, obj, fwvVar)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final Runnable m94232r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66910d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof fwv) {
                fwv fwvVar = (fwv) obj;
                Object objM123571m = fwvVar.m123571m();
                if (objM123571m != fwv.f99689g) {
                    return (Runnable) objM123571m;
                }
                C21643z7.m217426a(f66910d, this, obj, fwvVar.m123570l());
            } else {
                if (obj == u3f.f173606b) {
                    return null;
                }
                if (C21643z7.m217426a(f66910d, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void mo94185s0(@NotNull Runnable task) {
        if (m94233t0(task)) {
            m94242o0();
        } else {
            RunnableC15476g.INSTANCE.mo94185s0(task);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15477h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull bf4<? super Unit> continuation) {
        long jM191573d = u3f.m191573d(timeMillis);
        if (jM191573d < 4611686018427387903L) {
            AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
            long jM140174a = abstractC17712j8 != null ? abstractC17712j8.m140174a() : System.nanoTime();
            a aVar = new a(jM191573d + jM140174a, continuation);
            m94224A0(jM140174a, aVar);
            df4.m111429a(continuation, aVar);
        }
    }

    @Override // p149l.s3f
    public void shutdown() {
        toi0.INSTANCE.m189887c();
        m94227D0(true);
        m94231q0();
        while (mo94230j0() <= 0) {
        }
        m94235y0();
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m94233t0(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66910d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m94219m()) {
                return false;
            }
            if (obj == null) {
                if (C21643z7.m217426a(f66910d, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof fwv) {
                fwv fwvVar = (fwv) obj;
                int iM123561a = fwvVar.m123561a(task);
                if (iM123561a == 0) {
                    return true;
                }
                if (iM123561a == 1) {
                    C21643z7.m217426a(f66910d, this, obj, fwvVar.m123570l());
                } else if (iM123561a == 2) {
                    return false;
                }
            } else {
                if (obj == u3f.f173606b) {
                    return false;
                }
                fwv fwvVar2 = new fwv(8, true);
                fwvVar2.m123561a((Runnable) obj);
                fwvVar2.m123561a(task);
                if (C21643z7.m217426a(f66910d, this, obj, fwvVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m94234x0() {
        if (!m182157i0()) {
            return false;
        }
        d dVar = (d) f66911e.get(this);
        if (dVar != null && !dVar.m98128e()) {
            return false;
        }
        Object obj = f66910d.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof fwv) {
            return ((fwv) obj).m123568j();
        }
        return obj == u3f.f173606b;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m94235y0() {
        c cVarM98133j;
        AbstractC17712j8 abstractC17712j8 = C17950k8.f121709a;
        long jM140174a = abstractC17712j8 != null ? abstractC17712j8.m140174a() : System.nanoTime();
        while (true) {
            d dVar = (d) f66911e.get(this);
            if (dVar == null || (cVarM98133j = dVar.m98133j()) == null) {
                return;
            } else {
                mo94184n0(jM140174a, cVarM98133j);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m94236z0() {
        f66910d.set(this, null);
        f66911e.set(this, null);
    }
}
