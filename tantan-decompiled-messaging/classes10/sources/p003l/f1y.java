package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.e1y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f1y {
    /* JADX INFO: renamed from: a */
    public static void m6367a(e1y e1yVar, View view) {
        e1yVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e1yVar.b = viewGroup.getChildAt(0);
        e1yVar.c = viewGroup.getChildAt(1);
        e1yVar.d = (RelativeLayout) viewGroup.getChildAt(2);
        e1yVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e1yVar.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        e1yVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        e1yVar.h = viewGroup.getChildAt(3);
        e1yVar.i = viewGroup.getChildAt(4);
        e1yVar.j = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m6368b(e1y e1yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5569m0, viewGroup, false);
        m6367a(e1yVar, viewInflate);
        return viewInflate;
    }
}
