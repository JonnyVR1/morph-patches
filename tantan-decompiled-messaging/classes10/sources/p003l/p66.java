package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p66 {
    /* JADX INFO: renamed from: a */
    public static void m8714a(ConversationFilterLayout conversationFilterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFilterLayout.a = viewGroup.getChildAt(0);
        conversationFilterLayout.b = viewGroup.getChildAt(1);
        conversationFilterLayout.c = (FrameLayout) viewGroup.getChildAt(2);
        conversationFilterLayout.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
