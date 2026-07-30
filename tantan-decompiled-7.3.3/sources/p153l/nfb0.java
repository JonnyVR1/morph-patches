package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nfb0 {
    /* JADX INFO: renamed from: a */
    public static void m162922a(mfb0 mfb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mfb0Var._get_privilege_text = (VText) viewGroup.getChildAt(0);
        mfb0Var._origin_price = (VText) viewGroup.getChildAt(1);
        mfb0Var._divider = viewGroup.getChildAt(2);
        mfb0Var._pay_method = (LinearLayout) viewGroup.getChildAt(3);
        mfb0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mfb0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mfb0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mfb0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        mfb0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
    }
}
