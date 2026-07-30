package p002l;

import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.ffw;
import l.mkd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p9t extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final String f17160i;

    /* JADX INFO: renamed from: j */
    public cwf0 f17161j;

    /* JADX INFO: renamed from: k */
    public boolean f17162k;

    /* JADX INFO: renamed from: l */
    public c4g0 f17163l;

    public p9t(bsm bsmVar, String str) {
        super(bsmVar);
        this.f17162k = false;
        this.f17160i = str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX INFO: renamed from: M3 */
    public final void m20159M3() {
        this.f17161j = new cwf0(mo21430R2(), wat.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", m25547E2().m17235k());
            jSONObject.put("anchorId", m25547E2().m14576j0());
            jSONObject.put("live_entrance_source", this.f17160i);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f17161j.o(jSONObject);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m20160N3(c cVar) {
        cwf0 cwf0Var = this.f17161j;
        if (cwf0Var == null) {
            return;
        }
        if (cVar == c.i && this.f17162k) {
            this.f17162k = false;
            cwf0Var.l();
        } else if (cVar == c.k) {
            this.f17162k = true;
            cwf0Var.k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m20161O3(iqv iqvVar) {
        Map map = (Map) m14184F3(new rw2(4500));
        map.put("live_id", m25547E2().m17235k());
        zvf0.s("e_beauty_live_start", "p_anchor_live_ready", map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m20162P3(iqv iqvVar) {
        Map map = (Map) m14184F3(new rw2(4500));
        map.put("live_id", m25547E2().m17235k());
        zvf0.s("e_beauty_live_end", mo21430R2(), map);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T */
    public void m20163T() {
        super.T();
        this.f17163l = this.f22036e.f8337f.lifecycle().subscribe(ffw.d(new e30() { // from class: l.k9t
            public final void call(Object obj) {
                this.f14261a.m20160N3((c) obj);
            }
        }));
        duringCreated(m25547E2().m17236l()).takeFirst(new l9t()).subscribe(ffw.d(new e30() { // from class: l.m9t
            public final void call(Object obj) {
                this.f15291a.m20161O3((iqv) obj);
            }
        }));
        duringCreated(m25547E2().m17236l()).takeFirst(new n9t()).subscribe(ffw.d(new e30() { // from class: l.o9t
            public final void call(Object obj) {
                this.f16448a.m20162P3((iqv) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        cwf0 cwf0Var = this.f17161j;
        if (cwf0Var != null) {
            cwf0Var.j();
        }
        mkd0.z(this.f17163l);
    }

    /* JADX INFO: renamed from: t */
    public void m20164t() {
        super.t();
        m20159M3();
        this.f17161j.i();
        this.f17161j.l();
    }
}
