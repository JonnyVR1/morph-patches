package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemTeamGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jb6 {
    /* JADX INFO: renamed from: a */
    public static void m7389a(ConversationItemTeamGroup conversationItemTeamGroup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemTeamGroup.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemTeamGroup.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemTeamGroup.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemTeamGroup.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemTeamGroup.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemTeamGroup.h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationItemTeamGroup.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
