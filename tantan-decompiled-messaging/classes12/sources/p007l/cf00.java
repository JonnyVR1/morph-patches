package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cf00 {
    /* JADX INFO: renamed from: a */
    public static void m9128a(ze00 ze00Var, View view) {
        ze00Var.f15697a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9129b(ze00 ze00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11247k5, viewGroup, false);
        m9128a(ze00Var, viewInflate);
        return viewInflate;
    }
}
