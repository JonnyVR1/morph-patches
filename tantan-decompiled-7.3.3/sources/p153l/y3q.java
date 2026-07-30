package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatInterceptRight;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y3q {
    /* JADX INFO: renamed from: a */
    public static void m214170a(ItemChatInterceptRight itemChatInterceptRight, View view) {
        itemChatInterceptRight.f31720a = (ItemChatInterceptRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatInterceptRight.f31721b = (LinearLayout) viewGroup.getChildAt(0);
        itemChatInterceptRight.f31722c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
