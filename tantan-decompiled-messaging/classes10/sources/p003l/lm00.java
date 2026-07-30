package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.visitor.d;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lm00 {
    /* JADX INFO: renamed from: a */
    public static void m7753a(d dVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dVar.a = viewGroup.getChildAt(0);
        dVar.b = viewGroup.getChildAt(1);
        dVar.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dVar.d = view.findViewById(x4c0.f8329W);
        ViewGroup viewGroup2 = (ViewGroup) view;
        dVar.e = (FrameLayout) viewGroup2.getChildAt(2);
        dVar.f = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        dVar.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(0);
        dVar.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0)).getChildAt(1);
        dVar.i = viewGroup2.getChildAt(3);
        dVar.j = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        dVar.k = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        dVar.l = viewGroup2.getChildAt(4);
        dVar.m = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(0);
        dVar.n = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
        dVar.o = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
        dVar.p = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(3);
        dVar.q = (FrameLayout) viewGroup2.getChildAt(5);
        dVar.r = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        dVar.s = ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7754b(d dVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5523a2, viewGroup, false);
        m7753a(dVar, viewInflate);
        return viewInflate;
    }
}
