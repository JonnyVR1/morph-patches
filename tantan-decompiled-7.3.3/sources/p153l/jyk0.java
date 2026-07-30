package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jyk0 {
    /* JADX INFO: renamed from: a */
    public static void m147597a(iyk0 iyk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iyk0Var._background = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        iyk0Var._promotion_title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        iyk0Var._privileges = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        iyk0Var._close = (VImage) viewGroup.getChildAt(1);
        iyk0Var._pay_method = (LinearLayout) viewGroup.getChildAt(2);
        iyk0Var._pay_method_text = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        iyk0Var._pay_method_promotion = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        iyk0Var._divider = viewGroup.getChildAt(3);
        iyk0Var._countdown = (VText) viewGroup.getChildAt(4);
        iyk0Var._get_privilege = (VText) viewGroup.getChildAt(5);
        iyk0Var._rule = (VText) viewGroup.getChildAt(6);
        iyk0Var._get_privilege_divider = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m147598b(iyk0 iyk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162436E2, viewGroup, false);
        m147597a(iyk0Var, viewInflate);
        return viewInflate;
    }
}
