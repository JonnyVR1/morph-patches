package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;

/* JADX INFO: loaded from: classes4.dex */
public class n4s extends yh2<mu40> {
    public n4s(fw40 fw40Var, ChatListView chatListView) {
        super(fw40Var, chatListView);
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: K4 */
    public void mo103883K4(a5s a5sVar, View view, String str, LiveMessage liveMessage) {
        super.mo103883K4(a5sVar, view, str, liveMessage);
        str.getClass();
        if ((str.equals("profile") || str.equals("buttonOpenProfile")) && liveMessage.extInfo != null) {
            boolean zEquals = "profile".equals(str);
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            BLiveAtUserInfo bLiveAtUserInfo = zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo;
            m215917Q4(new LiveUserInfo(bLiveAtUserInfo.userId, bLiveAtUserInfo.userName), liveMessage.seq, true);
        }
    }
}
