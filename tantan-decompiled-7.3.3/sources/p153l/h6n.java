package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import p151v.VDraweeView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class h6n {
    /* JADX INFO: renamed from: a */
    public static void m133710a(f6n f6nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f6nVar._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        f6nVar._navigation_bar = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f6nVar._result_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        f6nVar._result_layout_finding_img = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        f6nVar._result_layout_finding_content_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        f6nVar._setting_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        f6nVar._setting_layout_index = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        f6nVar._setting_layout_banner = (ViewPager2) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        f6nVar._setting_layout_start_btn = (RoundTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m133711b(f6n f6nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126046s4, viewGroup, false);
        m133710a(f6nVar, viewInflate);
        return viewInflate;
    }
}
