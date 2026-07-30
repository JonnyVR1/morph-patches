package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemIntlReceiveLikeView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t96 {
    /* JADX INFO: renamed from: a */
    public static void m187605a(ConversationItemIntlReceiveLikeView conversationItemIntlReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemIntlReceiveLikeView.f24834a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemIntlReceiveLikeView.f24835b = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f24836c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemIntlReceiveLikeView.f24837d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemIntlReceiveLikeView.f24838e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f24839f = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemIntlReceiveLikeView.f24840g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f24841h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemIntlReceiveLikeView.f24842i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
