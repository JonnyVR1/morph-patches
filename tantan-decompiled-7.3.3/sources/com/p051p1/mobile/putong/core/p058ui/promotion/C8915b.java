package com.p051p1.mobile.putong.core.p058ui.promotion;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import java.util.List;
import p153l.ar2;
import p153l.jyb;
import p153l.ner;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8915b extends ar2<C8916c> {

    /* JADX INFO: renamed from: a */
    public List<a> f35180a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f35181a;

        /* JADX INFO: renamed from: b */
        public String f35182b;

        /* JADX INFO: renamed from: c */
        public List<String> f35183c;

        /* JADX INFO: renamed from: a */
        public static a m54265a(String str, String str2, List<String> list) {
            a aVar = new a();
            aVar.f35182b = str;
            aVar.f35181a = str2;
            aVar.f35183c = list;
            return aVar;
        }
    }

    public C8915b(ner nerVar) {
        super(nerVar);
        this.f35180a = jyb.m147507f0(a.m54265a("VIP首月低价", MonetizationPromotionsId.lowPriceFirstMonth, jyb.m147507f0(ConstantCouponId.lowPriceFirstMonthVIP1M_local)), a.m54265a("VIP前三月低价", MonetizationPromotionsId.lowPrice3Month, jyb.m147507f0(ConstantCouponId.lowPrice3MonthVIP1M1R_local)), a.m54265a("VIP低价召回", MonetizationPromotionsId.lowPriceCallback3VIP, jyb.m147507f0(ConstantCouponId.lowPriceCallback3VIP1M_local, ConstantCouponId.lowPriceCallback3VIP3M_local, ConstantCouponId.lowPriceCallback3VIP12M_local)), a.m54265a("VIP新客促销", MonetizationPromotionsId.lowPriceCustomerVIP, jyb.m147507f0(ConstantCouponId.lowPriceCustomerVIP_local_1M, ConstantCouponId.lowPriceCustomerVIP_local_3M)), a.m54265a("SVIP一元试用", MonetizationPromotionsId.trial7DSVIP, jyb.m147507f0(ConstantCouponId.trialSVIP7Day_local_1M)), a.m54265a("SVIP低价召回", MonetizationPromotionsId.lowPriceCallback3SVIP, jyb.m147507f0(ConstantCouponId.lowPriceCallback3SVIP1M_local, ConstantCouponId.lowPriceCallback3SVIP3M_local, ConstantCouponId.lowPriceCallback3SVIP6M_local, ConstantCouponId.lowPriceCallback3SVIP12M_local)), a.m54265a("SVIP新客促销", MonetizationPromotionsId.lowPriceCustomerSVIP, jyb.m147507f0(ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_58, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h_128, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_6M_under23age_h)), a.m54265a("SVIP年卡促销", MonetizationPromotionsId.lowPriceFirstTime12MSVIP, jyb.m147507f0(ConstantCouponId.lowPriceFirstTime12MSVIP_local_exceed23age_nonRenewal, ConstantCouponId.lowPriceFirstTime12MSVIP_local_under23age_nonRenewal)), a.m54265a("SVIP&Picks", MonetizationPromotionsId.lowPriceSVIPPicks, jyb.m147507f0(ConstantCouponId.lowPriceSVIPPicks_local_1M_exceed23age, ConstantCouponId.lowPriceSVIPPicks_local_1M_under23age, ConstantCouponId.lowPriceSVIPPicks_local_3M_exceed23age, ConstantCouponId.lowPriceSVIPPicks_local_3M_under23age)), a.m54265a("黑金春节低价", MonetizationPromotionsId.lowPriceODiamond, jyb.m147507f0(ConstantCouponId.lowPriceSpringODiamond_local_3M, ConstantCouponId.lowPriceSpringODiamond_local_12M)), a.m54265a("SVIP新客促销重构", MonetizationPromotionsId.lowPriceCustomerUpliftSVIP, jyb.m147507f0(ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MExceed23ageH, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MUnder23ageH, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MExceed23ageL, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MUnder23ageL)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m54264f0(Bundle bundle) {
        ((C8916c) this.viewModel).m54268c(this.f35180a);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qgb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157400a.m54264f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
