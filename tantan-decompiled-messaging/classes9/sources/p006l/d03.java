package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d03 {
    /* JADX INFO: renamed from: a */
    public static void m13715a(c03 c03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c03Var._close = viewGroup.getChildAt(0);
        c03Var._title = (TextView) viewGroup.getChildAt(1);
        c03Var._date_picker = viewGroup.getChildAt(2);
        c03Var._later_btn = viewGroup.getChildAt(3);
    }
}
