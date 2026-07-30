package p149l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zoq extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public Map<String, DialogC12611a> f204152i;

    public zoq(bsm bsmVar) {
        super(bsmVar);
        this.f204152i = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m219594O3(qoq qoqVar) {
        if (qoqVar != null) {
            if (qoqVar.m175753d()) {
                m219599U3(qoqVar);
            } else if (qoqVar.m175752c()) {
                m219597S3(qoqVar);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m219595P3(fpq fpqVar) {
        if (!fpqVar.m122623b() || fpqVar.m122624c()) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        dck0.m110725j(this, fpqVar.m122622a(), "js");
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m219596R3(ioq ioqVar, BLiveJsDialogConfig bLiveJsDialogConfig) {
        if (ioqVar.isShowing()) {
            ioqVar.dismiss();
            this.f204152i.remove(bLiveJsDialogConfig.name);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m219597S3(qoq qoqVar) {
        DialogC12611a dialogC12611a;
        BLiveJsDialogConfig bLiveJsDialogConfigM175750a = qoqVar.m175750a();
        if (bLiveJsDialogConfigM175750a == null || (dialogC12611a = this.f204152i.get(bLiveJsDialogConfigM175750a.name)) == null) {
            return;
        }
        dialogC12611a.dismiss();
        this.f204152i.remove(bLiveJsDialogConfigM175750a.name);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().LiveBridgeImplEvent.nativeDialogController().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.uoq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177526a.m219594O3((qoq) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.userCardController().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.voq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182411a.m219595P3((fpq) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m219598T3(final BLiveJsDialogConfig bLiveJsDialogConfig, String str) {
        if (this.f188513f.isFinishing() || vwb.m200296J(bLiveJsDialogConfig.types)) {
            return;
        }
        DialogC12611a dialogC12611a = this.f204152i.get(bLiveJsDialogConfig.name);
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            final JsDialogContentView jsDialogContentView = (JsDialogContentView) LayoutInflater.from(this.f188513f).inflate(t6c0.f168214V2, (ViewGroup) null);
            final ioq ioqVar = new ioq(this, jsDialogContentView);
            ioqVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.woq
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    jsDialogContentView.m73111e();
                }
            });
            jsDialogContentView.m73113g(bLiveJsDialogConfig, str, new f30() { // from class: l.xoq
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    bLiveJsDialogConfig.callJs.call((String) obj, (String) obj2);
                }
            }, new d30() { // from class: l.yoq
                @Override // p149l.d30
                public final void call() {
                    this.f199318a.m219596R3(ioqVar, bLiveJsDialogConfig);
                }
            });
            ioqVar.show();
            this.f204152i.put(bLiveJsDialogConfig.name, ioqVar);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m219599U3(qoq qoqVar) {
        BLiveJsDialogConfig bLiveJsDialogConfigM175750a = qoqVar.m175750a();
        if (bLiveJsDialogConfigM175750a == null) {
            return;
        }
        m219598T3(bLiveJsDialogConfigM175750a, qoqVar.m175751b());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f204152i.clear();
    }
}
