package p149l;

import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;

/* JADX INFO: loaded from: classes10.dex */
public class kq6 {
    /* JADX INFO: renamed from: a */
    public static void m146926a(ConversationsList conversationsList, View view) {
        conversationsList.f25099S = (ConversationsList) view;
        conversationsList.f25101T = (PullQuickChatLayout) view.findViewById(u4c0.f174193c7);
        conversationsList.f25103U = (FrameLayout) view.findViewById(u4c0.f174210d7);
        conversationsList.f25105V = (ConvCellList) view.findViewById(u4c0.f174176b7);
        conversationsList.f25107W = (ConversationFilterLayout) view.findViewById(u4c0.f174342l4);
    }
}
