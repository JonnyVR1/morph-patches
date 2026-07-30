package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.ConversationRecommendItemView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cj6 {
    /* JADX INFO: renamed from: a */
    public static void m107109a(ConversationRecommendItemView conversationRecommendItemView, View view) {
        conversationRecommendItemView.f25036d = (ConversationRecommendItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationRecommendItemView.f25037e = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        conversationRecommendItemView.f25038f = (VFrame) viewGroup.getChildAt(1);
        conversationRecommendItemView.f25039g = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationRecommendItemView.f25040h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationRecommendItemView.f25041i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationRecommendItemView.f25042j = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationRecommendItemView.f25043k = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationRecommendItemView.f25044l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        conversationRecommendItemView.f25045m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        conversationRecommendItemView.f25046n = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        conversationRecommendItemView.f25047o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        conversationRecommendItemView.f25048p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        conversationRecommendItemView.f25049q = (VText) viewGroup.getChildAt(2);
    }
}
