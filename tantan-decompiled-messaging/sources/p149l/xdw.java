package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class xdw {
    /* JADX INFO: renamed from: a */
    public static void m208429a(wdw wdwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wdwVar.f185865a = (VNavigationBar) viewGroup.getChildAt(0);
        wdwVar.f185866b = (ViewPager2) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wdwVar.f185867c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        wdwVar.f185868d = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208430b(wdw wdwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95353F6, viewGroup, false);
        m208429a(wdwVar, viewInflate);
        return viewInflate;
    }
}
