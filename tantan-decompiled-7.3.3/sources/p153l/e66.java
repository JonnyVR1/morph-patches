package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class e66 {
    /* JADX INFO: renamed from: a */
    public static void m119576a(d66 d66Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d66Var.f85292a = (VNavigationBar) viewGroup.getChildAt(0);
        d66Var.f85293b = (LinearLayout) viewGroup.getChildAt(1);
        d66Var.f85294c = (ViewPager2) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m119577b(d66 d66Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126024r, viewGroup, false);
        m119576a(d66Var, viewInflate);
        return viewInflate;
    }
}
