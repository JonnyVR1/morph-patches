package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.icebreak.a;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z8m {
    /* JADX INFO: renamed from: a */
    public static void m11361a(a aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.f = viewGroup.getChildAt(0);
        aVar.g = (LinearLayout) viewGroup.getChildAt(1);
        aVar.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aVar.j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        aVar.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        aVar.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        aVar.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        aVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        aVar.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        aVar.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        aVar.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        aVar.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        aVar.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        aVar.t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m11362b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.i4, viewGroup, false);
        m11361a(aVar, viewInflate);
        return viewInflate;
    }
}
