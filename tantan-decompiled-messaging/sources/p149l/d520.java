package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VCheckBox;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class d520 {
    /* JADX INFO: renamed from: a */
    public static void m110008a(c520 c520Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c520Var.f79316a = (VNavigationBar) viewGroup.getChildAt(0);
        c520Var.f79317b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c520Var.f79318c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c520Var.f79319d = (EditText) view.findViewById(u4c0.f173878J8);
        ViewGroup viewGroup2 = (ViewGroup) view;
        c520Var.f79320e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c520Var.f79321f = (FrameLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        c520Var.f79322g = (EditText) view.findViewById(u4c0.f174112X8);
        c520Var.f79323h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2)).getChildAt(1);
        c520Var.f79324i = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
        c520Var.f79325j = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4);
        c520Var.f79326k = (VCheckBox) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(0);
        c520Var.f79327l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(4)).getChildAt(1);
        c520Var.f79328m = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m110009b(c520 c520Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95434K7, viewGroup, false);
        m110008a(c520Var, viewInflate);
        return viewInflate;
    }
}
