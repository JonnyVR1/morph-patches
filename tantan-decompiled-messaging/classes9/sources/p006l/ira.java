package p006l;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.MonetizationPromotion;
import com.p1.mobile.putong.core.data.NewCustomerPromotionConfig;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.drb;
import l.du2;
import l.e30;
import l.e51;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ira extends ax6 {

    /* JADX INFO: renamed from: R */
    public final Map<String, MonetizationPromotion> f14716R;

    /* JADX INFO: renamed from: S */
    public final Map<String, Coupon> f14717S;

    /* JADX INFO: renamed from: T */
    public final Map<String, NewCustomerPromotionConfig> f14718T;

    /* JADX INFO: renamed from: U */
    public final a<List<MonetizationPromotion>> f14719U;

    public ira(C0158c c0158c) {
        super(c0158c);
        this.f14716R = new HashMap();
        this.f14717S = new HashMap();
        this.f14718T = new HashMap();
        this.f14719U = a.b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ void m16917i3() {
        CoreModule.f1542k.f11208p.deleteAll();
        CoreModule.f1542k.f11209q.deleteAll();
        if (ura.m25555e().m25559d().m5619F4()) {
            CoreModule.f1542k.f11203k.deleteAll();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m16928A3(List<Coupon> list) {
        vwb.z(list, new e30() { // from class: l.uqa
            public final void call(Object obj) {
                this.f23706a.m16932E3((Coupon) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final void m16929B3(List<MonetizationPromotion> list) {
        vwb.z(list, new e30() { // from class: l.vqa
            public final void call(Object obj) {
                this.f24417a.m16933F3((MonetizationPromotion) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m16930C3(Coupon coupon) {
        this.f14717S.put(coupon.userCouponID, coupon);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m16931D3(Coupon coupon) {
        this.f14717S.put(((DbObject) coupon).id, coupon);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m16932E3(Coupon coupon) {
        String str = coupon.newCustomerPromotionConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            NewCustomerPromotionConfig newCustomerPromotionConfig = (NewCustomerPromotionConfig) NewCustomerPromotionConfig.JSON_ADAPTER.parse(str);
            if (NullChecker.a(newCustomerPromotionConfig)) {
                this.f14718T.put(((DbObject) coupon).id, newCustomerPromotionConfig);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m16933F3(MonetizationPromotion monetizationPromotion) {
        this.f14716R.put(((DbObject) monetizationPromotion).id, monetizationPromotion);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m16934G3(ArrayList arrayList, ArrayList arrayList2) {
        m16929B3(arrayList);
        m16949z3(arrayList2);
        m16928A3(arrayList2);
        if (vwb.J(arrayList)) {
            return;
        }
        this.f14719U.onNext(arrayList);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m16935H3() {
        List listJ = CoreModule.f1542k.f11208p.m22514F().j();
        List listJ2 = CoreModule.f1542k.f11209q.m13617F().j();
        final ArrayList arrayList = new ArrayList(listJ);
        final ArrayList arrayList2 = new ArrayList(listJ2);
        e51.G(new Runnable() { // from class: l.wqa
            @Override // java.lang.Runnable
            public final void run() {
                this.f25314a.m16934G3(arrayList, arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ Envelope m16936I3(Envelope envelope) {
        if (ura.m25555e().m25559d().m5619F4()) {
            drb.INSTANCE.c(envelope);
        }
        List list = (List) this.f8580Q.f3643j0.m2508E4().e();
        List list2 = envelope.getModuleData(CoreData.class).merchandises;
        if (NullChecker.a(list) && NullChecker.a(list2) && list.size() != list2.size()) {
            CrashHelper.c(new Exception("MerchandiseBS size != MerchandiseDB size"));
        }
        du2.a("[core][merchandise]", "refreshPromotions mergeNetworkStateIntoLocalState");
        this.f8580Q.m3422w3(envelope, new d30() { // from class: l.hra
            public final void call() {
                ira.m16917i3();
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m16937J3(Throwable th) {
        m16943t3();
        m16940M3();
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m16938K3(Envelope envelope) {
        if (ura.m25555e().m25559d().m5619F4() && !vwb.J(envelope.getModuleData(CoreData.class).merchandises)) {
            CoreModule.f1534c.f3643j0.f3268R.put(ProductCategory.get("tttVip"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.qqa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttVip"));
                }
            }));
            CoreModule.f1534c.f3643j0.f3268R.put(ProductCategory.get("tttSeeWhoLikedMe"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.rqa
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "tttSeeWhoLikedMe"));
                }
            }));
            if (ura.m25555e().m25559d().m5803k()) {
                CoreModule.f1534c.f3643j0.f3268R.put(ProductCategory.get("svipPicksMembership"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.sqa
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "svipPicksMembership"));
                    }
                }));
                CoreModule.f1534c.f3643j0.f3268R.put(ProductCategory.get("picksMembership"), vwb.n(envelope.getModuleData(CoreData.class).merchandises, new w9j() { // from class: l.tqa
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TEnum.equals(((Merchandise) obj).category, "picksMembership"));
                    }
                }));
            }
            CoreModule.f1534c.f3643j0.m2508E4().onNext(envelope.getModuleData(CoreData.class).merchandises);
        }
        List<MonetizationPromotion> list = Collections.EMPTY_LIST;
        m16943t3();
        List<MonetizationPromotion> list2 = !vwb.J(envelope.getModuleData(CoreData.class).monetizationPromotions) ? envelope.getModuleData(CoreData.class).monetizationPromotions : list;
        if (!vwb.J(envelope.getModuleData(CoreData.class).coupons)) {
            list = envelope.getModuleData(CoreData.class).coupons;
        }
        m16929B3(list2);
        m16949z3(list);
        m16928A3(list);
        this.f14719U.onNext(list2);
        return roj0.a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ c m16939L3(String str) {
        final String strM3112B1 = C0154a.m3112B1();
        if (!TextUtils.isEmpty(str)) {
            strM3112B1 = strM3112B1 + "?" + str;
        }
        return new la20(new v9j() { // from class: l.cra
            public final Object call() {
                return C0154a.f3483P.auth().q(strM3112B1).f().b();
            }
        }).map(new w9j() { // from class: l.dra
            public final Object call(Object obj) {
                return this.f10538a.m16936I3((Envelope) obj);
            }
        }).compose(mkd0.C()).doOnError(new e30() { // from class: l.era
            public final void call(Object obj) {
                this.f11412a.m16937J3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.fra
            public final Object call(Object obj) {
                return this.f12870a.m16938K3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final void m16940M3() {
        e51.y(new Runnable() { // from class: l.gra
            @Override // java.lang.Runnable
            public final void run() {
                this.f13457a.m16935H3();
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public c<roj0> m16941N3() {
        return m16942O3(null);
    }

    /* JADX INFO: renamed from: O3 */
    public c<roj0> m16942O3(final String str) {
        return this.f8580Q.scheduled("promotions", 0, new v9j() { // from class: l.zqa
            public final Object call() {
                return this.f28911a.m16939L3(str);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m16943t3() {
        this.f14716R.clear();
        this.f14717S.clear();
        this.f14718T.clear();
    }

    /* JADX INFO: renamed from: u3 */
    public c<Data> m16944u3(String str, String str2) {
        final StringBuilder sb = new StringBuilder("/monetization-promotions/debug?action=add");
        if (!TextUtils.isEmpty(str)) {
            sb.append("&promotion=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&coupon=");
            sb.append(str2);
        }
        return this.f8580Q.scheduled("promotion_coupon_debug_" + str2, 0, new v9j() { // from class: l.pqa
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ara
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G(sb.toString())).l(utc0.create(Network.JSON, "")).b();
                    }
                }).map(new w9j() { // from class: l.bra
                    public final Object call(Object obj) {
                        return ((Envelope) obj).data;
                    }
                });
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: v3 */
    public List<Coupon> m16945v3() {
        return new ArrayList(CoreModule.f1542k.f11209q.m13617F().j());
    }

    /* JADX INFO: renamed from: w3 */
    public NewCustomerPromotionConfig m16946w3(String str) {
        if (TextUtils.isEmpty(str) || this.f14718T.isEmpty()) {
            return null;
        }
        return this.f14718T.get(str);
    }

    /* JADX INFO: renamed from: x3 */
    public a<List<MonetizationPromotion>> m16947x3() {
        return this.f14719U;
    }

    /* JADX INFO: renamed from: y3 */
    public List<MonetizationPromotion> m16948y3() {
        return (List) this.f14719U.e();
    }

    /* JADX INFO: renamed from: z3 */
    public final void m16949z3(List<Coupon> list) {
        if (ura.m25555e().m25559d().m5619F4()) {
            vwb.z(list, new e30() { // from class: l.xqa
                public final void call(Object obj) {
                    this.f27681a.m16930C3((Coupon) obj);
                }
            });
        } else {
            vwb.z(list, new e30() { // from class: l.yqa
                public final void call(Object obj) {
                    this.f28345a.m16931D3((Coupon) obj);
                }
            });
        }
    }
}
