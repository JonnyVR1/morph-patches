package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsViewModel;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lop {
    /* JADX INFO: renamed from: a */
    public static void m7759a(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVisitorsViewModel.b = viewGroup.getChildAt(0);
        intlVisitorsViewModel.c = (FrameLayout) viewGroup.getChildAt(1);
        intlVisitorsViewModel.d = viewGroup.getChildAt(2);
        intlVisitorsViewModel.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        intlVisitorsViewModel.f = view.findViewById(u4c0.tf);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVisitorsViewModel.g = viewGroup2.getChildAt(3);
        intlVisitorsViewModel.h = (ImageView) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
        intlVisitorsViewModel.i = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        intlVisitorsViewModel.j = (FrameLayout) viewGroup2.getChildAt(4);
        intlVisitorsViewModel.k = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7760b(IntlVisitorsViewModel intlVisitorsViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.X5, viewGroup, false);
        m7759a(intlVisitorsViewModel, viewInflate);
        return viewInflate;
    }
}
