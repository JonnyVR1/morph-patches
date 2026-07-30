package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wq70 {
    /* JADX INFO: renamed from: a */
    public static void m205026a(vq70 vq70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vq70Var.f182596i = viewGroup.getChildAt(0);
        vq70Var.f182597j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vq70Var.f182598k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        vq70Var.f182599l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        vq70Var.f182600m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        vq70Var.f182601n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vq70Var.f182602o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vq70Var.f182603p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        vq70Var.f182604q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        vq70Var.f182605r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        vq70Var.f182606s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m205027b(vq70 vq70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168228W4, viewGroup, false);
        m205026a(vq70Var, viewInflate);
        return viewInflate;
    }
}
