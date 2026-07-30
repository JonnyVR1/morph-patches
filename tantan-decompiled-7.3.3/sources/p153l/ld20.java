package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VCheckBox;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ld20 {
    /* JADX INFO: renamed from: a */
    public static void m153699a(kd20 kd20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kd20Var.f125127a = (VNavigationBar) viewGroup.getChildAt(0);
        kd20Var.f125128b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kd20Var.f125129c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kd20Var.f125130d = (EditText) view.findViewById(adc0.f70000L8);
        ViewGroup viewGroup2 = (ViewGroup) view;
        kd20Var.f125131e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        kd20Var.f125132f = (FrameLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        kd20Var.f125133g = (EditText) view.findViewById(adc0.f70235Z8);
        kd20Var.f125134h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        kd20Var.f125135i = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        kd20Var.f125136j = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        kd20Var.f125137k = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(0);
        kd20Var.f125138l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(1);
        kd20Var.f125139m = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m153700b(kd20 kd20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125600R7, viewGroup, false);
        m153699a(kd20Var, viewInflate);
        return viewInflate;
    }
}
