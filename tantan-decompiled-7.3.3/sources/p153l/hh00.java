package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes13.dex */
public class hh00 {
    /* JADX INFO: renamed from: a */
    public static void m135010a(fh00 fh00Var, View view) {
        fh00Var.f98992a = (LinearLayout) view;
        fh00Var.f98993b = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m135011b(fh00 fh00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173675h4, viewGroup, false);
        m135010a(fh00Var, viewInflate);
        return viewInflate;
    }
}
