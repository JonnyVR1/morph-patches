package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UltraRightsUpgradeInfo;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class cb9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public MembershipUpgradeInfo f80117R;

    /* JADX INFO: renamed from: S */
    public C22393b<Boolean> f80118S;

    /* JADX INFO: renamed from: T */
    public UltraRightsUpgradeInfo f80119T;

    /* JADX INFO: renamed from: U */
    public hpd0 f80120U;

    /* JADX INFO: renamed from: V */
    public C22393b<j760<PurchaseType, C8765d>> f80121V;

    public cb9(C4732c c4732c) {
        super(c4732c);
        this.f80118S = C22393b.m221521b();
        this.f80120U = new hpd0("has_clicked_ultra_card_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f80121V = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Envelope m105973a3(Envelope envelope, Envelope envelope2) {
        return envelope;
    }

    /* JADX INFO: renamed from: i3 */
    public ProductCategory m105981i3() {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        return cb9Var.m105982j3() ? ProductCategory.get(ProductCategory.Promo_premiumUpgradeToUltra) : cb9Var.f80117R.category;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m105982j3() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo;
        return (IntlCountryCodeController.m28115k() || (ultraRightsUpgradeInfo = this.f80119T) == null || !ultraRightsUpgradeInfo.isCanUpgradeUltra) ? false : true;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m105983k3(ProductCategory productCategory) {
        if (productCategory == null) {
            return false;
        }
        return TEnum.equals(productCategory, ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(productCategory, ProductCategory.tttSeeUpgradeToPremium) || TEnum.equals(productCategory, ProductCategory.tttPremiumUpgradeToUltra);
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m105984l3(PurchaseType purchaseType) {
        if (this.f80117R == null) {
            return false;
        }
        if (sab0.m182899q(purchaseType)) {
            return TEnum.equals(this.f80117R.category, ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(this.f80117R.category, ProductCategory.tttSeeUpgradeToPremium);
        }
        if (sab0.m182904v(purchaseType)) {
            return TEnum.equals(this.f80117R.category, ProductCategory.tttPremiumUpgradeToUltra);
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m105985m3(Envelope envelope) {
        this.f80117R = ((CoreData) envelope.getModuleData(CoreData.class)).membershipUpgradeInfo;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m105986n3(final Envelope envelope) {
        return m105993u3().map(new w9j() { // from class: l.bb9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cb9.m105973a3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22306c m105987o3() {
        return ia20.m135121e(new v9j() { // from class: l.va9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/membership-upgrade-info")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.wa9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185448a.m105985m3((Envelope) obj);
            }
        }).flatMap(new w9j() { // from class: l.xa9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191719a.m105986n3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m105988p3(Envelope envelope) {
        this.f80119T = ((CoreData) envelope.getModuleData(CoreData.class)).ultraRightsUpgradeInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ C22306c m105989q3() {
        return ia20.m135121e(new v9j() { // from class: l.za9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ultra/rights/upgrade-info")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.ab9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68637a.m105988p3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public void m105990r3() {
        this.f80120U.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<Envelope> m105991s3() {
        return this.f72126Q.scheduled("membership-upgrade-info", 0, new v9j() { // from class: l.ua9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f175582a.m105987o3();
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t3 */
    public boolean m105992t3() {
        return m105982j3() && !this.f80120U.get().booleanValue();
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<Envelope> m105993u3() {
        return this.f72126Q.scheduled("ultra-rights-upgrade-info", 0, new v9j() { // from class: l.ya9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f197157a.m105989q3();
            }
        }).observeOn(jo0.m142408a());
    }
}
