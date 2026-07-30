package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class y6j extends o6j {
    @Override // p153l.o6j, p153l.qql
    /* JADX INFO: renamed from: o */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return gra.m131613P1() && c8021d != null && c8021d.getUser() != null && i == 0 && m214484p(c8021d);
    }

    /* JADX INFO: renamed from: p */
    public boolean m214484p(C8021d c8021d) {
        User user = c8021d.getUser();
        CoreSuggested.UserInfo userInfo = c8021d.getUserInfo();
        if (user.isMe()) {
            return false;
        }
        if (user.superLikedMe() || user.letter()) {
            return true;
        }
        userInfo.isUserLikeMe();
        return false;
    }
}
