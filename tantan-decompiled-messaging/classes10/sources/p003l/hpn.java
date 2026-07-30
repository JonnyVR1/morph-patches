package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.gpn;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hpn {
    /* JADX INFO: renamed from: a */
    public static void m7048a(gpn gpnVar, View view) {
        gpnVar.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gpnVar.b = (FrameLayout) viewGroup.getChildAt(0);
        gpnVar.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gpnVar.d = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gpnVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gpnVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gpnVar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gpnVar.h = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7049b(gpn gpnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5572n, viewGroup, false);
        m7048a(gpnVar, viewInflate);
        return viewInflate;
    }
}
