package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import p147v.VDraweeView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class h4n {
    /* JADX INFO: renamed from: a */
    public static void m129276a(f4n f4nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f4nVar._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        f4nVar._navigation_bar = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f4nVar._result_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        f4nVar._result_layout_finding_img = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        f4nVar._result_layout_finding_content_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        f4nVar._setting_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        f4nVar._setting_layout_index = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        f4nVar._setting_layout_banner = (ViewPager2) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        f4nVar._setting_layout_start_btn = (RoundTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m129277b(f4n f4nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95992s4, viewGroup, false);
        m129276a(f4nVar, viewInflate);
        return viewInflate;
    }
}
