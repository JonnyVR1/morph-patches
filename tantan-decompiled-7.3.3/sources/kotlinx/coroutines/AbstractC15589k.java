package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC16728e8;
import p153l.C16923f8;
import p153l.C20511u7;
import p153l.ag4;
import p153l.bu40;
import p153l.cg4;
import p153l.cyi0;
import p153l.dyi0;
import p153l.gyv;
import p153l.vxi0;
import p153l.wg3;
import p153l.wtq0;
import p153l.y4f;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004?@ABB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u0004R$\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u000b\u0010<\u001a\u00020;8\u0002X\u0082\u0004R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=088\u0002X\u0082\u0004¨\u0006C"}, m88121d2 = {"Lkotlinx/coroutines/k;", "Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/h;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "u0", "(Ljava/lang/Runnable;)Z", "s0", "()Ljava/lang/Runnable;", "", "r0", "Lkotlinx/coroutines/k$c;", "F0", "(Lkotlinx/coroutines/k$c;)Z", "", "now", "delayedTask", "", "C0", "(JLkotlinx/coroutines/k$c;)I", "z0", "shutdown", "timeMillis", "Ll/ag4;", "continuation", "scheduleResumeAfterDelay", "(JLl/ag4;)V", "block", "Ll/z5e;", "D0", "(JLjava/lang/Runnable;)Ll/z5e;", "k0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "t0", "(Ljava/lang/Runnable;)V", "B0", "(JLkotlinx/coroutines/k$c;)V", "A0", "value", "m", "()Z", "E0", "(Z)V", "isCompleted", "y0", "isEmpty", "d0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/k$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "a", "b", "c", Constants.INAPP_DATA_TAG, "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class AbstractC15589k extends AbstractC15590l implements InterfaceC15584h {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67584d = AtomicReferenceFieldUpdater.newUpdater(AbstractC15589k.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67585e = AtomicReferenceFieldUpdater.newUpdater(AbstractC15589k.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67586f = AtomicIntegerFieldUpdater.newUpdater(AbstractC15589k.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.k$a */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lkotlinx/coroutines/k$a;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ll/ag4;", "", "cont", "<init>", "(Lkotlinx/coroutines/k;JLl/ag4;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ll/ag4;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ag4<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j, ag4<? super Unit> ag4Var) {
            super(j);
            this.cont = ag4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.mo94635B(AbstractC15589k.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.AbstractC15589k.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$b */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lkotlinx/coroutines/k$b;", "Lkotlinx/coroutines/k$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
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

        @Override // kotlinx.coroutines.AbstractC15589k.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$c */
    @Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010-\"\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Lkotlinx/coroutines/k$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Ll/z5e;", "Ll/dyi0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "g", "(Lkotlinx/coroutines/k$c;)I", "now", "", RXScreenCaptureService.KEY_INDEX, "(J)Z", "Lkotlinx/coroutines/k$d;", "delayed", "Lkotlinx/coroutines/k;", "eventLoop", "h", "(JLkotlinx/coroutines/k$d;Lkotlinx/coroutines/k;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "a", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Ll/cyi0;", "value", "()Ll/cyi0;", "f", "(Ll/cyi0;)V", "heap", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static abstract class c implements Runnable, Comparable<c>, z5e, dyi0 {

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

        @Override // p153l.dyi0
        @Nullable
        /* JADX INFO: renamed from: a */
        public cyi0<?> mo95130a() {
            Object obj = this._heap;
            if (obj instanceof cyi0) {
                return (cyi0) obj;
            }
            return null;
        }

        @Override // p153l.z5e
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == y4f.f197451a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m113176h(this);
                    }
                    this._heap = y4f.f197451a;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.dyi0
        /* JADX INFO: renamed from: f */
        public void mo95131f(@Nullable cyi0<?> cyi0Var) {
            if (this._heap != y4f.f197451a) {
                this._heap = cyi0Var;
            } else {
                wg3.m206174a("Failed requirement.");
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

        @Override // p153l.dyi0
        public int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: h */
        public final int m95133h(long now, @NotNull d delayed, @NotNull AbstractC15589k eventLoop) {
            synchronized (this) {
                if (this._heap == y4f.f197451a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarM113171b = delayed.m113171b();
                        if (eventLoop.m95112m()) {
                            return 1;
                        }
                        if (cVarM113171b == null) {
                            delayed.timeNow = now;
                        } else {
                            long j = cVarM113171b.nanoTime;
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
                        delayed.m113170a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m95134i(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // p153l.dyi0
        public void setIndex(int i) {
            this.index = i;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.k$d */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlinx/coroutines/k$d;", "Ll/cyi0;", "Lkotlinx/coroutines/k$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class d extends cyi0<c> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public long timeNow;

        public d(long j) {
            this.timeNow = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final boolean m95112m() {
        return f67586f.get(this) != 0;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m95117A0() {
        f67584d.set(this, null);
        f67585e.set(this, null);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m95118B0(long now, @NotNull c delayedTask) {
        int iM95119C0 = m95119C0(now, delayedTask);
        if (iM95119C0 == 0) {
            if (m95122F0(delayedTask)) {
                m95135p0();
            }
        } else if (iM95119C0 == 1) {
            mo95077o0(now, delayedTask);
        } else {
            if (iM95119C0 == 2) {
                return;
            }
            wtq0.m207906a("unexpected result");
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final int m95119C0(long now, c delayedTask) {
        if (m95112m()) {
            return 1;
        }
        d dVar = (d) f67585e.get(this);
        if (dVar == null) {
            C20511u7.m194801a(f67585e, this, null, new d(now));
            Object obj = f67585e.get(this);
            obj.getClass();
            dVar = (d) obj;
        }
        return delayedTask.m95133h(now, dVar, this);
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final z5e m95120D0(long timeMillis, @NotNull Runnable block) {
        long jM214206d = y4f.m214206d(timeMillis);
        if (jM214206d >= 4611686018427387903L) {
            return bu40.INSTANCE;
        }
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        long jM119781a = abstractC16728e8 != null ? abstractC16728e8.m119781a() : System.nanoTime();
        b bVar = new b(jM214206d + jM119781a, block);
        m95118B0(jM119781a, bVar);
        return bVar;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m95121E0(boolean z) {
        f67586f.set(this, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m95122F0(c task) {
        d dVar = (d) f67585e.get(this);
        return (dVar != null ? dVar.m113174f() : null) == task;
    }

    @Override // p153l.w4f
    /* JADX INFO: renamed from: d0 */
    public long mo95123d0() {
        c cVarM113174f;
        if (super.mo95123d0() == 0) {
            return 0L;
        }
        Object obj = f67584d.get(this);
        if (obj != null) {
            if (!(obj instanceof gyv)) {
                return obj == y4f.f197452b ? Long.MAX_VALUE : 0L;
            }
            if (!((gyv) obj).m133022j()) {
                return 0L;
            }
        }
        d dVar = (d) f67585e.get(this);
        if (dVar == null || (cVarM113174f = dVar.m113174f()) == null) {
            return Long.MAX_VALUE;
        }
        long j = cVarM113174f.nanoTime;
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        return C15274a.m88487c(j - (abstractC16728e8 != null ? abstractC16728e8.m119781a() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        mo95078t0(block);
    }

    @NotNull
    public z5e invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC15584h.a.m95080b(this, j, runnable, coroutineContext);
    }

    @Override // p153l.w4f
    /* JADX INFO: renamed from: k0 */
    public long mo95124k0() {
        c cVarM113177i;
        if (m204882l0()) {
            return 0L;
        }
        d dVar = (d) f67585e.get(this);
        if (dVar != null && !dVar.m113173e()) {
            AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
            long jM119781a = abstractC16728e8 != null ? abstractC16728e8.m119781a() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarM113171b = dVar.m113171b();
                        cVarM113177i = null;
                        if (cVarM113171b != null) {
                            c cVar = cVarM113171b;
                            cVarM113177i = cVar.m95134i(jM119781a) ? m95127u0(cVar) : false ? dVar.m113177i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVarM113177i != null);
        }
        Runnable runnableM95126s0 = m95126s0();
        if (runnableM95126s0 == null) {
            return mo95123d0();
        }
        runnableM95126s0.run();
        return 0L;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m95125r0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67584d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C20511u7.m194801a(f67584d, this, null, y4f.f197452b)) {
                    return;
                }
            } else if (obj instanceof gyv) {
                ((gyv) obj).m133018d();
                return;
            } else {
                if (obj == y4f.f197452b) {
                    return;
                }
                gyv gyvVar = new gyv(8, true);
                gyvVar.m133015a((Runnable) obj);
                if (C20511u7.m194801a(f67584d, this, obj, gyvVar)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final Runnable m95126s0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67584d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof gyv) {
                gyv gyvVar = (gyv) obj;
                Object objM133025m = gyvVar.m133025m();
                if (objM133025m != gyv.f107113g) {
                    return (Runnable) objM133025m;
                }
                C20511u7.m194801a(f67584d, this, obj, gyvVar.m133024l());
            } else {
                if (obj == y4f.f197452b) {
                    return null;
                }
                if (C20511u7.m194801a(f67584d, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC15584h
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull ag4<? super Unit> continuation) {
        long jM214206d = y4f.m214206d(timeMillis);
        if (jM214206d < 4611686018427387903L) {
            AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
            long jM119781a = abstractC16728e8 != null ? abstractC16728e8.m119781a() : System.nanoTime();
            a aVar = new a(jM214206d + jM119781a, continuation);
            m95118B0(jM119781a, aVar);
            cg4.m109663a(continuation, aVar);
        }
    }

    @Override // p153l.w4f
    public void shutdown() {
        vxi0.INSTANCE.m203846c();
        m95121E0(true);
        m95125r0();
        while (mo95124k0() <= 0) {
        }
        m95129z0();
    }

    /* JADX INFO: renamed from: t0 */
    public void mo95078t0(@NotNull Runnable task) {
        if (m95127u0(task)) {
            m95135p0();
        } else {
            RunnableC15583g.INSTANCE.mo95078t0(task);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m95127u0(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67584d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m95112m()) {
                return false;
            }
            if (obj == null) {
                if (C20511u7.m194801a(f67584d, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof gyv) {
                gyv gyvVar = (gyv) obj;
                int iM133015a = gyvVar.m133015a(task);
                if (iM133015a == 0) {
                    return true;
                }
                if (iM133015a == 1) {
                    C20511u7.m194801a(f67584d, this, obj, gyvVar.m133024l());
                } else if (iM133015a == 2) {
                    return false;
                }
            } else {
                if (obj == y4f.f197452b) {
                    return false;
                }
                gyv gyvVar2 = new gyv(8, true);
                gyvVar2.m133015a((Runnable) obj);
                gyvVar2.m133015a(task);
                if (C20511u7.m194801a(f67584d, this, obj, gyvVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m95128y0() {
        if (!m204881j0()) {
            return false;
        }
        d dVar = (d) f67585e.get(this);
        if (dVar != null && !dVar.m113173e()) {
            return false;
        }
        Object obj = f67584d.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof gyv) {
            return ((gyv) obj).m133022j();
        }
        return obj == y4f.f197452b;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m95129z0() {
        c cVarM113178j;
        AbstractC16728e8 abstractC16728e8 = C16923f8.f97691a;
        long jM119781a = abstractC16728e8 != null ? abstractC16728e8.m119781a() : System.nanoTime();
        while (true) {
            d dVar = (d) f67585e.get(this);
            if (dVar == null || (cVarM113178j = dVar.m113178j()) == null) {
                return;
            } else {
                mo95077o0(jM119781a, cVarM113178j);
            }
        }
    }
}
