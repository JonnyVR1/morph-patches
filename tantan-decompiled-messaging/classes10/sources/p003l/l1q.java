package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemBreakIceMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l1q {
    /* JADX INFO: renamed from: a */
    public static void m7659a(ItemBreakIceMessage itemBreakIceMessage, View view) {
        itemBreakIceMessage.a = (ItemBreakIceMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemBreakIceMessage.b = viewGroup.getChildAt(0);
        itemBreakIceMessage.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemBreakIceMessage.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        itemBreakIceMessage.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemBreakIceMessage.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemBreakIceMessage.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemBreakIceMessage.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemBreakIceMessage.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemBreakIceMessage.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
