package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VList;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class dq00 {
    /* JADX INFO: renamed from: a */
    public static void m117435a(cq00 cq00Var, View view) {
        cq00Var.f83052a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cq00Var.f83053b = (VNavigationBar) viewGroup.getChildAt(0);
        cq00Var.f83054c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cq00Var.f83055d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cq00Var.f83056e = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117436b(cq00 cq00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125671Ve, viewGroup, false);
        m117435a(cq00Var, viewInflate);
        return viewInflate;
    }
}
