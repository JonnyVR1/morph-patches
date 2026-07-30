package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface nol {
    /* JADX INFO: renamed from: a */
    void mo6196a(String str);

    /* JADX INFO: renamed from: b */
    void mo6197b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage);

    /* JADX INFO: renamed from: c */
    void mo6198c();

    /* JADX INFO: renamed from: d */
    void mo6199d(LiveMessage liveMessage);

    /* JADX INFO: renamed from: e */
    void mo6200e(LiveUserInfo liveUserInfo, long j);

    /* JADX INFO: renamed from: f */
    void mo6201f(List<BLiveTemplateMenu> list);

    hs4 getAdapter();

    String getChatScene();

    o7s getLiveDragonListViewHelper();

    String getLiveMode();

    /* JADX INFO: renamed from: i */
    void mo6202i(o7t o7tVar);

    /* JADX INFO: renamed from: j */
    void mo6204j();

    /* JADX INFO: renamed from: k */
    void mo6205k(z2s z2sVar, View view, String str, LiveMessage liveMessage);
}
