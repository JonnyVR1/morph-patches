package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mya0 {
    /* JADX INFO: renamed from: a */
    public static void m156999a(lya0 lya0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lya0Var.f130536j = (VImage) viewGroup.getChildAt(0);
        lya0Var.f130537k = (VImage) viewGroup.getChildAt(1);
        lya0Var.f130538l = (VText) viewGroup.getChildAt(2);
        lya0Var.f130539m = (VText) viewGroup.getChildAt(3);
        lya0Var.f130540n = (VText) viewGroup.getChildAt(4);
        lya0Var.f130541o = (VText) viewGroup.getChildAt(5);
        lya0Var.f130542p = (VText) viewGroup.getChildAt(6);
        lya0Var.f130543q = (LinearLayout) viewGroup.getChildAt(7);
        lya0Var.f130544r = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        lya0Var.f130545s = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        lya0Var.f130546t = (RelativeLayout) viewGroup.getChildAt(8);
        lya0Var.f130547u = (TextView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        lya0Var.f130548v = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        lya0Var.f130549w = viewGroup.getChildAt(9);
        lya0Var.f130550x = (VText) viewGroup.getChildAt(10);
        lya0Var.f130551y = (LinearLayout) viewGroup.getChildAt(11);
        lya0Var.f130552z = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        lya0Var.f130518A = (VText) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        lya0Var.f130519B = (VText) viewGroup.getChildAt(12);
        lya0Var.f130520C = (VText) viewGroup.getChildAt(13);
    }

    /* JADX INFO: renamed from: b */
    public static View m157000b(lya0 lya0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131554Y0, viewGroup, false);
        m156999a(lya0Var, viewInflate);
        return viewInflate;
    }
}
