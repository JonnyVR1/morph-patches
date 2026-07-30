package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.ioo;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class joo {
    /* JADX INFO: renamed from: a */
    public static void m7444a(ioo iooVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iooVar.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        iooVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iooVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        iooVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iooVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        iooVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        iooVar.g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        iooVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        iooVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7445b(ioo iooVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.V0, viewGroup, false);
        m7444a(iooVar, viewInflate);
        return viewInflate;
    }
}
