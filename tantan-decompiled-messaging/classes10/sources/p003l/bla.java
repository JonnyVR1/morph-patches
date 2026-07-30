package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.tka;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bla {
    /* JADX INFO: renamed from: a */
    public static void m5738a(tka tkaVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tkaVar.a = viewGroup.getChildAt(0);
        tkaVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tkaVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tkaVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        tkaVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        tkaVar.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        tkaVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m5739b(tka tkaVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6029m4, viewGroup, false);
        m5738a(tkaVar, viewInflate);
        return viewInflate;
    }
}
