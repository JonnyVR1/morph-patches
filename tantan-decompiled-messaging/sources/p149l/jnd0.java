package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jnd0 {
    /* JADX INFO: renamed from: a */
    public static void m142374a(hnd0 hnd0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hnd0Var.f108597a = (ConstraintLayout) viewGroup.getChildAt(0);
        hnd0Var.f108598b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hnd0Var.f108599c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hnd0Var.f108600d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        hnd0Var.f108601e = (FrameLayout) viewGroup.getChildAt(1);
        hnd0Var.f108602f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hnd0Var.f108603g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hnd0Var.f108604h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hnd0Var.f108605i = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m142375b(hnd0 hnd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131574c2, viewGroup, false);
        m142374a(hnd0Var, viewInflate);
        return viewInflate;
    }
}
