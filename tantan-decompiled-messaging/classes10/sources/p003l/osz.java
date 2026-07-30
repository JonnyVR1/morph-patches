package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.ksz;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class osz {
    /* JADX INFO: renamed from: a */
    public static void m8587a(ksz kszVar, View view) {
        kszVar.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kszVar.b = (FrameLayout) viewGroup.getChildAt(0);
        kszVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kszVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kszVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        kszVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        kszVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        kszVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        kszVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        kszVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        kszVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        kszVar.l = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8588b(ksz kszVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6063r3, viewGroup, false);
        m8587a(kszVar, viewInflate);
        return viewInflate;
    }
}
