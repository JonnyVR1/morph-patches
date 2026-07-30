package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fvk0 {
    /* JADX INFO: renamed from: a */
    public static void m123338a(evk0 evk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        evk0Var.f93358a = (VNavigationBar) viewGroup.getChildAt(0);
        evk0Var.f93359b = (VLinear) viewGroup.getChildAt(1);
        evk0Var.f93360c = (VLinear) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m123339b(evk0 evk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95487Nc, viewGroup, false);
        m123338a(evk0Var, viewInflate);
        return viewInflate;
    }
}
