package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.FilterSwitchCell;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUiHiddenNearByView;
import p151v.VSlider;

/* JADX INFO: loaded from: classes10.dex */
public class xl40 {
    /* JADX INFO: renamed from: a */
    public static void m211492a(NewUiHiddenNearByView newUiHiddenNearByView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUiHiddenNearByView.f37099l = (FilterSwitchCell) viewGroup.getChildAt(0);
        newUiHiddenNearByView.f37100m = (FrameLayout) viewGroup.getChildAt(1);
        newUiHiddenNearByView.f37101n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        newUiHiddenNearByView.f37102o = (VSlider) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m211493b(NewUiHiddenNearByView newUiHiddenNearByView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167588r, viewGroup, true);
        m211492a(newUiHiddenNearByView, viewInflate);
        return viewInflate;
    }
}
