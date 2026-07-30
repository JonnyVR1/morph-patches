package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;

/* JADX INFO: loaded from: classes9.dex */
public class x5k extends owl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        if ("voice.live.activity.refresh".equals(str)) {
            LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
        }
        if ("voice.live.counter.refresh".equals(str)) {
            uqb0.f180396b0.f170326c.mo68411Lh().mo175951h();
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if ("live/updateVoiceActivitiesNum".equals(str)) {
            LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
        } else if ("live/updateNewVoiceActivitiesNum".equals(str)) {
            uqb0.f180396b0.f170326c.mo68411Lh().mo175951h();
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return "voice.live.activity.refresh".equals(str) || "voice.live.counter.refresh".equals(str);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/updateVoiceActivitiesNum".equals(str) || "live/updateNewVoiceActivitiesNum".equals(str);
    }
}
