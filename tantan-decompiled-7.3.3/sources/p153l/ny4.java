package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ny4 {
    /* JADX INFO: renamed from: a */
    public static void m165309a(ChatListView chatListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatListView.f49756a = (TopChatView) viewGroup.getChildAt(0);
        chatListView.f49757b = (FrameLayout) viewGroup.getChildAt(1);
        chatListView.f49758c = (LiveFadeRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        chatListView.f49759d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        chatListView.f49760e = (UserNotificationView) viewGroup.getChildAt(2);
    }
}
