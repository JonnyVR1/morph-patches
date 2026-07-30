package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class jgi0 {
    /* JADX INFO: renamed from: a */
    public static void m141295a(igi0 igi0Var, View view) {
        igi0Var.f113114a = (VNavigationBar) ((ViewGroup) view).getChildAt(0);
        igi0Var.f113115b = (VList) view.findViewById(u4c0.f174176b7);
        ViewGroup viewGroup = (ViewGroup) view;
        igi0Var.f113116c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        igi0Var.f113117d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        igi0Var.f113118e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m141296b(igi0 igi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95311Cc, viewGroup, false);
        m141295a(igi0Var, viewInflate);
        return viewInflate;
    }
}
