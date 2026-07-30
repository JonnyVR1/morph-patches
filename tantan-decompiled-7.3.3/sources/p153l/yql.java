package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface yql {
    /* JADX INFO: renamed from: a */
    void mo73876a(String str);

    /* JADX INFO: renamed from: b */
    void mo73877b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage);

    /* JADX INFO: renamed from: c */
    void mo73878c();

    /* JADX INFO: renamed from: d */
    void mo73879d(LiveMessage liveMessage);

    /* JADX INFO: renamed from: e */
    void mo73880e(LiveUserInfo liveUserInfo, long j);

    /* JADX INFO: renamed from: f */
    void mo73881f(List<BLiveTemplateMenu> list);

    gt4 getAdapter();

    String getChatScene();

    p9s getLiveDragonListViewHelper();

    String getLiveMode();

    /* JADX INFO: renamed from: i */
    void mo73882i(p9t p9tVar);

    /* JADX INFO: renamed from: j */
    void mo73883j();

    /* JADX INFO: renamed from: k */
    void mo73884k(a5s a5sVar, View view, String str, LiveMessage liveMessage);
}
