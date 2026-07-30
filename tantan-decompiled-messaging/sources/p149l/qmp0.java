package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qmp0 {
    /* JADX INFO: renamed from: a */
    public static void m175576a(pmp0 pmp0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pmp0Var.f150247f = viewGroup.getChildAt(0);
        pmp0Var.f150248g = (LinearLayout) viewGroup.getChildAt(1);
        pmp0Var.f150249h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pmp0Var.f150250i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pmp0Var.f150251j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pmp0Var.f150252k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m175577b(pmp0 pmp0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95551Rc, viewGroup, false);
        m175576a(pmp0Var, viewInflate);
        return viewInflate;
    }
}
