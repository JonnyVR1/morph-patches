package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class z220 {
    /* JADX INFO: renamed from: a */
    public static void m218385a(y220 y220Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y220Var.f197168a = (VNavigationBar) viewGroup.getChildAt(0);
        y220Var.f197169b = (RecyclerView) viewGroup.getChildAt(1);
        y220Var.f197170c = (VText) viewGroup.getChildAt(2);
        y220Var.f197171d = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m218386b(y220 y220Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125360Ca, viewGroup, false);
        m218385a(y220Var, viewInflate);
        return viewInflate;
    }
}
