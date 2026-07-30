package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class p9t extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final String f147809i;

    /* JADX INFO: renamed from: j */
    public cwf0 f147810j;

    /* JADX INFO: renamed from: k */
    public boolean f147811k;

    /* JADX INFO: renamed from: l */
    public c4g0 f147812l;

    public p9t(bsm bsmVar, String str) {
        super(bsmVar);
        this.f147811k = false;
        this.f147809i = str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public final void m167881M3() {
        this.f147810j = new cwf0(mo77274R2(), wat.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", m206027E2().m149814k());
            jSONObject.put("anchorId", m206027E2().m132140j0());
            jSONObject.put("live_entrance_source", this.f147809i);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f147810j.m109039o(jSONObject);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m167882N3(C4319c c4319c) {
        cwf0 cwf0Var = this.f147810j;
        if (cwf0Var == null) {
            return;
        }
        if (c4319c == C4319c.f15548i && this.f147811k) {
            this.f147811k = false;
            cwf0Var.m109036l();
        } else if (c4319c == C4319c.f15550k) {
            this.f147811k = true;
            cwf0Var.m109035k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m167883O3(iqv iqvVar) {
        Map map = (Map) m129297F3(new rw2(4500));
        map.put("live_id", m206027E2().m149814k());
        zvf0.m220397s("e_beauty_live_start", "p_anchor_live_ready", map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m167884P3(iqv iqvVar) {
        Map map = (Map) m129297F3(new rw2(4500));
        map.put("live_id", m206027E2().m149814k());
        zvf0.m220397s("e_beauty_live_end", mo77274R2(), map);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f147812l = this.f188512e.f77100f.lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.k9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122070a.m167882N3((C4319c) obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).takeFirst(new l9t()).subscribe(ffw.m121193d(new e30() { // from class: l.m9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132800a.m167883O3((iqv) obj);
            }
        }));
        duringCreated(m206027E2().m149815l()).takeFirst(new n9t()).subscribe(ffw.m121193d(new e30() { // from class: l.o9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142743a.m167884P3((iqv) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        cwf0 cwf0Var = this.f147810j;
        if (cwf0Var != null) {
            cwf0Var.m109034j();
        }
        mkd0.m154992z(this.f147812l);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m167881M3();
        this.f147810j.m109033i();
        this.f147810j.m109036l();
    }
}
