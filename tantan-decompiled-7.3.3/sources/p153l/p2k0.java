package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;

/* JADX INFO: loaded from: classes4.dex */
public class p2k0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public String f150274i;

    /* JADX INFO: renamed from: j */
    public t1k0 f150275j;

    /* JADX INFO: renamed from: k */
    public UpgradeGiftContentView f150276k;

    /* JADX INFO: renamed from: l */
    public Act f150277l;

    /* JADX INFO: renamed from: m */
    public qxj f150278m;

    public p2k0(dum dumVar) {
        super(dumVar);
        this.f150277l = dumVar.f90815a;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m170360N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41306) {
                o1j0.m165651y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m170362P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public void m170363R3() {
        t1k0 t1k0Var = this.f150275j;
        if (t1k0Var == null || !t1k0Var.isShowing()) {
            return;
        }
        this.f150275j.dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX INFO: renamed from: S3 */
    public void m170364S3(final a2k0 a2k0Var) {
        duringCreated(aiv.m98128q0(a2k0Var.m95711e(), a2k0Var.m95710d().f45314id, m213810E2().mo183440n().f45172id, m213810E2().m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.i2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112651a.m170367V3(a2k0Var, (BLiveGiftItem) obj);
            }
        }, new y20() { // from class: l.j2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                p2k0.m170360N3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().UpgradeGiftEvent.showUpgradeDialog().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.k2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123621a.m170366U3((x1k0) obj);
            }
        }, new y20() { // from class: l.l2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                p2k0.m170362P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public String m170365T3() {
        return this.f150274i;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m170366U3(x1k0 x1k0Var) {
        this.f150278m = x1k0Var.m209086c();
        m170374c4(x1k0Var.m209085b());
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m170367V3(a2k0 a2k0Var, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem == null) {
            return;
        }
        qxj qxjVar = this.f150278m;
        if (qxjVar != null) {
            qxjVar.mo178603a(bLiveGiftItem);
        }
        this.f150276k.m75491o0(a2k0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m170368W3(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo) {
        this.f150276k.m75489m0(bLiveUpgradeGiftInfo, this);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m170369X3(Throwable th) {
        this.f150276k.m75490n0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m170370Y3(DialogInterface dialogInterface) {
        this.f150276k.onDestroy();
        this.f150278m = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m170371Z3(String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(23000).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: a4 */
    public final void m170372a4(jjs jjsVar) {
        duringCreated(aiv.m98060Q0(jjsVar.m145122h().slotGiftInfo.slotId)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.n2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139872a.m170368W3((BLiveUpgradeGiftInfo) obj);
            }
        }, new y20() { // from class: l.o2k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144746a.m170369X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m170373b4(String str) {
        this.f150274i = str;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m170374c4(jjs jjsVar) {
        if (this.f150276k == null) {
            this.f150276k = (UpgradeGiftContentView) LayoutInflater.from(this.f150277l).inflate(yec0.f199270u6, (ViewGroup) null);
        }
        if (this.f150275j == null) {
            t1k0 t1k0Var = new t1k0(this, this.f150276k);
            this.f150275j = t1k0Var;
            t1k0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.m2k0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f134587a.m170370Y3(dialogInterface);
                }
            });
        }
        this.f150275j.show();
        m170372a4(jjsVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
