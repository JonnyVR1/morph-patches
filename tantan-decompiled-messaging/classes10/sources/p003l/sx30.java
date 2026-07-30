package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.home.b;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sx30 {
    /* JADX INFO: renamed from: a */
    public static void m9493a(b bVar, View view) {
        bVar.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.b = viewGroup.getChildAt(0);
        bVar.c = viewGroup.getChildAt(1);
        bVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        bVar.f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        bVar.g = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        bVar.h = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        bVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        bVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        bVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        bVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        bVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        bVar.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        bVar.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        bVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        bVar.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        bVar.r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bVar.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bVar.t = (ViewStub) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bVar.u = (ViewStub) viewGroup.getChildAt(2);
        bVar.v = (FrameLayout) viewGroup.getChildAt(3);
        bVar.w = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9494b(b bVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ke, viewGroup, false);
        m9493a(bVar, viewInflate);
        return viewInflate;
    }
}
