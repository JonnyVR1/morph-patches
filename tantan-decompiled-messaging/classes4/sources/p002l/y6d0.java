package p002l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import l.e30;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y6d0<T extends ho2> extends rh2<T> {
    public y6d0(bsm<T> bsmVar, ChatListView chatListView) {
        super(bsmVar, chatListView);
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

    @Override // p002l.rh2
    /* JADX INFO: renamed from: O4 */
    public void mo21969O4(RecyclerView recyclerView) {
        if (m25547E2() instanceof o91) {
            ((o91) m25547E2()).mo9890b().m9781b(RecyclerViewPoolType.CHAT, recyclerView, new e30() { // from class: l.x6d0
                public final void call(Object obj) {
                    ((RecyclerView.u) obj).m(t6c0.f19743Y, 10);
                }
            });
        }
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: m4 */
    public void mo21982m4() {
        super.mo21982m4();
    }
}
