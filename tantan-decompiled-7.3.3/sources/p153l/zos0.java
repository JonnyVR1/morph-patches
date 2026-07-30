package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zos0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            d2v0.m113737k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        vmw0 vmw0VarM207135l = wmw0.m207135l();
        vmw0VarM207135l.mo201848b((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        vmw0VarM207135l.mo201854h(wit0Var.getWidth());
        vmw0VarM207135l.mo201853g(wit0Var.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            vmw0VarM207135l.mo201850d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            vmw0VarM207135l.mo201850d(81);
        }
        if (map.containsKey("verticalMargin")) {
            vmw0VarM207135l.mo201851e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            vmw0VarM207135l.mo201851e(0.02f);
        }
        if (map.containsKey("enifd")) {
            vmw0VarM207135l.mo201847a((String) map.get("enifd"));
        }
        try {
            bxy0.m106928l().m114067j(wit0Var, vmw0VarM207135l.mo201855i());
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            d2v0.m113737k("Missing parameters for LMD Overlay show request");
        }
    }
}
