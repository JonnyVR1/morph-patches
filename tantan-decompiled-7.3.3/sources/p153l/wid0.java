package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class wid0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public l4g0 f189351i;

    public wid0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m206585L3(C4470c c4470c) {
        l4g0 l4g0Var = this.f189351i;
        if (l4g0Var == null) {
            return;
        }
        if (c4470c == C4470c.f16267i) {
            l4g0Var.m152777l();
        } else {
            if (c4470c != C4470c.f16268j || this.f196919f.isFinishing()) {
                return;
            }
            this.f189351i.m152776k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K3 */
    public void m206586K3() {
        this.f189351i = new l4g0(mo78457R2(), getClass().getName());
        JSONObject jSONObject = new JSONObject();
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j != null) {
            try {
                jSONObject.put("liveId", bLiveAbsDataMo183435j.f45171id);
                jSONObject.put("anchorId", m213810E2().mo183435j().anchor.f45267id);
                BLiveState bLiveState = m213810E2().mo183435j().state;
                String str = "NA";
                if (TEnum.equals(bLiveState, "onlive")) {
                    str = "onLive";
                } else if (TEnum.equals(bLiveState, "stopped")) {
                    str = "endLive";
                }
                jSONObject.put("liveStatus", str);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        this.f189351i.m152780o(jSONObject);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.vid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184229a.m206585L3((C4470c) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        l4g0 l4g0Var = this.f189351i;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f189351i.m152775j();
            this.f189351i = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m206586K3();
        this.f189351i.m152774i();
        this.f189351i.m152777l();
    }
}
