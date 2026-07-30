package p009l;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.kwo;
import l.wvv;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m7l extends AbstractC1065o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18293c(z5l.C1346a c1346a) {
        c1346a.f23488b.m19386Y4();
        c1346a.f23488b.f17660G.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18294e() {
        return wvv.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (iapAffiliatePromotionE3 != null) {
            long j = iapAffiliatePromotionE3.promotionHitId;
            if (j > 0) {
                coreIntlAffiliatePromotions.a0.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.Z.put(Boolean.FALSE);
            } else {
                coreIntlAffiliatePromotions.Z.put(Boolean.TRUE);
            }
        } else {
            coreIntlAffiliatePromotions.Z.put(Boolean.TRUE);
        }
        d30 d30Var = new d30() { // from class: l.l7l
            public final void call() {
                m7l.m18293c(c1346a);
            }
        };
        kwo.s(c1346a.m25611a(), kwo.q(), "intl_swipe_first_enter_fullscreen_discount", (e30) null, d30Var, d30Var);
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        if (((c1346a.m25611a() instanceof NewMainAct) && c1346a.m25611a().m3890f6(TabName.Live)) || !CoreModule.c.x0.W3() || !CoreModule.c.x0.N3()) {
            return false;
        }
        IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
        if (!NullChecker.a(iapAffiliatePromotionE3)) {
            return false;
        }
        long j = iapAffiliatePromotionE3.promotionHitId;
        if (CoreModule.c.x0.Y3(j)) {
            return false;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (j > 0) {
            boolean zBooleanValue = ((Boolean) coreIntlAffiliatePromotions.Z.get()).booleanValue();
            zpd0 zpd0Var = coreIntlAffiliatePromotions.a0;
            if (zBooleanValue) {
                zpd0Var.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.Z.put(Boolean.FALSE);
                return false;
            }
            if (j == ((Long) zpd0Var.get()).longValue()) {
                return false;
            }
        } else if (((Boolean) coreIntlAffiliatePromotions.Z.get()).booleanValue()) {
            return false;
        }
        return m18294e();
    }
}
