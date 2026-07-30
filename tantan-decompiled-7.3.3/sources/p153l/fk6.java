package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.ConversationRecommendItemView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fk6 {
    /* JADX INFO: renamed from: a */
    public static void m125977a(ConversationRecommendItemView conversationRecommendItemView, View view) {
        conversationRecommendItemView.f25778d = (ConversationRecommendItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationRecommendItemView.f25779e = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        conversationRecommendItemView.f25780f = (VFrame) viewGroup.getChildAt(1);
        conversationRecommendItemView.f25781g = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationRecommendItemView.f25782h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationRecommendItemView.f25783i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationRecommendItemView.f25784j = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationRecommendItemView.f25785k = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationRecommendItemView.f25786l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        conversationRecommendItemView.f25787m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        conversationRecommendItemView.f25788n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        conversationRecommendItemView.f25789o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        conversationRecommendItemView.f25790p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        conversationRecommendItemView.f25791q = (VText) viewGroup.getChildAt(2);
    }
}
