package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d4j extends t3j {
    @Override // p009l.t3j, p009l.fol
    /* JADX INFO: renamed from: o */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        return upa.P1() && c0034d != null && c0034d.getUser() != null && i == 0 && m13005p(c0034d);
    }

    /* JADX INFO: renamed from: p */
    public boolean m13005p(C0034d c0034d) {
        User user = c0034d.getUser();
        CoreSuggested.UserInfo userInfo = c0034d.getUserInfo();
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
