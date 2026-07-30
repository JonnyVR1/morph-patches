package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class lch0 {
    /* JADX INFO: renamed from: a */
    public static void m153684a(gch0 gch0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gch0Var.f103573f = viewGroup.getChildAt(0);
        gch0Var.f103574g = (LinearLayout) viewGroup.getChildAt(1);
        gch0Var.f103575h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gch0Var.f103576i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m153685b(gch0 gch0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126054sc, viewGroup, false);
        m153684a(gch0Var, viewInflate);
        return viewInflate;
    }
}
