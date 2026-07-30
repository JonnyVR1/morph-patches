package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemInstantChatGuideView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k96 {
    /* JADX INFO: renamed from: a */
    public static void m145027a(ConversationItemInstantChatGuideView conversationItemInstantChatGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemInstantChatGuideView.f24821a = (VDraweeView) viewGroup.getChildAt(0);
        conversationItemInstantChatGuideView.f24822b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemInstantChatGuideView.f24823c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemInstantChatGuideView.f24824d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemInstantChatGuideView.f24825e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemInstantChatGuideView.f24826f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.f24827g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.f24828h = (VImage) viewGroup.getChildAt(2);
    }
}
