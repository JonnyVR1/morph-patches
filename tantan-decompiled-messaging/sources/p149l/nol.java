package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface nol {
    /* JADX INFO: renamed from: a */
    void mo72693a(String str);

    /* JADX INFO: renamed from: b */
    void mo72694b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage);

    /* JADX INFO: renamed from: c */
    void mo72695c();

    /* JADX INFO: renamed from: d */
    void mo72696d(LiveMessage liveMessage);

    /* JADX INFO: renamed from: e */
    void mo72697e(LiveUserInfo liveUserInfo, long j);

    /* JADX INFO: renamed from: f */
    void mo72698f(List<BLiveTemplateMenu> list);

    hs4 getAdapter();

    String getChatScene();

    o7s getLiveDragonListViewHelper();

    String getLiveMode();

    /* JADX INFO: renamed from: i */
    void mo72699i(o7t o7tVar);

    /* JADX INFO: renamed from: j */
    void mo72700j();

    /* JADX INFO: renamed from: k */
    void mo72701k(z2s z2sVar, View view, String str, LiveMessage liveMessage);
}
