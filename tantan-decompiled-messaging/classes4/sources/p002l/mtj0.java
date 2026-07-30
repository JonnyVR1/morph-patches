package p002l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.ffw;
import l.jo0;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mtj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public String f15628i;

    /* JADX INFO: renamed from: j */
    public qsj0 f15629j;

    /* JADX INFO: renamed from: k */
    public UpgradeGiftContentView f15630k;

    /* JADX INFO: renamed from: l */
    public Act f15631l;

    /* JADX INFO: renamed from: m */
    public avj f15632m;

    public mtj0(bsm bsmVar) {
        super(bsmVar);
        this.f15631l = bsmVar.f8332a;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m18166N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41306) {
                lsi0.y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m18168P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public void m18169R3() {
        a aVar = this.f15629j;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f15629j.dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public void m18170S3(final xsj0 xsj0Var) {
        duringCreated(zfv.m27297q0(xsj0Var.m26105e(), xsj0Var.m26104d().id, m25547E2().m17238n().id, ((DbObject) m25547E2().m14582l0()).id)).subscribe(ffw.e(new e30() { // from class: l.ftj0
            public final void call(Object obj) {
                this.f10631a.m18174V3(xsj0Var, (BLiveGiftItem) obj);
            }
        }, new e30() { // from class: l.gtj0
            public final void call(Object obj) {
                mtj0.m18166N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m18171T() {
        super.T();
        duringCreated((c) m25548F2().UpgradeGiftEvent.showUpgradeDialog().g()).subscribe(ffw.e(new e30() { // from class: l.htj0
            public final void call(Object obj) {
                this.f12266a.m18173U3((usj0) obj);
            }
        }, new e30() { // from class: l.itj0
            public final void call(Object obj) {
                mtj0.m18168P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public String m18172T3() {
        return this.f15628i;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m18173U3(usj0 usj0Var) {
        this.f15632m = usj0Var.m23591c();
        m18181c4(usj0Var.m23590b());
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m18174V3(xsj0 xsj0Var, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem == null) {
            return;
        }
        avj avjVar = this.f15632m;
        if (avjVar != null) {
            avjVar.mo10076a(bLiveGiftItem);
        }
        this.f15630k.m7889o0(xsj0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m18175W3(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo) {
        this.f15630k.m7887m0(bLiveUpgradeGiftInfo, this);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m18176X3(Throwable th) {
        this.f15630k.m7888n0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m18177Y3(DialogInterface dialogInterface) {
        this.f15630k.onDestroy();
        this.f15632m = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m18178Z3(String str) {
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(23000).m25610e(str).m25608c());
    }

    /* JADX INFO: renamed from: a4 */
    public final void m18179a4(ihs ihsVar) {
        duringCreated(zfv.m27229Q0(ihsVar.m15160h().slotGiftInfo.slotId)).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.ktj0
            public final void call(Object obj) {
                this.f14511a.m18175W3((BLiveUpgradeGiftInfo) obj);
            }
        }, new e30() { // from class: l.ltj0
            public final void call(Object obj) {
                this.f15054a.m18176X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m18180b4(String str) {
        this.f15628i = str;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m18181c4(ihs ihsVar) {
        if (this.f15630k == null) {
            this.f15630k = (UpgradeGiftContentView) LayoutInflater.from(this.f15631l).inflate(t6c0.f20034u6, (ViewGroup) null);
        }
        if (this.f15629j == null) {
            qsj0 qsj0Var = new qsj0(this, this.f15630k);
            this.f15629j = qsj0Var;
            qsj0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jtj0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14014a.m18177Y3(dialogInterface);
                }
            });
        }
        this.f15629j.show();
        m18179a4(ihsVar);
    }

    /* JADX INFO: renamed from: t */
    public void m18182t() {
        super.t();
    }
}
