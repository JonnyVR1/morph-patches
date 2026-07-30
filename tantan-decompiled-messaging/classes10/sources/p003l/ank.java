package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.zmk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ank {
    /* JADX INFO: renamed from: a */
    public static void m5437a(zmk zmkVar, View view) {
        zmkVar.a = (FrameLayout) view.findViewById(y4c0.f8766T3);
        ViewGroup viewGroup = (ViewGroup) view;
        zmkVar.b = viewGroup.getChildAt(0);
        zmkVar.c = view.findViewById(y4c0.f8819c0);
        zmkVar.d = view.findViewById(y4c0.f8921q4);
        zmkVar.e = (LinearLayout) view.findViewById(y4c0.f8816b4);
        zmkVar.f = view.findViewById(y4c0.f8690H);
        zmkVar.g = view.findViewById(y4c0.f8914p4);
        zmkVar.h = viewGroup.getChildAt(1);
        zmkVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        zmkVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5438b(zmk zmkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6003j, viewGroup, false);
        m5437a(zmkVar, viewInflate);
        return viewInflate;
    }
}
