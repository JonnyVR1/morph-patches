package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.itemview.ConversationItemHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e96 {
    /* JADX INFO: renamed from: a */
    public static void m6254a(ConversationItemHeadView conversationItemHeadView, View view) {
        conversationItemHeadView.a = (ConversationItemHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemHeadView.b = viewGroup.getChildAt(0);
        conversationItemHeadView.c = viewGroup.getChildAt(1);
        conversationItemHeadView.d = viewGroup.getChildAt(2);
        conversationItemHeadView.e = viewGroup.getChildAt(3);
        conversationItemHeadView.f = viewGroup.getChildAt(4);
        conversationItemHeadView.g = viewGroup.getChildAt(5);
        conversationItemHeadView.h = (FrameLayout) viewGroup.getChildAt(6);
        conversationItemHeadView.i = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemHeadView.j = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationItemHeadView.k = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationItemHeadView.l = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationItemHeadView.m = viewGroup.getChildAt(7);
        conversationItemHeadView.n = viewGroup.getChildAt(8);
        conversationItemHeadView.o = (FrameLayout) viewGroup.getChildAt(9);
        conversationItemHeadView.p = ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
    }
}
