package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IsCoinerDataEnvelope;
import com.p051p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class jan extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<IntlCurrencyDiamond> f118995R;

    /* JADX INFO: renamed from: S */
    public C22507a<Map<SummarizedPrivilegesId, Integer>> f118996S;

    /* JADX INFO: renamed from: T */
    public C22507a<Map<SummarizedPrivilegesId, String>> f118997T;

    /* JADX INFO: renamed from: U */
    public C22507a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f118998U;

    /* JADX INFO: renamed from: V */
    public final p8i0 f118999V;

    /* JADX INFO: renamed from: W */
    public PromotionPrivilegePrices f119000W;

    public jan(C4883c c4883c) {
        super(c4883c);
        this.f118995R = C22507a.m222758b();
        this.f118996S = C22507a.m222758b();
        this.f118997T = C22507a.m222758b();
        this.f118998U = C22507a.m222758b();
        this.f118999V = new p8i0();
    }

    /* JADX INFO: renamed from: V3 */
    private int m144025V3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, Integer> mapM222761e = this.f118996S.m222761e();
        if (mapM222761e == null || !mapM222761e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM222761e.get(summarizedPrivilegesId).intValue();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ SummarizedPrivilegePrice m144030e3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A3, reason: merged with bridge method [inline-methods] */
    public final void m144053J3(Envelope envelope) {
        List<PromotionPrivilegePrices> list;
        if (((CoreData) envelope.getModuleData(CoreData.class)).diamond != null && ((CoreData) envelope.getModuleData(CoreData.class)).diamond.available > 0) {
            this.f118995R.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).diamond);
        }
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices)) {
            return;
        }
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) jyb.m147529r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.t9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f21251id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f119000W = summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        this.f118996S.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.u9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.v9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f118998U.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.w9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.x9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jan.m144030e3((SummarizedPrivilegePrice) obj);
            }
        }));
        this.f118997T.m137019l(jyb.m147502d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new qcj() { // from class: l.y9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f21251id;
            }
        }, new qcj() { // from class: l.z9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).diamondSign;
            }
        }));
    }

    /* JADX INFO: renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void m144050G3(IntlCurrencyDiamond intlCurrencyDiamond) {
        IntlCurrencyDiamond intlCurrencyDiamondM222761e = this.f118995R.m222761e();
        if (!NullChecker.m82486a(intlCurrencyDiamondM222761e)) {
            intlCurrencyDiamondM222761e = IntlCurrencyDiamond.new_();
        }
        intlCurrencyDiamondM222761e.available = Math.max(0L, intlCurrencyDiamond.available);
        intlCurrencyDiamondM222761e.agentAvailable = Math.max(0L, intlCurrencyDiamond.agentAvailable);
        this.f118995R.m137019l(intlCurrencyDiamondM222761e);
    }

    /* JADX INFO: renamed from: C3 */
    public long m144046C3() {
        return this.f118999V.m171246c(this.f118995R.m222761e() == null ? 0L : this.f118995R.m222761e().agentAvailable);
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<IsCurrencyMerchantData> m144047D3() {
        return this.f91137Q.scheduled("isCoiner", 0, new pcj() { // from class: l.aan
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.fan
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/live/wholesaler/diamond/iscoiner")).m209032f().m209028b();
                    }
                }, IsCoinerDataEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.ban
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((IsCoinerDataEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ uxj0 m144048E3(Envelope envelope) {
        m144058O3(((CoreData) envelope.getModuleData(CoreData.class)).diamond);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22421c m144049F3() {
        return qi20.m176654a(new pcj() { // from class: l.gan
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32307h0(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.han
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108509a.m144048E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ uxj0 m144051H3(Envelope envelope) {
        m144060Q3(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22421c m144052I3() {
        return qi20.m176654a(new pcj() { // from class: l.dan
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0(IntlCountryCodeController.m29114k() ? "/summarized-privilege-prices?affiliate=huawei&priceType=diamond" : "/summarized-privilege-prices?affiliate=googleplay&priceType=diamond")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.ean
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92792a.m144051H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public long m144054K3() {
        return this.f118999V.m171246c(this.f118995R.m222761e() == null ? 0L : this.f118995R.m222761e().available);
    }

    /* JADX INFO: renamed from: L3 */
    public int m144055L3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<IntlCurrencyDiamond> m144056M3() {
        return this.f118995R;
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<uxj0> m144057N3() {
        return this.f91137Q.scheduled("refresh_diamond", 0, new pcj() { // from class: l.can
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f80607a.m144049F3();
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final void m144058O3(final IntlCurrencyDiamond intlCurrencyDiamond) {
        l51.m152893M(new Runnable() { // from class: l.s9n
            @Override // java.lang.Runnable
            public final void run() {
                this.f166956a.m144050G3(intlCurrencyDiamond);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<uxj0> m144059P3() {
        return this.f91137Q.scheduled("refreshMyDiamonds", 0, new pcj() { // from class: l.r9n
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f161837a.m144052I3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public void m144060Q3(final Envelope envelope) {
        l51.m152893M(new Runnable() { // from class: l.ian
            @Override // java.lang.Runnable
            public final void run() {
                this.f113607a.m144053J3(envelope);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public synchronized void m144061R3(Long l2) {
        this.f118999V.m171248f(l2);
    }

    /* JADX INFO: renamed from: S3 */
    public synchronized Long m144062S3(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f118999V.m171247d(str, m144025V3(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: T3 */
    public int m144063T3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
    }

    /* JADX INFO: renamed from: U3 */
    public int m144064U3() {
        return m144025V3(SummarizedPrivilegesId.get("superLike"));
    }

    /* JADX INFO: renamed from: s3 */
    public int m144065s3() {
        return m144025V3(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: t3 */
    public int m144066t3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMatch));
    }

    /* JADX INFO: renamed from: u3 */
    public int m144067u3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMemojiMatch));
    }

    /* JADX INFO: renamed from: v3 */
    public int m144068v3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVideoMatch));
    }

    /* JADX INFO: renamed from: w3 */
    public int m144069w3() {
        return m144025V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVoiceMatch));
    }

    /* JADX INFO: renamed from: x3 */
    public String m144070x3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, String> mapM222761e = this.f118997T.m222761e();
        return mapM222761e == null ? "" : mapM222761e.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: y3 */
    public String m144071y3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f119000W;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.diamondSign;
    }

    /* JADX INFO: renamed from: z3 */
    public int m144072z3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f119000W;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }
}
