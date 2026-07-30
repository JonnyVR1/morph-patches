package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLongTimeNoSeeTip;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v7q {
    /* JADX INFO: renamed from: a */
    public static void m200255a(ItemLongTimeNoSeeTip itemLongTimeNoSeeTip, View view) {
        itemLongTimeNoSeeTip.f31947a = (ItemLongTimeNoSeeTip) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLongTimeNoSeeTip.f31948b = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.f31949c = (LinearLayout) viewGroup.getChildAt(0);
        itemLongTimeNoSeeTip.f31950d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.f31951e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemLongTimeNoSeeTip.f31952f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLongTimeNoSeeTip.f31953g = (VText) viewGroup.getChildAt(1);
    }
}
