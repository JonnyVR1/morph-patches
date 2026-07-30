package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.UltraRightsUpgradeInfo;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.e30;
import l.hpd0;
import l.j760;
import l.jo0;
import l.sab0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cb9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public MembershipUpgradeInfo f9573R;

    /* JADX INFO: renamed from: S */
    public b<Boolean> f9574S;

    /* JADX INFO: renamed from: T */
    public UltraRightsUpgradeInfo f9575T;

    /* JADX INFO: renamed from: U */
    public hpd0 f9576U;

    /* JADX INFO: renamed from: V */
    public b<j760<PurchaseType, d>> f9577V;

    public cb9(C0158c c0158c) {
        super(c0158c);
        this.f9574S = b.b();
        this.f9576U = new hpd0("has_clicked_ultra_card_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.f9577V = b.b();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Envelope m13318a3(Envelope envelope, Envelope envelope2) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public ProductCategory m13326i3() {
        cb9 cb9Var = CoreModule.f1534c.f3558G2;
        return cb9Var.m13327j3() ? ProductCategory.get("Promo_premiumUpgradeToUltra") : cb9Var.f9573R.category;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m13327j3() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo;
        return (IntlCountryCodeController.m10k() || (ultraRightsUpgradeInfo = this.f9575T) == null || !ultraRightsUpgradeInfo.isCanUpgradeUltra) ? false : true;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m13328k3(ProductCategory productCategory) {
        if (productCategory == null) {
            return false;
        }
        return TEnum.equals(productCategory, "tttVipUpgradeToPremium") || TEnum.equals(productCategory, "tttSeeUpgradeToPremium") || TEnum.equals(productCategory, "tttPremiumUpgradeToUltra");
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m13329l3(PurchaseType purchaseType) {
        if (this.f9573R == null) {
            return false;
        }
        if (sab0.q(purchaseType)) {
            return TEnum.equals(this.f9573R.category, "tttVipUpgradeToPremium") || TEnum.equals(this.f9573R.category, "tttSeeUpgradeToPremium");
        }
        if (sab0.v(purchaseType)) {
            return TEnum.equals(this.f9573R.category, "tttPremiumUpgradeToUltra");
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m13330m3(Envelope envelope) {
        this.f9573R = envelope.getModuleData(CoreData.class).membershipUpgradeInfo;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m13331n3(final Envelope envelope) {
        return m13338u3().map(new w9j() { // from class: l.bb9
            public final Object call(Object obj) {
                return cb9.m13318a3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ c m13332o3() {
        return ia20.m16571e(new v9j() { // from class: l.va9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/membership-upgrade-info")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.wa9
            public final void call(Object obj) {
                this.f25061a.m13330m3((Envelope) obj);
            }
        }).flatMap(new w9j() { // from class: l.xa9
            public final Object call(Object obj) {
                return this.f27402a.m13331n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m13333p3(Envelope envelope) {
        this.f9575T = envelope.getModuleData(CoreData.class).ultraRightsUpgradeInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ c m13334q3() {
        return ia20.m16571e(new v9j() { // from class: l.za9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/ultra/rights/upgrade-info")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.ab9
            public final void call(Object obj) {
                this.f8190a.m13333p3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m13335r3() {
        this.f9576U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public c<Envelope> m13336s3() {
        return this.f8580Q.scheduled("membership-upgrade-info", 0, new v9j() { // from class: l.ua9
            public final Object call() {
                return this.f23464a.m13332o3();
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: t3 */
    public boolean m13337t3() {
        return m13327j3() && !((Boolean) this.f9576U.get()).booleanValue();
    }

    /* JADX INFO: renamed from: u3 */
    public c<Envelope> m13338u3() {
        return this.f8580Q.scheduled("ultra-rights-upgrade-info", 0, new v9j() { // from class: l.ya9
            public final Object call() {
                return this.f28091a.m13334q3();
            }
        }).observeOn(jo0.a());
    }
}
