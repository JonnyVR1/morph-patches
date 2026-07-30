package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLongTimeNoSeeTip;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v5q {
    /* JADX INFO: renamed from: a */
    public static void m197151a(ItemLongTimeNoSeeTip itemLongTimeNoSeeTip, View view) {
        itemLongTimeNoSeeTip.f31099a = (ItemLongTimeNoSeeTip) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLongTimeNoSeeTip.f31100b = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.f31101c = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.f31102d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.f31103e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.f31104f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLongTimeNoSeeTip.f31105g = (VText) viewGroup.getChildAt(1);
    }
}
