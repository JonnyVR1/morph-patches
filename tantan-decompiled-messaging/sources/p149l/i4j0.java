package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class i4j0 {
    /* JADX INFO: renamed from: a */
    public static void m134365a(h4j0 h4j0Var, View view) {
        h4j0Var.f105842a = (VRecyclerView) view.findViewById(b5c0.f73624y);
        ViewGroup viewGroup = (ViewGroup) view;
        h4j0Var.f105843b = (LinearLayout) viewGroup.getChildAt(1);
        h4j0Var.f105844c = (LinearLayout) viewGroup.getChildAt(1);
        h4j0Var.f105845d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h4j0Var.f105846e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h4j0Var.f105847f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        h4j0Var.f105848g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        h4j0Var.f105849h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m134366b(h4j0 h4j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142007B5, viewGroup, false);
        m134365a(h4j0Var, viewInflate);
        return viewInflate;
    }
}
