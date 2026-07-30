package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dx60 {
    /* JADX INFO: renamed from: a */
    public static void m9582a(bx60 bx60Var, View view) {
        bx60Var.f6458y = (LinearLayout) view;
        bx60Var.f6459z = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9583b(bx60 bx60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11268n5, viewGroup, false);
        m9582a(bx60Var, viewInflate);
        return viewInflate;
    }
}
