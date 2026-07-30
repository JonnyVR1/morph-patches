package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBox;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m4q {
    /* JADX INFO: renamed from: a */
    public static void m157050a(ItemCommonTipBox itemCommonTipBox, View view) {
        itemCommonTipBox.f31742c = (ItemCommonTipBox) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBox.f31743d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBox.f31744e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBox.f31745f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBox.f31746g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
