package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.gift.message.ItemGiftMessageRight;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u5q {
    /* JADX INFO: renamed from: a */
    public static void m194616a(ItemGiftMessageRight itemGiftMessageRight, View view) {
        itemGiftMessageRight.f30068b = (ItemGiftMessageRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGiftMessageRight.f30069c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGiftMessageRight.f30070d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGiftMessageRight.f30071e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
