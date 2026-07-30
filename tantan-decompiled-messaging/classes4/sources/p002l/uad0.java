package p002l;

import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.CrashHelper;
import l.cwf0;
import l.e30;
import l.ffw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uad0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public cwf0 f20563i;

    public uad0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m23409L3(c cVar) {
        cwf0 cwf0Var = this.f20563i;
        if (cwf0Var == null) {
            return;
        }
        if (cVar == c.i) {
            cwf0Var.l();
        } else {
            if (cVar != c.j || this.f22037f.isFinishing()) {
                return;
            }
            this.f20563i.k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public void m23410K3() {
        this.f20563i = new cwf0(mo21430R2(), getClass().getName());
        JSONObject jSONObject = new JSONObject();
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j != null) {
            try {
                jSONObject.put("liveId", bLiveAbsDataM17234j.id);
                jSONObject.put("anchorId", m25547E2().m17234j().anchor.id);
                BLiveState bLiveState = m25547E2().m17234j().state;
                String str = "NA";
                if (TEnum.equals(bLiveState, "onlive")) {
                    str = "onLive";
                } else if (TEnum.equals(bLiveState, "stopped")) {
                    str = "endLive";
                }
                jSONObject.put("liveStatus", str);
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        this.f20563i.o(jSONObject);
    }

    /* JADX INFO: renamed from: T */
    public void m23411T() {
        super.T();
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.tad0
            public final void call(Object obj) {
                this.f20145a.m23409L3((c) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        cwf0 cwf0Var = this.f20563i;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f20563i.j();
            this.f20563i = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m23412t() {
        super.t();
        m23410K3();
        this.f20563i.i();
        this.f20563i.l();
    }
}
