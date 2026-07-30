package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;

/* JADX INFO: loaded from: classes13.dex */
public class f3k extends aul {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        if ("voice.live.activity.refresh".equals(str)) {
            LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
        }
        if ("voice.live.counter.refresh".equals(str)) {
            qib0.f154713b0.f139232c.mo67228Lh().mo95354h();
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if ("live/updateVoiceActivitiesNum".equals(str)) {
            LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
        } else if ("live/updateNewVoiceActivitiesNum".equals(str)) {
            qib0.f154713b0.f139232c.mo67228Lh().mo95354h();
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return "voice.live.activity.refresh".equals(str) || "voice.live.counter.refresh".equals(str);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/updateVoiceActivitiesNum".equals(str) || "live/updateNewVoiceActivitiesNum".equals(str);
    }
}
