package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.m6c0;
import l.w6p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x6p {
    /* JADX INFO: renamed from: a */
    public static void m10648a(w6p w6pVar, View view) {
        w6pVar.m = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w6pVar.n = viewGroup.getChildAt(0);
        w6pVar.o = (LinearLayout) viewGroup.getChildAt(1);
        w6pVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        w6pVar.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        w6pVar.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        w6pVar.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        w6pVar.t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10649b(w6p w6pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.N, viewGroup, false);
        m10648a(w6pVar, viewInflate);
        return viewInflate;
    }
}
