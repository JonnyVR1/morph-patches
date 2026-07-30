package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;

/* JADX INFO: loaded from: classes9.dex */
public class t5k extends owl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        Boolean bool = pushMessageCustom.canUserStartLive;
        LiveAssertApi.updateCanUserStartLive(bool != null && bool.booleanValue());
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (!"live/refreshGuildAuth".equals(str)) {
            if ("live/updateCanUserStartLive".equals(str)) {
                LiveAssertApi.updateCanUserStartLive(v5k0.m199893e(abe0Var, "hasPermission"));
            }
        } else {
            LiveVerificationApi.requestLiveVerification();
            if (act instanceof LiveWebViewAct) {
                act.m68056e2();
            }
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return "live.startlive.authorized".equals(str);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/updateCanUserStartLive".equals(str) || "live/refreshGuildAuth".equals(str);
    }
}
