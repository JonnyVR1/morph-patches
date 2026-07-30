package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemReceiveLikeView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ja6 {
    /* JADX INFO: renamed from: a */
    public static void m140689a(ConversationItemReceiveLikeView conversationItemReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemReceiveLikeView.f24870a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemReceiveLikeView.f24871b = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemReceiveLikeView.f24872c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemReceiveLikeView.f24873d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.f24874e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemReceiveLikeView.f24875f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.f24876g = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemReceiveLikeView.f24877h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemReceiveLikeView.f24878i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemReceiveLikeView.f24879j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemReceiveLikeView.f24880k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
