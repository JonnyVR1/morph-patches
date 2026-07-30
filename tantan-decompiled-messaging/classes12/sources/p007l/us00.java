package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class us00 {
    /* JADX INFO: renamed from: a */
    public static void m15131a(ts00 ts00Var, View view) {
        ts00Var.f13391a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ts00Var.f13392b = viewGroup.getChildAt(0);
        ts00Var.f13393c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15132b(ts00 ts00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11351z4, viewGroup, false);
        m15131a(ts00Var, viewInflate);
        return viewInflate;
    }
}
