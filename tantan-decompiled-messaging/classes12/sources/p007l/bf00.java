package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bf00 {
    /* JADX INFO: renamed from: a */
    public static void m8811a(af00 af00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        af00Var.f5718a = viewGroup.getChildAt(0);
        af00Var.f5719b = (LinearLayout) viewGroup.getChildAt(1);
        af00Var.f5720c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        af00Var.f5721d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        af00Var.f5722e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8812b(af00 af00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11288q4, viewGroup, false);
        m8811a(af00Var, viewInflate);
        return viewInflate;
    }
}
