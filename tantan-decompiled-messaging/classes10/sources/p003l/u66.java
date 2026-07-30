package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationFoldView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u66 {
    /* JADX INFO: renamed from: a */
    public static void m9652a(ConversationFoldView conversationFoldView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFoldView.c = (FrameLayout) viewGroup.getChildAt(0);
        conversationFoldView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationFoldView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationFoldView.f = viewGroup.getChildAt(1);
    }
}
