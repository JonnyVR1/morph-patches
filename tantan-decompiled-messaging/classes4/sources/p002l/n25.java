package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n25 {
    /* JADX INFO: renamed from: a */
    public static void m18425a(ChatView chatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatView.f4779a = (ChatListView) viewGroup.getChildAt(0);
        chatView.f4780b = viewGroup.getChildAt(1);
        chatView.f4781c = viewGroup.getChildAt(2);
    }
}
