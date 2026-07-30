package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;

/* JADX INFO: loaded from: classes4.dex */
public class m35 {
    /* JADX INFO: renamed from: a */
    public static void m156919a(ChatView chatView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        chatView.f49585a = (ChatListView) viewGroup.getChildAt(0);
        chatView.f49586b = viewGroup.getChildAt(1);
        chatView.f49587c = viewGroup.getChildAt(2);
    }
}
