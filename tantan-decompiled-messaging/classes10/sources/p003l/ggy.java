package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.fgy;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ggy {
    /* JADX INFO: renamed from: a */
    public static void m6635a(fgy fgyVar, View view) {
        fgyVar.b = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fgyVar.c = (FrameLayout) viewGroup.getChildAt(0);
        fgyVar.d = (FrameLayout) viewGroup.getChildAt(1);
        fgyVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fgyVar.f = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6636b(fgy fgyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.y, viewGroup, false);
        m6635a(fgyVar, viewInflate);
        return viewInflate;
    }
}
