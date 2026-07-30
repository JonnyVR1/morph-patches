package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class o2l0 {
    /* JADX INFO: renamed from: a */
    public static void m165732a(n2l0 n2l0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        n2l0Var.f139873a = (VNavigationBar) viewGroup.getChildAt(0);
        n2l0Var.f139874b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m165733b(n2l0 n2l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125541Nc, viewGroup, false);
        m165732a(n2l0Var, viewInflate);
        return viewInflate;
    }
}
