package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.intlGender.a;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fjn {
    /* JADX INFO: renamed from: a */
    public static void m6477a(a aVar, View view) {
        aVar.b = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.c = viewGroup.getChildAt(0);
        aVar.d = viewGroup.getChildAt(2);
        aVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        aVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        aVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        aVar.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        aVar.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        aVar.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        aVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        aVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        aVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        aVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        aVar.o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        aVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        aVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        aVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        aVar.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        aVar.t = viewGroup.getChildAt(3);
        aVar.u = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        aVar.v = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        aVar.w = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        aVar.x = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m6478b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.L5, viewGroup, false);
        m6477a(aVar, viewInflate);
        return viewInflate;
    }
}
