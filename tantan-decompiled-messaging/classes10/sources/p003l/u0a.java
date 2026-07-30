package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.t0a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u0a {
    /* JADX INFO: renamed from: a */
    public static void m9637a(t0a t0aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t0aVar.a = (LinearLayout) viewGroup.getChildAt(0);
        t0aVar.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        t0aVar.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        t0aVar.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        t0aVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        t0aVar.f = (GridView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        t0aVar.g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        t0aVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        t0aVar.i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        t0aVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        t0aVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9638b(t0a t0aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6013k2, viewGroup, false);
        m9637a(t0aVar, viewInflate);
        return viewInflate;
    }
}
