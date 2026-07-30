package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yya0 {
    /* JADX INFO: renamed from: a */
    public static void m217957a(xya0 xya0Var, View view) {
        xya0Var.f196728u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xya0Var.f196729v = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xya0Var.f196730w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xya0Var.f196731x = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m217958b(xya0 xya0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126018qa, viewGroup, false);
        m217957a(xya0Var, viewInflate);
        return viewInflate;
    }
}
