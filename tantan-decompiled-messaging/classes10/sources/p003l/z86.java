package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.itemview.ConversationItemGroupSubTitleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z86 {
    /* JADX INFO: renamed from: a */
    public static void m11357a(ConversationItemGroupSubTitleView conversationItemGroupSubTitleView, View view) {
        conversationItemGroupSubTitleView.a = (ConversationItemGroupSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGroupSubTitleView.b = viewGroup.getChildAt(0);
        conversationItemGroupSubTitleView.c = viewGroup.getChildAt(1);
        conversationItemGroupSubTitleView.d = viewGroup.getChildAt(2);
        conversationItemGroupSubTitleView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
