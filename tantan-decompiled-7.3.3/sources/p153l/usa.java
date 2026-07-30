package p153l;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotion;
import com.p051p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Promotions;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class usa extends dy6 {

    /* JADX INFO: renamed from: R */
    public final Map<String, MonetizationPromotion> f180752R;

    /* JADX INFO: renamed from: S */
    public final Map<String, Coupon> f180753S;

    /* JADX INFO: renamed from: T */
    public final Map<String, NewCustomerPromotionConfig> f180754T;

    /* JADX INFO: renamed from: U */
    public final C22507a<List<MonetizationPromotion>> f180755U;

    public usa(C4883c c4883c) {
        super(c4883c);
        this.f180752R = new HashMap();
        this.f180753S = new HashMap();
        this.f180754T = new HashMap();
        this.f180755U = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m197827i3() {
        CoreModule.f18272k.f115548p.deleteAll();
        CoreModule.f18272k.f115549q.deleteAll();
        if (gta.m132210e().m132214d().mo34685F4()) {
            CoreModule.f18272k.f115543k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m197838A3(List<Coupon> list) {
        jyb.m147537z(list, new y20() { // from class: l.gsa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106249a.m197842E3((Coupon) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final void m197839B3(List<MonetizationPromotion> list) {
        jyb.m147537z(list, new y20() { // from class: l.hsa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111427a.m197843F3((MonetizationPromotion) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m197840C3(Coupon coupon) {
        this.f180753S.put(coupon.userCouponID, coupon);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m197841D3(Coupon coupon) {
        this.f180753S.put(coupon.f56859id, coupon);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m197842E3(Coupon coupon) {
        String str = coupon.newCustomerPromotionConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            NewCustomerPromotionConfig newCustomerPromotionConfig = NewCustomerPromotionConfig.JSON_ADAPTER.parse(str);
            if (NullChecker.m82486a(newCustomerPromotionConfig)) {
                this.f180754T.put(coupon.f56859id, newCustomerPromotionConfig);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m197843F3(MonetizationPromotion monetizationPromotion) {
        this.f180752R.put(monetizationPromotion.f56859id, monetizationPromotion);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m197844G3(ArrayList arrayList, ArrayList arrayList2) {
        m197839B3(arrayList);
        m197859z3(arrayList2);
        m197838A3(arrayList2);
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f180755U.m137019l(arrayList);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m197845H3() {
        Collection collectionM208674j = CoreModule.f18272k.f115548p.m194659F().m208674j();
        Collection collectionM208674j2 = CoreModule.f18272k.f115549q.m177756F().m208674j();
        final ArrayList arrayList = new ArrayList(collectionM208674j);
        final ArrayList arrayList2 = new ArrayList(collectionM208674j2);
        l51.m152887G(new Runnable() { // from class: l.isa
            @Override // java.lang.Runnable
            public final void run() {
                this.f116634a.m197844G3(arrayList, arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Envelope m197846I3(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34685F4()) {
            rsb.INSTANCE.m182951c(envelope);
        }
        List<Merchandise> listM222761e = this.f91137Q.f20396j0.m31583E4().m222761e();
        List<Merchandise> list = ((CoreData) envelope.getModuleData(CoreData.class)).merchandises;
        if (NullChecker.m82486a(listM222761e) && NullChecker.m82486a(list) && listM222761e.size() != list.size()) {
            CrashHelper.m82479c(new Exception("MerchandiseBS size != MerchandiseDB size"));
        }
        tu2.m192703a("[core][merchandise]", "refreshPromotions mergeNetworkStateIntoLocalState");
        this.f91137Q.m32495w3(envelope, new x20() { // from class: l.tsa
            @Override // p153l.x20
            public final void call() {
                usa.m197827i3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m197847J3(Throwable th) {
        m197853t3();
        m197850M3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ uxj0 m197848K3(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34685F4() && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).merchandises)) {
            CoreModule.f18264c.f20396j0.f20021R.put(ProductCategory.get(ProductCategory.tttVip), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.csa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
                }
            }));
            CoreModule.f18264c.f20396j0.f20021R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.dsa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
                }
            }));
            if (gta.m132210e().m132214d().mo34869k()) {
                CoreModule.f18264c.f20396j0.f20021R.put(ProductCategory.get("svipPicksMembership"), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.esa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                    }
                }));
                CoreModule.f18264c.f20396j0.f20021R.put(ProductCategory.get("picksMembership"), jyb.m147522n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new qcj() { // from class: l.fsa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                    }
                }));
            }
            CoreModule.f18264c.f20396j0.m31583E4().m137019l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        }
        List<Coupon> list = Collections.EMPTY_LIST;
        m197853t3();
        List list2 = !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).monetizationPromotions) ? ((CoreData) envelope.getModuleData(CoreData.class)).monetizationPromotions : list;
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).coupons)) {
            list = ((CoreData) envelope.getModuleData(CoreData.class)).coupons;
        }
        m197839B3(list2);
        m197859z3(list);
        m197838A3(list);
        this.f180755U.m137019l((List<MonetizationPromotion>) list2);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22421c m197849L3(String str) {
        final String strM32185B1 = C4879a.m32185B1();
        if (!TextUtils.isEmpty(str)) {
            strM32185B1 = strM32185B1 + "?" + str;
        }
        return new ti20(new pcj() { // from class: l.osa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(strM32185B1).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.psa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153878a.m197846I3((Envelope) obj);
            }
        }).compose(psd0.m173592C()).doOnError(new y20() { // from class: l.qsa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159266a.m197847J3((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.rsa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164648a.m197848K3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final void m197850M3() {
        l51.m152919y(new Runnable() { // from class: l.ssa
            @Override // java.lang.Runnable
            public final void run() {
                this.f170443a.m197845H3();
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<uxj0> m197851N3() {
        return m197852O3(null);
    }

    /* JADX INFO: renamed from: O3 */
    public C22421c<uxj0> m197852O3(final String str) {
        return this.f91137Q.scheduled(Promotions.TYPE, 0, new pcj() { // from class: l.lsa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133410a.m197849L3(str);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m197853t3() {
        this.f180752R.clear();
        this.f180753S.clear();
        this.f180754T.clear();
    }

    /* JADX INFO: renamed from: u3 */
    public C22421c<Data> m197854u3(String str, String str2) {
        final StringBuilder sb = new StringBuilder("/monetization-promotions/debug?action=add");
        if (!TextUtils.isEmpty(str)) {
            sb.append("&promotion=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&coupon=");
            sb.append(str2);
        }
        return this.f91137Q.scheduled("promotion_coupon_debug_" + str2, 0, new pcj() { // from class: l.bsa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.msa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G(sb.toString())).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                }).map(new qcj() { // from class: l.nsa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: v3 */
    public List<Coupon> m197855v3() {
        return new ArrayList(CoreModule.f18272k.f115549q.m177756F().m208674j());
    }

    /* JADX INFO: renamed from: w3 */
    public NewCustomerPromotionConfig m197856w3(String str) {
        if (TextUtils.isEmpty(str) || this.f180754T.isEmpty()) {
            return null;
        }
        return this.f180754T.get(str);
    }

    /* JADX INFO: renamed from: x3 */
    public C22507a<List<MonetizationPromotion>> m197857x3() {
        return this.f180755U;
    }

    /* JADX INFO: renamed from: y3 */
    public List<MonetizationPromotion> m197858y3() {
        return this.f180755U.m222761e();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m197859z3(List<Coupon> list) {
        if (gta.m132210e().m132214d().mo34685F4()) {
            jyb.m147537z(list, new y20() { // from class: l.jsa
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122444a.m197840C3((Coupon) obj);
                }
            });
        } else {
            jyb.m147537z(list, new y20() { // from class: l.ksa
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128552a.m197841D3((Coupon) obj);
                }
            });
        }
    }
}
