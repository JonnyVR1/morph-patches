package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class gdn extends pl2 {

    /* JADX INFO: renamed from: s */
    public final hpd0 f102124s;

    public gdn(bsm bsmVar) {
        super(bsmVar);
        this.f102124s = new hpd0("intl_live_first_charge_" + qib0.f154713b0.f139230a.userId(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J4 */
    public void m125566J4(final BLiveMerchandise bLiveMerchandise, final int i) {
        ypv.f199493a.m199342e(act(), bLiveMerchandise, new d30() { // from class: l.cdn
            @Override // p149l.d30
            public final void call() {
                this.f80382a.m125568L4(i, bLiveMerchandise);
            }
        }, new d30() { // from class: l.ddn
            @Override // p149l.d30
            public final void call() {
                this.f85610a.m170104n4();
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public void m125567K4() {
        duringCreated(qib0.f154713b0.f139231b.getTPayResultBs()).subscribe(ffw.m121194e(new e30() { // from class: l.xcn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192244a.m125570N4((xaj0) obj);
            }
        }, new e30() { // from class: l.ycn
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46873Ob));
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m125568L4(int i, BLiveMerchandise bLiveMerchandise) {
        mo151756o4(i, true);
        sgj.m184100m(bLiveMerchandise.quantity);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22306c m125569M4(List list) {
        return ypv.f199493a.m199328U(act(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m125570N4(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.f191751a).intValue() == 0) {
            mo151756o4(((Integer) xaj0Var.f191752b).intValue(), true);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m125571O4(pge0 pge0Var, int i, String str, nig nigVar, PaymentData paymentData) {
        act().progressDismiss();
        if (!paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCOutName()) && !paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCodaName())) {
            m170110x4(nigVar);
            m170091A4(nigVar, "0");
        } else {
            if (pge0Var != null) {
                lsi0.m151595y(ypv.f199497e.getString(u6n.m192015a() ? R$string.f46852Nb : R$string.f46579B0));
            }
            m125573Q4(i, pge0Var, str, paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCOutName()));
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m125572P4(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m125573Q4(int i, pge0 pge0Var, String str, boolean z) {
        zfv.m218577k1().subscribe(ffw.m121192c());
        this.f150057m = pge0Var;
        this.f150059o = i;
        this.f150060p = str;
        m206031K2().m182470m(LiveDialogEnum.WEBVIEW);
        qib0.f154713b0.f139231b.skipH5PayActivityFromLive(act(), str, z);
        List<BLiveMerchandise> listM170094a4 = m170094a4();
        String strM218630b = zgc0.m218630b(str, m206032L2());
        this.f150061q = strM218630b;
        zgc0.m218637i(strM218630b, listM170094a4, this.f150053i, "0");
    }

    @Override // p149l.pl2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m125567K4();
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo125574V3(List<BLiveMerchandise> list) {
        if (list.size() == 7) {
            if (this.f102124s.get().booleanValue() && ypv.f199493a.m199314G()) {
                list.remove(1);
                return list;
            }
            list.remove(0);
        }
        return list;
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: W3 */
    public C22306c<List<BLiveMerchandise>> mo125575W3() {
        return C22306c.just(ypv.f199493a.m199352j()).flatMap(new w9j() { // from class: l.zcn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ypv.f199493a.m199343e0((String) obj, false);
            }
        }).filter(new w9j() { // from class: l.adn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.bdn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75044a.m125569M4((List) obj);
            }
        });
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: X3 */
    public C22306c<BLiveMerchandise> mo125576X3() {
        return C22306c.just(null);
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: Y3 */
    public C22306c<BLiveData> mo125577Y3() {
        return C22306c.just(null);
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: l4 */
    public void mo125578l4(pl2.C19263b c19263b) {
        if (c19263b.f150069e != null) {
            qib0.m174815e1("tantancoin_purchase_click", new Object[0]);
            m125566J4(c19263b.f150069e, c19263b.f150068d);
            zgc0.m218638j(c19263b.f150065a);
        }
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: p4 */
    public void mo125579p4() {
        if (this.f102124s.get().booleanValue()) {
            this.f102124s.put(Boolean.FALSE);
            ((al2) this.viewModel).m97252V(m170092U3(this.f150055k, this.f150056l, this.f150058n));
        }
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: u4 */
    public void mo125580u4() {
        mo51532C(new vcn());
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: v4 */
    public void mo125581v4(final nig nigVar) {
        if (IntlCountryCodeController.m28115k()) {
            Act act = this.f188513f;
            kkp0.m146350c(act, act.pageId());
            return;
        }
        final int i = nigVar.f139088a;
        final pge0 pge0Var = nigVar.f139089b;
        final String str = nigVar.f139090c;
        act().progress(R$string.f47464q, true);
        duringCreated(qib0.f154713b0.f139231b.h5PayCanUseForLive()).subscribe(ffw.m121194e(new e30() { // from class: l.edn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90628a.m125571O4(pge0Var, i, str, nigVar, (PaymentData) obj);
            }
        }, new e30() { // from class: l.fdn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97061a.m125572P4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.pl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo125582z4() {
        return true;
    }
}
