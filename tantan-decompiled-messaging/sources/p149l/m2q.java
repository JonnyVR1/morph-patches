package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBox;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m2q {
    /* JADX INFO: renamed from: a */
    public static void m152701a(ItemCommonTipBox itemCommonTipBox, View view) {
        itemCommonTipBox.f30894c = (ItemCommonTipBox) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonTipBox.f30895d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCommonTipBox.f30896e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonTipBox.f30897f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonTipBox.f30898g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
