package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.filter.newui.NewUiHiddenNearByView;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jd40 {
    /* JADX INFO: renamed from: a */
    public static void m7394a(NewUiHiddenNearByView newUiHiddenNearByView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUiHiddenNearByView.l = viewGroup.getChildAt(0);
        newUiHiddenNearByView.m = (FrameLayout) viewGroup.getChildAt(1);
        newUiHiddenNearByView.n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newUiHiddenNearByView.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7395b(NewUiHiddenNearByView newUiHiddenNearByView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.r, viewGroup, true);
        m7394a(newUiHiddenNearByView, viewInflate);
        return viewInflate;
    }
}
