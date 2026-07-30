package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.PromotionPrivilegePrices;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IsCoinerDataEnvelope;
import com.p046p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class j8n extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<IntlCurrencyDiamond> f116727R;

    /* JADX INFO: renamed from: S */
    public C22392a<Map<SummarizedPrivilegesId, Integer>> f116728S;

    /* JADX INFO: renamed from: T */
    public C22392a<Map<SummarizedPrivilegesId, String>> f116729T;

    /* JADX INFO: renamed from: U */
    public C22392a<Map<SummarizedPrivilegesId, SummarizedPrivilegePrice>> f116730U;

    /* JADX INFO: renamed from: V */
    public final h0i0 f116731V;

    /* JADX INFO: renamed from: W */
    public PromotionPrivilegePrices f116732W;

    public j8n(C4732c c4732c) {
        super(c4732c);
        this.f116727R = C22392a.m221512b();
        this.f116728S = C22392a.m221512b();
        this.f116729T = C22392a.m221512b();
        this.f116730U = C22392a.m221512b();
        this.f116731V = new h0i0();
    }

    /* JADX INFO: renamed from: V3 */
    private int m140228V3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, Integer> mapM221515e = this.f116728S.m221515e();
        if (mapM221515e == null || !mapM221515e.containsKey(summarizedPrivilegesId)) {
            return 0;
        }
        return mapM221515e.get(summarizedPrivilegesId).intValue();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ SummarizedPrivilegePrice m140233e3(SummarizedPrivilegePrice summarizedPrivilegePrice) {
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: A3, reason: merged with bridge method [inline-methods] */
    public final void m140256J3(Envelope envelope) {
        List<PromotionPrivilegePrices> list;
        if (((CoreData) envelope.getModuleData(CoreData.class)).diamond != null && ((CoreData) envelope.getModuleData(CoreData.class)).diamond.available > 0) {
            this.f116727R.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).diamond);
        }
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices)) {
            return;
        }
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) vwb.m200346r(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.t7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((SummarizedPrivilegePrice) obj).f20509id, "boost"));
            }
        });
        if (summarizedPrivilegePrice != null && (list = summarizedPrivilegePrice.promotionPrivilegePrices) != null && !list.isEmpty()) {
            this.f116732W = summarizedPrivilegePrice.promotionPrivilegePrices.get(0);
        }
        this.f116728S.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.u7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.v7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((SummarizedPrivilegePrice) obj).unitPrice);
            }
        }));
        this.f116730U.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.w7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.x7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j8n.m140233e3((SummarizedPrivilegePrice) obj);
            }
        }));
        this.f116729T.m132487l(vwb.m200319d(((CoreData) envelope.getModuleData(CoreData.class)).summarizedPrivilegePrices, new w9j() { // from class: l.y7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).f20509id;
            }
        }, new w9j() { // from class: l.z7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((SummarizedPrivilegePrice) obj).diamondSign;
            }
        }));
    }

    /* JADX INFO: renamed from: B3, reason: merged with bridge method [inline-methods] */
    public final void m140253G3(IntlCurrencyDiamond intlCurrencyDiamond) {
        IntlCurrencyDiamond intlCurrencyDiamondM221515e = this.f116727R.m221515e();
        if (!NullChecker.m81303a(intlCurrencyDiamondM221515e)) {
            intlCurrencyDiamondM221515e = IntlCurrencyDiamond.new_();
        }
        intlCurrencyDiamondM221515e.available = Math.max(0L, intlCurrencyDiamond.available);
        intlCurrencyDiamondM221515e.agentAvailable = Math.max(0L, intlCurrencyDiamond.agentAvailable);
        this.f116727R.m132487l(intlCurrencyDiamondM221515e);
    }

    /* JADX INFO: renamed from: C3 */
    public long m140249C3() {
        return this.f116731V.m128956c(this.f116727R.m221515e() == null ? 0L : this.f116727R.m221515e().agentAvailable);
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<IsCurrencyMerchantData> m140250D3() {
        return this.f72126Q.scheduled("isCoiner", 0, new v9j() { // from class: l.a8n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.f8n
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/live/wholesaler/diamond/iscoiner")).m185887f().m185883b();
                    }
                }, IsCoinerDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.b8n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((IsCoinerDataEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ roj0 m140251E3(Envelope envelope) {
        m140261O3(((CoreData) envelope.getModuleData(CoreData.class)).diamond);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ C22306c m140252F3() {
        return ia20.m135117a(new v9j() { // from class: l.g8n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31304h0(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.h8n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106454a.m140251E3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ roj0 m140254H3(Envelope envelope) {
        m140263Q3(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22306c m140255I3() {
        return ia20.m135117a(new v9j() { // from class: l.d8n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0(IntlCountryCodeController.m28115k() ? "/summarized-privilege-prices?affiliate=huawei&priceType=diamond" : "/summarized-privilege-prices?affiliate=googleplay&priceType=diamond")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.e8n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f89839a.m140254H3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public long m140257K3() {
        return this.f116731V.m128956c(this.f116727R.m221515e() == null ? 0L : this.f116727R.m221515e().available);
    }

    /* JADX INFO: renamed from: L3 */
    public int m140258L3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<IntlCurrencyDiamond> m140259M3() {
        return this.f116727R;
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<roj0> m140260N3() {
        return this.f72126Q.scheduled("refresh_diamond", 0, new v9j() { // from class: l.c8n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79774a.m140252F3();
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final void m140261O3(final IntlCurrencyDiamond intlCurrencyDiamond) {
        e51.m114748M(new Runnable() { // from class: l.s7n
            @Override // java.lang.Runnable
            public final void run() {
                this.f162922a.m140253G3(intlCurrencyDiamond);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<roj0> m140262P3() {
        return this.f72126Q.scheduled("refreshMyDiamonds", 0, new v9j() { // from class: l.r7n
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158050a.m140255I3();
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public void m140263Q3(final Envelope envelope) {
        e51.m114748M(new Runnable() { // from class: l.i8n
            @Override // java.lang.Runnable
            public final void run() {
                this.f112056a.m140256J3(envelope);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public synchronized void m140264R3(Long l2) {
        this.f116731V.m128958f(l2);
    }

    /* JADX INFO: renamed from: S3 */
    public synchronized Long m140265S3(String str, SummarizedPrivilegesId summarizedPrivilegesId) {
        return this.f116731V.m128957d(str, m140228V3(summarizedPrivilegesId));
    }

    /* JADX INFO: renamed from: T3 */
    public int m140266T3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.spotLight));
    }

    /* JADX INFO: renamed from: U3 */
    public int m140267U3() {
        return m140228V3(SummarizedPrivilegesId.get("superLike"));
    }

    /* JADX INFO: renamed from: s3 */
    public int m140268s3() {
        return m140228V3(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: t3 */
    public int m140269t3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMatch));
    }

    /* JADX INFO: renamed from: u3 */
    public int m140270u3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzMemojiMatch));
    }

    /* JADX INFO: renamed from: v3 */
    public int m140271v3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVideoMatch));
    }

    /* JADX INFO: renamed from: w3 */
    public int m140272w3() {
        return m140228V3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.buzzVoiceMatch));
    }

    /* JADX INFO: renamed from: x3 */
    public String m140273x3(SummarizedPrivilegesId summarizedPrivilegesId) {
        Map<SummarizedPrivilegesId, String> mapM221515e = this.f116729T.m221515e();
        return mapM221515e == null ? "" : mapM221515e.get(summarizedPrivilegesId);
    }

    /* JADX INFO: renamed from: y3 */
    public String m140274y3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f116732W;
        return promotionPrivilegePrices == null ? "" : promotionPrivilegePrices.diamondSign;
    }

    /* JADX INFO: renamed from: z3 */
    public int m140275z3() {
        PromotionPrivilegePrices promotionPrivilegePrices = this.f116732W;
        if (promotionPrivilegePrices == null) {
            return 0;
        }
        return promotionPrivilegePrices.price;
    }
}
