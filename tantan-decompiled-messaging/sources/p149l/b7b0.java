package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b7b0 {
    /* JADX INFO: renamed from: a */
    public static void m100622a(a7b0 a7b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        a7b0Var._get_privilege = (VLinear) viewGroup.getChildAt(0);
        a7b0Var._get_privilege_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        a7b0Var._get_privilege_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        a7b0Var._pay_method = (LinearLayout) viewGroup.getChildAt(1);
        a7b0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        a7b0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        a7b0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        a7b0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        a7b0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        a7b0Var._day_price_text = (VText) viewGroup.getChildAt(2);
        a7b0Var._stickers = (VText) viewGroup.getChildAt(3);
    }
}
