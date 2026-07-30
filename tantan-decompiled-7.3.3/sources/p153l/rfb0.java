package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rfb0 {
    /* JADX INFO: renamed from: a */
    public static void m181168a(qfb0 qfb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qfb0Var._pay_method = (LinearLayout) viewGroup.getChildAt(0);
        qfb0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qfb0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qfb0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qfb0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        qfb0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        qfb0Var._get_privilege = (VLinear) viewGroup.getChildAt(1);
        qfb0Var._get_privilege_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
