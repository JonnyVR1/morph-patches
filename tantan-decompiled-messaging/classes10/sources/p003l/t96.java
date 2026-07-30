package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemIntlReceiveLikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t96 {
    /* JADX INFO: renamed from: a */
    public static void m9551a(ConversationItemIntlReceiveLikeView conversationItemIntlReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemIntlReceiveLikeView.a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemIntlReceiveLikeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemIntlReceiveLikeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemIntlReceiveLikeView.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemIntlReceiveLikeView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemIntlReceiveLikeView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemIntlReceiveLikeView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemIntlReceiveLikeView.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
