package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dpk0 {
    /* JADX INFO: renamed from: a */
    public static void m112916a(cpk0 cpk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cpk0Var._background = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cpk0Var._promotion_title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cpk0Var._privileges = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cpk0Var._close = (VImage) viewGroup.getChildAt(1);
        cpk0Var._pay_method = (LinearLayout) viewGroup.getChildAt(2);
        cpk0Var._pay_method_text = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cpk0Var._pay_method_promotion = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cpk0Var._divider = viewGroup.getChildAt(3);
        cpk0Var._countdown = (VText) viewGroup.getChildAt(4);
        cpk0Var._get_privilege = (VText) viewGroup.getChildAt(5);
        cpk0Var._rule = (VText) viewGroup.getChildAt(6);
        cpk0Var._get_privilege_divider = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m112917b(cpk0 cpk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131476E2, viewGroup, false);
        m112916a(cpk0Var, viewInflate);
        return viewInflate;
    }
}
