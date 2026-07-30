package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.ItemLongTimeNoSeeTip;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v5q {
    /* JADX INFO: renamed from: a */
    public static void m9842a(ItemLongTimeNoSeeTip itemLongTimeNoSeeTip, View view) {
        itemLongTimeNoSeeTip.a = (ItemLongTimeNoSeeTip) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLongTimeNoSeeTip.b = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.c = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLongTimeNoSeeTip.g = viewGroup.getChildAt(1);
    }
}
