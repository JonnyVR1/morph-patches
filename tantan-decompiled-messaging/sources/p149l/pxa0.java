package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pxa0 {
    /* JADX INFO: renamed from: a */
    public static void m171825a(oxa0 oxa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oxa0Var.f146172j = (VImage) viewGroup.getChildAt(0);
        oxa0Var.f146173k = (Guideline) viewGroup.getChildAt(2);
        oxa0Var.f146174l = (VImage) viewGroup.getChildAt(3);
        oxa0Var.f146175m = (Guideline) viewGroup.getChildAt(4);
        oxa0Var.f146176n = (VImage) viewGroup.getChildAt(5);
        oxa0Var.f146177o = (VImage) viewGroup.getChildAt(6);
        oxa0Var.f146178p = (VText) viewGroup.getChildAt(7);
        oxa0Var.f146179q = (VText) viewGroup.getChildAt(8);
        oxa0Var.f146180r = (VText) viewGroup.getChildAt(9);
        oxa0Var.f146181s = (VText) viewGroup.getChildAt(10);
        oxa0Var.f146182t = (LinearLayout) viewGroup.getChildAt(11);
        oxa0Var.f146183u = (VImage) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        oxa0Var.f146184v = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        oxa0Var.f146185w = (RelativeLayout) viewGroup.getChildAt(12);
        oxa0Var.f146186x = (TextView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        oxa0Var.f146187y = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
        oxa0Var.f146188z = viewGroup.getChildAt(13);
        oxa0Var.f146158A = (LinearLayout) viewGroup.getChildAt(14);
        oxa0Var.f146159B = (VText) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
        oxa0Var.f146160C = (VText) viewGroup.getChildAt(15);
    }

    /* JADX INFO: renamed from: b */
    public static View m171826b(oxa0 oxa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131546W0, viewGroup, false);
        m171825a(oxa0Var, viewInflate);
        return viewInflate;
    }
}
