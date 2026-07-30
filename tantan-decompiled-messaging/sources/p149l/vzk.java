package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.FilterSwitchCell;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import p147v.VSlider;

/* JADX INFO: loaded from: classes10.dex */
public class vzk {
    /* JADX INFO: renamed from: a */
    public static void m200764a(HiddenNearByView hiddenNearByView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hiddenNearByView.f36070a = (FilterSwitchCell) viewGroup.getChildAt(0);
        hiddenNearByView.f36071b = (FrameLayout) viewGroup.getChildAt(1);
        hiddenNearByView.f36072c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hiddenNearByView.f36073d = (VSlider) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m200765b(HiddenNearByView hiddenNearByView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137375r0, viewGroup, true);
        m200764a(hiddenNearByView, viewInflate);
        return viewInflate;
    }
}
