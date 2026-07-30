package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bb6 {
    /* JADX INFO: renamed from: a */
    public static void m100953a(ConversationItemSurpriseBoxEntrance conversationItemSurpriseBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSurpriseBoxEntrance.f24886a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.f24887b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.f24888c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemSurpriseBoxEntrance.f24889d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.f24890e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.f24891f = (TextView) viewGroup.getChildAt(2);
    }
}
