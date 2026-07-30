package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dg4 {
    /* JADX INFO: renamed from: a */
    public static void m9370a(cg4 cg4Var, View view) {
        cg4Var.f6622a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cg4Var.f6623b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cg4Var.f6624c = viewGroup.getChildAt(1);
        cg4Var.f6625d = (LinearLayout) viewGroup.getChildAt(2);
        cg4Var.f6626e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cg4Var.f6627f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cg4Var.f6628g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9371b(cg4 cg4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11239j4, viewGroup, false);
        m9370a(cg4Var, viewInflate);
        return viewInflate;
    }
}
