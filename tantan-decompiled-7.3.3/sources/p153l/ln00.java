package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes13.dex */
public class ln00 {
    /* JADX INFO: renamed from: a */
    public static void m154942a(in00 in00Var, View view) {
        in00Var.f115850a = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m154943b(in00 in00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173697k5, viewGroup, false);
        m154942a(in00Var, viewInflate);
        return viewInflate;
    }
}
