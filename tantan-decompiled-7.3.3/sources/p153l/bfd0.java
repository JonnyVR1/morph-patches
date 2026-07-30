package p153l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class bfd0<T extends oo2> extends yh2<T> {
    public bfd0(dum<T> dumVar, ChatListView chatListView) {
        super(dumVar, chatListView);
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

    @Override // p153l.yh2
    /* JADX INFO: renamed from: O4 */
    public void mo103884O4(RecyclerView recyclerView) {
        if (m213810E2() instanceof v91) {
            ((v91) m213810E2()).mo146608b().m104770b(RecyclerViewPoolType.CHAT, recyclerView, new y20() { // from class: l.afd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((RecyclerView.C0585u) obj).m3440m(yec0.f198979Y, 10);
                }
            });
        }
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: m4 */
    public void mo103885m4() {
        super.mo103885m4();
    }
}
