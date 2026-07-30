package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VSwitch;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class yap {
    /* JADX INFO: renamed from: a */
    public static void m213866a(xap xapVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xapVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        xapVar._gender_man = (VLinear) viewGroup.getChildAt(2);
        xapVar._gender_man_show_profile_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xapVar._gender_man_gender_man_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xapVar._gender_woman = (VLinear) viewGroup.getChildAt(3);
        xapVar._gender_woman_gender_woman_text = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        xapVar._gender_woman_gender_woman_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        xapVar._gender_nonbinary = (VLinear) viewGroup.getChildAt(4);
        xapVar._gender_nonbinary_gender_nonbinary_text = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        xapVar._gender_nonbinary_gender_nonbinary_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        xapVar._gender_everyone = (VLinear) viewGroup.getChildAt(5);
        xapVar._gender_everyone_gender_everyone_text = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        xapVar._gender_everyone_gender_everyone_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        xapVar._show_cis = (ConstraintLayout) viewGroup.getChildAt(7);
        xapVar._show_cis_show_cis_title = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        xapVar._show_cis_show_cis_desc = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        xapVar._show_cis_show_cis_switch = (VSwitch) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        xapVar._save_ = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m213867b(xap xapVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95432K5, viewGroup, false);
        m213866a(xapVar, viewInflate);
        return viewInflate;
    }
}
