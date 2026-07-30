package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes12.dex */
public class y800 {
    /* JADX INFO: renamed from: a */
    public static void m213342a(w800 w800Var, View view) {
        w800Var.f185124a = (LinearLayout) view;
        w800Var.f185125b = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m213343b(w800 w800Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142206h4, viewGroup, false);
        m213342a(w800Var, viewInflate);
        return viewInflate;
    }
}
