package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class d4j extends t3j {
    @Override // p149l.t3j, p149l.fol
    /* JADX INFO: renamed from: o */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return upa.m194682P1() && c7870d != null && c7870d.getUser() != null && i == 0 && m109989p(c7870d);
    }

    /* JADX INFO: renamed from: p */
    public boolean m109989p(C7870d c7870d) {
        User user = c7870d.getUser();
        CoreSuggested.UserInfo userInfo = c7870d.getUserInfo();
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
