package p153l;

import android.app.Activity;
import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class jrf implements dyr {
    /* JADX INFO: renamed from: d */
    public static void m146734d(Activity activity, LiveGoAction liveGoAction) {
        if (liveGoAction.getGoExtra() == null || !(activity instanceof Act)) {
            return;
        }
        String str = liveGoAction.getGoExtra().get("source");
        String goData = liveGoAction.getGoData();
        goData.getClass();
        switch (goData) {
            case "voiceChat":
                mbs.m157853g().mo31717Oa((Act) activity, "voice_quick_chat", str, Boolean.FALSE);
                break;
            case "onlineChat":
                mbs.m157853g().mo31717Oa((Act) activity, UnlockConversationType.quick_chat, str, Boolean.FALSE);
                break;
            case "videoChat":
                mbs.m157821G().mo68458nf((Act) activity, str);
                break;
        }
    }

    @Override // p153l.dyr
    /* JADX INFO: renamed from: a */
    public void mo118711a(Context context, LiveGoAction liveGoAction) {
        if (liveGoAction == null) {
            return;
        }
        if (!(context instanceof Act)) {
            context = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
            if (!(context instanceof Act)) {
                return;
            }
        }
        Act act = (Act) context;
        if (fss.m127252o(act, liveGoAction)) {
            return;
        }
        gss.m132146b(String.valueOf(liveGoAction.getType()), false);
        if (liveGoAction.getType() == 9) {
            m146734d(act, liveGoAction);
            return;
        }
        h3g0.m133482a(context, null);
        CrashHelper.m82479c(new IllegalArgumentException("LiveGoAction type:" + liveGoAction.getType()));
    }

    @Override // p153l.dyr
    public C22421c<AuthData> accessOutterToken() {
        return mbs.m157847d();
    }

    @Override // p153l.dyr
    /* JADX INFO: renamed from: b */
    public vwt mo118712b() {
        return tbs.f172989b;
    }

    @Override // p153l.dyr
    /* JADX INFO: renamed from: c */
    public void mo118713c() {
        LiveVerificationApi.requestLiveVerification();
    }

    @Override // p153l.dyr
    public String getUserId() {
        return mbs.m157870o0();
    }
}
