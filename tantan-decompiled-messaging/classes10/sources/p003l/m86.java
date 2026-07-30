package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemFriendMoments;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m86 {
    /* JADX INFO: renamed from: a */
    public static void m8003a(ConversationItemFriendMoments conversationItemFriendMoments, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemFriendMoments.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemFriendMoments.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemFriendMoments.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.e = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemFriendMoments.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemFriendMoments.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemFriendMoments.h = (TextView) viewGroup.getChildAt(2);
    }
}
