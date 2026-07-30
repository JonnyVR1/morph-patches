package p002l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogContentView;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogConfig;
import java.util.HashMap;
import java.util.Map;
import l.d30;
import l.e30;
import l.f30;
import l.ffw;
import l.jo0;
import l.qoq;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zoq extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public Map<String, C0200a> f23526i;

    public zoq(bsm bsmVar) {
        super(bsmVar);
        this.f23526i = new HashMap();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m27454O3(qoq qoqVar) {
        if (qoqVar != null) {
            if (qoqVar.d()) {
                m27460U3(qoqVar);
            } else if (qoqVar.c()) {
                m27457S3(qoqVar);
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m27455P3(fpq fpqVar) {
        if (!fpqVar.m13455b() || fpqVar.m13456c()) {
            return;
        }
        m25548F2().OpenUserCardDialogEvent.dismiss().p();
        dck0.m11742j(this, fpqVar.m13454a(), "js");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m27456R3(ioq ioqVar, BLiveJsDialogConfig bLiveJsDialogConfig) {
        if (ioqVar.isShowing()) {
            ioqVar.dismiss();
            this.f23526i.remove(bLiveJsDialogConfig.name);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m27457S3(qoq qoqVar) {
        C0200a c0200a;
        BLiveJsDialogConfig bLiveJsDialogConfigA = qoqVar.a();
        if (bLiveJsDialogConfigA == null || (c0200a = this.f23526i.get(bLiveJsDialogConfigA.name)) == null) {
            return;
        }
        c0200a.dismiss();
        this.f23526i.remove(bLiveJsDialogConfigA.name);
    }

    /* JADX INFO: renamed from: T */
    public void m27458T() {
        super.T();
        duringCreated((c) m25548F2().LiveBridgeImplEvent.nativeDialogController().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.uoq
            public final void call(Object obj) {
                this.f20741a.m27454O3((qoq) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.userCardController().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.voq
            public final void call(Object obj) {
                this.f21253a.m27455P3((fpq) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m27459T3(final BLiveJsDialogConfig bLiveJsDialogConfig, String str) {
        if (this.f22037f.isFinishing() || vwb.J(bLiveJsDialogConfig.types)) {
            return;
        }
        a aVar = (C0200a) this.f23526i.get(bLiveJsDialogConfig.name);
        if (aVar == null || !aVar.isShowing()) {
            final JsDialogContentView jsDialogContentView = (JsDialogContentView) LayoutInflater.from(this.f22037f).inflate(t6c0.f19710V2, (ViewGroup) null);
            final ioq ioqVar = new ioq(this, jsDialogContentView);
            ioqVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.woq
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    jsDialogContentView.m6637e();
                }
            });
            jsDialogContentView.m6639g(bLiveJsDialogConfig, str, new f30() { // from class: l.xoq
                public final void call(Object obj, Object obj2) {
                    bLiveJsDialogConfig.callJs.call((String) obj, (String) obj2);
                }
            }, new d30() { // from class: l.yoq
                public final void call() {
                    this.f23007a.m27456R3(ioqVar, bLiveJsDialogConfig);
                }
            });
            ioqVar.show();
            this.f23526i.put(bLiveJsDialogConfig.name, ioqVar);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m27460U3(qoq qoqVar) {
        BLiveJsDialogConfig bLiveJsDialogConfigA = qoqVar.a();
        if (bLiveJsDialogConfigA == null) {
            return;
        }
        m27459T3(bLiveJsDialogConfigA, qoqVar.b());
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f23526i.clear();
    }
}
