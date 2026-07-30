package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.view.banner.Banner;
import com.p000p1.mobile.putong.core.view.banner.IndicatorView;
import l.f6c0;
import l.vpi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wpi {
    /* JADX INFO: renamed from: a */
    public static void m10536a(vpi vpiVar, View view) {
        vpiVar.b = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vpiVar.c = viewGroup.getChildAt(0);
        vpiVar.d = viewGroup.getChildAt(1);
        vpiVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vpiVar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vpiVar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vpiVar.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vpiVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vpiVar.j = viewGroup.getChildAt(2);
        vpiVar.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vpiVar.l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vpiVar.m = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vpiVar.n = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        vpiVar.o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        vpiVar.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m10537b(vpi vpiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.G4, viewGroup, false);
        m10536a(vpiVar, viewInflate);
        return viewInflate;
    }
}
