package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VListCell;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class sw4 {
    /* JADX INFO: renamed from: a */
    public static void m188236a(rw4 rw4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rw4Var.f165099a = (VNavigationBar) viewGroup.getChildAt(0);
        rw4Var.f165100b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        rw4Var.f165101c = (VListCell) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m188237b(rw4 rw4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125823f1, viewGroup, false);
        m188236a(rw4Var, viewInflate);
        return viewInflate;
    }
}
