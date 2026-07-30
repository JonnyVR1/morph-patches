package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Square;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes13.dex */
public class g2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: c */
    public void mo124162c(Act act, LiveGoAction liveGoAction) {
        super.mo124162c(act, liveGoAction);
        if (liveGoAction.getGoExtra() != null) {
            liveGoAction.getGoExtra().get("avatar");
            liveGoAction.getGoExtra().get(AuthenticationTokenClaims.JSON_KEY_NAME);
            liveGoAction.getGoExtra().get("ttc");
        }
        dnk0.m112644c(act, liveGoAction.getGoData(), Square.TYPE);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (ytl.m216064h(act)) {
            return;
        }
        if (l9s.m149076g().isNewMainActContext(act)) {
            m216069b(act, "videoChatSquare", null);
        }
        String strM181411j = rwj0.m181411j(w2e0Var, "source");
        String strM181411j2 = rwj0.m181411j(w2e0Var, "roomId");
        if (TextUtils.isEmpty(strM181411j2)) {
            return;
        }
        dnk0.m112644c(act, strM181411j2, strM181411j);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: j */
    public boolean mo124163j(int i) {
        return 4 == i;
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a("videoChatRoom").equals(str);
    }
}
