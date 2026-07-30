package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class m7l extends AbstractC18834o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m153380c(z5l.C21640a c21640a) {
        c21640a.f201828b.m161182Y4();
        c21640a.f201828b.f140350G.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m153381e() {
        return wvv.m205773m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(final z5l.C21640a c21640a) {
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (iapAffiliatePromotionM30171E3 != null) {
            long j = iapAffiliatePromotionM30171E3.promotionHitId;
            if (j > 0) {
                coreIntlAffiliatePromotions.f19199a0.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.f19198Z.put(Boolean.FALSE);
            } else {
                coreIntlAffiliatePromotions.f19198Z.put(Boolean.TRUE);
            }
        } else {
            coreIntlAffiliatePromotions.f19198Z.put(Boolean.TRUE);
        }
        d30 d30Var = new d30() { // from class: l.l7l
            @Override // p149l.d30
            public final void call() {
                m7l.m153380c(c21640a);
            }
        };
        kwo.m147624s(c21640a.m217363a(), kwo.m147622q(), "intl_swipe_first_enter_fullscreen_discount", null, d30Var, d30Var);
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        if (((c21640a.m217363a() instanceof NewMainAct) && ((NewMainAct) c21640a.m217363a()).m39814f6(TabName.Live)) || !CoreModule.f17545c.f19696x0.m30191W3() || !CoreModule.f17545c.f19696x0.m30186N3()) {
            return false;
        }
        IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
        if (!NullChecker.m81303a(iapAffiliatePromotionM30171E3)) {
            return false;
        }
        long j = iapAffiliatePromotionM30171E3.promotionHitId;
        if (CoreModule.f17545c.f19696x0.m30193Y3(j)) {
            return false;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (j > 0) {
            boolean zBooleanValue = coreIntlAffiliatePromotions.f19198Z.get().booleanValue();
            zpd0 zpd0Var = coreIntlAffiliatePromotions.f19199a0;
            if (zBooleanValue) {
                zpd0Var.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.f19198Z.put(Boolean.FALSE);
                return false;
            }
            if (j == zpd0Var.get().longValue()) {
                return false;
            }
        } else if (coreIntlAffiliatePromotions.f19198Z.get().booleanValue()) {
            return false;
        }
        return m153381e();
    }
}
