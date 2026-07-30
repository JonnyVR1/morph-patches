package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemHeadView;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e96 {
    /* JADX INFO: renamed from: a */
    public static void m115344a(ConversationItemHeadView conversationItemHeadView, View view) {
        conversationItemHeadView.f25821a = (ConversationItemHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemHeadView.f25822b = (LiveHaloAvatar) viewGroup.getChildAt(0);
        conversationItemHeadView.f25823c = (HeaderFrameWrapper) viewGroup.getChildAt(1);
        conversationItemHeadView.f25824d = viewGroup.getChildAt(2);
        conversationItemHeadView.f25825e = viewGroup.getChildAt(3);
        conversationItemHeadView.f25826f = viewGroup.getChildAt(4);
        conversationItemHeadView.f25827g = (NewTalkProgressView) viewGroup.getChildAt(5);
        conversationItemHeadView.f25828h = (FrameLayout) viewGroup.getChildAt(6);
        conversationItemHeadView.f25829i = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemHeadView.f25830j = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationItemHeadView.f25831k = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationItemHeadView.f25832l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationItemHeadView.f25833m = (VImage) viewGroup.getChildAt(7);
        conversationItemHeadView.f25834n = (VImage) viewGroup.getChildAt(8);
        conversationItemHeadView.f25835o = (FrameLayout) viewGroup.getChildAt(9);
        conversationItemHeadView.f25836p = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
    }
}
