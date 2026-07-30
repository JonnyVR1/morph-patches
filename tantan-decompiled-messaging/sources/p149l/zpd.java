package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zpd {
    /* JADX INFO: renamed from: a */
    public static void m219668a(ypd ypdVar, View view) {
        ypdVar.f199426a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ypdVar.f199427b = viewGroup.getChildAt(0);
        ypdVar.f199428c = (LinearLayout) viewGroup.getChildAt(1);
        ypdVar.f199429d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ypdVar.f199430e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ypdVar.f199431f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        ypdVar.f199432g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m219669b(ypd ypdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95419J8, viewGroup, false);
        m219668a(ypdVar, viewInflate);
        return viewInflate;
    }
}
