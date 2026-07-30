package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a5r {
    /* JADX INFO: renamed from: a */
    public static void m9401a(KtvTuningViewModel ktvTuningViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ktvTuningViewModel.a = viewGroup.getChildAt(0);
        ktvTuningViewModel.b = viewGroup.getChildAt(1);
        ktvTuningViewModel.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ktvTuningViewModel.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ktvTuningViewModel.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ktvTuningViewModel.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ktvTuningViewModel.g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ktvTuningViewModel.h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ktvTuningViewModel.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ktvTuningViewModel.j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        ktvTuningViewModel.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        ktvTuningViewModel.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        ktvTuningViewModel.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        ktvTuningViewModel.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        ktvTuningViewModel.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        ktvTuningViewModel.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        ktvTuningViewModel.q = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        ktvTuningViewModel.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
        ktvTuningViewModel.s = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
        ktvTuningViewModel.t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
        ktvTuningViewModel.u = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        ktvTuningViewModel.v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(18);
    }

    /* JADX INFO: renamed from: b */
    public static View m9402b(KtvTuningViewModel ktvTuningViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19985q9, viewGroup, false);
        m9401a(ktvTuningViewModel, viewInflate);
        return viewInflate;
    }
}
