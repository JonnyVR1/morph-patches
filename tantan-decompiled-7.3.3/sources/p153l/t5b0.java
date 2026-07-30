package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t5b0 {
    /* JADX INFO: renamed from: a */
    public static void m189377a(s5b0 s5b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        s5b0Var.f166335j = (VImage) viewGroup.getChildAt(0);
        s5b0Var.f166336k = (Guideline) viewGroup.getChildAt(2);
        s5b0Var.f166337l = (VImage) viewGroup.getChildAt(3);
        s5b0Var.f166338m = (Guideline) viewGroup.getChildAt(4);
        s5b0Var.f166339n = (VImage) viewGroup.getChildAt(5);
        s5b0Var.f166340o = (VImage) viewGroup.getChildAt(6);
        s5b0Var.f166341p = (VText) viewGroup.getChildAt(7);
        s5b0Var.f166342q = (VText) viewGroup.getChildAt(8);
        s5b0Var.f166343r = (VText) viewGroup.getChildAt(9);
        s5b0Var.f166344s = (VText) viewGroup.getChildAt(10);
        s5b0Var.f166345t = (LinearLayout) viewGroup.getChildAt(11);
        s5b0Var.f166346u = (VImage) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        s5b0Var.f166347v = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        s5b0Var.f166348w = (RelativeLayout) viewGroup.getChildAt(12);
        s5b0Var.f166349x = (TextView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        s5b0Var.f166350y = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
        s5b0Var.f166351z = viewGroup.getChildAt(13);
        s5b0Var.f166321A = (LinearLayout) viewGroup.getChildAt(14);
        s5b0Var.f166322B = (VText) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
        s5b0Var.f166323C = (VText) viewGroup.getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m189378b(s5b0 s5b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162506W0, viewGroup, false);
        m189377a(s5b0Var, viewInflate);
        return viewInflate;
    }
}
