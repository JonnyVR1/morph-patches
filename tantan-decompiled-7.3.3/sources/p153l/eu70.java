package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class eu70 {
    /* JADX INFO: renamed from: a */
    public static void m122538a(du70 du70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        du70Var.f90759i = viewGroup.getChildAt(0);
        du70Var.f90760j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        du70Var.f90761k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        du70Var.f90762l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        du70Var.f90763m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m122539b(du70 du70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198900R4, viewGroup, false);
        m122538a(du70Var, viewInflate);
        return viewInflate;
    }
}
