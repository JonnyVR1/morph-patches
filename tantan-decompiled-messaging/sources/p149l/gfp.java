package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class gfp {
    /* JADX INFO: renamed from: a */
    public static void m125925a(ffp ffpVar, View view) {
        ffpVar.f97277g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ffpVar.f97278h = (VImage) viewGroup.getChildAt(0);
        ffpVar.f97279i = (VText_NoTopPadding) viewGroup.getChildAt(1);
        ffpVar.f97280j = (VText_NoTopPadding) viewGroup.getChildAt(2);
        ffpVar.f97281k = (VRecyclerView) viewGroup.getChildAt(3);
        ffpVar.f97282l = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m125926b(ffp ffpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95624W5, viewGroup, false);
        m125925a(ffpVar, viewInflate);
        return viewInflate;
    }
}
