package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;
import l.h6x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i6x {
    /* JADX INFO: renamed from: a */
    public static void m7133a(h6x h6xVar, View view) {
        h6xVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h6xVar.b = viewGroup.getChildAt(0);
        h6xVar.c = viewGroup.getChildAt(1);
        h6xVar.d = viewGroup.getChildAt(2);
        h6xVar.e = viewGroup.getChildAt(3);
        h6xVar.f = (LinearLayout) viewGroup.getChildAt(4);
        h6xVar.g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        h6xVar.h = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        h6xVar.i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        h6xVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        h6xVar.k = (EditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(0);
        h6xVar.l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3)).getChildAt(1);
        h6xVar.m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(4);
        h6xVar.n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(5);
        h6xVar.o = (FrameLayout) viewGroup.getChildAt(5);
        h6xVar.p = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        h6xVar.q = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7134b(h6x h6xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.M7, viewGroup, false);
        m7133a(h6xVar, viewInflate);
        return viewInflate;
    }
}
