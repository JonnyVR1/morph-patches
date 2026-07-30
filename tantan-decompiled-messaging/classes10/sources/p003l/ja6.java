package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemReceiveLikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ja6 {
    /* JADX INFO: renamed from: a */
    public static void m7381a(ConversationItemReceiveLikeView conversationItemReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemReceiveLikeView.a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemReceiveLikeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemReceiveLikeView.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemReceiveLikeView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemReceiveLikeView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.g = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemReceiveLikeView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemReceiveLikeView.j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
