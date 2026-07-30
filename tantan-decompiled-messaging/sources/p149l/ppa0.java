package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ppa0 {
    /* JADX INFO: renamed from: a */
    public static void m170712a(opa0 opa0Var, View view) {
        opa0Var.f144961f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        opa0Var.f144962g = (VLinear) viewGroup.getChildAt(0);
        opa0Var.f144963h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        opa0Var.f144964i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        opa0Var.f144965j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        opa0Var.f144966k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        opa0Var.f144967l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        opa0Var.f144968m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        opa0Var.f144969n = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m170713b(opa0 opa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95437Ka, viewGroup, false);
        m170712a(opa0Var, viewInflate);
        return viewInflate;
    }
}
