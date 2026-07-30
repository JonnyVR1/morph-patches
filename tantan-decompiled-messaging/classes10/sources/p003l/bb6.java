package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bb6 {
    /* JADX INFO: renamed from: a */
    public static void m5705a(ConversationItemSurpriseBoxEntrance conversationItemSurpriseBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSurpriseBoxEntrance.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemSurpriseBoxEntrance.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.f = (TextView) viewGroup.getChildAt(2);
    }
}
