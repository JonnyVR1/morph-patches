package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageChatPrologueLayout;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class w4z {
    /* JADX INFO: renamed from: a */
    public static void m204903a(MessageChatPrologueLayout messageChatPrologueLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageChatPrologueLayout.f32434c = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageChatPrologueLayout.f32435d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageChatPrologueLayout.f32436e = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageChatPrologueLayout.f32437f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageChatPrologueLayout.f32438g = (VLinear) viewGroup.getChildAt(2);
    }
}
