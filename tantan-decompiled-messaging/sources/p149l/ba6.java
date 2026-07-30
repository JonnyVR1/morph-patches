package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ba6 {
    /* JADX INFO: renamed from: a */
    public static void m100896a(ConversationItemPlatinumPinLike conversationItemPlatinumPinLike, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemPlatinumPinLike.f24848a = (VDraweeView) viewGroup.getChildAt(0);
        conversationItemPlatinumPinLike.f24849b = (VLinear) viewGroup.getChildAt(1);
        conversationItemPlatinumPinLike.f24850c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemPlatinumPinLike.f24851d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemPlatinumPinLike.f24852e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationItemPlatinumPinLike.f24853f = (TextView) viewGroup.getChildAt(2);
    }
}
