package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.view.banner.Banner;
import com.p051p1.mobile.putong.core.view.banner.IndicatorView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dgr {
    /* JADX INFO: renamed from: a */
    public static void m115739a(cgr cgrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cgrVar._bg = (VDraweeView) viewGroup.getChildAt(0);
        cgrVar._finding_layout = (ConstraintLayout) viewGroup.getChildAt(1);
        cgrVar._finding_layout_finding_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cgrVar._finding_layout_finding_time = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cgrVar._finding_layout_progress = (VProgress) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        cgrVar._finding_layout_finding_anim_big_circle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        cgrVar._finding_layout_finding_anim_ring = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        cgrVar._finding_layout_finding_anim_small_circle = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        cgrVar._finding_layout_finding_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        cgrVar._finding_layout_finding_content_title = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        cgrVar._finding_layout_finding_content_desc = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        cgrVar._setting_layout = (ConstraintLayout) viewGroup.getChildAt(2);
        cgrVar._setting_layout_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cgrVar._setting_layout_banner = (Banner) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        cgrVar._setting_layout_indicator = (IndicatorView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        cgrVar._setting_layout_start_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        cgrVar._setting_layout_later_btn = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m115740b(cgr cgrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125565P4, viewGroup, false);
        m115739a(cgrVar, viewInflate);
        return viewInflate;
    }
}
