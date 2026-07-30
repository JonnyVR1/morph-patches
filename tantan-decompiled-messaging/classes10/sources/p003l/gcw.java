package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.f6c0;
import l.fcw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gcw {
    /* JADX INFO: renamed from: a */
    public static void m6624a(fcw fcwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fcwVar.a = (FrameLayout) viewGroup.getChildAt(0);
        fcwVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fcwVar.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fcwVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        fcwVar.e = (LinearLayout) viewGroup.getChildAt(1);
        fcwVar.f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fcwVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        fcwVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fcwVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        fcwVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6625b(fcw fcwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.B6, viewGroup, false);
        m6624a(fcwVar, viewInflate);
        return viewInflate;
    }
}
