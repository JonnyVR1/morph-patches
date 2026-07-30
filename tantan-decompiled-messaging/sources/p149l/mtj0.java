package p149l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView;

/* JADX INFO: loaded from: classes4.dex */
public class mtj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public String f135607i;

    /* JADX INFO: renamed from: j */
    public qsj0 f135608j;

    /* JADX INFO: renamed from: k */
    public UpgradeGiftContentView f135609k;

    /* JADX INFO: renamed from: l */
    public Act f135610l;

    /* JADX INFO: renamed from: m */
    public avj f135611m;

    public mtj0(bsm bsmVar) {
        super(bsmVar);
        this.f135610l = bsmVar.f77095a;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m156239N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41306) {
                lsi0.m151595y(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m156241P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public void m156242R3() {
        qsj0 qsj0Var = this.f135608j;
        if (qsj0Var == null || !qsj0Var.isShowing()) {
            return;
        }
        this.f135608j.dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public void m156243S3(final xsj0 xsj0Var) {
        duringCreated(zfv.m218594q0(xsj0Var.m210778e(), xsj0Var.m210777d().f44466id, m206027E2().mo149817n().f44324id, m206027E2().m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.ftj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99218a.m156246V3(xsj0Var, (BLiveGiftItem) obj);
            }
        }, new e30() { // from class: l.gtj0
            @Override // p149l.e30
            public final void call(Object obj) {
                mtj0.m156239N3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().UpgradeGiftEvent.showUpgradeDialog().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.htj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109393a.m156245U3((usj0) obj);
            }
        }, new e30() { // from class: l.itj0
            @Override // p149l.e30
            public final void call(Object obj) {
                mtj0.m156241P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public String m156244T3() {
        return this.f135607i;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m156245U3(usj0 usj0Var) {
        this.f135611m = usj0Var.m195208c();
        m156253c4(usj0Var.m195207b());
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m156246V3(xsj0 xsj0Var, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem == null) {
            return;
        }
        avj avjVar = this.f135611m;
        if (avjVar != null) {
            avjVar.mo99192a(bLiveGiftItem);
        }
        this.f135609k.m74308o0(xsj0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m156247W3(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo) {
        this.f135609k.m74306m0(bLiveUpgradeGiftInfo, this);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m156248X3(Throwable th) {
        this.f135609k.m74307n0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m156249Y3(DialogInterface dialogInterface) {
        this.f135609k.onDestroy();
        this.f135611m = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public void m156250Z3(String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(23000).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: a4 */
    public final void m156251a4(ihs ihsVar) {
        duringCreated(zfv.m218526Q0(ihsVar.m136283h().slotGiftInfo.slotId)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.ktj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124593a.m156247W3((BLiveUpgradeGiftInfo) obj);
            }
        }, new e30() { // from class: l.ltj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129972a.m156248X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m156252b4(String str) {
        this.f135607i = str;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m156253c4(ihs ihsVar) {
        if (this.f135609k == null) {
            this.f135609k = (UpgradeGiftContentView) LayoutInflater.from(this.f135610l).inflate(t6c0.f168538u6, (ViewGroup) null);
        }
        if (this.f135608j == null) {
            qsj0 qsj0Var = new qsj0(this, this.f135609k);
            this.f135608j = qsj0Var;
            qsj0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jtj0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f119613a.m156249Y3(dialogInterface);
                }
            });
        }
        this.f135608j.show();
        m156251a4(ihsVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
