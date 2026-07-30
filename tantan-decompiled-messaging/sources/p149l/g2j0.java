package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class g2j0 {
    /* JADX INFO: renamed from: a */
    public static void m124160a(f2j0 f2j0Var, View view) {
        f2j0Var.f94187a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        f2j0Var.f94188b = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        f2j0Var.f94189c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        f2j0Var.f94190d = (RecyclerView) viewGroup.getChildAt(1);
        f2j0Var.f94191e = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        f2j0Var.f94192f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        f2j0Var.f94193g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        f2j0Var.f94194h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m124161b(f2j0 f2j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142048I3, viewGroup, false);
        m124160a(f2j0Var, viewInflate);
        return viewInflate;
    }
}
