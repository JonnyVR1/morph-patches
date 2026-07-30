package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.ypd;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zpd {
    /* JADX INFO: renamed from: a */
    public static void m11442a(ypd ypdVar, View view) {
        ypdVar.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ypdVar.b = viewGroup.getChildAt(0);
        ypdVar.c = (LinearLayout) viewGroup.getChildAt(1);
        ypdVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ypdVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ypdVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        ypdVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m11443b(ypd ypdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J8, viewGroup, false);
        m11442a(ypdVar, viewInflate);
        return viewInflate;
    }
}
