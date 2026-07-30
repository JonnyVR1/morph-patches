package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.l0g;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r0g {
    /* JADX INFO: renamed from: a */
    public static void m9068a(l0g l0gVar, View view) {
        l0gVar.c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l0gVar.d = viewGroup.getChildAt(0);
        l0gVar.e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        l0gVar.f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        l0gVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        l0gVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        l0gVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        l0gVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        l0gVar.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        l0gVar.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        l0gVar.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        l0gVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        l0gVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        l0gVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        l0gVar.q = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(3);
        l0gVar.r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9069b(l0g l0gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5548h, viewGroup, false);
        m9068a(l0gVar, viewInflate);
        return viewInflate;
    }
}
