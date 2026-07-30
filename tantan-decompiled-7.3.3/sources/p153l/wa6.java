package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemIntlReceiveLikeView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wa6 {
    /* JADX INFO: renamed from: a */
    public static void m205635a(ConversationItemIntlReceiveLikeView conversationItemIntlReceiveLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemIntlReceiveLikeView.f25576a = (FrameLayout) viewGroup.getChildAt(0);
        conversationItemIntlReceiveLikeView.f25577b = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f25578c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemIntlReceiveLikeView.f25579d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationItemIntlReceiveLikeView.f25580e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f25581f = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemIntlReceiveLikeView.f25582g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemIntlReceiveLikeView.f25583h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemIntlReceiveLikeView.f25584i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
