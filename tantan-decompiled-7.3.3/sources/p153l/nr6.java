package p153l;

import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;

/* JADX INFO: loaded from: classes10.dex */
public class nr6 {
    /* JADX INFO: renamed from: a */
    public static void m164461a(ConversationsList conversationsList, View view) {
        conversationsList.f25841S = (ConversationsList) view;
        conversationsList.f25843T = (PullQuickChatLayout) view.findViewById(adc0.f70318e7);
        conversationsList.f25845U = (FrameLayout) view.findViewById(adc0.f70335f7);
        conversationsList.f25847V = (ConvCellList) view.findViewById(adc0.f70301d7);
        conversationsList.f25849W = (ConversationFilterLayout) view.findViewById(adc0.f70467n4);
    }
}
