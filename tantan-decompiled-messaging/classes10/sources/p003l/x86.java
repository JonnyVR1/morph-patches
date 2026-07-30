package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.itemview.ConversationItemGreetSubTitleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x86 {
    /* JADX INFO: renamed from: a */
    public static void m10697a(ConversationItemGreetSubTitleView conversationItemGreetSubTitleView, View view) {
        conversationItemGreetSubTitleView.a = (ConversationItemGreetSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGreetSubTitleView.b = viewGroup.getChildAt(0);
        conversationItemGreetSubTitleView.c = viewGroup.getChildAt(1);
        conversationItemGreetSubTitleView.d = viewGroup.getChildAt(2);
        conversationItemGreetSubTitleView.e = viewGroup.getChildAt(3);
    }
}
