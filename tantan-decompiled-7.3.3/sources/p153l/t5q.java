package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageLeft;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t5q {
    /* JADX INFO: renamed from: a */
    public static void m189416a(ItemGiftMessageLeft itemGiftMessageLeft, View view) {
        itemGiftMessageLeft.f30064b = (ItemGiftMessageLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGiftMessageLeft.f30065c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGiftMessageLeft.f30066d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGiftMessageLeft.f30067e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
