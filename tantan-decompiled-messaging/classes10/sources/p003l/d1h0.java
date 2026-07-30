package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.supreme.SupremeListViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d1h0 {
    /* JADX INFO: renamed from: a */
    public static void m6033a(SupremeListViewModel supremeListViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeListViewModel.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeListViewModel.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeListViewModel.d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        supremeListViewModel.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        supremeListViewModel.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        supremeListViewModel.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        supremeListViewModel.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        supremeListViewModel.i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        supremeListViewModel.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        supremeListViewModel.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6034b(SupremeListViewModel supremeListViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5456E1, viewGroup, false);
        m6033a(supremeListViewModel, viewInflate);
        return viewInflate;
    }
}
