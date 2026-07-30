package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.xje;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yje {
    /* JADX INFO: renamed from: a */
    public static void m11254a(xje xjeVar, View view) {
        xjeVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xjeVar.v = viewGroup.getChildAt(0);
        xjeVar.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xjeVar.x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xjeVar.y = viewGroup.getChildAt(1);
        xjeVar.z = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11255b(xje xjeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.q2, viewGroup, false);
        m11254a(xjeVar, viewInflate);
        return viewInflate;
    }
}
