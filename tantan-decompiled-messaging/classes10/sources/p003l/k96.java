package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationItemInstantChatGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k96 {
    /* JADX INFO: renamed from: a */
    public static void m7551a(ConversationItemInstantChatGuideView conversationItemInstantChatGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemInstantChatGuideView.a = viewGroup.getChildAt(0);
        conversationItemInstantChatGuideView.b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemInstantChatGuideView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemInstantChatGuideView.d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemInstantChatGuideView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemInstantChatGuideView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.h = viewGroup.getChildAt(2);
    }
}
