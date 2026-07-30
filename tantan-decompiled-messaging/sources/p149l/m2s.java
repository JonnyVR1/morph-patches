package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;

/* JADX INFO: loaded from: classes4.dex */
public class m2s extends rh2<yl40> {
    public m2s(rn40 rn40Var, ChatListView chatListView) {
        super(rn40Var, chatListView);
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: K4 */
    public void mo152703K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        super.mo152703K4(z2sVar, view, str, liveMessage);
        str.getClass();
        if ((str.equals("profile") || str.equals("buttonOpenProfile")) && liveMessage.extInfo != null) {
            boolean zEquals = "profile".equals(str);
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            BLiveAtUserInfo bLiveAtUserInfo = zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo;
            m179306Q4(new LiveUserInfo(bLiveAtUserInfo.userId, bLiveAtUserInfo.userName), liveMessage.seq, true);
        }
    }
}
