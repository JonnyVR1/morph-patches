package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import l.cwf0;
import l.e30;
import l.ffw;
import l.gkh0;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.u0t;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class egb0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f9743i;

    /* JADX INFO: renamed from: j */
    public int f9744j;

    /* JADX INFO: renamed from: k */
    public Dialog f9745k;

    /* JADX INFO: renamed from: l */
    public int f9746l;

    /* JADX INFO: renamed from: m */
    public int f9747m;

    /* JADX INFO: renamed from: n */
    public long f9748n;

    public egb0(bsm bsmVar, h1m h1mVar) {
        super(bsmVar);
        this.f9744j = 0;
        this.f9746l = ypv.k().d5();
        this.f9747m = 0;
        this.f9748n = 0L;
        this.f9743i = h1mVar;
    }

    /* JADX INFO: renamed from: S3 */
    private void m12473S3() {
        m25548F2().LivePusherEvent.recoverLive().p();
        zvf0.u("e_live_stream_push_popup_button", "p_live_stream_push_popup", new j760[]{vwb.Y("live_stream_push_popup_button_type", "retry")});
        gkh0.j(u0t.b, "retry dialog:reconnect");
    }

    /* JADX INFO: renamed from: N3 */
    public final void m12474N3() {
        zvf0.u("e_live_stream_push_popup_button", "p_live_stream_push_popup", new j760[]{vwb.Y("live_stream_push_popup_button_type", "end")});
        gkh0.j(u0t.b, "retry dialog:stop live");
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m12475O3(c cVar) {
        Dialog dialog = this.f9745k;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        gkh0.j(u0t.b, "retry dialog dismiss");
        this.f9745k.dismiss();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m12476P3() {
        if (mqi0.o() - this.f9748n > ypv.k().a5()) {
            this.f9747m = 0;
        }
        if (this.f9747m < ypv.k().c5()) {
            this.f9748n = mqi0.o();
        } else {
            lsi0.h(R$string.f3294g6);
            eet.m12448b(this, "anchor_pusher_retry_frequent", null);
        }
        this.f9747m++;
        this.f9746l = 1;
        m12473S3();
        eet.m12448b(this, "anchor_pusher_retry", null);
    }

    /* JADX INFO: renamed from: R3 */
    public void m12477R3(int i) {
        int i2 = this.f9744j;
        if (i2 < this.f9746l) {
            this.f9744j = i2 + 1;
            gkh0.j(u0t.b, "retry connect. retryCount:" + this.f9744j);
            this.f9743i.mo10198q1(RefreshCause.AutoRetry, i);
            return;
        }
        Dialog dialog = this.f9745k;
        if (dialog == null || !dialog.isShowing()) {
            m25548F2().LivePusherEvent.suspendLive().j(Boolean.FALSE);
            this.f9743i.mo10196d(false);
            m12480U3();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12478T() {
        super.T();
        lifecycle().filter(new w9j() { // from class: l.agb0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.k);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.bgb0
            public final void call(Object obj) {
                this.f8112a.m12475O3((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m12479T3() {
        this.f9744j = 0;
        Dialog dialog = this.f9745k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m12480U3() {
        gkh0.j(u0t.b, "retry dialog show");
        this.f9745k = act().dialog().F(ypv.e.getString(R$string.f3294g6)).B(false).q(true).n0(ypv.e.getString(R$string.f3137Z2), new Runnable() { // from class: l.cgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8658a.m12474N3();
            }
        }).v0(ypv.e.getString(R$string.f3316h6), new Runnable() { // from class: l.dgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9212a.m12476P3();
            }
        }).z0();
        cwf0 cwf0Var = new cwf0("p_live_stream_push_popup", ygb0.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_stream_push_type", "failed");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0Var.o(jSONObject);
        cwf0Var.i();
        cwf0Var.l();
    }
}
