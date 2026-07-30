package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class yr00 {
    /* JADX INFO: renamed from: a */
    public static void m215767a(xr00 xr00Var, View view) {
        xr00Var.f194064a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xr00Var.f194065b = (VScroll) viewGroup.getChildAt(0);
        xr00Var.f194066c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xr00Var.f194067d = (FrameLayout) viewGroup.getChildAt(1);
        xr00Var.f194068e = (LinearLayout) viewGroup.getChildAt(2);
        xr00Var.f194069f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xr00Var.f194070g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xr00Var.f194071h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        xr00Var.f194072i = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        xr00Var.f194073j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m215768b(xr00 xr00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142013C4, viewGroup, false);
        m215767a(xr00Var, viewInflate);
        return viewInflate;
    }
}
