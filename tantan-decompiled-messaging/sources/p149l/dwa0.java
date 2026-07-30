package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dwa0 {
    /* JADX INFO: renamed from: a */
    public static void m113862a(cwa0 cwa0Var, View view) {
        cwa0Var.f82764a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cwa0Var.f82765b = (VImage) viewGroup.getChildAt(0);
        cwa0Var.f82766c = (VImage) viewGroup.getChildAt(1);
        cwa0Var.f82767d = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m113863b(cwa0 cwa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95532Q9, viewGroup, false);
        m113862a(cwa0Var, viewInflate);
        return viewInflate;
    }
}
