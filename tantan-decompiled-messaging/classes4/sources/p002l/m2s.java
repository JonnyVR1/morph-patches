package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m2s extends rh2<yl40> {
    public m2s(rn40 rn40Var, ChatListView chatListView) {
        super(rn40Var, chatListView);
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: K4 */
    public void mo17682K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        super.mo17682K4(z2sVar, view, str, liveMessage);
        str.getClass();
        if ((str.equals("profile") || str.equals("buttonOpenProfile")) && liveMessage.extInfo != null) {
            boolean zEquals = "profile".equals(str);
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            BLiveAtUserInfo bLiveAtUserInfo = zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo;
            m21971Q4(new LiveUserInfo(bLiveAtUserInfo.userId, bLiveAtUserInfo.userName), liveMessage.seq, true);
        }
    }
}
