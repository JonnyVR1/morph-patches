package p153l;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0003R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(RH\u0010.\u001a6\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00120*j\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0012`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103¨\u0006:"}, m88121d2 = {"Ll/r3n;", "", "<init>", "()V", "", "h", "()J", "", Reason.TYPE, "", "g", "(Ljava/lang/String;)Z", "", "j", "(Ljava/lang/String;)V", Owner.TYPE, "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", NotificationCompat.CATEGORY_PROMO, "Lkotlin/Function1;", "onRemainMillis", "n", "(Ljava/lang/Object;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;Lkotlin/jvm/functions/Function1;)V", "o", "(Ljava/lang/Object;)V", "k", "f", "endWallMs", "m", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;J)V", "remainMs", "e", "(J)V", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainHandler", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "pendingEmptyShutdown", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "c", "Ljava/util/LinkedHashMap;", "clients", "Landroid/os/CountDownTimer;", Constants.INAPP_DATA_TAG, "Landroid/os/CountDownTimer;", "timer", "J", "currentHitId", "scheduledEndWallMs", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "boundPromo", "pausedRemainMs", "lastBroadcastRemainMs", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class r3n {

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
    public static final r3n INSTANCE = new r3n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final LinkedHashMap<Object, Function1<Long, Unit>> clients = new LinkedHashMap<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static volatile long lastBroadcastRemainMs = -1;

    /* JADX INFO: renamed from: l.r3n$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/r3n$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "(J)V", "onFinish", "()V", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class CountDownTimerC19755a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IapAffiliatePromotion f161059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC19755a(long j, IapAffiliatePromotion iapAffiliatePromotion) {
            super(j, 1000L);
            this.f161059a = iapAffiliatePromotion;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            r3n r3nVar = r3n.INSTANCE;
            r3nVar.m179642e(0L);
            r3nVar.m179644i(this.f161059a, 0L);
            r3n.timer = null;
            CoreModule.f18264c.f20438x0.m31206o4(this.f161059a.promotionHitId);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            r3n r3nVar = r3n.INSTANCE;
            r3nVar.m179642e(millisUntilFinished);
            r3nVar.m179644i(this.f161059a, millisUntilFinished);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m179635a() {
        pendingEmptyShutdown = null;
        if (clients.isEmpty()) {
            INSTANCE.m179646l();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public static final boolean m179639g(@NotNull String reason) {
        IapAffiliatePromotion iapAffiliatePromotion;
        reason.getClass();
        r3n r3nVar = INSTANCE;
        r3nVar.m179643f();
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
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        coreIntlAffiliatePromotions.m31170E4(iapAffiliatePromotion.promotionHitId, j);
        long jM88487c = C15274a.m88487c(j - pzi0.m174454o(), 0L);
        pausedRemainMs = jM88487c;
        r3nVar.m179644i(iapAffiliatePromotion, jM88487c);
        coreIntlAffiliatePromotions.m31164B3();
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
    public static final long m179640h() {
        return currentHitId;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public static final void m179641j(@NotNull String reason) {
        IapAffiliatePromotion iapAffiliatePromotion;
        reason.getClass();
        r3n r3nVar = INSTANCE;
        r3nVar.m179643f();
        if (clients.isEmpty() || (iapAffiliatePromotion = boundPromo) == null || currentHitId == 0 || timer != null) {
            return;
        }
        iapAffiliatePromotion.getClass();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        long jM174454o = pzi0.m174454o();
        long j = pausedRemainMs;
        pausedRemainMs = 0L;
        long jM31218u4 = coreIntlAffiliatePromotions.m31218u4(iapAffiliatePromotion.promotionHitId);
        coreIntlAffiliatePromotions.m31203n3();
        if (j > 0) {
            jM31218u4 = jM174454o + j;
        } else if (jM31218u4 <= jM174454o) {
            jM31218u4 = coreIntlAffiliatePromotions.m31171F3(iapAffiliatePromotion);
        }
        r3nVar.m179647m(iapAffiliatePromotion, jM31218u4);
        coreIntlAffiliatePromotions.m31164B3();
        coreIntlAffiliatePromotions.m31180J4(iapAffiliatePromotion.promotionHitId, jM31218u4, coreIntlAffiliatePromotions.m31224x4());
        r3nVar.m179642e(C15274a.m88487c(jM31218u4 - pzi0.m174454o(), 0L));
    }

    /* JADX INFO: renamed from: e */
    public final void m179642e(long remainMs) {
        lastBroadcastRemainMs = remainMs;
        i3n.INSTANCE.m138327e(currentHitId, remainMs);
        Collection<Function1<Long, Unit>> collectionValues = clients.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Long.valueOf(remainMs));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m179643f() {
        Runnable runnable = pendingEmptyShutdown;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        pendingEmptyShutdown = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m179644i(IapAffiliatePromotion promo, long remainMs) {
        CoreModule.f18264c.f20438x0.m31163A4(promo.promotionHitId, C15274a.m88487c(remainMs / 1000, 0L));
        CoreModule.f18264c.f20438x0.m31164B3();
    }

    /* JADX INFO: renamed from: k */
    public final void m179645k() {
        m179643f();
        Runnable runnable = new Runnable() { // from class: l.q3n
            @Override // java.lang.Runnable
            public final void run() {
                r3n.m179635a();
            }
        };
        pendingEmptyShutdown = runnable;
        mainHandler.postDelayed(runnable, 120L);
    }

    /* JADX INFO: renamed from: l */
    public final void m179646l() {
        m179643f();
        CoreModule.f18264c.f20438x0.m31203n3();
        IapAffiliatePromotion iapAffiliatePromotion = boundPromo;
        long j = scheduledEndWallMs;
        CountDownTimer countDownTimer = timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timer = null;
        if (iapAffiliatePromotion != null && j > 0) {
            m179644i(iapAffiliatePromotion, C15274a.m88487c(j - pzi0.m174454o(), 0L));
            CoreModule.f18264c.f20438x0.m31164B3();
        }
        currentHitId = 0L;
        scheduledEndWallMs = 0L;
        boundPromo = null;
        pausedRemainMs = 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m179647m(IapAffiliatePromotion promo, long endWallMs) {
        CountDownTimer countDownTimer = timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timer = null;
        currentHitId = promo.promotionHitId;
        scheduledEndWallMs = endWallMs;
        boundPromo = promo;
        long jM88487c = C15274a.m88487c(endWallMs - pzi0.m174454o(), 0L);
        if (jM88487c <= 0) {
            m179644i(promo, 0L);
            CoreModule.f18264c.f20438x0.m31206o4(promo.promotionHitId);
        } else {
            m179644i(promo, jM88487c);
            CountDownTimerC19755a countDownTimerC19755a = new CountDownTimerC19755a(jM88487c, promo);
            countDownTimerC19755a.start();
            timer = countDownTimerC19755a;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m179648n(@NotNull Object owner, @NotNull IapAffiliatePromotion promo, @NotNull Function1<? super Long, Unit> onRemainMillis) {
        owner.getClass();
        promo.getClass();
        onRemainMillis.getClass();
        m179643f();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (coreIntlAffiliatePromotions.m31174G4(promo)) {
            long j = currentHitId;
            if (j != 0 && promo.promotionHitId != j) {
                m179643f();
                CoreModule.f18264c.f20438x0.m31203n3();
                m179646l();
                clients.clear();
            }
            clients.put(owner, onRemainMillis);
            long jM31171F3 = coreIntlAffiliatePromotions.m31171F3(promo);
            if (timer == null || promo.promotionHitId != currentHitId || Math.abs(jM31171F3 - scheduledEndWallMs) > 800) {
                m179647m(promo, jM31171F3);
            }
            m179642e(C15274a.m88487c(jM31171F3 - pzi0.m174454o(), 0L));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m179649o(@NotNull Object owner) {
        owner.getClass();
        LinkedHashMap<Object, Function1<Long, Unit>> linkedHashMap = clients;
        linkedHashMap.remove(owner);
        if (linkedHashMap.isEmpty()) {
            m179645k();
        }
    }
}
