package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class uad0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public cwf0 f175595i;

    public uad0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m192752L3(C4319c c4319c) {
        cwf0 cwf0Var = this.f175595i;
        if (cwf0Var == null) {
            return;
        }
        if (c4319c == C4319c.f15548i) {
            cwf0Var.m109036l();
        } else {
            if (c4319c != C4319c.f15549j || this.f188513f.isFinishing()) {
                return;
            }
            this.f175595i.m109035k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public void m192753K3() {
        this.f175595i = new cwf0(mo77274R2(), getClass().getName());
        JSONObject jSONObject = new JSONObject();
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j != null) {
            try {
                jSONObject.put("liveId", bLiveAbsDataMo149813j.f44323id);
                jSONObject.put("anchorId", m206027E2().mo149813j().anchor.f44419id);
                BLiveState bLiveState = m206027E2().mo149813j().state;
                String str = "NA";
                if (TEnum.equals(bLiveState, "onlive")) {
                    str = "onLive";
                } else if (TEnum.equals(bLiveState, "stopped")) {
                    str = "endLive";
                }
                jSONObject.put("liveStatus", str);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        this.f175595i.m109039o(jSONObject);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.tad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169108a.m192752L3((C4319c) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        cwf0 cwf0Var = this.f175595i;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f175595i.m109034j();
            this.f175595i = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m192753K3();
        this.f175595i.m109033i();
        this.f175595i.m109036l();
    }
}
