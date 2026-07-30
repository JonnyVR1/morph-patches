package p149l;

import android.app.Activity;
import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class cqf implements cwr {
    /* JADX INFO: renamed from: d */
    public static void m108256d(Activity activity, LiveGoAction liveGoAction) {
        if (liveGoAction.getGoExtra() == null || !(activity instanceof Act)) {
            return;
        }
        String str = liveGoAction.getGoExtra().get("source");
        String goData = liveGoAction.getGoData();
        goData.getClass();
        switch (goData) {
            case "voiceChat":
                l9s.m149076g().mo30714Oa((Act) activity, "voice_quick_chat", str, Boolean.FALSE);
                break;
            case "onlineChat":
                l9s.m149076g().mo30714Oa((Act) activity, UnlockConversationType.quick_chat, str, Boolean.FALSE);
                break;
            case "videoChat":
                l9s.m149044G().mo67275nf((Act) activity, str);
                break;
        }
    }

    @Override // p149l.cwr
    /* JADX INFO: renamed from: a */
    public void mo108257a(Context context, LiveGoAction liveGoAction) {
        if (liveGoAction == null) {
            return;
        }
        if (!(context instanceof Act)) {
            context = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
            if (!(context instanceof Act)) {
                return;
            }
        }
        Act act = (Act) context;
        if (eqs.m117787o(act, liveGoAction)) {
            return;
        }
        fqs.m122742b(String.valueOf(liveGoAction.getType()), false);
        if (liveGoAction.getType() == 9) {
            m108256d(act, liveGoAction);
            return;
        }
        yuf0.m216111a(context, null);
        CrashHelper.m81296c(new IllegalArgumentException("LiveGoAction type:" + liveGoAction.getType()));
    }

    @Override // p149l.cwr
    public C22306c<AuthData> accessOutterToken() {
        return l9s.m149070d();
    }

    @Override // p149l.cwr
    /* JADX INFO: renamed from: b */
    public uut mo108258b() {
        return s9s.f163228b;
    }

    @Override // p149l.cwr
    /* JADX INFO: renamed from: c */
    public void mo108259c() {
        LiveVerificationApi.requestLiveVerification();
    }

    @Override // p149l.cwr
    public String getUserId() {
        return l9s.m149093o0();
    }
}
