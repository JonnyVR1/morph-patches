package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import l.mik;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nik {
    /* JADX INFO: renamed from: a */
    public static void m8335a(mik mikVar, View view) {
        mikVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mikVar.b = (RelativeLayout) viewGroup.getChildAt(0);
        mikVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mikVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mikVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mikVar.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mikVar.g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mikVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mikVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        mikVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        mikVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mikVar.l = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mikVar.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        mikVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        mikVar.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8336b(mik mikVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5975f, viewGroup, false);
        m8335a(mikVar, viewInflate);
        return viewInflate;
    }
}
