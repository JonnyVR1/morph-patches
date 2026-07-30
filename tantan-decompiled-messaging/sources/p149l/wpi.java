package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.view.banner.Banner;
import com.p046p1.mobile.putong.core.view.banner.IndicatorView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wpi {
    /* JADX INFO: renamed from: a */
    public static void m204915a(vpi vpiVar, View view) {
        vpiVar._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vpiVar._bg = (VDraweeView) viewGroup.getChildAt(0);
        vpiVar._finding_layout = (ConstraintLayout) viewGroup.getChildAt(1);
        vpiVar._finding_layout_finding_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vpiVar._finding_layout_finding_time = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vpiVar._finding_layout_progress = (VProgress) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vpiVar._finding_layout_finding_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vpiVar._finding_layout_finding_bottom_title = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vpiVar._setting_layout = (ConstraintLayout) viewGroup.getChildAt(2);
        vpiVar._setting_layout_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vpiVar._setting_layout_sub_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vpiVar._setting_layout_banner = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vpiVar._setting_layout_indicator = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        vpiVar._setting_layout_start_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        vpiVar._setting_layout_later_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m204916b(vpi vpiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95367G4, viewGroup, false);
        m204915a(vpiVar, viewInflate);
        return viewInflate;
    }
}
