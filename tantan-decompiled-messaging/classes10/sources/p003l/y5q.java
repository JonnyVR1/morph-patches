package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemLoveBuzzBreakIceMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y5q {
    /* JADX INFO: renamed from: a */
    public static void m11155a(ItemLoveBuzzBreakIceMessage itemLoveBuzzBreakIceMessage, View view) {
        itemLoveBuzzBreakIceMessage.a = (ItemLoveBuzzBreakIceMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLoveBuzzBreakIceMessage.b = viewGroup.getChildAt(0);
        itemLoveBuzzBreakIceMessage.c = viewGroup.getChildAt(1);
        itemLoveBuzzBreakIceMessage.d = viewGroup.getChildAt(2);
    }
}
