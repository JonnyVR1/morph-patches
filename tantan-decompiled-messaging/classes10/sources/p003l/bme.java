package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ame;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bme {
    /* JADX INFO: renamed from: a */
    public static void m5744a(ame ameVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ameVar.u = viewGroup.getChildAt(1);
        ameVar.v = viewGroup.getChildAt(2);
        ameVar.w = viewGroup.getChildAt(3);
        ameVar.x = viewGroup.getChildAt(4);
        ameVar.y = viewGroup.getChildAt(5);
        ameVar.z = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ameVar.A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        ameVar.B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        ameVar.C = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        ameVar.D = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        ameVar.E = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        ameVar.F = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5745b(ame ameVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.w9, viewGroup, false);
        m5744a(ameVar, viewInflate);
        return viewInflate;
    }
}
