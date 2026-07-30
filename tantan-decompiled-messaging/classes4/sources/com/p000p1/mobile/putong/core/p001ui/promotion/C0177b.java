package com.p000p1.mobile.putong.core.p001ui.promotion;

import android.os.Bundle;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0177b extends jq2<C0178c> {

    /* JADX INFO: renamed from: a */
    public List<a> f2154a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f2155a;

        /* JADX INFO: renamed from: b */
        public String f2156b;

        /* JADX INFO: renamed from: c */
        public List<String> f2157c;

        /* JADX INFO: renamed from: a */
        public static a m3646a(String str, String str2, List<String> list) {
            a aVar = new a();
            aVar.f2156b = str;
            aVar.f2155a = str2;
            aVar.f2157c = list;
            return aVar;
        }
    }

    public C0177b(mcr mcrVar) {
        super(mcrVar);
        this.f2154a = vwb.f0(new a[]{a.m3646a("VIP首月低价", "lowPriceFirstMonth", vwb.f0(new String[]{"lowPriceFirstMonthVIP1M@local"})), a.m3646a("VIP前三月低价", "lowPrice3Month", vwb.f0(new String[]{"lowPrice3MonthVIP1M1R@local"})), a.m3646a("VIP低价召回", "lowPriceCallback3VIP", vwb.f0(new String[]{"lowPriceCallback3VIP1M@local", "lowPriceCallback3VIP3M@local", "lowPriceCallback3VIP12M@local"})), a.m3646a("VIP新客促销", "lowPriceCustomerVIP", vwb.f0(new String[]{"lowPriceCustomerVIP@local_1M", "lowPriceCustomerVIP@local_3M"})), a.m3646a("SVIP一元试用", "trial7DSVIP", vwb.f0(new String[]{"trialSVIP7Day@local_1M"})), a.m3646a("SVIP低价召回", "lowPriceCallback3SVIP", vwb.f0(new String[]{"lowPriceCallback3SVIP1M@local", "lowPriceCallback3SVIP3M@local", "lowPriceCallback3SVIP6M@local", "lowPriceCallback3SVIP12M@local"})), a.m3646a("SVIP新客促销", "lowPriceCustomerSVIP", vwb.f0(new String[]{"lowPriceCustomerSVIP@local_1M_exceed23age_h", "lowPriceCustomerSVIP_local_1M_under23age_h", "lowPriceCustomerSVIP@local_3M_exceed23age_h", "lowPriceCustomerSVIP@local_3M_under23age_h", "lowPriceCustomerSVIP@local_1M_exceed23age_h_58", "lowPriceCustomerSVIP@local_3M_exceed23age_h_128", "lowPriceCustomerSVIP@local_6M_exceed23age_h", "lowPriceCustomerSVIP@local_6M_under23age_h"})), a.m3646a("SVIP年卡促销", "lowPriceFirstTime12MSVIP", vwb.f0(new String[]{"lowPriceFirstTime12MSVIP@local_exceed23age_nonRenewal", "lowPriceFirstTime12MSVIP@local_under23age_nonRenewal"})), a.m3646a("SVIP&Picks", "lowPriceSVIPPicks", vwb.f0(new String[]{"lowPriceSVIPPicks@local_1M_exceed23age", "lowPriceSVIPPicks@local_1M_under23age", "lowPriceSVIPPicks@local_3M_exceed23age", "lowPriceSVIPPicks@local_3M_under23age"})), a.m3646a("黑金春节低价", "lowPriceODiamond", vwb.f0(new String[]{"lowPriceODiamond@android_3M_nonRenewal", "lowPriceODiamond@android_12M_nonRenewal"})), a.m3646a("SVIP新客促销重构", "lowPriceCustomerUpliftSVIP", vwb.f0(new String[]{"lowPriceCustomerUpliftSVIP@local_1M_exceed23age_h", "lowPriceCustomerUpliftSVIP@local_1M_under23age_h", "lowPriceCustomerUpliftSVIP@local_1M_exceed23age_l", "lowPriceCustomerUpliftSVIP@local_1M_under23age_l"}))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m3644f0(Bundle bundle) {
        ((C0178c) ((jq2) this).viewModel).m3650c(this.f2154a);
    }

    /* JADX INFO: renamed from: a0 */
    public void m3645a0() {
        super.a0();
        creates(new e30() { // from class: l.m8b0
            public final void call(Object obj) {
                this.f15276a.m3644f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
