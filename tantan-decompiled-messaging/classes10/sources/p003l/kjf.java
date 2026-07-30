package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.jjf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kjf {
    /* JADX INFO: renamed from: a */
    public static void m7603a(jjf jjfVar, View view) {
        jjfVar.e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jjfVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jjfVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jjfVar.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jjfVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        jjfVar.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jjfVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7604b(jjf jjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H9, viewGroup, false);
        m7603a(jjfVar, viewInflate);
        return viewInflate;
    }
}
