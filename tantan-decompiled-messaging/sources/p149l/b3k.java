package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;

/* JADX INFO: loaded from: classes13.dex */
public class b3k extends aul {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        Boolean bool = pushMessageCustom.canUserStartLive;
        LiveAssertApi.updateCanUserStartLive(bool != null && bool.booleanValue());
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (!"live/refreshGuildAuth".equals(str)) {
            if ("live/updateCanUserStartLive".equals(str)) {
                LiveAssertApi.updateCanUserStartLive(rwj0.m181406e(w2e0Var, "hasPermission"));
            }
        } else {
            LiveVerificationApi.requestLiveVerification();
            if (act instanceof LiveWebViewAct) {
                act.m66873d2();
            }
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return "live.startlive.authorized".equals(str);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/updateCanUserStartLive".equals(str) || "live/refreshGuildAuth".equals(str);
    }
}
