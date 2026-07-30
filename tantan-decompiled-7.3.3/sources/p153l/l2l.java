package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.FilterSwitchCell;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import p151v.VSlider;

/* JADX INFO: loaded from: classes10.dex */
public class l2l {
    /* JADX INFO: renamed from: a */
    public static void m152626a(HiddenNearByView hiddenNearByView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hiddenNearByView.f36918a = (FilterSwitchCell) viewGroup.getChildAt(0);
        hiddenNearByView.f36919b = (FrameLayout) viewGroup.getChildAt(1);
        hiddenNearByView.f36920c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hiddenNearByView.f36921d = (VSlider) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152627b(HiddenNearByView hiddenNearByView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167589r0, viewGroup, true);
        m152626a(hiddenNearByView, viewInflate);
        return viewInflate;
    }
}
