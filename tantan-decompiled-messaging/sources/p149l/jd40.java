package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.FilterSwitchCell;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewUiHiddenNearByView;
import p147v.VSlider;

/* JADX INFO: loaded from: classes10.dex */
public class jd40 {
    /* JADX INFO: renamed from: a */
    public static void m141012a(NewUiHiddenNearByView newUiHiddenNearByView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUiHiddenNearByView.f36251l = (FilterSwitchCell) viewGroup.getChildAt(0);
        newUiHiddenNearByView.f36252m = (FrameLayout) viewGroup.getChildAt(1);
        newUiHiddenNearByView.f36253n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newUiHiddenNearByView.f36254o = (VSlider) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m141013b(NewUiHiddenNearByView newUiHiddenNearByView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137374r, viewGroup, true);
        m141012a(newUiHiddenNearByView, viewInflate);
        return viewInflate;
    }
}
