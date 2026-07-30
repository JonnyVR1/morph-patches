package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class asc0 {
    /* JADX INFO: renamed from: a */
    public static void m98589a(zrc0 zrc0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zrc0Var.f204469a = (VImage) viewGroup.getChildAt(0);
        zrc0Var.f204470b = (VImage) viewGroup.getChildAt(1);
        zrc0Var.f204471c = (LinearLayout) viewGroup.getChildAt(2);
        zrc0Var.f204472d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        zrc0Var.f204473e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        zrc0Var.f204474f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        zrc0Var.f204475g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        zrc0Var.f204476h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        zrc0Var.f204477i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        zrc0Var.f204478j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        zrc0Var.f204479k = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        zrc0Var.f204480l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        zrc0Var.f204481m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        zrc0Var.f204482n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        zrc0Var.f204483o = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        zrc0Var.f204484p = (VButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m98590b(zrc0 zrc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131555Y1, viewGroup, false);
        m98589a(zrc0Var, viewInflate);
        return viewInflate;
    }
}
