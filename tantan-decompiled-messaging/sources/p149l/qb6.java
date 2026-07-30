package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qb6 {
    /* JADX INFO: renamed from: a */
    public static void m173820a(ConversationItemUserStatesView conversationItemUserStatesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemUserStatesView.f24907a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemUserStatesView.f24908b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemUserStatesView.f24909c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemUserStatesView.f24910d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemUserStatesView.f24911e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemUserStatesView.f24912f = (TextView) viewGroup.getChildAt(2);
    }
}
