package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qb6 {
    /* JADX INFO: renamed from: a */
    public static void m8952a(ConversationItemUserStatesView conversationItemUserStatesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemUserStatesView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemUserStatesView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemUserStatesView.c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemUserStatesView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemUserStatesView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemUserStatesView.f = (TextView) viewGroup.getChildAt(2);
    }
}
