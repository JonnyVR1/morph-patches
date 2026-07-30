package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ce6 {
    /* JADX INFO: renamed from: a */
    public static void m5934a(ConversationItemVirtualVoiceGroupView conversationItemVirtualVoiceGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemVirtualVoiceGroupView.d = viewGroup.getChildAt(0);
        conversationItemVirtualVoiceGroupView.e = viewGroup.getChildAt(1);
        conversationItemVirtualVoiceGroupView.f = viewGroup.getChildAt(2);
        conversationItemVirtualVoiceGroupView.g = (FrameLayout) viewGroup.getChildAt(3);
        conversationItemVirtualVoiceGroupView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.i = (TextView) viewGroup.getChildAt(4);
        conversationItemVirtualVoiceGroupView.j = viewGroup.getChildAt(5);
        conversationItemVirtualVoiceGroupView.k = viewGroup.getChildAt(6);
        conversationItemVirtualVoiceGroupView.l = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationItemVirtualVoiceGroupView.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        conversationItemVirtualVoiceGroupView.o = viewGroup.getChildAt(7);
    }
}
