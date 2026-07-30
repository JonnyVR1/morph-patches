package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.C8890a;
import p147v.VButton;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fjn {
    /* JADX INFO: renamed from: a */
    public static void m121605a(C8890a c8890a, View view) {
        c8890a._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c8890a._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        c8890a._gender = (VLinear) viewGroup.getChildAt(2);
        c8890a._male = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c8890a._male_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c8890a._male_gender_ic_male_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8890a._male_gender_tv_male_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8890a._male_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        c8890a._female = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c8890a._female_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        c8890a._female_gender_ic_female_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8890a._female_gender_tv_female_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        c8890a._female_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        c8890a._nonbinary = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        c8890a._nonbinary_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        c8890a._nonbinary_gender_ic_nonbinary_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        c8890a._nonbinary_gender_tv_nonbinary_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        c8890a._nonbinary_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        c8890a._add_more_gender_entrance = (ConstraintLayout) viewGroup.getChildAt(3);
        c8890a._add_more_gender_entrance_tv_more_gender = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        c8890a._add_more_gender_entrance_tv_more_gender_add = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        c8890a._add_more_gender_entrance_ic_more_gender = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        c8890a._save_ = (VButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m121606b(C8890a c8890a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95448L5, viewGroup, false);
        m121605a(c8890a, viewInflate);
        return viewInflate;
    }
}
