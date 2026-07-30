package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.hhr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ihr {
    /* JADX INFO: renamed from: a */
    public static void m7241a(hhr hhrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hhrVar.a = viewGroup.getChildAt(0);
        hhrVar.b = viewGroup.getChildAt(1);
        hhrVar.c = viewGroup.getChildAt(2);
        hhrVar.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        hhrVar.e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        hhrVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        hhrVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        hhrVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        hhrVar.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        hhrVar.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        hhrVar.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        hhrVar.l = (Button) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        hhrVar.m = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        hhrVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0);
        hhrVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7242b(hhr hhrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5533d0, viewGroup, false);
        m7241a(hhrVar, viewInflate);
        return viewInflate;
    }
}
