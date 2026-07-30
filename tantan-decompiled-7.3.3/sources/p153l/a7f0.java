package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class a7f0 {
    /* JADX INFO: renamed from: a */
    public static void m96362a(z6f0 z6f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z6f0Var.f203146c = (VNavigationBar) viewGroup.getChildAt(0);
        z6f0Var.f203147d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z6f0Var.f203148e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        z6f0Var.f203149f = (LinearLayout) viewGroup.getChildAt(2);
        z6f0Var.f203150g = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        z6f0Var.f203151h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m96363b(z6f0 z6f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109122l0, viewGroup, false);
        m96362a(z6f0Var, viewInflate);
        return viewInflate;
    }
}
