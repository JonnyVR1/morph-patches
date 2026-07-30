package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y800 {
    /* JADX INFO: renamed from: a */
    public static void m16967a(w800 w800Var, View view) {
        w800Var.f14451a = (LinearLayout) view;
        w800Var.f14452b = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m16968b(w800 w800Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11225h4, viewGroup, false);
        m16967a(w800Var, viewInflate);
        return viewInflate;
    }
}
