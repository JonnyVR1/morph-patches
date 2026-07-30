package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class qbt extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final String f156499i;

    /* JADX INFO: renamed from: j */
    public l4g0 f156500j;

    /* JADX INFO: renamed from: k */
    public boolean f156501k;

    /* JADX INFO: renamed from: l */
    public kcg0 f156502l;

    public qbt(dum dumVar, String str) {
        super(dumVar);
        this.f156501k = false;
        this.f156499i = str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    /* JADX INFO: renamed from: M3 */
    public final void m176071M3() {
        this.f156500j = new l4g0(mo78457R2(), xct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("liveId", m213810E2().m202191k());
            jSONObject.put("anchorId", m213810E2().m168526j0());
            jSONObject.put("live_entrance_source", this.f156499i);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f156500j.m152780o(jSONObject);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m176072N3(C4470c c4470c) {
        l4g0 l4g0Var = this.f156500j;
        if (l4g0Var == null) {
            return;
        }
        if (c4470c == C4470c.f16267i && this.f156501k) {
            this.f156501k = false;
            l4g0Var.m152777l();
        } else if (c4470c == C4470c.f16269k) {
            this.f156501k = true;
            l4g0Var.m152776k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m176073O3(jsv jsvVar) {
        Map map = (Map) m138856F3(new hx2(4500));
        map.put("live_id", m213810E2().m202191k());
        i4g0.m138521s("e_beauty_live_start", "p_anchor_live_ready", map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m176074P3(jsv jsvVar) {
        Map map = (Map) m138856F3(new hx2(4500));
        map.put("live_id", m213810E2().m202191k());
        i4g0.m138521s("e_beauty_live_end", mo78457R2(), map);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f156502l = this.f196918e.f90820f.lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.lbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131227a.m176072N3((C4470c) obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).takeFirst(new mbt()).subscribe(dhw.m115825d(new y20() { // from class: l.nbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141257a.m176073O3((jsv) obj);
            }
        }));
        duringCreated(m213810E2().m202192l()).takeFirst(new obt()).subscribe(dhw.m115825d(new y20() { // from class: l.pbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151428a.m176074P3((jsv) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        l4g0 l4g0Var = this.f156500j;
        if (l4g0Var != null) {
            l4g0Var.m152775j();
        }
        psd0.m173633z(this.f156502l);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m176071M3();
        this.f156500j.m152774i();
        this.f156500j.m152777l();
    }
}
