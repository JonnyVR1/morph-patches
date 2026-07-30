package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.view.banner.Banner;
import com.p046p1.mobile.putong.core.view.banner.IndicatorView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VProgress;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cer {
    /* JADX INFO: renamed from: a */
    public static void m106347a(ber berVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        berVar._bg = (VDraweeView) viewGroup.getChildAt(0);
        berVar._finding_layout = (ConstraintLayout) viewGroup.getChildAt(1);
        berVar._finding_layout_finding_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        berVar._finding_layout_finding_time = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        berVar._finding_layout_progress = (VProgress) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        berVar._finding_layout_finding_anim_big_circle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        berVar._finding_layout_finding_anim_ring = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        berVar._finding_layout_finding_anim_small_circle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        berVar._finding_layout_finding_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        berVar._finding_layout_finding_content_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        berVar._finding_layout_finding_content_desc = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        berVar._setting_layout = (ConstraintLayout) viewGroup.getChildAt(2);
        berVar._setting_layout_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        berVar._setting_layout_banner = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        berVar._setting_layout_indicator = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        berVar._setting_layout_start_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        berVar._setting_layout_later_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m106348b(ber berVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95511P4, viewGroup, false);
        m106347a(berVar, viewInflate);
        return viewInflate;
    }
}
