package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q6b0 {
    /* JADX INFO: renamed from: a */
    public static void m175545a(p6b0 p6b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p6b0Var.f150788j = (VImage) viewGroup.getChildAt(0);
        p6b0Var.f150789k = (VImage) viewGroup.getChildAt(1);
        p6b0Var.f150790l = (VText) viewGroup.getChildAt(2);
        p6b0Var.f150791m = (VText) viewGroup.getChildAt(3);
        p6b0Var.f150792n = (VText) viewGroup.getChildAt(4);
        p6b0Var.f150793o = (VText) viewGroup.getChildAt(5);
        p6b0Var.f150794p = (VText) viewGroup.getChildAt(6);
        p6b0Var.f150795q = (LinearLayout) viewGroup.getChildAt(7);
        p6b0Var.f150796r = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        p6b0Var.f150797s = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        p6b0Var.f150798t = (RelativeLayout) viewGroup.getChildAt(8);
        p6b0Var.f150799u = (TextView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        p6b0Var.f150800v = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        p6b0Var.f150801w = viewGroup.getChildAt(9);
        p6b0Var.f150802x = (VText) viewGroup.getChildAt(10);
        p6b0Var.f150803y = (LinearLayout) viewGroup.getChildAt(11);
        p6b0Var.f150804z = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        p6b0Var.f150770A = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        p6b0Var.f150771B = (VText) viewGroup.getChildAt(12);
        p6b0Var.f150772C = (VText) viewGroup.getChildAt(13);
    }

    /* JADX INFO: renamed from: b */
    public static View m175546b(p6b0 p6b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162514Y0, viewGroup, false);
        m175545a(p6b0Var, viewInflate);
        return viewInflate;
    }
}
