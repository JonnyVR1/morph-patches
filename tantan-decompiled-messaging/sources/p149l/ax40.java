package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, m87232d2 = {"Ll/ax40;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "j", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "m", "()Z", "Ll/j760;", "Lcom/p1/mobile/putong/core/data/Coupon;", RXScreenCaptureService.KEY_INDEX, "()Ll/j760;", Merchandise.TYPE, "k", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "Ll/zpd0;", "a", "Ll/zpd0;", "getODiamondPromotionPageLastShowTime", "()Ll/zpd0;", "setODiamondPromotionPageLastShowTime", "(Ll/zpd0;)V", "oDiamondPromotionPageLastShowTime", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ax40 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile ax40 f72114b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public zpd0 oDiamondPromotionPageLastShowTime = new zpd0("odiamond_promotion_page_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static Boolean m99363a(ax40 ax40Var, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.quarterly() && merchandise.noneRenewable() && ax40Var.m99374k(merchandise));
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m99364b(Merchandise merchandise) {
        return Boolean.valueOf(NullChecker.m81303a(merchandise) && merchandise.yearly() && merchandise.noneRenewable() && rxa0.m181499t(merchandise));
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m99365c(ax40 ax40Var, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.yearly() && merchandise.noneRenewable() && ax40Var.m99374k(merchandise));
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m99366d(Merchandise merchandise) {
        if (merchandise != null) {
            return Boolean.valueOf(merchandise.yearly() && merchandise.noneRenewable() && rxa0.m181491l(merchandise, MonetizationPromotionsId.lowPriceODiamond));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m99367e(Merchandise merchandise) {
        return Boolean.valueOf(NullChecker.m81303a(merchandise) && merchandise.quarterly() && merchandise.noneRenewable() && rxa0.m181499t(merchandise));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final ax40 m99370h() {
        return INSTANCE.m99377a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m99371l() {
        INSTANCE.m99378b();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final j760<Merchandise, Coupon> m99372i() {
        Merchandise merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("oDiamond")), new w9j() { // from class: l.vw40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ax40.m99366d((Merchandise) obj);
            }
        });
        if (merchandise != null) {
            return vwb.m200311Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final List<Merchandise> m99373j(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        List<? extends Merchandise> list = merchandises;
        if (vwb.m200296J(list)) {
            return null;
        }
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.ww40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ax40.m99365c(this.f188330a, (Merchandise) obj);
            }
        });
        Merchandise merchandise2 = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.xw40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ax40.m99363a(this.f194695a, (Merchandise) obj);
            }
        });
        if (NullChecker.m81303a(merchandise) && NullChecker.m81303a(merchandise2)) {
            return CollectionsKt.arrayListOf(merchandise, merchandise2);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m99374k(Merchandise merchandise) {
        return rxa0.m181491l(merchandise, MonetizationPromotionsId.lowPriceODiamond);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m99375m() {
        return NullChecker.m81303a(m99372i());
    }

    /* JADX INFO: renamed from: n */
    public final void m99376n(@NotNull Act act, @NotNull List<? extends Merchandise> merchandises, @NotNull String from) {
        act.getClass();
        merchandises.getClass();
        from.getClass();
        List<? extends Merchandise> list = merchandises;
        Object objM200346r = vwb.m200346r(list, new w9j() { // from class: l.yw40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ax40.m99364b((Merchandise) obj);
            }
        });
        objM200346r.getClass();
        Merchandise merchandise = (Merchandise) objM200346r;
        Object objM200346r2 = vwb.m200346r(list, new w9j() { // from class: l.zw40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ax40.m99367e((Merchandise) obj);
            }
        });
        objM200346r2.getClass();
        Merchandise merchandise2 = (Merchandise) objM200346r2;
        if (NullChecker.m81303a(merchandise) && NullChecker.m81303a(merchandise2)) {
            Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond);
            couponForPromotion.getClass();
            Coupon couponForPromotion2 = merchandise2.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond);
            couponForPromotion2.getClass();
            new ox40(act, merchandise, couponForPromotion, merchandise2, couponForPromotion2, from).show();
        }
    }

    /* JADX INFO: renamed from: l.ax40$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/ax40$a;", "", "<init>", "()V", "Ll/ax40;", "a", "()Ll/ax40;", "", "b", "instance", "Ll/ax40;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ax40 m99377a() {
            ax40 ax40Var;
            ax40 ax40Var2 = ax40.f72114b;
            if (ax40Var2 != null) {
                return ax40Var2;
            }
            synchronized (this) {
                ax40Var = ax40.f72114b;
                if (ax40Var == null) {
                    ax40Var = new ax40();
                    ax40.f72114b = ax40Var;
                }
            }
            return ax40Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m99378b() {
            ax40.f72114b = null;
        }

        public Companion() {
        }
    }
}
