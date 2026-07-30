package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveMerchandise;
import java.util.List;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.hpd0;
import l.kkp0;
import l.lsi0;
import l.qib0;
import l.sgj;
import l.u6n;
import l.w9j;
import l.xaj0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gdn extends pl2 {

    /* JADX INFO: renamed from: s */
    public final hpd0 f11382s;

    public gdn(bsm bsmVar) {
        super(bsmVar);
        this.f11382s = new hpd0("intl_live_first_charge_" + qib0.b0.a.userId(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J4 */
    public void m13740J4(final BLiveMerchandise bLiveMerchandise, final int i) {
        ypv.a.e(act(), bLiveMerchandise, new d30() { // from class: l.cdn
            public final void call() {
                this.f8603a.m13742L4(i, bLiveMerchandise);
            }
        }, new d30() { // from class: l.ddn
            public final void call() {
                this.f9179a.m20408n4();
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public void m13741K4() {
        duringCreated(qib0.b0.b.getTPayResultBs()).subscribe(ffw.e(new e30() { // from class: l.xcn
            public final void call(Object obj) {
                this.f22218a.m13744N4((xaj0) obj);
            }
        }, new e30() { // from class: l.ycn
            public final void call(Object obj) {
                lsi0.y(ypv.e.getString(R$string.f2915Ob));
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m13742L4(int i, BLiveMerchandise bLiveMerchandise) {
        mo17460o4(i, true);
        sgj.m(bLiveMerchandise.quantity);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ c m13743M4(List list) {
        return ypv.a.U(act(), list);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m13744N4(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.a).intValue() == 0) {
            mo17460o4(((Integer) xaj0Var.b).intValue(), true);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m13745O4(pge0 pge0Var, int i, String str, nig nigVar, PaymentData paymentData) {
        act().progressDismiss();
        if (!paymentData.isCanUse("live_recharge", paymentData.getCOutName()) && !paymentData.isCanUse("live_recharge", paymentData.getCodaName())) {
            m20414x4(nigVar);
            m20395A4(nigVar, "0");
        } else {
            if (pge0Var != null) {
                lsi0.y(ypv.e.getString(u6n.a() ? R$string.f2894Nb : R$string.f2621B0));
            }
            m13747Q4(i, pge0Var, str, paymentData.isCanUse("live_recharge", paymentData.getCOutName()));
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m13746P4(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m13747Q4(int i, pge0 pge0Var, String str, boolean z) {
        zfv.m27280k1().subscribe(ffw.c());
        this.f17469m = pge0Var;
        this.f17471o = i;
        this.f17472p = str;
        m25551K2().m22225m(LiveDialogEnum.WEBVIEW);
        qib0.b0.b.skipH5PayActivityFromLive(act(), str, z);
        List<BLiveMerchandise> listM20398a4 = m20398a4();
        String strM27327b = zgc0.m27327b(str, m25552L2());
        this.f17473q = strM27327b;
        zgc0.m27334i(strM27327b, listM20398a4, this.f17465i, "0");
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: T */
    public void mo13748T() {
        super.mo13748T();
        m13741K4();
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: V3 */
    public List<BLiveMerchandise> mo13749V3(List<BLiveMerchandise> list) {
        if (list.size() == 7) {
            if (((Boolean) this.f11382s.get()).booleanValue() && ypv.a.G()) {
                list.remove(1);
                return list;
            }
            list.remove(0);
        }
        return list;
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: W3 */
    public c<List<BLiveMerchandise>> mo13750W3() {
        return c.just(ypv.a.j()).flatMap(new w9j() { // from class: l.zcn
            public final Object call(Object obj) {
                return ypv.a.e0((String) obj, false);
            }
        }).filter(new w9j() { // from class: l.adn
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.bdn
            public final Object call(Object obj) {
                return this.f8085a.m13743M4((List) obj);
            }
        });
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: X3 */
    public c<BLiveMerchandise> mo13751X3() {
        return c.just((Object) null);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: Y3 */
    public c<BLiveData> mo13752Y3() {
        return c.just((Object) null);
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: l4 */
    public void mo13753l4(pl2.C0751b c0751b) {
        if (c0751b.f17481e != null) {
            qib0.e1("tantancoin_purchase_click", new Object[0]);
            m13740J4(c0751b.f17481e, c0751b.f17480d);
            zgc0.m27335j(c0751b.f17477a);
        }
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: p4 */
    public void mo13754p4() {
        if (((Boolean) this.f11382s.get()).booleanValue()) {
            this.f11382s.put(Boolean.FALSE);
            ((al2) ((bwr) this).viewModel).m9863V(m20396U3(this.f17467k, this.f17468l, this.f17470n));
        }
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: u4 */
    public void mo13755u4() {
        C(new vcn());
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: v4 */
    public void mo13756v4(final nig nigVar) {
        if (IntlCountryCodeController.k()) {
            Act act = this.f22037f;
            kkp0.c(act, act.pageId());
            return;
        }
        final int i = nigVar.f16050a;
        final pge0 pge0Var = nigVar.f16051b;
        final String str = nigVar.f16052c;
        act().progress(R$string.f3506q, true);
        duringCreated(qib0.b0.b.h5PayCanUseForLive()).subscribe(ffw.e(new e30() { // from class: l.edn
            public final void call(Object obj) {
                this.f9681a.m13745O4(pge0Var, i, str, nigVar, (PaymentData) obj);
            }
        }, new e30() { // from class: l.fdn
            public final void call(Object obj) {
                this.f10303a.m13746P4((Throwable) obj);
            }
        }));
    }

    @Override // p002l.pl2
    /* JADX INFO: renamed from: z4 */
    public boolean mo13757z4() {
        return true;
    }
}
