package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageRight;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u3q {
    /* JADX INFO: renamed from: a */
    public static void m191610a(ItemGiftMessageRight itemGiftMessageRight, View view) {
        itemGiftMessageRight.f29220b = (ItemGiftMessageRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGiftMessageRight.f29221c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGiftMessageRight.f29222d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGiftMessageRight.f29223e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
