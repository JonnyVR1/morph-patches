package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.LiveChatItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k2s {
    /* JADX INFO: renamed from: a */
    public static void m16478a(LiveChatItem liveChatItem, View view) {
        liveChatItem.f4789a = (LiveChatItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveChatItem.f4790b = (LinearLayout) viewGroup.getChildAt(0);
        liveChatItem.f4791c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveChatItem.f4792d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveChatItem.f4793e = viewGroup.getChildAt(1);
    }
}
