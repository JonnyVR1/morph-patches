package p149l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class y6d0<T extends ho2> extends rh2<T> {
    public y6d0(bsm<T> bsmVar, ChatListView chatListView) {
        super(bsmVar, chatListView);
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

    @Override // p149l.rh2
    /* JADX INFO: renamed from: O4 */
    public void mo179304O4(RecyclerView recyclerView) {
        if (m206027E2() instanceof o91) {
            ((o91) m206027E2()).mo97487b().m96683b(RecyclerViewPoolType.CHAT, recyclerView, new e30() { // from class: l.x6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((RecyclerView.C0583u) obj).m3431m(t6c0.f168247Y, 10);
                }
            });
        }
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: m4 */
    public void mo179317m4() {
        super.mo179317m4();
    }
}
