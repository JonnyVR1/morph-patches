package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j7b0 {
    /* JADX INFO: renamed from: a */
    public static void m140081a(i7b0 i7b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i7b0Var._get_privilege_text = (VText) viewGroup.getChildAt(0);
        i7b0Var._origin_price = (VText) viewGroup.getChildAt(1);
        i7b0Var._divider = viewGroup.getChildAt(2);
        i7b0Var._pay_method = (LinearLayout) viewGroup.getChildAt(3);
        i7b0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        i7b0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        i7b0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        i7b0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        i7b0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
    }
}
