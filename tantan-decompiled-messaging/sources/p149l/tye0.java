package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class tye0 {
    /* JADX INFO: renamed from: a */
    public static void m191019a(sye0 sye0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sye0Var.f166944c = (VNavigationBar) viewGroup.getChildAt(0);
        sye0Var.f166945d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sye0Var.f166946e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sye0Var.f166947f = (LinearLayout) viewGroup.getChildAt(2);
        sye0Var.f166948g = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sye0Var.f166949h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191020b(sye0 sye0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79510l0, viewGroup, false);
        m191019a(sye0Var, viewInflate);
        return viewInflate;
    }
}
