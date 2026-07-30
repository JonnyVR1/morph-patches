package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatInterceptRight;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y1q {
    /* JADX INFO: renamed from: a */
    public static void m212260a(ItemChatInterceptRight itemChatInterceptRight, View view) {
        itemChatInterceptRight.f30872a = (ItemChatInterceptRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatInterceptRight.f30873b = (LinearLayout) viewGroup.getChildAt(0);
        itemChatInterceptRight.f30874c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
