package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;

/* JADX INFO: loaded from: classes4.dex */
public class n25 {
    /* JADX INFO: renamed from: a */
    public static void m157547a(ChatView chatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatView.f48737a = (ChatListView) viewGroup.getChildAt(0);
        chatView.f48738b = viewGroup.getChildAt(1);
        chatView.f48739c = viewGroup.getChildAt(2);
    }
}
