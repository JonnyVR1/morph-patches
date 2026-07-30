package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class tk80 {

    /* JADX INFO: renamed from: a */
    public cwf0 f170825a;

    /* JADX INFO: renamed from: b */
    public boolean f170826b = false;

    /* JADX INFO: renamed from: e */
    public static void m189431e(String str) {
        zvf0.m220399u("e_live_start", str, vwb.m200311Y("beauty_function_type", ShareConstants.NEW_VERSION));
    }

    /* JADX INFO: renamed from: a */
    public void m189432a() {
        if (this.f170825a == null) {
            this.f170825a = new cwf0("p_anchor_live_ready", PreviewView.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", ypv.f199493a.m199309D0());
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
            this.f170825a.m109039o(jSONObject);
        }
        this.f170825a.m109033i();
    }

    /* JADX INFO: renamed from: b */
    public void m189433b(C4319c c4319c) {
        cwf0 cwf0Var = this.f170825a;
        if (cwf0Var == null) {
            return;
        }
        if (c4319c == C4319c.f15548i && this.f170826b) {
            this.f170826b = false;
            cwf0Var.m109036l();
        } else if (c4319c == C4319c.f15549j) {
            this.f170826b = true;
            cwf0Var.m109035k();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m189434c() {
        cwf0 cwf0Var = this.f170825a;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            this.f170825a.m109034j();
            this.f170825a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m189435d() {
        cwf0 cwf0Var = this.f170825a;
        if (cwf0Var != null) {
            cwf0Var.m109036l();
        }
    }
}
