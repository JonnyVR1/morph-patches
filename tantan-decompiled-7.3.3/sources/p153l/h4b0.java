package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h4b0 {
    /* JADX INFO: renamed from: a */
    public static void m133553a(g4b0 g4b0Var, View view) {
        g4b0Var.f102159a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g4b0Var.f102160b = (VImage) viewGroup.getChildAt(0);
        g4b0Var.f102161c = (VImage) viewGroup.getChildAt(1);
        g4b0Var.f102162d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m133554b(g4b0 g4b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125698X9, viewGroup, false);
        m133553a(g4b0Var, viewInflate);
        return viewInflate;
    }
}
