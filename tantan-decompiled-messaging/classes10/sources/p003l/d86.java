package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemBlindBoxEntrance;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d86 {
    /* JADX INFO: renamed from: a */
    public static void m6090a(ConversationItemBlindBoxEntrance conversationItemBlindBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemBlindBoxEntrance.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemBlindBoxEntrance.b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemBlindBoxEntrance.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemBlindBoxEntrance.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemBlindBoxEntrance.e = (TextView) viewGroup.getChildAt(2);
    }
}
