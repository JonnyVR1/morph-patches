package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.view.banner.Banner;
import com.p051p1.mobile.putong.core.view.banner.IndicatorView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ssi {
    /* JADX INFO: renamed from: a */
    public static void m187712a(rsi rsiVar, View view) {
        rsiVar._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rsiVar._bg = (VDraweeView) viewGroup.getChildAt(0);
        rsiVar._finding_layout = (ConstraintLayout) viewGroup.getChildAt(1);
        rsiVar._finding_layout_finding_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rsiVar._finding_layout_finding_time = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        rsiVar._finding_layout_progress = (VProgress) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        rsiVar._finding_layout_finding_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        rsiVar._finding_layout_finding_bottom_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        rsiVar._setting_layout = (ConstraintLayout) viewGroup.getChildAt(2);
        rsiVar._setting_layout_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        rsiVar._setting_layout_sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        rsiVar._setting_layout_banner = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        rsiVar._setting_layout_indicator = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        rsiVar._setting_layout_start_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        rsiVar._setting_layout_later_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m187713b(rsi rsiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125421G4, viewGroup, false);
        m187712a(rsiVar, viewInflate);
        return viewInflate;
    }
}
