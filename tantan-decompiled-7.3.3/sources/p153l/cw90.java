package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class cw90 {
    /* JADX INFO: renamed from: a */
    public static void m112893a(bw90 bw90Var, View view) {
        bw90Var.f78690a = (FrameLayout) view;
        bw90Var.f78691b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m112894b(bw90 bw90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167540U0, viewGroup, false);
        m112893a(bw90Var, viewInflate);
        return viewInflate;
    }
}
