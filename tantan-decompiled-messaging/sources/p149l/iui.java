package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iui {
    /* JADX INFO: renamed from: a */
    public static void m138405a(yti ytiVar, View view) {
        ytiVar.f199929a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ytiVar.f199930b = viewGroup.getChildAt(0);
        ytiVar.f199931c = (RelativeLayout) viewGroup.getChildAt(1);
        ytiVar.f199932d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ytiVar.f199933e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ytiVar.f199934f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ytiVar.f199935g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ytiVar.f199936h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ytiVar.f199937i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        ytiVar.f199938j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ytiVar.f199939k = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ytiVar.f199940l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        ytiVar.f199941m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        ytiVar.f199942n = (RelativeLayout) viewGroup.getChildAt(2);
        ytiVar.f199943o = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ytiVar.f199944p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ytiVar.f199945q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ytiVar.f199946r = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m138406b(yti ytiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168325e1, viewGroup, false);
        m138405a(ytiVar, viewInflate);
        return viewInflate;
    }
}
