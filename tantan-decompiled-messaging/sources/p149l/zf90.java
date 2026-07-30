package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zf90 {
    /* JADX INFO: renamed from: a */
    public static void m218451a(yf90 yf90Var, View view) {
        yf90Var.f198010a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        yf90Var.f198011b = (VText) viewGroup.getChildAt(0);
        yf90Var.f198012c = (RelativeLayout) viewGroup.getChildAt(1);
        yf90Var.f198013d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        yf90Var.f198014e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        yf90Var.f198015f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        yf90Var.f198016g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yf90Var.f198017h = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        yf90Var.f198018i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        yf90Var.f198019j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        yf90Var.f198020k = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        yf90Var.f198021l = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        yf90Var.f198022m = (LinearLayout) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m218452b(yf90 yf90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96083xa, viewGroup, false);
        m218451a(yf90Var, viewInflate);
        return viewInflate;
    }
}
