package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ffb0 {
    /* JADX INFO: renamed from: a */
    public static void m125361a(efb0 efb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        efb0Var._get_privilege = (VLinear) viewGroup.getChildAt(0);
        efb0Var._get_privilege_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        efb0Var._get_privilege_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        efb0Var._pay_method = (LinearLayout) viewGroup.getChildAt(1);
        efb0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        efb0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        efb0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        efb0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        efb0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        efb0Var._day_price_text = (VText) viewGroup.getChildAt(2);
        efb0Var._stickers = (VText) viewGroup.getChildAt(3);
    }
}
