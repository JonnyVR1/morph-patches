package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IsCoinerDataEnvelope;
import com.p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.e51;
import l.h0i0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j8n extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<IntlCurrencyDiamond> f15058R;

    /* JADX INFO: renamed from: S */
    public a<Map<SummarizedPrivilegesId, Integer>> f15059S;

    /* JADX INFO: renamed from: T */
    public a<Map<SummarizedPrivilegesId, String>> f15060T;

    /* JADX INFO: renamed from: U */
    public a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f15061U;

    /* JADX INFO: renamed from: V */
    public final h0i0 f15062V;

    /* JADX INFO: renamed from: W */
    public PromotionPrivilegePrices f15063W;

    public j8n(C0158c c0158c) {
        super(c0158c);
        this.f15058R = a.b();
        this.f15059S = a.b();
        this.f15060T = a.b();
        this.f15061U = a.b();
        this.f15062V = new h0i0();
    }

    /* JADX INFO: renamed from: V3 */
    private int m17344V3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map map = (Map) this.f15059S.e();
        if (map == null || !map.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return ((Integer) map.get(summarizedPrivilegesId)).intValue();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ SummarizedPrivilegePrice m17349e3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A3, reason: merged with bridge method [inline-methods] */
    public final void m17372J3(Envelope envelope) {
        List list;
        if (envelope.getModuleData(CoreData.class).diamond != null && envelope.getModuleData(CoreData.class).diamond.available > 0) {
            this.f15058R.onNext(envelope.getModuleData(CoreData.class).diamond);
        }
        if (vwb.J(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices)) {
            return;
        }
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) vwb.r(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.t7n
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f15063W = (PromotionPrivilegePrices) summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        this.f15059S.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.u7n
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.v7n
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f15061U.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.w7n
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.x7n
            public final Object call(Object obj) {
                return j8n.m17349e3((SummarizedPrivilegePrice) obj);
            }
        }));
        this.f15060T.onNext(vwb.d(envelope.getModuleData(CoreData.class).summarizedPrivilegePrices, new w9j() { // from class: l.y7n
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).id;
            }
        }, new w9j() { // from class: l.z7n
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).diamondSign;
            }
        }));
    }

    /* JADX INFO: renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void m17369G3(IntlCurrencyDiamond intlCurrencyDiamond) {
        IntlCurrencyDiamond intlCurrencyDiamondNew_ = (IntlCurrencyDiamond) this.f15058R.e();
        if (!NullChecker.a(intlCurrencyDiamondNew_)) {
            intlCurrencyDiamondNew_ = IntlCurrencyDiamond.new_();
        }
        intlCurrencyDiamondNew_.available = Math.max(0L, intlCurrencyDiamond.available);
        intlCurrencyDiamondNew_.agentAvailable = Math.max(0L, intlCurrencyDiamond.agentAvailable);
        this.f15058R.onNext(intlCurrencyDiamondNew_);
    }

    /* JADX INFO: renamed from: C3 */
    public long m17365C3() {
        return this.f15062V.c(this.f15058R.e() == null ? 0L : ((IntlCurrencyDiamond) this.f15058R.e()).agentAvailable);
    }

    /* JADX INFO: renamed from: D3 */
    public c<IsCurrencyMerchantData> m17366D3() {
        return this.f8580Q.scheduled("isCoiner", 0, new v9j() { // from class: l.a8n
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.f8n
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/live/wholesaler/diamond/iscoiner")).f().b();
                    }
                }, IsCoinerDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.b8n
            public final Object call(Object obj) {
                return ((IsCoinerDataEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m17367E3(Envelope envelope) {
        m17377O3(envelope.getModuleData(CoreData.class).diamond);
        return roj0.a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ c m17368F3() {
        return ia20.m16567a(new v9j() { // from class: l.g8n
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3234h0(CoreModule.m1850H().userId())).f().b();
            }
        }).map(new w9j() { // from class: l.h8n
            public final Object call(Object obj) {
                return this.f13743a.m17367E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ roj0 m17370H3(Envelope envelope) {
        m17379Q3(envelope);
        return roj0.a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ c m17371I3() {
        return ia20.m16567a(new v9j() { // from class: l.d8n
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0(IntlCountryCodeController.m10k() ? "/summarized-privilege-prices?affiliate=huawei&priceType=diamond" : "/summarized-privilege-prices?affiliate=googleplay&priceType=diamond")).f().b();
            }
        }).map(new w9j() { // from class: l.e8n
            public final Object call(Object obj) {
                return this.f10849a.m17370H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public long m17373K3() {
        return this.f15062V.c(this.f15058R.e() == null ? 0L : ((IntlCurrencyDiamond) this.f15058R.e()).available);
    }

    /* JADX INFO: renamed from: L3 */
    public int m17374L3() {
        return m17344V3(SummarizedPrivilegesId.get("minBoost"));
    }

    /* JADX INFO: renamed from: M3 */
    public c<IntlCurrencyDiamond> m17375M3() {
        return this.f15058R;
    }

    /* JADX INFO: renamed from: N3 */
    public c<roj0> m17376N3() {
        return this.f8580Q.scheduled("refresh_diamond", 0, new v9j() { // from class: l.c8n
            public final Object call() {
                return this.f9495a.m17368F3();
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final void m17377O3(final IntlCurrencyDiamond intlCurrencyDiamond) {
        e51.M(new Runnable() { // from class: l.s7n
            @Override // java.lang.Runnable
            public final void run() {
                this.f21132a.m17369G3(intlCurrencyDiamond);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public c<roj0> m17378P3() {
        return this.f8580Q.scheduled("refreshMyDiamonds", 0, new v9j() { // from class: l.r7n
            public final Object call() {
                return this.f20398a.m17371I3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public void m17379Q3(final Envelope envelope) {
        e51.M(new Runnable() { // from class: l.i8n
            @Override // java.lang.Runnable
            public final void run() {
                this.f14310a.m17372J3(envelope);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public synchronized void m17380R3(Long l2) {
        this.f15062V.f(l2);
    }

    /* JADX INFO: renamed from: S3 */
    public synchronized Long m17381S3(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f15062V.d(str, m17344V3(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: T3 */
    public int m17382T3() {
        return m17344V3(SummarizedPrivilegesId.get("spotLight"));
    }

    /* JADX INFO: renamed from: U3 */
    public int m17383U3() {
        return m17344V3(SummarizedPrivilegesId.get("superLike"));
    }

    /* JADX INFO: renamed from: s3 */
    public int m17384s3() {
        return m17344V3(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: t3 */
    public int m17385t3() {
        return m17344V3(SummarizedPrivilegesId.get("buzzMatch"));
    }

    /* JADX INFO: renamed from: u3 */
    public int m17386u3() {
        return m17344V3(SummarizedPrivilegesId.get("buzzMemojiMatch"));
    }

    /* JADX INFO: renamed from: v3 */
    public int m17387v3() {
        return m17344V3(SummarizedPrivilegesId.get("buzzVideoMatch"));
    }

    /* JADX INFO: renamed from: w3 */
    public int m17388w3() {
        return m17344V3(SummarizedPrivilegesId.get("buzzVoiceMatch"));
    }

    /* JADX INFO: renamed from: x3 */
    public String m17389x3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map map = (Map) this.f15060T.e();
        return map == null ? "" : (String) map.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: y3 */
    public String m17390y3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f15063W;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.diamondSign;
    }

    /* JADX INFO: renamed from: z3 */
    public int m17391z3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f15063W;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }
}
