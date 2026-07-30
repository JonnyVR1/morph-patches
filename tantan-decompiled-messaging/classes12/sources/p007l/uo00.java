package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uo00 {
    /* JADX INFO: renamed from: a */
    public static void m15122a(to00 to00Var, View view) {
        to00Var.f13358a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        to00Var.f13359b = viewGroup.getChildAt(0);
        to00Var.f13360c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15123b(to00 to00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11344y4, viewGroup, false);
        m15122a(to00Var, viewInflate);
        return viewInflate;
    }
}
