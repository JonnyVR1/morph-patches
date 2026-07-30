package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h33 {
    /* JADX INFO: renamed from: a */
    public static void m129157a(g33 g33Var, View view) {
        g33Var.f100319a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        g33Var.f100320b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        g33Var.f100321c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        g33Var.f100322d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        g33Var.f100323e = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        g33Var.f100324f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        g33Var.f100325g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        g33Var.f100326h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        g33Var.f100327i = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        g33Var.f100328j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        g33Var.f100329k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        g33Var.f100330l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        g33Var.f100331m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        g33Var.f100332n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        g33Var.f100333o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        g33Var.f100334p = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        g33Var.f100335q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        g33Var.f100336r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m129158b(g33 g33Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95594U7, viewGroup, false);
        m129157a(g33Var, viewInflate);
        return viewInflate;
    }
}
