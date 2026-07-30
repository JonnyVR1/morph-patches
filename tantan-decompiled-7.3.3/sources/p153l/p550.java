package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, m88121d2 = {"Ll/p550;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "j", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "", "n", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "m", "()Z", "Ll/pf60;", "Lcom/p1/mobile/putong/core/data/Coupon;", RXScreenCaptureService.KEY_INDEX, "()Ll/pf60;", Merchandise.TYPE, "k", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Z", "Ll/byd0;", "a", "Ll/byd0;", "getODiamondPromotionPageLastShowTime", "()Ll/byd0;", "setODiamondPromotionPageLastShowTime", "(Ll/byd0;)V", "oDiamondPromotionPageLastShowTime", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class p550 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile p550 f150608b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public byd0 oDiamondPromotionPageLastShowTime = new byd0("odiamond_promotion_page_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static Boolean m170594a(p550 p550Var, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.quarterly() && merchandise.noneRenewable() && p550Var.m170605k(merchandise));
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m170595b(Merchandise merchandise) {
        return Boolean.valueOf(NullChecker.m82486a(merchandise) && merchandise.yearly() && merchandise.noneRenewable() && v5b0.m199794t(merchandise));
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m170596c(p550 p550Var, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.yearly() && merchandise.noneRenewable() && p550Var.m170605k(merchandise));
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m170597d(Merchandise merchandise) {
        if (merchandise != null) {
            return Boolean.valueOf(merchandise.yearly() && merchandise.noneRenewable() && v5b0.m199786l(merchandise, MonetizationPromotionsId.lowPriceODiamond));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m170598e(Merchandise merchandise) {
        return Boolean.valueOf(NullChecker.m82486a(merchandise) && merchandise.quarterly() && merchandise.noneRenewable() && v5b0.m199794t(merchandise));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final p550 m170601h() {
        return INSTANCE.m170608a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m170602l() {
        INSTANCE.m170609b();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final pf60<Merchandise, Coupon> m170603i() {
        Merchandise merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("oDiamond")), new qcj() { // from class: l.k550
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p550.m170597d((Merchandise) obj);
            }
        });
        if (merchandise != null) {
            return jyb.m147494Y(merchandise, merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final List<Merchandise> m170604j(@NotNull List<? extends Merchandise> merchandises) {
        merchandises.getClass();
        List<? extends Merchandise> list = merchandises;
        if (jyb.m147479J(list)) {
            return null;
        }
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.l550
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p550.m170596c(this.f130068a, (Merchandise) obj);
            }
        });
        Merchandise merchandise2 = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.m550
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p550.m170594a(this.f134865a, (Merchandise) obj);
            }
        });
        if (NullChecker.m82486a(merchandise) && NullChecker.m82486a(merchandise2)) {
            return CollectionsKt.arrayListOf(merchandise, merchandise2);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m170605k(Merchandise merchandise) {
        return v5b0.m199786l(merchandise, MonetizationPromotionsId.lowPriceODiamond);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m170606m() {
        return NullChecker.m82486a(m170603i());
    }

    /* JADX INFO: renamed from: n */
    public final void m170607n(@NotNull Act act, @NotNull List<? extends Merchandise> merchandises, @NotNull String from) {
        act.getClass();
        merchandises.getClass();
        from.getClass();
        List<? extends Merchandise> list = merchandises;
        Object objM147529r = jyb.m147529r(list, new qcj() { // from class: l.n550
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p550.m170595b((Merchandise) obj);
            }
        });
        objM147529r.getClass();
        Merchandise merchandise = (Merchandise) objM147529r;
        Object objM147529r2 = jyb.m147529r(list, new qcj() { // from class: l.o550
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p550.m170598e((Merchandise) obj);
            }
        });
        objM147529r2.getClass();
        Merchandise merchandise2 = (Merchandise) objM147529r2;
        if (NullChecker.m82486a(merchandise) && NullChecker.m82486a(merchandise2)) {
            Coupon couponForPromotion = merchandise.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond);
            couponForPromotion.getClass();
            Coupon couponForPromotion2 = merchandise2.getCouponForPromotion(MonetizationPromotionsId.lowPriceODiamond);
            couponForPromotion2.getClass();
            new d650(act, merchandise, couponForPromotion, merchandise2, couponForPromotion2, from).show();
        }
    }

    /* JADX INFO: renamed from: l.p550$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/p550$a;", "", "<init>", "()V", "Ll/p550;", "a", "()Ll/p550;", "", "b", "instance", "Ll/p550;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final p550 m170608a() {
            p550 p550Var;
            p550 p550Var2 = p550.f150608b;
            if (p550Var2 != null) {
                return p550Var2;
            }
            synchronized (this) {
                p550Var = p550.f150608b;
                if (p550Var == null) {
                    p550Var = new p550();
                    p550.f150608b = p550Var;
                }
            }
            return p550Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m170609b() {
            p550.f150608b = null;
        }

        public Companion() {
        }
    }
}
