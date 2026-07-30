package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ce6 {
    /* JADX INFO: renamed from: a */
    public static void m106315a(ConversationItemVirtualVoiceGroupView conversationItemVirtualVoiceGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemVirtualVoiceGroupView.f24940d = (LiveHaloAvatar) viewGroup.getChildAt(0);
        conversationItemVirtualVoiceGroupView.f24941e = (MultipleChatIconView) viewGroup.getChildAt(1);
        conversationItemVirtualVoiceGroupView.f24942f = (VImage) viewGroup.getChildAt(2);
        conversationItemVirtualVoiceGroupView.f24943g = (FrameLayout) viewGroup.getChildAt(3);
        conversationItemVirtualVoiceGroupView.f24944h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f24945i = (TextView) viewGroup.getChildAt(4);
        conversationItemVirtualVoiceGroupView.f24946j = (VText) viewGroup.getChildAt(5);
        conversationItemVirtualVoiceGroupView.f24947k = (VLinear) viewGroup.getChildAt(6);
        conversationItemVirtualVoiceGroupView.f24948l = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f24949m = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.f24950n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        conversationItemVirtualVoiceGroupView.f24951o = (VText) viewGroup.getChildAt(7);
    }
}
