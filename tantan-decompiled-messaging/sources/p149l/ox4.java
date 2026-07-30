package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ox4 {
    /* JADX INFO: renamed from: a */
    public static void m166459a(ChatListView chatListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatListView.f48908a = (TopChatView) viewGroup.getChildAt(0);
        chatListView.f48909b = (FrameLayout) viewGroup.getChildAt(1);
        chatListView.f48910c = (LiveFadeRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        chatListView.f48911d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        chatListView.f48912e = (UserNotificationView) viewGroup.getChildAt(2);
    }
}
