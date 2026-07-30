package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ff6 {
    /* JADX INFO: renamed from: a */
    public static void m125359a(ConversationItemVirtualVoiceGroupView conversationItemVirtualVoiceGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemVirtualVoiceGroupView.f25682d = (LiveHaloAvatar) viewGroup.getChildAt(0);
        conversationItemVirtualVoiceGroupView.f25683e = (MultipleChatIconView) viewGroup.getChildAt(1);
        conversationItemVirtualVoiceGroupView.f25684f = (VImage) viewGroup.getChildAt(2);
        conversationItemVirtualVoiceGroupView.f25685g = (FrameLayout) viewGroup.getChildAt(3);
        conversationItemVirtualVoiceGroupView.f25686h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f25687i = (TextView) viewGroup.getChildAt(4);
        conversationItemVirtualVoiceGroupView.f25688j = (VText) viewGroup.getChildAt(5);
        conversationItemVirtualVoiceGroupView.f25689k = (VLinear) viewGroup.getChildAt(6);
        conversationItemVirtualVoiceGroupView.f25690l = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f25691m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f25692n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        conversationItemVirtualVoiceGroupView.f25693o = (VText) viewGroup.getChildAt(7);
    }
}
