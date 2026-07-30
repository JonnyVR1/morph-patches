package com.p046p1.mobile.putong.core.p053ui.promotion;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import java.util.List;
import p149l.e30;
import p149l.jq2;
import p149l.mcr;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8752b extends jq2<C8753c> {

    /* JADX INFO: renamed from: a */
    public List<a> f34332a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f34333a;

        /* JADX INFO: renamed from: b */
        public String f34334b;

        /* JADX INFO: renamed from: c */
        public List<String> f34335c;

        /* JADX INFO: renamed from: a */
        public static a m53082a(String str, String str2, List<String> list) {
            a aVar = new a();
            aVar.f34334b = str;
            aVar.f34333a = str2;
            aVar.f34335c = list;
            return aVar;
        }
    }

    public C8752b(mcr mcrVar) {
        super(mcrVar);
        this.f34332a = vwb.m200324f0(a.m53082a("VIP首月低价", MonetizationPromotionsId.lowPriceFirstMonth, vwb.m200324f0(ConstantCouponId.lowPriceFirstMonthVIP1M_local)), a.m53082a("VIP前三月低价", MonetizationPromotionsId.lowPrice3Month, vwb.m200324f0(ConstantCouponId.lowPrice3MonthVIP1M1R_local)), a.m53082a("VIP低价召回", MonetizationPromotionsId.lowPriceCallback3VIP, vwb.m200324f0(ConstantCouponId.lowPriceCallback3VIP1M_local, ConstantCouponId.lowPriceCallback3VIP3M_local, ConstantCouponId.lowPriceCallback3VIP12M_local)), a.m53082a("VIP新客促销", MonetizationPromotionsId.lowPriceCustomerVIP, vwb.m200324f0(ConstantCouponId.lowPriceCustomerVIP_local_1M, ConstantCouponId.lowPriceCustomerVIP_local_3M)), a.m53082a("SVIP一元试用", MonetizationPromotionsId.trial7DSVIP, vwb.m200324f0(ConstantCouponId.trialSVIP7Day_local_1M)), a.m53082a("SVIP低价召回", MonetizationPromotionsId.lowPriceCallback3SVIP, vwb.m200324f0(ConstantCouponId.lowPriceCallback3SVIP1M_local, ConstantCouponId.lowPriceCallback3SVIP3M_local, ConstantCouponId.lowPriceCallback3SVIP6M_local, ConstantCouponId.lowPriceCallback3SVIP12M_local)), a.m53082a("SVIP新客促销", MonetizationPromotionsId.lowPriceCustomerSVIP, vwb.m200324f0(ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_58, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h_128, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_6M_under23age_h)), a.m53082a("SVIP年卡促销", MonetizationPromotionsId.lowPriceFirstTime12MSVIP, vwb.m200324f0(ConstantCouponId.lowPriceFirstTime12MSVIP_local_exceed23age_nonRenewal, ConstantCouponId.lowPriceFirstTime12MSVIP_local_under23age_nonRenewal)), a.m53082a("SVIP&Picks", MonetizationPromotionsId.lowPriceSVIPPicks, vwb.m200324f0(ConstantCouponId.lowPriceSVIPPicks_local_1M_exceed23age, ConstantCouponId.lowPriceSVIPPicks_local_1M_under23age, ConstantCouponId.lowPriceSVIPPicks_local_3M_exceed23age, ConstantCouponId.lowPriceSVIPPicks_local_3M_under23age)), a.m53082a("黑金春节低价", MonetizationPromotionsId.lowPriceODiamond, vwb.m200324f0(ConstantCouponId.lowPriceSpringODiamond_local_3M, ConstantCouponId.lowPriceSpringODiamond_local_12M)), a.m53082a("SVIP新客促销重构", MonetizationPromotionsId.lowPriceCustomerUpliftSVIP, vwb.m200324f0(ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MExceed23ageH, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MUnder23ageH, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MExceed23ageL, ConstantCouponId.lowPriceCustomerUpliftSVIPLocal1MUnder23ageL)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m53081f0(Bundle bundle) {
        ((C8753c) this.viewModel).m53085c(this.f34332a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.m8b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132559a.m53081f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
