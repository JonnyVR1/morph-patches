package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fs80 {
    /* JADX INFO: renamed from: a */
    public static void m6502a(PrivateCustomResultListViewModel privateCustomResultListViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultListViewModel.b = viewGroup.getChildAt(0);
        privateCustomResultListViewModel.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultListViewModel.d = (RelativeLayout) viewGroup.getChildAt(1);
        privateCustomResultListViewModel.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privateCustomResultListViewModel.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privateCustomResultListViewModel.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privateCustomResultListViewModel.h = viewGroup.getChildAt(2);
        privateCustomResultListViewModel.i = (FrameLayout) viewGroup.getChildAt(3);
        privateCustomResultListViewModel.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        privateCustomResultListViewModel.k = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6503b(PrivateCustomResultListViewModel privateCustomResultListViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5546g1, viewGroup, false);
        m6502a(privateCustomResultListViewModel, viewInflate);
        return viewInflate;
    }
}
