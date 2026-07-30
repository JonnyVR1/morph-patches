package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f96 {
    /* JADX INFO: renamed from: a */
    public static void m124631a(ConversationHeadRecommendLayout conversationHeadRecommendLayout, View view) {
        conversationHeadRecommendLayout.f25482a = (ConversationHeadRecommendLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadRecommendLayout.f25483b = (VLinear) viewGroup.getChildAt(0);
        conversationHeadRecommendLayout.f25484c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.f25485d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.f25486e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadRecommendLayout.f25487f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationHeadRecommendLayout.f25488g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        conversationHeadRecommendLayout.f25489h = (ViewStub) viewGroup.getChildAt(1);
        conversationHeadRecommendLayout.f25490i = (VRecyclerView) viewGroup.getChildAt(2);
        conversationHeadRecommendLayout.f25491j = (SVGAnimationView) viewGroup.getChildAt(3);
        conversationHeadRecommendLayout.f25492k = viewGroup.getChildAt(4);
    }
}
