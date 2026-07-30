package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u76 {
    /* JADX INFO: renamed from: a */
    public static void m194836a(ConversationFilterLayout conversationFilterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFilterLayout.f25440a = (VRecyclerView) viewGroup.getChildAt(0);
        conversationFilterLayout.f25441b = (VText) viewGroup.getChildAt(1);
        conversationFilterLayout.f25442c = (FrameLayout) viewGroup.getChildAt(2);
        conversationFilterLayout.f25443d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
