package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p147v.VDraweeView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class t7p {
    /* JADX INFO: renamed from: a */
    public static void m187493a(r7p r7pVar, View view) {
        r7pVar._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r7pVar._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        r7pVar._navigation_bar = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        r7pVar._result_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        r7pVar._result_layout_finding_img = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        r7pVar._result_layout_finding_content_title = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        r7pVar._setting_layout = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        r7pVar._setting_layout_banner = (ViewPager2) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        r7pVar._setting_layout_index = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m187494b(r7p r7pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95304C5, viewGroup, false);
        m187493a(r7pVar, viewInflate);
        return viewInflate;
    }
}
