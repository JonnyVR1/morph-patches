package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a86 {
    /* JADX INFO: renamed from: a */
    public static void m5297a(ConversationHeadRecommendLayout conversationHeadRecommendLayout, View view) {
        conversationHeadRecommendLayout.a = (ConversationHeadRecommendLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadRecommendLayout.b = viewGroup.getChildAt(0);
        conversationHeadRecommendLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadRecommendLayout.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationHeadRecommendLayout.g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        conversationHeadRecommendLayout.h = (ViewStub) viewGroup.getChildAt(1);
        conversationHeadRecommendLayout.i = viewGroup.getChildAt(2);
        conversationHeadRecommendLayout.j = viewGroup.getChildAt(3);
        conversationHeadRecommendLayout.k = viewGroup.getChildAt(4);
    }
}
