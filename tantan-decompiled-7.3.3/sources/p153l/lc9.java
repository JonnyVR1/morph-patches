package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UltraRightsUpgradeInfo;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class lc9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public MembershipUpgradeInfo f131283R;

    /* JADX INFO: renamed from: S */
    public C22508b<Boolean> f131284S;

    /* JADX INFO: renamed from: T */
    public UltraRightsUpgradeInfo f131285T;

    /* JADX INFO: renamed from: U */
    public jxd0 f131286U;

    /* JADX INFO: renamed from: V */
    public C22508b<pf60<PurchaseType, C8928d>> f131287V;

    public lc9(C4883c c4883c) {
        super(c4883c);
        this.f131284S = C22508b.m222767b();
        this.f131286U = new jxd0("has_clicked_ultra_card_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f131287V = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Envelope m153643a3(Envelope envelope, Envelope envelope2) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public ProductCategory m153651i3() {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        return lc9Var.m153652j3() ? ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra) : lc9Var.f131283R.category;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m153652j3() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo;
        return (IntlCountryCodeController.m29114k() || (ultraRightsUpgradeInfo = this.f131285T) == null || !ultraRightsUpgradeInfo.isCanUpgradeUltra) ? false : true;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m153653k3(ProductCategory productCategory) {
        if (productCategory == null) {
            return false;
        }
        return TEnum.equals(productCategory, ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(productCategory, ProductCategory.tttSeeUpgradeToPremium) || TEnum.equals(productCategory, ProductCategory.tttPremiumUpgradeToUltra);
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m153654l3(PurchaseType purchaseType) {
        if (this.f131283R == null) {
            return false;
        }
        if (wib0.m206573q(purchaseType)) {
            return TEnum.equals(this.f131283R.category, ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(this.f131283R.category, ProductCategory.tttSeeUpgradeToPremium);
        }
        if (wib0.m206578v(purchaseType)) {
            return TEnum.equals(this.f131283R.category, ProductCategory.tttPremiumUpgradeToUltra);
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m153655m3(Envelope envelope) {
        this.f131283R = ((CoreData) envelope.getModuleData(CoreData.class)).membershipUpgradeInfo;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m153656n3(final Envelope envelope) {
        return m153663u3().map(new qcj() { // from class: l.kc9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lc9.m153643a3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22421c m153657o3() {
        return qi20.m176658e(new pcj() { // from class: l.ec9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/membership-upgrade-info")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.fc9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98203a.m153655m3((Envelope) obj);
            }
        }).flatMap(new qcj() { // from class: l.gc9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f103550a.m153656n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m153658p3(Envelope envelope) {
        this.f131285T = ((CoreData) envelope.getModuleData(CoreData.class)).ultraRightsUpgradeInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22421c m153659q3() {
        return qi20.m176658e(new pcj() { // from class: l.ic9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ultra/rights/upgrade-info")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.jc9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120027a.m153658p3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m153660r3() {
        this.f131286U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<Envelope> m153661s3() {
        return this.f91137Q.scheduled("membership-upgrade-info", 0, new pcj() { // from class: l.dc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f87760a.m153657o3();
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t3 */
    public boolean m153662t3() {
        return m153652j3() && !this.f131286U.get().booleanValue();
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<Envelope> m153663u3() {
        return this.f91137Q.scheduled("ultra-rights-upgrade-info", 0, new pcj() { // from class: l.hc9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108682a.m153659q3();
            }
        }).observeOn(fo0.m126432a());
    }
}
