package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xa6 {
    /* JADX INFO: renamed from: a */
    public static void m10719a(ConversationItemRightBtnView conversationItemRightBtnView, View view) {
        conversationItemRightBtnView.a = (ConversationItemRightBtnView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemRightBtnView.b = viewGroup.getChildAt(0);
        conversationItemRightBtnView.c = viewGroup.getChildAt(1);
        conversationItemRightBtnView.d = viewGroup.getChildAt(2);
    }
}
