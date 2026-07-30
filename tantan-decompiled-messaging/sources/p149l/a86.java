package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a86 {
    /* JADX INFO: renamed from: a */
    public static void m95335a(ConversationHeadRecommendLayout conversationHeadRecommendLayout, View view) {
        conversationHeadRecommendLayout.f24740a = (ConversationHeadRecommendLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadRecommendLayout.f24741b = (VLinear) viewGroup.getChildAt(0);
        conversationHeadRecommendLayout.f24742c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.f24743d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationHeadRecommendLayout.f24744e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadRecommendLayout.f24745f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationHeadRecommendLayout.f24746g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        conversationHeadRecommendLayout.f24747h = (ViewStub) viewGroup.getChildAt(1);
        conversationHeadRecommendLayout.f24748i = (VRecyclerView) viewGroup.getChildAt(2);
        conversationHeadRecommendLayout.f24749j = (SVGAnimationView) viewGroup.getChildAt(3);
        conversationHeadRecommendLayout.f24750k = viewGroup.getChildAt(4);
    }
}
