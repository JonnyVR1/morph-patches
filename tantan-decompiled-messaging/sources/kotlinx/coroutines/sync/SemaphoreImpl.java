package kotlinx.coroutines.sync;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21643z7;
import p149l.bde0;
import p149l.bf4;
import p149l.df4;
import p149l.jck0;
import p149l.jee0;
import p149l.kee0;
import p149l.ls5;
import p149l.mce0;
import p149l.nnq;
import p149l.oce0;
import p149l.ofp0;
import p149l.tr4;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0005¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u0013\u0010!\u001a\u00020\u0007*\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u000b\u0010.\u001a\u00020-8\u0002X\u0082\u0004R\u000b\u0010/\u001a\u00020-8\u0002X\u0082\u0004R\u0011\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004R\u0011\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¨\u00064"}, m87232d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Ll/jee0;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Z", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/bf4;", "waiter", "f", "(Ll/bf4;)V", "Ll/bde0;", "select", "", "ignoredParam", "r", "(Ll/bde0;Ljava/lang/Object;)V", "release", "()V", "h", "k", "()I", "j", "Ll/ofp0;", RXScreenCaptureService.KEY_INDEX, "(Ll/ofp0;)Z", "u", Constants.KEY_T, "(Ljava/lang/Object;)Z", "a", "I", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", BLiveStormDanmakuGiftResourceType.f44444l, "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Ll/kee0;", "head", "tail", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class SemaphoreImpl implements jee0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66985c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f66986d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66987e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f66988f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66989g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int permits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<Throwable, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            jck0.m140980a("Semaphore should have at least 1 permit, but had ", i);
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            jck0.m140980a("The number of acquired permits should be in 0..", i);
            throw null;
        }
        kee0 kee0Var = new kee0(0L, null, 2);
        this.head$volatile = kee0Var;
        this.tail$volatile = kee0Var;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.this$0.release();
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m94367g(SemaphoreImpl semaphoreImpl, Continuation<? super Unit> continuation) {
        if (semaphoreImpl.m94378k() > 0) {
            return Unit.INSTANCE;
        }
        Object objM94375h = semaphoreImpl.m94375h(continuation);
        return objM94375h == uwp.m196133e() ? objM94375h : Unit.INSTANCE;
    }

    @Override // p149l.jee0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo94373b(@NotNull Continuation<? super Unit> continuation) {
        return m94367g(this, continuation);
    }

    /* JADX INFO: renamed from: f */
    public final void m94374f(@NotNull bf4<? super Unit> waiter) {
        while (m94378k() <= 0) {
            waiter.getClass();
            if (m94376i((ofp0) waiter)) {
                return;
            }
        }
        waiter.mo93764f(Unit.INSTANCE, this.onCancellationRelease);
    }

    /* JADX INFO: renamed from: h */
    public final Object m94375h(Continuation<? super Unit> continuation) {
        C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation));
        try {
            if (!m94376i(c15407cM111430b)) {
                m94374f(c15407cM111430b);
            }
            Object objM93778v = c15407cM111430b.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        } catch (Throwable th) {
            c15407cM111430b.m93752O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m94376i(ofp0 waiter) {
        Object objM151515c;
        kee0 kee0Var = (kee0) f66987e.get(this);
        long andIncrement = f66988f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66987e;
        long j = andIncrement / ((long) SemaphoreKt.f66997f);
        loop0: while (true) {
            objM151515c = ls5.m151515c(kee0Var, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!oce0.m163512c(objM151515c)) {
                mce0 mce0VarM163511b = oce0.m163511b(objM151515c);
                while (true) {
                    mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                    if (mce0Var.id >= mce0VarM163511b.id) {
                        break loop0;
                    }
                    if (!mce0VarM163511b.m153994u()) {
                        break;
                    }
                    if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, mce0VarM163511b)) {
                        if (!mce0Var.m153992p()) {
                            break loop0;
                        }
                        mce0Var.m156117n();
                        break loop0;
                    }
                    if (mce0VarM163511b.m153992p()) {
                        mce0VarM163511b.m156117n();
                    }
                }
            } else {
                break;
            }
        }
        kee0 kee0Var2 = (kee0) oce0.m163511b(objM151515c);
        int i = (int) (andIncrement % ((long) SemaphoreKt.f66997f));
        if (tr4.m190366a(kee0Var2.getF122699e(), i, null, waiter)) {
            waiter.mo93765g(kee0Var2, i);
            return true;
        }
        if (tr4.m190366a(kee0Var2.getF122699e(), i, SemaphoreKt.f66993b, SemaphoreKt.f66994c)) {
            if (waiter instanceof bf4) {
                waiter.getClass();
                ((bf4) waiter).mo93764f(Unit.INSTANCE, this.onCancellationRelease);
            } else if (waiter instanceof bde0) {
                ((bde0) waiter).mo94310d(Unit.INSTANCE);
            } else {
                nnq.m160357a("unexpected: ", waiter);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m94377j() {
        int i;
        do {
            i = f66989g.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!f66989g.compareAndSet(this, i, this.permits));
    }

    /* JADX INFO: renamed from: k */
    public final int m94378k() {
        int andDecrement;
        do {
            andDecrement = f66989g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: renamed from: l */
    public int m94379l() {
        return Math.max(f66989g.get(this), 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m94380r(@NotNull bde0<?> select, @Nullable Object ignoredParam) {
        while (m94378k() <= 0) {
            select.getClass();
            if (m94376i((ofp0) select)) {
                return;
            }
        }
        select.mo94310d(Unit.INSTANCE);
    }

    @Override // p149l.jee0
    public void release() {
        do {
            int andIncrement = f66989g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                m94377j();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m94383u());
    }

    /* JADX INFO: renamed from: s */
    public boolean m94381s() {
        while (true) {
            int i = f66989g.get(this);
            if (i > this.permits) {
                m94377j();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (f66989g.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m94382t(Object obj) {
        if (!(obj instanceof bf4)) {
            if (obj instanceof bde0) {
                return ((bde0) obj).mo94312f(this, Unit.INSTANCE);
            }
            nnq.m160357a("unexpected: ", obj);
            return false;
        }
        bf4 bf4Var = (bf4) obj;
        Object objMo93742A = bf4Var.mo93742A(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objMo93742A == null) {
            return false;
        }
        bf4Var.mo93779w(objMo93742A);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m94383u() {
        Object objM151515c;
        kee0 kee0Var = (kee0) f66985c.get(this);
        long andIncrement = f66986d.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.f66997f);
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66985c;
        loop0: while (true) {
            objM151515c = ls5.m151515c(kee0Var, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (oce0.m163512c(objM151515c)) {
                break;
            }
            mce0 mce0VarM163511b = oce0.m163511b(objM151515c);
            while (true) {
                mce0 mce0Var = (mce0) atomicReferenceFieldUpdater.get(this);
                if (mce0Var.id >= mce0VarM163511b.id) {
                    break loop0;
                }
                if (!mce0VarM163511b.m153994u()) {
                    break;
                }
                if (C21643z7.m217426a(atomicReferenceFieldUpdater, this, mce0Var, mce0VarM163511b)) {
                    if (!mce0Var.m153992p()) {
                        break loop0;
                    }
                    mce0Var.m156117n();
                    break loop0;
                }
                if (mce0VarM163511b.m153992p()) {
                    mce0VarM163511b.m156117n();
                }
            }
        }
        kee0 kee0Var2 = (kee0) oce0.m163511b(objM151515c);
        kee0Var2.m156109c();
        if (kee0Var2.id > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) SemaphoreKt.f66997f));
        Object andSet = kee0Var2.getF122699e().getAndSet(i, SemaphoreKt.f66993b);
        if (andSet != null) {
            if (andSet == SemaphoreKt.f66996e) {
                return false;
            }
            return m94382t(andSet);
        }
        int i2 = SemaphoreKt.f66992a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (kee0Var2.getF122699e().get(i) == SemaphoreKt.f66994c) {
                return true;
            }
        }
        return !tr4.m190366a(kee0Var2.getF122699e(), i, SemaphoreKt.f66993b, SemaphoreKt.f66995d);
    }
}
