package p002l;

import com.p000p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import l.cwf0;
import l.j760;
import l.vwb;
import l.ypv;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tk80 {

    /* JADX INFO: renamed from: a */
    public cwf0 f20283a;

    /* JADX INFO: renamed from: b */
    public boolean f20284b = false;

    /* JADX INFO: renamed from: e */
    public static void m22997e(String str) {
        zvf0.u("e_live_start", str, new j760[]{vwb.Y("beauty_function_type", "new")});
    }

    /* JADX INFO: renamed from: a */
    public void m22998a() {
        if (this.f20283a == null) {
            this.f20283a = new cwf0("p_anchor_live_ready", PreviewView.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", ypv.a.D0());
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
            this.f20283a.o(jSONObject);
        }
        this.f20283a.i();
    }

    /* JADX INFO: renamed from: b */
    public void m22999b(c cVar) {
        cwf0 cwf0Var = this.f20283a;
        if (cwf0Var == null) {
            return;
        }
        if (cVar == c.i && this.f20284b) {
            this.f20284b = false;
            cwf0Var.l();
        } else if (cVar == c.j) {
            this.f20284b = true;
            cwf0Var.k();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23000c() {
        cwf0 cwf0Var = this.f20283a;
        if (cwf0Var != null) {
            cwf0Var.k();
            this.f20283a.j();
            this.f20283a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m23001d() {
        cwf0 cwf0Var = this.f20283a;
        if (cwf0Var != null) {
            cwf0Var.l();
        }
    }
}
