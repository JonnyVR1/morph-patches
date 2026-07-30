package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i4j0 {
    /* JADX INFO: renamed from: a */
    public static void m10774a(h4j0 h4j0Var, View view) {
        h4j0Var.f8579a = view.findViewById(b5c0.f6105y);
        ViewGroup viewGroup = (ViewGroup) view;
        h4j0Var.f8580b = (LinearLayout) viewGroup.getChildAt(1);
        h4j0Var.f8581c = (LinearLayout) viewGroup.getChildAt(1);
        h4j0Var.f8582d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h4j0Var.f8583e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h4j0Var.f8584f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        h4j0Var.f8585g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        h4j0Var.f8586h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10775b(h4j0 h4j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11026B5, viewGroup, false);
        m10774a(h4j0Var, viewInflate);
        return viewInflate;
    }
}
