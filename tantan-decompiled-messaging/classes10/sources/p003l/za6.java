package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.itemview.ConversationItemSubTitleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class za6 {
    /* JADX INFO: renamed from: a */
    public static void m11381a(ConversationItemSubTitleView conversationItemSubTitleView, View view) {
        conversationItemSubTitleView.a = (ConversationItemSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSubTitleView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSubTitleView.c = viewGroup.getChildAt(1);
        conversationItemSubTitleView.d = viewGroup.getChildAt(2);
        conversationItemSubTitleView.e = viewGroup.getChildAt(3);
        conversationItemSubTitleView.f = (FrameLayout) viewGroup.getChildAt(4);
        conversationItemSubTitleView.g = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        conversationItemSubTitleView.h = viewGroup.getChildAt(6);
    }
}
