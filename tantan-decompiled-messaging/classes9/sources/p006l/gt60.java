package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gt60 {
    /* JADX INFO: renamed from: a */
    public static void m15967a(ft60 ft60Var, View view) {
        ft60Var.f12891a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ft60Var.f12892b = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ft60Var.f12893c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ft60Var.f12894d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ft60Var.f12895e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15968b(ft60 ft60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9405O, viewGroup, false);
        m15967a(ft60Var, viewInflate);
        return viewInflate;
    }
}
