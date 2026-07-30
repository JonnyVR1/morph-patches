package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class pnn0 {
    /* JADX INFO: renamed from: a */
    public static void m173073a(onn0 onn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onn0Var.f148099a = (VNavigationBar) viewGroup.getChildAt(0);
        onn0Var.f148100b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        onn0Var.f148101c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        onn0Var.f148102d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        onn0Var.f148103e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m173074b(onn0 onn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193866g0, viewGroup, false);
        m173073a(onn0Var, viewInflate);
        return viewInflate;
    }
}
