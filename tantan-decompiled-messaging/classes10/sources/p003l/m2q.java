package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemCommonTipBox;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m2q {
    /* JADX INFO: renamed from: a */
    public static void m7948a(ItemCommonTipBox itemCommonTipBox, View view) {
        itemCommonTipBox.c = (ItemCommonTipBox) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBox.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBox.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBox.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBox.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
