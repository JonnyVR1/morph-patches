package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class z46 {
    /* JADX INFO: renamed from: a */
    public static void m217062a(y46 y46Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y46Var.f195898a = (VNavigationBar) viewGroup.getChildAt(0);
        y46Var.f195899b = (LinearLayout) viewGroup.getChildAt(1);
        y46Var.f195900c = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m217063b(y46 y46Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95970r, viewGroup, false);
        m217062a(y46Var, viewInflate);
        return viewInflate;
    }
}
