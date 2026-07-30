package p149l;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotion;
import com.p046p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Promotions;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class ira extends ax6 {

    /* JADX INFO: renamed from: R */
    public final Map<String, MonetizationPromotion> f114603R;

    /* JADX INFO: renamed from: S */
    public final Map<String, Coupon> f114604S;

    /* JADX INFO: renamed from: T */
    public final Map<String, NewCustomerPromotionConfig> f114605T;

    /* JADX INFO: renamed from: U */
    public final C22392a<List<MonetizationPromotion>> f114606U;

    public ira(C4732c c4732c) {
        super(c4732c);
        this.f114603R = new HashMap();
        this.f114604S = new HashMap();
        this.f114605T = new HashMap();
        this.f114606U = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m137840i3() {
        CoreModule.f17553k.f91953p.deleteAll();
        CoreModule.f17553k.f91954q.deleteAll();
        if (ura.m195053e().m195057d().mo33682F4()) {
            CoreModule.f17553k.f91948k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m137851A3(List<Coupon> list) {
        vwb.m200354z(list, new e30() { // from class: l.uqa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177733a.m137855E3((Coupon) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final void m137852B3(List<MonetizationPromotion> list) {
        vwb.m200354z(list, new e30() { // from class: l.vqa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182619a.m137856F3((MonetizationPromotion) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m137853C3(Coupon coupon) {
        this.f114604S.put(coupon.userCouponID, coupon);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m137854D3(Coupon coupon) {
        this.f114604S.put(coupon.f56011id, coupon);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m137855E3(Coupon coupon) {
        String str = coupon.newCustomerPromotionConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            NewCustomerPromotionConfig newCustomerPromotionConfig = NewCustomerPromotionConfig.JSON_ADAPTER.parse(str);
            if (NullChecker.m81303a(newCustomerPromotionConfig)) {
                this.f114605T.put(coupon.f56011id, newCustomerPromotionConfig);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m137856F3(MonetizationPromotion monetizationPromotion) {
        this.f114603R.put(monetizationPromotion.f56011id, monetizationPromotion);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m137857G3(ArrayList arrayList, ArrayList arrayList2) {
        m137852B3(arrayList);
        m137872z3(arrayList2);
        m137851A3(arrayList2);
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f114606U.m132487l(arrayList);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m137858H3() {
        Collection collectionM165617j = CoreModule.f17553k.f91953p.m177026F().m165617j();
        Collection collectionM165617j2 = CoreModule.f17553k.f91954q.m108352F().m165617j();
        final ArrayList arrayList = new ArrayList(collectionM165617j);
        final ArrayList arrayList2 = new ArrayList(collectionM165617j2);
        e51.m114742G(new Runnable() { // from class: l.wqa
            @Override // java.lang.Runnable
            public final void run() {
                this.f187670a.m137857G3(arrayList, arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Envelope m137859I3(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33682F4()) {
            drb.INSTANCE.m113292c(envelope);
        }
        List<Merchandise> listM221515e = this.f72126Q.f19654j0.m30580E4().m221515e();
        List<Merchandise> list = ((CoreData) envelope.getModuleData(CoreData.class)).merchandises;
        if (NullChecker.m81303a(listM221515e) && NullChecker.m81303a(list) && listM221515e.size() != list.size()) {
            CrashHelper.m81296c(new Exception("MerchandiseBS size != MerchandiseDB size"));
        }
        du2.m113670a("[core][merchandise]", "refreshPromotions mergeNetworkStateIntoLocalState");
        this.f72126Q.m31492w3(envelope, new d30() { // from class: l.hra
            @Override // p149l.d30
            public final void call() {
                ira.m137840i3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m137860J3(Throwable th) {
        m137866t3();
        m137863M3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m137861K3(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33682F4() && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).merchandises)) {
            CoreModule.f17545c.f19654j0.f19279R.put(ProductCategory.get(ProductCategory.tttVip), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.qqa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttVip));
                }
            }));
            CoreModule.f17545c.f19654j0.f19279R.put(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.rqa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, ProductCategory.tttSeeWhoLikedMe));
                }
            }));
            if (ura.m195053e().m195057d().mo33866k()) {
                CoreModule.f17545c.f19654j0.f19279R.put(ProductCategory.get("svipPicksMembership"), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.sqa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                    }
                }));
                CoreModule.f17545c.f19654j0.f19279R.put(ProductCategory.get("picksMembership"), vwb.m200339n(((CoreData) envelope.getModuleData(CoreData.class)).merchandises, new w9j() { // from class: l.tqa
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                    }
                }));
            }
            CoreModule.f17545c.f19654j0.m30580E4().m132487l(((CoreData) envelope.getModuleData(CoreData.class)).merchandises);
        }
        List<Coupon> list = Collections.EMPTY_LIST;
        m137866t3();
        List list2 = !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).monetizationPromotions) ? ((CoreData) envelope.getModuleData(CoreData.class)).monetizationPromotions : list;
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).coupons)) {
            list = ((CoreData) envelope.getModuleData(CoreData.class)).coupons;
        }
        m137852B3(list2);
        m137872z3(list);
        m137851A3(list);
        this.f114606U.m132487l((List<MonetizationPromotion>) list2);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22306c m137862L3(String str) {
        final String strM31182B1 = C4728a.m31182B1();
        if (!TextUtils.isEmpty(str)) {
            strM31182B1 = strM31182B1 + "?" + str;
        }
        return new la20(new v9j() { // from class: l.cra
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(strM31182B1).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.dra
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f87601a.m137859I3((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).doOnError(new e30() { // from class: l.era
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92897a.m137860J3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.fra
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98914a.m137861K3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final void m137863M3() {
        e51.m114774y(new Runnable() { // from class: l.gra
            @Override // java.lang.Runnable
            public final void run() {
                this.f104037a.m137858H3();
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<roj0> m137864N3() {
        return m137865O3(null);
    }

    /* JADX INFO: renamed from: O3 */
    public C22306c<roj0> m137865O3(final String str) {
        return this.f72126Q.scheduled(Promotions.TYPE, 0, new v9j() { // from class: l.zqa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204365a.m137862L3(str);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m137866t3() {
        this.f114603R.clear();
        this.f114604S.clear();
        this.f114605T.clear();
    }

    /* JADX INFO: renamed from: u3 */
    public C22306c<Data> m137867u3(String str, String str2) {
        final StringBuilder sb = new StringBuilder("/monetization-promotions/debug?action=add");
        if (!TextUtils.isEmpty(str)) {
            sb.append("&promotion=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&coupon=");
            sb.append(str2);
        }
        return this.f72126Q.scheduled("promotion_coupon_debug_" + str2, 0, new v9j() { // from class: l.pqa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ara
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G(sb.toString())).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                }).map(new w9j() { // from class: l.bra
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: v3 */
    public List<Coupon> m137868v3() {
        return new ArrayList(CoreModule.f17553k.f91954q.m108352F().m165617j());
    }

    /* JADX INFO: renamed from: w3 */
    public NewCustomerPromotionConfig m137869w3(String str) {
        if (TextUtils.isEmpty(str) || this.f114605T.isEmpty()) {
            return null;
        }
        return this.f114605T.get(str);
    }

    /* JADX INFO: renamed from: x3 */
    public C22392a<List<MonetizationPromotion>> m137870x3() {
        return this.f114606U;
    }

    /* JADX INFO: renamed from: y3 */
    public List<MonetizationPromotion> m137871y3() {
        return this.f114606U.m221515e();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m137872z3(List<Coupon> list) {
        if (ura.m195053e().m195057d().mo33682F4()) {
            vwb.m200354z(list, new e30() { // from class: l.xqa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193992a.m137853C3((Coupon) obj);
                }
            });
        } else {
            vwb.m200354z(list, new e30() { // from class: l.yqa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199540a.m137854D3((Coupon) obj);
                }
            });
        }
    }
}
