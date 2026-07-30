package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ea6 {
    /* JADX INFO: renamed from: a */
    public static void m6282a(ConversationItemProfileLikeEntrance conversationItemProfileLikeEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemProfileLikeEntrance.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemProfileLikeEntrance.e = viewGroup.getChildAt(1);
        conversationItemProfileLikeEntrance.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
