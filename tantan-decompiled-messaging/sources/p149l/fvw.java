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
public class fvw {
    /* JADX INFO: renamed from: a */
    public static void m123371a(cvw cvwVar, View view) {
        cvwVar.f82691a = (VNavigationBar) ((ViewGroup) view).getChildAt(0);
        cvwVar.f82692b = (VList) view.findViewById(u4c0.f174176b7);
        ViewGroup viewGroup = (ViewGroup) view;
        cvwVar.f82693c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cvwVar.f82694d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cvwVar.f82695e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123372b(cvw cvwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95449L6, viewGroup, false);
        m123371a(cvwVar, viewInflate);
        return viewInflate;
    }
}
