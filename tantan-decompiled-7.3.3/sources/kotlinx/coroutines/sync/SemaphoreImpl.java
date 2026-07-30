package kotlinx.coroutines.sync;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.ag4;
import p153l.cg4;
import p153l.gle0;
import p153l.mpq;
import p153l.ome0;
import p153l.plk0;
import p153l.pme0;
import p153l.pt5;
import p153l.rke0;
import p153l.sop0;
import p153l.ss4;
import p153l.tke0;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0005¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u0013\u0010!\u001a\u00020\u0007*\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u000b\u0010.\u001a\u00020-8\u0002X\u0082\u0004R\u000b\u0010/\u001a\u00020-8\u0002X\u0082\u0004R\u0011\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004R\u0011\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¨\u00064"}, m88121d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Ll/ome0;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Z", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/ag4;", "waiter", "f", "(Ll/ag4;)V", "Ll/gle0;", "select", "", "ignoredParam", "r", "(Ll/gle0;Ljava/lang/Object;)V", "release", "()V", "h", "k", "()I", "j", "Ll/sop0;", RXScreenCaptureService.KEY_INDEX, "(Ll/sop0;)Z", "u", Constants.KEY_T, "(Ljava/lang/Object;)Z", "a", "I", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onCancellationRelease", BLiveStormDanmakuGiftResourceType.f45292l, "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Ll/pme0;", "head", "tail", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class SemaphoreImpl implements ome0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67659c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f67660d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67661e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f67662f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67663g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
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
            plk0.m172832a("Semaphore should have at least 1 permit, but had ", i);
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            plk0.m172832a("The number of acquired permits should be in 0..", i);
            throw null;
        }
        pme0 pme0Var = new pme0(0L, null, 2);
        this.head$volatile = pme0Var;
        this.tail$volatile = pme0Var;
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
    public static /* synthetic */ Object m95260g(SemaphoreImpl semaphoreImpl, Continuation<? super Unit> continuation) {
        if (semaphoreImpl.m95271k() > 0) {
            return Unit.INSTANCE;
        }
        Object objM95268h = semaphoreImpl.m95268h(continuation);
        return objM95268h == uyp.m198688e() ? objM95268h : Unit.INSTANCE;
    }

    @Override // p153l.ome0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo95266b(@NotNull Continuation<? super Unit> continuation) {
        return m95260g(this, continuation);
    }

    /* JADX INFO: renamed from: f */
    public final void m95267f(@NotNull ag4<? super Unit> waiter) {
        while (m95271k() <= 0) {
            waiter.getClass();
            if (m95269i((sop0) waiter)) {
                return;
            }
        }
        waiter.mo94656f(Unit.INSTANCE, this.onCancellationRelease);
    }

    /* JADX INFO: renamed from: h */
    public final Object m95268h(Continuation<? super Unit> continuation) {
        C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation));
        try {
            if (!m95269i(c15514cM109664b)) {
                m95267f(c15514cM109664b);
            }
            Object objM94670v = c15514cM109664b.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        } catch (Throwable th) {
            c15514cM109664b.m94644O();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95269i(sop0 waiter) {
        Object objM173703c;
        pme0 pme0Var = (pme0) f67661e.get(this);
        long andIncrement = f67662f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67661e;
        long j = andIncrement / ((long) SemaphoreKt.f67671f);
        loop0: while (true) {
            objM173703c = pt5.m173703c(pme0Var, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!tke0.m191548c(objM173703c)) {
                rke0 rke0VarM191547b = tke0.m191547b(objM173703c);
                while (true) {
                    rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                    if (rke0Var.id >= rke0VarM191547b.id) {
                        break loop0;
                    }
                    if (!rke0VarM191547b.m181786u()) {
                        break;
                    }
                    if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, rke0VarM191547b)) {
                        if (!rke0Var.m181784p()) {
                            break loop0;
                        }
                        rke0Var.m177903n();
                        break loop0;
                    }
                    if (rke0VarM191547b.m181784p()) {
                        rke0VarM191547b.m177903n();
                    }
                }
            } else {
                break;
            }
        }
        pme0 pme0Var2 = (pme0) tke0.m191547b(objM173703c);
        int i = (int) (andIncrement % ((long) SemaphoreKt.f67671f));
        if (ss4.m187688a(pme0Var2.getF153162e(), i, null, waiter)) {
            waiter.mo94657g(pme0Var2, i);
            return true;
        }
        if (ss4.m187688a(pme0Var2.getF153162e(), i, SemaphoreKt.f67667b, SemaphoreKt.f67668c)) {
            if (waiter instanceof ag4) {
                waiter.getClass();
                ((ag4) waiter).mo94656f(Unit.INSTANCE, this.onCancellationRelease);
            } else if (waiter instanceof gle0) {
                ((gle0) waiter).mo95203d(Unit.INSTANCE);
            } else {
                mpq.m159379a("unexpected: ", waiter);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m95270j() {
        int i;
        do {
            i = f67663g.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!f67663g.compareAndSet(this, i, this.permits));
    }

    /* JADX INFO: renamed from: k */
    public final int m95271k() {
        int andDecrement;
        do {
            andDecrement = f67663g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: renamed from: l */
    public int m95272l() {
        return Math.max(f67663g.get(this), 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m95273r(@NotNull gle0<?> select, @Nullable Object ignoredParam) {
        while (m95271k() <= 0) {
            select.getClass();
            if (m95269i((sop0) select)) {
                return;
            }
        }
        select.mo95203d(Unit.INSTANCE);
    }

    @Override // p153l.ome0
    public void release() {
        do {
            int andIncrement = f67663g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                m95270j();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m95276u());
    }

    /* JADX INFO: renamed from: s */
    public boolean m95274s() {
        while (true) {
            int i = f67663g.get(this);
            if (i > this.permits) {
                m95270j();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (f67663g.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m95275t(Object obj) {
        if (!(obj instanceof ag4)) {
            if (obj instanceof gle0) {
                return ((gle0) obj).mo95205f(this, Unit.INSTANCE);
            }
            mpq.m159379a("unexpected: ", obj);
            return false;
        }
        ag4 ag4Var = (ag4) obj;
        Object objMo94634A = ag4Var.mo94634A(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objMo94634A == null) {
            return false;
        }
        ag4Var.mo94671w(objMo94634A);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m95276u() {
        Object objM173703c;
        pme0 pme0Var = (pme0) f67659c.get(this);
        long andIncrement = f67660d.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.f67671f);
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67659c;
        loop0: while (true) {
            objM173703c = pt5.m173703c(pme0Var, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (tke0.m191548c(objM173703c)) {
                break;
            }
            rke0 rke0VarM191547b = tke0.m191547b(objM173703c);
            while (true) {
                rke0 rke0Var = (rke0) atomicReferenceFieldUpdater.get(this);
                if (rke0Var.id >= rke0VarM191547b.id) {
                    break loop0;
                }
                if (!rke0VarM191547b.m181786u()) {
                    break;
                }
                if (C20511u7.m194801a(atomicReferenceFieldUpdater, this, rke0Var, rke0VarM191547b)) {
                    if (!rke0Var.m181784p()) {
                        break loop0;
                    }
                    rke0Var.m177903n();
                    break loop0;
                }
                if (rke0VarM191547b.m181784p()) {
                    rke0VarM191547b.m177903n();
                }
            }
        }
        pme0 pme0Var2 = (pme0) tke0.m191547b(objM173703c);
        pme0Var2.m177894c();
        if (pme0Var2.id > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) SemaphoreKt.f67671f));
        Object andSet = pme0Var2.getF153162e().getAndSet(i, SemaphoreKt.f67667b);
        if (andSet != null) {
            if (andSet == SemaphoreKt.f67670e) {
                return false;
            }
            return m95275t(andSet);
        }
        int i2 = SemaphoreKt.f67666a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (pme0Var2.getF153162e().get(i) == SemaphoreKt.f67668c) {
                return true;
            }
        }
        return !ss4.m187688a(pme0Var2.getF153162e(), i, SemaphoreKt.f67667b, SemaphoreKt.f67669d);
    }
}
