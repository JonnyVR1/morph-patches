package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.crn;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class drn {
    /* JADX INFO: renamed from: a */
    public static void m6199a(crn crnVar, View view) {
        crnVar.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        crnVar.b = viewGroup.getChildAt(0);
        crnVar.c = viewGroup.getChildAt(1);
        crnVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        crnVar.e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        crnVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        crnVar.g = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        crnVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        crnVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        crnVar.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        crnVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        crnVar.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m6200b(crn crnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5588r, viewGroup, false);
        m6199a(crnVar, viewInflate);
        return viewInflate;
    }
}
