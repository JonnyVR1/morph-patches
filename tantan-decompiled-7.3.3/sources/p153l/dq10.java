package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dq10 {
    /* JADX INFO: renamed from: a */
    public static void m117439a(wp10 wp10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wp10Var._apply_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wp10Var._horizontal_line = (Guideline) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        wp10Var._vertical_line = (Guideline) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        wp10Var._reject = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        wp10Var._divider = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        wp10Var._agree = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
