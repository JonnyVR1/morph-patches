package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ox4 {
    /* JADX INFO: renamed from: a */
    public static void m19801a(ChatListView chatListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatListView.f4950a = (TopChatView) viewGroup.getChildAt(0);
        chatListView.f4951b = (FrameLayout) viewGroup.getChildAt(1);
        chatListView.f4952c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        chatListView.f4953d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        chatListView.f4954e = (UserNotificationView) viewGroup.getChildAt(2);
    }
}
