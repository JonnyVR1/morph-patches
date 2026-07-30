package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tfs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            xsu0.m210834k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        pdw0 pdw0VarM174122l = qdw0.m174122l();
        pdw0VarM174122l.mo168435b((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        pdw0VarM174122l.mo168441h(q9t0Var.getWidth());
        pdw0VarM174122l.mo168440g(q9t0Var.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            pdw0VarM174122l.mo168437d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            pdw0VarM174122l.mo168437d(81);
        }
        if (map.containsKey("verticalMargin")) {
            pdw0VarM174122l.mo168438e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            pdw0VarM174122l.mo168438e(0.02f);
        }
        if (map.containsKey("enifd")) {
            pdw0VarM174122l.mo168434a((String) map.get("enifd"));
        }
        try {
            vny0.m199074l().m211041j(q9t0Var, pdw0VarM174122l.mo168442i());
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            xsu0.m210834k("Missing parameters for LMD Overlay show request");
        }
    }
}
