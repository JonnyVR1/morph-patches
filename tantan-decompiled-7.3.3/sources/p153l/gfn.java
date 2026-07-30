package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class gfn extends xl2 {

    /* JADX INFO: renamed from: s */
    public final jxd0 f103942s;

    public gfn(dum dumVar) {
        super(dumVar);
        this.f103942s = new jxd0("intl_live_first_charge_" + uqb0.f180396b0.f170324a.userId(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J4 */
    public void m130101J4(final BLiveMerchandise bLiveMerchandise, final int i) {
        zrv.f205799a.m207664e(act(), bLiveMerchandise, new x20() { // from class: l.cfn
            @Override // p153l.x20
            public final void call() {
                this.f81530a.m130103L4(i, bLiveMerchandise);
            }
        }, new x20() { // from class: l.dfn
            @Override // p153l.x20
            public final void call() {
                this.f88208a.m211484n4();
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public void m130102K4() {
        duringCreated(uqb0.f180396b0.f170325b.getTPayResultBs()).subscribe(dhw.m115826e(new y20() { // from class: l.xen
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193969a.m130105N4((bkj0) obj);
            }
        }, new y20() { // from class: l.yen
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47721Ob));
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m130103L4(int i, BLiveMerchandise bLiveMerchandise) {
        mo160358o4(i, true);
        mjj.m158584m(bLiveMerchandise.quantity);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22421c m130104M4(List list) {
        return zrv.f205799a.m207650U(act(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m130105N4(bkj0 bkj0Var) {
        if (bkj0Var != null && ((Integer) bkj0Var.f77081a).intValue() == 0) {
            mo160358o4(((Integer) bkj0Var.f77082b).intValue(), true);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m130106O4(uoe0 uoe0Var, int i, String str, bkg bkgVar, PaymentData paymentData) {
        act().progressDismiss();
        if (!paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCOutName()) && !paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCodaName())) {
            m211490x4(bkgVar);
            m211471A4(bkgVar, "0");
        } else {
            if (uoe0Var != null) {
                o1j0.m165651y(zrv.f205803e.getString(u8n.m195065a() ? R$string.f47700Nb : R$string.f47427B0));
            }
            m130108Q4(i, uoe0Var, str, paymentData.isCanUse(PaymentData.FROM_LIVE_RECHARGE, paymentData.getCOutName()));
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m130107P4(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m130108Q4(int i, uoe0 uoe0Var, String str, boolean z) {
        aiv.m98111k1().subscribe(dhw.m115824c());
        this.f194841m = uoe0Var;
        this.f194843o = i;
        this.f194844p = str;
        m213814K2().m189706m(LiveDialogEnum.WEBVIEW);
        uqb0.f180396b0.f170325b.skipH5PayActivityFromLive(act(), str, z);
        List<BLiveMerchandise> listM211474a4 = m211474a4();
        String strM131242b = gpc0.m131242b(str, m213815L2());
        this.f194845q = strM131242b;
        gpc0.m131249i(strM131242b, listM211474a4, this.f194837i, "0");
    }

    @Override // p153l.xl2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m130102K4();
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo130109V3(List<BLiveMerchandise> list) {
        if (list.size() == 7) {
            if (this.f103942s.get().booleanValue() && zrv.f205799a.m207636G()) {
                list.remove(1);
                return list;
            }
            list.remove(0);
        }
        return list;
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: W3 */
    public C22421c<List<BLiveMerchandise>> mo130110W3() {
        return C22421c.just(zrv.f205799a.m207674j()).flatMap(new qcj() { // from class: l.zen
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrv.f205799a.m207665e0((String) obj, false);
            }
        }).filter(new qcj() { // from class: l.afn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.bfn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76526a.m130104M4((List) obj);
            }
        });
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: X3 */
    public C22421c<BLiveMerchandise> mo130111X3() {
        return C22421c.just(null);
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: Y3 */
    public C22421c<BLiveData> mo130112Y3() {
        return C22421c.just(null);
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: l4 */
    public void mo130113l4(xl2.C21365b c21365b) {
        if (c21365b.f194853e != null) {
            uqb0.m197269e1("tantancoin_purchase_click", new Object[0]);
            m130101J4(c21365b.f194853e, c21365b.f194852d);
            gpc0.m131250j(c21365b.f194849a);
        }
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: p4 */
    public void mo130114p4() {
        if (this.f103942s.get().booleanValue()) {
            this.f103942s.put(Boolean.FALSE);
            ((il2) this.viewModel).m140563V(m211472U3(this.f194839k, this.f194840l, this.f194842n));
        }
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: u4 */
    public void mo130115u4() {
        mo52715C(new ven());
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: v4 */
    public void mo130116v4(final bkg bkgVar) {
        if (IntlCountryCodeController.m29114k()) {
            Act act = this.f196919f;
            otp0.m169162c(act, act.pageId());
            return;
        }
        final int i = bkgVar.f77067a;
        final uoe0 uoe0Var = bkgVar.f77068b;
        final String str = bkgVar.f77069c;
        act().progress(R$string.f48312q, true);
        duringCreated(uqb0.f180396b0.f170325b.h5PayCanUseForLive()).subscribe(dhw.m115826e(new y20() { // from class: l.efn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93801a.m130106O4(uoe0Var, i, str, bkgVar, (PaymentData) obj);
            }
        }, new y20() { // from class: l.ffn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98813a.m130107P4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.xl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo130117z4() {
        return true;
    }
}
