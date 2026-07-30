package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemHeadView;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ja6 {
    /* JADX INFO: renamed from: a */
    public static void m144003a(ConversationItemHeadView conversationItemHeadView, View view) {
        conversationItemHeadView.f26563a = (ConversationItemHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemHeadView.f26564b = (LiveHaloAvatar) viewGroup.getChildAt(0);
        conversationItemHeadView.f26565c = (HeaderFrameWrapper) viewGroup.getChildAt(1);
        conversationItemHeadView.f26566d = viewGroup.getChildAt(2);
        conversationItemHeadView.f26567e = viewGroup.getChildAt(3);
        conversationItemHeadView.f26568f = viewGroup.getChildAt(4);
        conversationItemHeadView.f26569g = (NewTalkProgressView) viewGroup.getChildAt(5);
        conversationItemHeadView.f26570h = (FrameLayout) viewGroup.getChildAt(6);
        conversationItemHeadView.f26571i = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemHeadView.f26572j = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationItemHeadView.f26573k = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationItemHeadView.f26574l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationItemHeadView.f26575m = (VImage) viewGroup.getChildAt(7);
        conversationItemHeadView.f26576n = (VImage) viewGroup.getChildAt(8);
        conversationItemHeadView.f26577o = (FrameLayout) viewGroup.getChildAt(9);
        conversationItemHeadView.f26578p = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
    }
}
