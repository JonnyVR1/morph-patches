package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tlc0 {
    /* JADX INFO: renamed from: a */
    public static void m189616a(slc0 slc0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        slc0Var.f165158a = (RelativeLayout) viewGroup.getChildAt(0);
        slc0Var.f165159b = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        slc0Var.f165160c = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        slc0Var.f165161d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        slc0Var.f165162e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        slc0Var.f165163f = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        slc0Var.f165164g = (RelativeLayout) viewGroup.getChildAt(1);
        slc0Var.f165165h = (RelativeLayout) viewGroup.getChildAt(2);
        slc0Var.f165166i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        slc0Var.f165167j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        slc0Var.f165168k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        slc0Var.f165169l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        slc0Var.f165170m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        slc0Var.f165171n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        slc0Var.f165172o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        slc0Var.f165173p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        slc0Var.f165174q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        slc0Var.f165175r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        slc0Var.f165176s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(4);
        slc0Var.f165177t = (RelativeLayout) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m189617b(slc0 slc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126534o4, viewGroup, false);
        m189616a(slc0Var, viewInflate);
        return viewInflate;
    }
}
