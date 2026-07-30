package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.vvw;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wvw {
    /* JADX INFO: renamed from: a */
    public static void m10588a(vvw vvwVar, View view) {
        vvwVar.c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vvwVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        vvwVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        vvwVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        vvwVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        vvwVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        vvwVar.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(4);
        vvwVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(5);
        vvwVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(7);
        vvwVar.l = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10589b(vvw vvwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.K, viewGroup, false);
        m10588a(vvwVar, viewInflate);
        return viewInflate;
    }
}
