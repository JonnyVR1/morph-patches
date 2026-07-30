package p002l;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.mqi0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0003R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(RH\u0010.\u001a6\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00120*j\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0012`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103¨\u0006:"}, d2 = {"Ll/r1n;", "", "<init>", "()V", "", "h", "()J", "", "reason", "", "g", "(Ljava/lang/String;)Z", "", "j", "(Ljava/lang/String;)V", "owner", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "promo", "Lkotlin/Function1;", "onRemainMillis", "n", "(Ljava/lang/Object;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Lkotlin/jvm/functions/Function1;)V", "o", "(Ljava/lang/Object;)V", "k", "f", "endWallMs", "m", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;J)V", "remainMs", "e", "(J)V", "i", "l", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainHandler", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "pendingEmptyShutdown", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "c", "Ljava/util/LinkedHashMap;", "clients", "Landroid/os/CountDownTimer;", "d", "Landroid/os/CountDownTimer;", "timer", "J", "currentHitId", "scheduledEndWallMs", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "boundPromo", "pausedRemainMs", "lastBroadcastRemainMs", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class r1n {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Runnable pendingEmptyShutdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static CountDownTimer timer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static long currentHitId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static long scheduledEndWallMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static IapAffiliatePromotion boundPromo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static long pausedRemainMs;

    @NotNull
    public static final r1n INSTANCE = new r1n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final LinkedHashMap<Object, Function1<Long, Unit>> clients = new LinkedHashMap<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static volatile long lastBroadcastRemainMs = -1;

    /* JADX INFO: renamed from: l.r1n$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/r1n$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "(J)V", "onFinish", "()V", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountDownTimerC0793a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IapAffiliatePromotion f18328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC0793a(long j, IapAffiliatePromotion iapAffiliatePromotion) {
            super(j, 1000L);
            this.f18328a = iapAffiliatePromotion;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            r1n r1nVar = r1n.INSTANCE;
            r1nVar.m21740e(0L);
            r1nVar.m21742i(this.f18328a, 0L);
            r1n.timer = null;
            CoreModule.c.x0.o4(this.f18328a.promotionHitId);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            r1n r1nVar = r1n.INSTANCE;
            r1nVar.m21740e(millisUntilFinished);
            r1nVar.m21742i(this.f18328a, millisUntilFinished);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21733a() {
        pendingEmptyShutdown = null;
        if (clients.isEmpty()) {
            INSTANCE.m21744l();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public static final boolean m21737g(@NotNull String reason) {
        IapAffiliatePromotion iapAffiliatePromotion;
        reason.getClass();
        r1n r1nVar = INSTANCE;
        r1nVar.m21741f();
        CountDownTimer countDownTimer = timer;
        if (countDownTimer == null || (iapAffiliatePromotion = boundPromo) == null) {
            return false;
        }
        long j = scheduledEndWallMs;
        if (j <= 0) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            timer = null;
            return false;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        coreIntlAffiliatePromotions.E4(iapAffiliatePromotion.promotionHitId, j);
        long jC = a.c(j - mqi0.o(), 0L);
        pausedRemainMs = jC;
        r1nVar.m21742i(iapAffiliatePromotion, jC);
        coreIntlAffiliatePromotions.B3();
        CountDownTimer countDownTimer2 = timer;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        timer = null;
        scheduledEndWallMs = 0L;
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final long m21738h() {
        return currentHitId;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public static final void m21739j(@NotNull String reason) {
        IapAffiliatePromotion iapAffiliatePromotion;
        reason.getClass();
        r1n r1nVar = INSTANCE;
        r1nVar.m21741f();
        if (clients.isEmpty() || (iapAffiliatePromotion = boundPromo) == null || currentHitId == 0 || timer != null) {
            return;
        }
        iapAffiliatePromotion.getClass();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        long jO = mqi0.o();
        long j = pausedRemainMs;
        pausedRemainMs = 0L;
        long jU4 = coreIntlAffiliatePromotions.u4(iapAffiliatePromotion.promotionHitId);
        coreIntlAffiliatePromotions.n3();
        if (j > 0) {
            jU4 = jO + j;
        } else if (jU4 <= jO) {
            jU4 = coreIntlAffiliatePromotions.F3(iapAffiliatePromotion);
        }
        r1nVar.m21745m(iapAffiliatePromotion, jU4);
        coreIntlAffiliatePromotions.B3();
        coreIntlAffiliatePromotions.J4(iapAffiliatePromotion.promotionHitId, jU4, coreIntlAffiliatePromotions.x4());
        r1nVar.m21740e(a.c(jU4 - mqi0.o(), 0L));
    }

    /* JADX INFO: renamed from: e */
    public final void m21740e(long remainMs) {
        lastBroadcastRemainMs = remainMs;
        i1n.INSTANCE.m14981e(currentHitId, remainMs);
        Collection<Function1<Long, Unit>> collectionValues = clients.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Long.valueOf(remainMs));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m21741f() {
        Runnable runnable = pendingEmptyShutdown;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        pendingEmptyShutdown = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m21742i(IapAffiliatePromotion promo, long remainMs) {
        CoreModule.c.x0.A4(promo.promotionHitId, a.c(remainMs / 1000, 0L));
        CoreModule.c.x0.B3();
    }

    /* JADX INFO: renamed from: k */
    public final void m21743k() {
        m21741f();
        Runnable runnable = new Runnable() { // from class: l.q1n
            @Override // java.lang.Runnable
            public final void run() {
                r1n.m21733a();
            }
        };
        pendingEmptyShutdown = runnable;
        mainHandler.postDelayed(runnable, 120L);
    }

    /* JADX INFO: renamed from: l */
    public final void m21744l() {
        m21741f();
        CoreModule.c.x0.n3();
        IapAffiliatePromotion iapAffiliatePromotion = boundPromo;
        long j = scheduledEndWallMs;
        CountDownTimer countDownTimer = timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timer = null;
        if (iapAffiliatePromotion != null && j > 0) {
            m21742i(iapAffiliatePromotion, a.c(j - mqi0.o(), 0L));
            CoreModule.c.x0.B3();
        }
        currentHitId = 0L;
        scheduledEndWallMs = 0L;
        boundPromo = null;
        pausedRemainMs = 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m21745m(IapAffiliatePromotion promo, long endWallMs) {
        CountDownTimer countDownTimer = timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timer = null;
        currentHitId = promo.promotionHitId;
        scheduledEndWallMs = endWallMs;
        boundPromo = promo;
        long jC = a.c(endWallMs - mqi0.o(), 0L);
        if (jC <= 0) {
            m21742i(promo, 0L);
            CoreModule.c.x0.o4(promo.promotionHitId);
        } else {
            m21742i(promo, jC);
            CountDownTimerC0793a countDownTimerC0793a = new CountDownTimerC0793a(jC, promo);
            countDownTimerC0793a.start();
            timer = countDownTimerC0793a;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21746n(@NotNull Object owner, @NotNull IapAffiliatePromotion promo, @NotNull Function1<? super Long, Unit> onRemainMillis) {
        owner.getClass();
        promo.getClass();
        onRemainMillis.getClass();
        m21741f();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (coreIntlAffiliatePromotions.G4(promo)) {
            long j = currentHitId;
            if (j != 0 && promo.promotionHitId != j) {
                m21741f();
                CoreModule.c.x0.n3();
                m21744l();
                clients.clear();
            }
            clients.put(owner, onRemainMillis);
            long jF3 = coreIntlAffiliatePromotions.F3(promo);
            if (timer == null || promo.promotionHitId != currentHitId || Math.abs(jF3 - scheduledEndWallMs) > 800) {
                m21745m(promo, jF3);
            }
            m21740e(a.c(jF3 - mqi0.o(), 0L));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m21747o(@NotNull Object owner) {
        owner.getClass();
        LinkedHashMap<Object, Function1<Long, Unit>> linkedHashMap = clients;
        linkedHashMap.remove(owner);
        if (linkedHashMap.isEmpty()) {
            m21743k();
        }
    }
}
