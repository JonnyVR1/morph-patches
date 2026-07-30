package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageChatPrologueLayout;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class zvy {
    /* JADX INFO: renamed from: a */
    public static void m220495a(MessageChatPrologueLayout messageChatPrologueLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageChatPrologueLayout.f31586c = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageChatPrologueLayout.f31587d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageChatPrologueLayout.f31588e = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageChatPrologueLayout.f31589f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageChatPrologueLayout.f31590g = (VLinear) viewGroup.getChildAt(2);
    }
}
