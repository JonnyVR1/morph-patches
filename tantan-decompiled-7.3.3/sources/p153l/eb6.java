package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eb6 {
    /* JADX INFO: renamed from: a */
    public static void m120157a(ConversationItemPlatinumPinLike conversationItemPlatinumPinLike, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemPlatinumPinLike.f25590a = (VDraweeView) viewGroup.getChildAt(0);
        conversationItemPlatinumPinLike.f25591b = (VLinear) viewGroup.getChildAt(1);
        conversationItemPlatinumPinLike.f25592c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemPlatinumPinLike.f25593d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemPlatinumPinLike.f25594e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationItemPlatinumPinLike.f25595f = (TextView) viewGroup.getChildAt(2);
    }
}
