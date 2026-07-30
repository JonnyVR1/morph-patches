package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zqq extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public Map<String, DialogC12774a> f205648i;

    public zqq(dum dumVar) {
        super(dumVar);
        this.f205648i = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m221040O3(qqq qqqVar) {
        if (qqqVar != null) {
            if (qqqVar.m177509d()) {
                m221045U3(qqqVar);
            } else if (qqqVar.m177508c()) {
                m221043S3(qqqVar);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m221041P3(frq frqVar) {
        if (!frqVar.m126949b() || frqVar.m126950c()) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        jlk0.m146088j(this, frqVar.m126948a(), "js");
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m221042R3(iqq iqqVar, BLiveJsDialogConfig bLiveJsDialogConfig) {
        if (iqqVar.isShowing()) {
            iqqVar.dismiss();
            this.f205648i.remove(bLiveJsDialogConfig.name);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m221043S3(qqq qqqVar) {
        DialogC12774a dialogC12774a;
        BLiveJsDialogConfig bLiveJsDialogConfigM177506a = qqqVar.m177506a();
        if (bLiveJsDialogConfigM177506a == null || (dialogC12774a = this.f205648i.get(bLiveJsDialogConfigM177506a.name)) == null) {
            return;
        }
        dialogC12774a.dismiss();
        this.f205648i.remove(bLiveJsDialogConfigM177506a.name);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().LiveBridgeImplEvent.nativeDialogController().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.uqq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180500a.m221040O3((qqq) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.userCardController().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.vqq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185392a.m221041P3((frq) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m221044T3(final BLiveJsDialogConfig bLiveJsDialogConfig, String str) {
        if (this.f196919f.isFinishing() || jyb.m147479J(bLiveJsDialogConfig.types)) {
            return;
        }
        DialogC12774a dialogC12774a = this.f205648i.get(bLiveJsDialogConfig.name);
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            final JsDialogContentView jsDialogContentView = (JsDialogContentView) LayoutInflater.from(this.f196919f).inflate(yec0.f198946V2, (ViewGroup) null);
            final iqq iqqVar = new iqq(this, jsDialogContentView);
            iqqVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wqq
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    jsDialogContentView.m74294e();
                }
            });
            jsDialogContentView.m74296g(bLiveJsDialogConfig, str, new z20() { // from class: l.xqq
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    bLiveJsDialogConfig.callJs.call((String) obj, (String) obj2);
                }
            }, new x20() { // from class: l.yqq
                @Override // p153l.x20
                public final void call() {
                    this.f201233a.m221042R3(iqqVar, bLiveJsDialogConfig);
                }
            });
            iqqVar.show();
            this.f205648i.put(bLiveJsDialogConfig.name, iqqVar);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m221045U3(qqq qqqVar) {
        BLiveJsDialogConfig bLiveJsDialogConfigM177506a = qqqVar.m177506a();
        if (bLiveJsDialogConfigM177506a == null) {
            return;
        }
        m221044T3(bLiveJsDialogConfigM177506a, qqqVar.m177507b());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f205648i.clear();
    }
}
