package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.view.banner.Banner;
import com.p000p1.mobile.putong.core.view.banner.IndicatorView;
import l.ber;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cer {
    /* JADX INFO: renamed from: a */
    public static void m5939a(ber berVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        berVar.b = viewGroup.getChildAt(0);
        berVar.c = viewGroup.getChildAt(1);
        berVar.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        berVar.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        berVar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        berVar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        berVar.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        berVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        berVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        berVar.k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        berVar.l = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        berVar.m = viewGroup.getChildAt(2);
        berVar.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        berVar.o = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        berVar.p = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        berVar.q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        berVar.r = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5940b(ber berVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.P4, viewGroup, false);
        m5939a(berVar, viewInflate);
        return viewInflate;
    }
}
