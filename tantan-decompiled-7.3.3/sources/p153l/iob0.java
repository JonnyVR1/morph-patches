package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class iob0 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public final a4m f116135i;

    /* JADX INFO: renamed from: j */
    public int f116136j;

    /* JADX INFO: renamed from: k */
    public Dialog f116137k;

    /* JADX INFO: renamed from: l */
    public int f116138l;

    /* JADX INFO: renamed from: m */
    public int f116139m;

    /* JADX INFO: renamed from: n */
    public long f116140n;

    public iob0(dum dumVar, a4m a4mVar) {
        super(dumVar);
        this.f116136j = 0;
        this.f116138l = zrv.m221193k().m203603d5();
        this.f116139m = 0;
        this.f116140n = 0L;
        this.f116135i = a4mVar;
    }

    /* JADX INFO: renamed from: S3 */
    private void m141287S3() {
        m213811F2().LivePusherEvent.recoverLive().m199277p();
        i4g0.m138523u("e_live_stream_push_popup_button", "p_live_stream_push_popup", jyb.m147494Y("live_stream_push_popup_button_type", "retry"));
        nsh0.m164608j(v2t.f182112b, "retry dialog:reconnect");
    }

    /* JADX INFO: renamed from: N3 */
    public final void m141288N3() {
        i4g0.m138523u("e_live_stream_push_popup_button", "p_live_stream_push_popup", jyb.m147494Y("live_stream_push_popup_button_type", "end"));
        nsh0.m164608j(v2t.f182112b, "retry dialog:stop live");
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m141289O3(C4470c c4470c) {
        Dialog dialog = this.f116137k;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        nsh0.m164608j(v2t.f182112b, "retry dialog dismiss");
        this.f116137k.dismiss();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m141290P3() {
        if (pzi0.m174454o() - this.f116140n > zrv.m221193k().m203579a5()) {
            this.f116139m = 0;
        }
        if (this.f116139m < zrv.m221193k().m203595c5()) {
            this.f116140n = pzi0.m174454o();
        } else {
            o1j0.m165634h(R$string.f48100g6);
            fgt.m125530b(this, "anchor_pusher_retry_frequent", null);
        }
        this.f116139m++;
        this.f116138l = 1;
        m141287S3();
        fgt.m125530b(this, "anchor_pusher_retry", null);
    }

    /* JADX INFO: renamed from: R3 */
    public void m141291R3(int i) {
        int i2 = this.f116136j;
        if (i2 < this.f116138l) {
            this.f116136j = i2 + 1;
            nsh0.m164608j(v2t.f182112b, "retry connect. retryCount:" + this.f116136j);
            this.f116135i.mo95984q1(RefreshCause.AutoRetry, i);
            return;
        }
        Dialog dialog = this.f116137k;
        if (dialog == null || !dialog.isShowing()) {
            m213811F2().LivePusherEvent.suspendLive().mo199273j(Boolean.FALSE);
            this.f116135i.mo95983d(false);
            m141293U3();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        lifecycle().filter(new qcj() { // from class: l.eob0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.fob0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100047a.m141289O3((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m141292T3() {
        this.f116136j = 0;
        Dialog dialog = this.f116137k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m141293U3() {
        nsh0.m164608j(v2t.f182112b, "retry dialog show");
        this.f116137k = act().dialog().m21503F(zrv.f205803e.getString(R$string.f48100g6)).m21495B(false).m21548q(true).m21543n0(zrv.f205803e.getString(R$string.f47943Z2), new Runnable() { // from class: l.gob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105280a.m141288N3();
            }
        }).m21559v0(zrv.f205803e.getString(R$string.f48122h6), new Runnable() { // from class: l.hob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110882a.m141290P3();
            }
        }).m21567z0();
        l4g0 l4g0Var = new l4g0("p_live_stream_push_popup", cpb0.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_stream_push_type", "failed");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0Var.m152780o(jSONObject);
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }
}
