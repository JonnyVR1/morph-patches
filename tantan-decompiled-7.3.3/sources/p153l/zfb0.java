package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zfb0 {
    /* JADX INFO: renamed from: a */
    public static void m219534a(yfb0 yfb0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yfb0Var._pay_method = (LinearLayout) viewGroup.getChildAt(0);
        yfb0Var._pay_method_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yfb0Var._pay_method_text = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yfb0Var._pay_method_promotion = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        yfb0Var._pay_method_promotion_right = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        yfb0Var._pay_method_arrow = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        yfb0Var._get_privilege = (VLinear) viewGroup.getChildAt(1);
        yfb0Var._get_privilege_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yfb0Var._get_privilege_subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yfb0Var._anchor = viewGroup.getChildAt(2);
        yfb0Var._stickers = (VText) viewGroup.getChildAt(3);
    }
}
