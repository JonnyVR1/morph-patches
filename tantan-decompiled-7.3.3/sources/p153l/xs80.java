package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class xs80 {

    /* JADX INFO: renamed from: a */
    public l4g0 f196067a;

    /* JADX INFO: renamed from: b */
    public boolean f196068b = false;

    /* JADX INFO: renamed from: e */
    public static void m212958e(String str) {
        i4g0.m138523u("e_live_start", str, jyb.m147494Y("beauty_function_type", ShareConstants.NEW_VERSION));
    }

    /* JADX INFO: renamed from: a */
    public void m212959a() {
        if (this.f196067a == null) {
            this.f196067a = new l4g0("p_anchor_live_ready", PreviewView.class.getName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchorId", zrv.f205799a.m207631D0());
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
            this.f196067a.m152780o(jSONObject);
        }
        this.f196067a.m152774i();
    }

    /* JADX INFO: renamed from: b */
    public void m212960b(C4470c c4470c) {
        l4g0 l4g0Var = this.f196067a;
        if (l4g0Var == null) {
            return;
        }
        if (c4470c == C4470c.f16267i && this.f196068b) {
            this.f196068b = false;
            l4g0Var.m152777l();
        } else if (c4470c == C4470c.f16268j) {
            this.f196068b = true;
            l4g0Var.m152776k();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m212961c() {
        l4g0 l4g0Var = this.f196067a;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            this.f196067a.m152775j();
            this.f196067a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m212962d() {
        l4g0 l4g0Var = this.f196067a;
        if (l4g0Var != null) {
            l4g0Var.m152777l();
        }
    }
}
