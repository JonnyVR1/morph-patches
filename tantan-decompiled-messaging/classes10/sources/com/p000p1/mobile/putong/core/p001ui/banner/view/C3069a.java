package com.p000p1.mobile.putong.core.p001ui.banner.view;

import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import l.a190;
import l.a5;
import l.b290;
import l.d090;
import l.d190;
import l.d290;
import l.d390;
import l.ez80;
import l.g090;
import l.h090;
import l.i090;
import l.iz80;
import l.j090;
import l.k090;
import l.k190;
import l.ky80;
import l.l390;
import l.ly80;
import l.m290;
import l.my80;
import l.o090;
import l.o390;
import l.py80;
import l.r190;
import l.r290;
import l.s090;
import l.s390;
import l.sy80;
import l.uy80;
import l.v090;
import l.v290;
import l.w390;
import l.xy80;
import l.yy80;
import l.yz80;
import l.zy80;
import org.jetbrains.annotations.NotNull;
import p003l.c490;
import p003l.d590;
import p003l.f490;
import p003l.h590;
import p003l.j490;
import p003l.k590;
import p003l.m590;
import p003l.p490;
import p003l.p590;
import p003l.s590;
import p003l.t490;
import p003l.x490;
import p003l.z390;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.banner.view.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0004\b\n\u0010\u000bR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/a;", "", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Ljava/util/LinkedHashMap;", "", "Ll/a5;", "Lkotlin/collections/LinkedHashMap;", "a", "()Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "defaultListMap", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class C3069a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, a5> defaultListMap;

    public C3069a(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        c3068a.getClass();
        this.defaultListMap = MapsKt.linkedMapOf(new Pair[]{TuplesKt.a("PrivilegeEntrancePendingPaymentStrategy", new b290(c3068a)), TuplesKt.a("PrivilegeEntranceODiamondSpringStrategy", new uy80(c3068a)), TuplesKt.a("PrivilegeEntranceODiamondStrategy", new k190(c3068a)), TuplesKt.a("PrivilegeEntrancePlatinumStrategy", new d290(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiBefore24SVIPWithODiamondBannerStrategy", new a190(c3068a)), TuplesKt.a("PrivilegeEntranceOdiamondRefundStrategy", new r190(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerDouble11SVIP6mWithSVIPStrategy", new ly80(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerSVIP12YearWithSVIPStrategy", new yy80(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPRenewableRecoverStrategy", new w390(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPWithGuideSigningStrategy", new j490(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiAfter24SVIPWithODiamondBannerStrategy", new j090(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPStrategy", new z390(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiBefore24VIPWithODiamondBannerStrategy", new d190(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiBefore24SVIPGuideWithVIPStrategy", new v090(c3068a)), TuplesKt.a("PrivilegeEntranceVIPWithODiamondBannerStrategy", new s590(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerDouble11SVIP6mWithVIPStrategy", new my80(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerSVIP12YearWithVIPStrategy", new zy80(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPLowPriceCallbackWithVIPStrategy", new l390(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPNewCustomerWithVIPStrategy", new s390(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPTrailHasVipStrategy", new c490(c3068a)), TuplesKt.a("PrivilegeEntranceVIPRenewableRecoverStrategy", new k590(c3068a)), TuplesKt.a("PrivilegeEntranceVIPGuideToSVIPStrategy", new x490(c3068a)), TuplesKt.a("PrivilegeEntranceVIPWithGuideSigningStrategy", new p590(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiAfter24VIPWithODiamondBannerStrategy", new k090(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiAfter24SVIPGuideWithVIPStrategy", new i090(c3068a)), TuplesKt.a("PrivilegeEntranceVIPStrategy", new m590(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiBefore24DefaultWithODiamondBannerStrategy", new o090(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiBefore24DefaultWithSVIPStrategy", new s090(c3068a)), TuplesKt.a("PrivilegeEntranceRecoverODiamondStrategy", new m290(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerDouble11SVIP6mStrategy", new ky80(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerSVIP12YearStrategy", new xy80(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerSVIPLowPriceCallBackStrategy", new ez80(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPLowPriceCallbackStrategy", new d390(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPExpiredWithODiamondStrategy", new r290(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPExpiredWithoutODiamondStrategy", new v290(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerLowPriceCustomerSVIPStrategy", new py80(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPNewCustomerStrategy", new o390(c3068a)), TuplesKt.a("PrivilegeEntranceSVIPTrailStrategy", new f490(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerVIPLowPriceCallBackStrategy", new iz80(c3068a)), TuplesKt.a("PrivilegeEntranceVIPLowPriceCallbackStrategy", new d590(c3068a)), TuplesKt.a("PrivilegeEnhancedPromotionBannerLowPriceCustomerVIPStrategy", new sy80(c3068a)), TuplesKt.a("PrivilegeEntranceVIPNewCustomerStrategy", new h590(c3068a)), TuplesKt.a("PrivilegeEntranceVIPExpiredWithODiamondStrategy", new p490(c3068a)), TuplesKt.a("PrivilegeEntranceDefaultWithODiamondBannerStrategy", new d090(c3068a)), TuplesKt.a("PrivilegeEntranceVIPExpiredWithoutODiamondStrategy", new t490(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiAfter24DefaultWithODiamondBannerStrategy", new g090(c3068a)), TuplesKt.a("PrivilegeEntranceHuaWeiAfter24DefaultWithSVIPStrategy", new h090(c3068a)), TuplesKt.a("PrivilegeEntranceDefaultStrategy", new yz80(c3068a))});
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<String, a5> m1706a() {
        return this.defaultListMap;
    }
}
