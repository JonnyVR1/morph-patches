package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemInstantChatGuideView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pa6 {
    /* JADX INFO: renamed from: a */
    public static void m171414a(ConversationItemInstantChatGuideView conversationItemInstantChatGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemInstantChatGuideView.f25563a = (VDraweeView) viewGroup.getChildAt(0);
        conversationItemInstantChatGuideView.f25564b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemInstantChatGuideView.f25565c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemInstantChatGuideView.f25566d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemInstantChatGuideView.f25567e = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemInstantChatGuideView.f25568f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.f25569g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemInstantChatGuideView.f25570h = (VImage) viewGroup.getChildAt(2);
    }
}
