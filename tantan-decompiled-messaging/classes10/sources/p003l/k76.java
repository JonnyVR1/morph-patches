package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k76 {
    /* JADX INFO: renamed from: a */
    public static void m7545a(ConversationHeadLikerItemLayout conversationHeadLikerItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadLikerItemLayout.a = viewGroup.getChildAt(0);
        conversationHeadLikerItemLayout.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadLikerItemLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadLikerItemLayout.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationHeadLikerItemLayout.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationHeadLikerItemLayout.f = viewGroup.getChildAt(1);
    }
}
