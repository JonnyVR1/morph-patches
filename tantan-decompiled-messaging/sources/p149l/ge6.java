package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationLeftToolBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ge6 {
    /* JADX INFO: renamed from: a */
    public static void m125680a(ConversationLeftToolBar conversationLeftToolBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationLeftToolBar.f24955a = (FrameLayout) viewGroup.getChildAt(0);
        conversationLeftToolBar.f24956b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationLeftToolBar.f24957c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationLeftToolBar.f24958d = (LinearLayout) viewGroup.getChildAt(1);
        conversationLeftToolBar.f24959e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationLeftToolBar.f24960f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationLeftToolBar.f24961g = (FrameLayout) viewGroup.getChildAt(2);
        conversationLeftToolBar.f24962h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationLeftToolBar.f24963i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
