package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VScroll_Horizontal;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wv40 {
    /* JADX INFO: renamed from: a */
    public static void m205715a(vv40 vv40Var, View view) {
        vv40Var.f183149a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vv40Var.f183150b = viewGroup.getChildAt(0);
        vv40Var.f183151c = viewGroup.getChildAt(1);
        vv40Var.f183152d = viewGroup.getChildAt(2);
        vv40Var.f183153e = (VDraweeView) viewGroup.getChildAt(3);
        vv40Var.f183154f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        vv40Var.f183155g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        vv40Var.f183156h = (VLinear_FillerMeasure) viewGroup.getChildAt(5);
        vv40Var.f183157i = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        vv40Var.f183158j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        vv40Var.f183159k = (VText) viewGroup.getChildAt(6);
        vv40Var.f183160l = (LinearLayout) viewGroup.getChildAt(7);
        vv40Var.f183161m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        vv40Var.f183162n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(0);
        vv40Var.f183163o = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0)).getChildAt(1);
        vv40Var.f183164p = (LinearLayout) viewGroup.getChildAt(8);
        vv40Var.f183165q = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        vv40Var.f183166r = (VButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(2);
        vv40Var.f183167s = (VScroll_Horizontal) viewGroup.getChildAt(9);
        vv40Var.f183168t = (VLinear) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        vv40Var.f183169u = (FrameLayout) viewGroup.getChildAt(10);
        vv40Var.f183170v = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m205716b(vv40 vv40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121329Q1, viewGroup, false);
        m205715a(vv40Var, viewInflate);
        return viewInflate;
    }
}
