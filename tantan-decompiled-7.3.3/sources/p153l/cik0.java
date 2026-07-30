package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class cik0 {
    /* JADX INFO: renamed from: a */
    public static void m109903a(bik0 bik0Var, View view) {
        bik0Var.f76888a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bik0Var.f76889b = (VNavigationBar) viewGroup.getChildAt(0);
        bik0Var.f76890c = (RecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109904b(bik0 bik0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193890m1, viewGroup, false);
        m109903a(bik0Var, viewInflate);
        return viewInflate;
    }
}
