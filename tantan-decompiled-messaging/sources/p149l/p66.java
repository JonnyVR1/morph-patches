package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p66 {
    /* JADX INFO: renamed from: a */
    public static void m167641a(ConversationFilterLayout conversationFilterLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFilterLayout.f24698a = (VRecyclerView) viewGroup.getChildAt(0);
        conversationFilterLayout.f24699b = (VText) viewGroup.getChildAt(1);
        conversationFilterLayout.f24700c = (FrameLayout) viewGroup.getChildAt(2);
        conversationFilterLayout.f24701d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
