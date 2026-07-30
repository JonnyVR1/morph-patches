package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class egb0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f90915i;

    /* JADX INFO: renamed from: j */
    public int f90916j;

    /* JADX INFO: renamed from: k */
    public Dialog f90917k;

    /* JADX INFO: renamed from: l */
    public int f90918l;

    /* JADX INFO: renamed from: m */
    public int f90919m;

    /* JADX INFO: renamed from: n */
    public long f90920n;

    public egb0(bsm bsmVar, h1m h1mVar) {
        super(bsmVar);
        this.f90916j = 0;
        this.f90918l = ypv.m215672k().m195816d5();
        this.f90919m = 0;
        this.f90920n = 0L;
        this.f90915i = h1mVar;
    }

    /* JADX INFO: renamed from: S3 */
    private void m116240S3() {
        m206028F2().LivePusherEvent.recoverLive().m172467p();
        zvf0.m220399u("e_live_stream_push_popup_button", "p_live_stream_push_popup", vwb.m200311Y("live_stream_push_popup_button_type", "retry"));
        gkh0.m126627j(u0t.f172943b, "retry dialog:reconnect");
    }

    /* JADX INFO: renamed from: N3 */
    public final void m116241N3() {
        zvf0.m220399u("e_live_stream_push_popup_button", "p_live_stream_push_popup", vwb.m200311Y("live_stream_push_popup_button_type", "end"));
        gkh0.m126627j(u0t.f172943b, "retry dialog:stop live");
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m116242O3(C4319c c4319c) {
        Dialog dialog = this.f90917k;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        gkh0.m126627j(u0t.f172943b, "retry dialog dismiss");
        this.f90917k.dismiss();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m116243P3() {
        if (mqi0.m155944o() - this.f90920n > ypv.m215672k().m195792a5()) {
            this.f90919m = 0;
        }
        if (this.f90919m < ypv.m215672k().m195808c5()) {
            this.f90920n = mqi0.m155944o();
        } else {
            lsi0.m151578h(R$string.f47252g6);
            eet.m116003b(this, "anchor_pusher_retry_frequent", null);
        }
        this.f90919m++;
        this.f90918l = 1;
        m116240S3();
        eet.m116003b(this, "anchor_pusher_retry", null);
    }

    /* JADX INFO: renamed from: R3 */
    public void m116244R3(int i) {
        int i2 = this.f90916j;
        if (i2 < this.f90918l) {
            this.f90916j = i2 + 1;
            gkh0.m126627j(u0t.f172943b, "retry connect. retryCount:" + this.f90916j);
            this.f90915i.mo100521q1(RefreshCause.AutoRetry, i);
            return;
        }
        Dialog dialog = this.f90917k;
        if (dialog == null || !dialog.isShowing()) {
            m206028F2().LivePusherEvent.suspendLive().mo172463j(Boolean.FALSE);
            this.f90915i.mo100519d(false);
            m116246U3();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        lifecycle().filter(new w9j() { // from class: l.agb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.bgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75419a.m116242O3((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void m116245T3() {
        this.f90916j = 0;
        Dialog dialog = this.f90917k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m116246U3() {
        gkh0.m126627j(u0t.f172943b, "retry dialog show");
        this.f90917k = act().dialog().m20504F(ypv.f199497e.getString(R$string.f47252g6)).m20496B(false).m20549q(true).m20544n0(ypv.f199497e.getString(R$string.f47095Z2), new Runnable() { // from class: l.cgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80733a.m116241N3();
            }
        }).m20560v0(ypv.f199497e.getString(R$string.f47274h6), new Runnable() { // from class: l.dgb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86069a.m116243P3();
            }
        }).m20568z0();
        cwf0 cwf0Var = new cwf0("p_live_stream_push_popup", ygb0.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("live_stream_push_type", "failed");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0Var.m109039o(jSONObject);
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }
}
