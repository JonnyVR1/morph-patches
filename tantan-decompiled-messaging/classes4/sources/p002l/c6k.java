package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.b6k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c6k {
    /* JADX INFO: renamed from: a */
    public static void m10766a(b6k b6kVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        b6kVar.k = viewGroup.getChildAt(0);
        b6kVar.l = (LinearLayout) viewGroup.getChildAt(1);
        b6kVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        b6kVar.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        b6kVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        b6kVar.p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        b6kVar.q = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        b6kVar.r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        b6kVar.s = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10767b(b6k b6kVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19728W8, viewGroup, false);
        m10766a(b6kVar, viewInflate);
        return viewInflate;
    }
}
