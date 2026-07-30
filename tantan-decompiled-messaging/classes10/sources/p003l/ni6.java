package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ni6 {
    /* JADX INFO: renamed from: a */
    public static void m8332a(ConversationNewMatchItem conversationNewMatchItem, View view) {
        conversationNewMatchItem.a = (ConversationNewMatchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationNewMatchItem.b = viewGroup.getChildAt(0);
        conversationNewMatchItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationNewMatchItem.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationNewMatchItem.e = (FrameLayout) viewGroup.getChildAt(2);
        conversationNewMatchItem.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationNewMatchItem.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        conversationNewMatchItem.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        conversationNewMatchItem.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        conversationNewMatchItem.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        conversationNewMatchItem.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        conversationNewMatchItem.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }
}
