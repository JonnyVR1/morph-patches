package p002l;

import android.os.CountDownTimer;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.mqi0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 *2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006+"}, d2 = {"Ll/d1n;", "", "<init>", "()V", "", "endWallMs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "remainMs", "", "onRemainMillis", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "affiliatePromotionForPersistedTicks", "j", "(JLkotlin/jvm/functions/Function1;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "k", "f", "promo", "g", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "i", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;J)V", "persistPromo", "h", "(JLcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "a", "Ljava/lang/Object;", "pausedCoordinatorOwner", "Landroid/os/CountDownTimer;", "b", "Landroid/os/CountDownTimer;", "timer", "c", "J", "activeEndWallMs", "d", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "activePersistPromo", "e", "lastScheduledEndWallMs", "lastScheduledAtMs", "Companion", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class d1n {

    @NotNull
    private static final C0520a Companion = new C0520a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object pausedCoordinatorOwner = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CountDownTimer timer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long activeEndWallMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public IapAffiliatePromotion activePersistPromo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long lastScheduledEndWallMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long lastScheduledAtMs;

    /* JADX INFO: renamed from: l.d1n$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l/d1n$b", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "(J)V", "onFinish", "()V", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountDownTimerC0521b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<Long, Unit> f9029a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d1n f9030b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ IapAffiliatePromotion f9031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountDownTimerC0521b(long j, Function1<? super Long, Unit> function1, d1n d1nVar, IapAffiliatePromotion iapAffiliatePromotion) {
            super(j, 1000L);
            this.f9029a = function1;
            this.f9030b = d1nVar;
            this.f9031c = iapAffiliatePromotion;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f9029a.invoke(0L);
            this.f9030b.m11594i(this.f9031c, 0L);
            this.f9030b.m11592g(this.f9031c);
            this.f9030b.m11591f();
            this.f9030b.timer = null;
            CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
            IapAffiliatePromotion iapAffiliatePromotion = this.f9031c;
            coreIntlAffiliatePromotions.o4(iapAffiliatePromotion != null ? iapAffiliatePromotion.promotionHitId : 0L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            this.f9029a.invoke(Long.valueOf(millisUntilFinished));
            this.f9030b.m11594i(this.f9031c, millisUntilFinished);
            this.f9030b.m11593h(millisUntilFinished, this.f9031c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11591f() {
        this.activeEndWallMs = 0L;
        this.activePersistPromo = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m11592g(IapAffiliatePromotion promo) {
        if (promo == null) {
            return;
        }
        CoreModule.c.x0.B3();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[PHI: r7
      0x0017: PHI (r7v7 java.lang.Long) = (r7v2 java.lang.Long), (r7v9 java.lang.Long) binds: [B:14:0x002e, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    public final void m11593h(long remainMs, IapAffiliatePromotion persistPromo) {
        Long lValueOf;
        Long l2;
        long jLongValue = 0;
        if (persistPromo != null) {
            lValueOf = Long.valueOf(persistPromo.promotionHitId);
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                lValueOf = Long.valueOf(r1n.m21738h());
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    Long lValueOf2 = Long.valueOf(CoreModule.c.x0.C4());
                    l2 = lValueOf2.longValue() > 0 ? lValueOf2 : null;
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    }
                }
            }
        } else {
            lValueOf = Long.valueOf(r1n.m21738h());
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                Long lValueOf3 = Long.valueOf(CoreModule.c.x0.C4());
                if (lValueOf3.longValue() > 0) {
                }
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
            }
        }
        i1n.INSTANCE.m14981e(jLongValue, remainMs);
    }

    /* JADX INFO: renamed from: i */
    public final void m11594i(IapAffiliatePromotion promo, long remainMs) {
        if (promo == null) {
            return;
        }
        CoreModule.c.x0.A4(promo.promotionHitId, a.c(remainMs / 1000, 0L));
    }

    /* JADX INFO: renamed from: j */
    public final void m11595j(long endWallMs, @NotNull Function1<? super Long, Unit> onRemainMillis, @Nullable IapAffiliatePromotion affiliatePromotionForPersistedTicks) {
        onRemainMillis.getClass();
        IapAffiliatePromotion iapAffiliatePromotion = (affiliatePromotionForPersistedTicks == null || !CoreModule.c.x0.G4(affiliatePromotionForPersistedTicks)) ? null : affiliatePromotionForPersistedTicks;
        long jO = mqi0.o();
        long j = endWallMs - jO;
        if (iapAffiliatePromotion != null) {
            if (j > 0) {
                r1n.INSTANCE.m21746n(this.pausedCoordinatorOwner, iapAffiliatePromotion, onRemainMillis);
                return;
            }
            m11596k();
            onRemainMillis.invoke(0L);
            m11594i(iapAffiliatePromotion, 0L);
            m11592g(iapAffiliatePromotion);
            CoreModule.c.x0.o4(iapAffiliatePromotion.promotionHitId);
            return;
        }
        if (this.timer == null || j <= 0 || jO - this.lastScheduledAtMs >= 600 || Math.abs(endWallMs - this.lastScheduledEndWallMs) >= 8000) {
            m11596k();
            if (j <= 0) {
                onRemainMillis.invoke(0L);
                m11594i(iapAffiliatePromotion, 0L);
                m11592g(iapAffiliatePromotion);
                CoreModule.c.x0.o4(0L);
                return;
            }
            this.activeEndWallMs = endWallMs;
            this.activePersistPromo = iapAffiliatePromotion;
            this.lastScheduledEndWallMs = endWallMs;
            this.lastScheduledAtMs = mqi0.o();
            onRemainMillis.invoke(Long.valueOf(j));
            m11594i(iapAffiliatePromotion, j);
            m11593h(j, iapAffiliatePromotion);
            CountDownTimerC0521b countDownTimerC0521b = new CountDownTimerC0521b(j, onRemainMillis, this, iapAffiliatePromotion);
            countDownTimerC0521b.start();
            this.timer = countDownTimerC0521b;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11596k() {
        r1n.INSTANCE.m21747o(this.pausedCoordinatorOwner);
        boolean z = this.timer != null;
        IapAffiliatePromotion iapAffiliatePromotion = this.activePersistPromo;
        long j = this.activeEndWallMs;
        if (!z && iapAffiliatePromotion == null && j == 0) {
            return;
        }
        if (iapAffiliatePromotion != null && j > 0) {
            m11594i(iapAffiliatePromotion, a.c(j - mqi0.o(), 0L));
            m11592g(iapAffiliatePromotion);
        }
        m11591f();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    /* JADX INFO: renamed from: l.d1n$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ll/d1n$a;", "", "<init>", "()V", "", "RAPID_RESTART_DEBOUNCE_MS", "J", "RAPID_RESTART_END_WALL_SLOP_MS", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0520a {
        public /* synthetic */ C0520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0520a() {
        }
    }
}
