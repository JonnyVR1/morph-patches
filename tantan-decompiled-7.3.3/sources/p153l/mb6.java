package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemReceiveLikeView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mb6 {
    /* JADX INFO: renamed from: a */
    public static void m157773a(ConversationItemReceiveLikeView conversationItemReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemReceiveLikeView.f25612a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemReceiveLikeView.f25613b = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemReceiveLikeView.f25614c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemReceiveLikeView.f25615d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.f25616e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemReceiveLikeView.f25617f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.f25618g = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemReceiveLikeView.f25619h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.f25620i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemReceiveLikeView.f25621j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.f25622k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
