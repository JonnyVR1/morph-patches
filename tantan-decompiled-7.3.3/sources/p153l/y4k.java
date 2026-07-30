package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;

/* JADX INFO: loaded from: classes9.dex */
public class y4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: c */
    public void mo108063c(Act act, LiveGoAction liveGoAction) {
        super.mo108063c(act, liveGoAction);
        if (liveGoAction.getGoExtra() != null) {
            liveGoAction.getGoExtra().get("avatar");
            liveGoAction.getGoExtra().get(AuthenticationTokenClaims.JSON_KEY_NAME);
            liveGoAction.getGoExtra().get("ttc");
        }
        jwk0.m147169c(act, liveGoAction.getGoData(), Square.TYPE);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (mwl.m160558h(act)) {
            return;
        }
        if (mbs.m157853g().isNewMainActContext(act)) {
            m160564b(act, "videoChatSquare", null);
        }
        String strM199898j = v5k0.m199898j(abe0Var, "source");
        String strM199898j2 = v5k0.m199898j(abe0Var, "roomId");
        if (TextUtils.isEmpty(strM199898j2)) {
            return;
        }
        jwk0.m147169c(act, strM199898j2, strM199898j);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: j */
    public boolean mo108064j(int i) {
        return 4 == i;
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("videoChatRoom").equals(str);
    }
}
