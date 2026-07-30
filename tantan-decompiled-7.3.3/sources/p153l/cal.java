package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class cal extends AbstractC18774n4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m108501c(p8l.C19323a c19323a) {
        c19323a.f151041b.m101976Y4();
        c19323a.f151041b.f74502G.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m108502e() {
        return xxv.m213586m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(final p8l.C19323a c19323a) {
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (iapAffiliatePromotionM31169E3 != null) {
            long j = iapAffiliatePromotionM31169E3.promotionHitId;
            if (j > 0) {
                coreIntlAffiliatePromotions.f19940a0.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.f19939Z.put(Boolean.FALSE);
            } else {
                coreIntlAffiliatePromotions.f19939Z.put(Boolean.TRUE);
            }
        } else {
            coreIntlAffiliatePromotions.f19939Z.put(Boolean.TRUE);
        }
        x20 x20Var = new x20() { // from class: l.bal
            @Override // p153l.x20
            public final void call() {
                cal.m108501c(c19323a);
            }
        };
        kyo.m152063s(c19323a.m171258a(), kyo.m152061q(), "intl_swipe_first_enter_fullscreen_discount", null, x20Var, x20Var);
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        if (((c19323a.m171258a() instanceof NewMainAct) && ((NewMainAct) c19323a.m171258a()).m40822j6(TabName.Live)) || !CoreModule.f18264c.f20438x0.m31189W3() || !CoreModule.f18264c.f20438x0.m31184N3()) {
            return false;
        }
        IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
        if (!NullChecker.m82486a(iapAffiliatePromotionM31169E3)) {
            return false;
        }
        long j = iapAffiliatePromotionM31169E3.promotionHitId;
        if (CoreModule.f18264c.f20438x0.m31191Y3(j)) {
            return false;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (j > 0) {
            boolean zBooleanValue = coreIntlAffiliatePromotions.f19939Z.get().booleanValue();
            byd0 byd0Var = coreIntlAffiliatePromotions.f19940a0;
            if (zBooleanValue) {
                byd0Var.put(Long.valueOf(j));
                coreIntlAffiliatePromotions.f19939Z.put(Boolean.FALSE);
                return false;
            }
            if (j == byd0Var.get().longValue()) {
                return false;
            }
        } else if (coreIntlAffiliatePromotions.f19939Z.get().booleanValue()) {
            return false;
        }
        return m108502e();
    }
}
