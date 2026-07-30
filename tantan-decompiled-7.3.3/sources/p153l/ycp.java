package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ycp {
    /* JADX INFO: renamed from: a */
    public static void m215171a(xcp xcpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xcpVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        xcpVar._gender_man = (VLinear) viewGroup.getChildAt(2);
        xcpVar._gender_man_show_profile_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        xcpVar._gender_man_gender_man_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        xcpVar._gender_woman = (VLinear) viewGroup.getChildAt(3);
        xcpVar._gender_woman_gender_woman_text = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        xcpVar._gender_woman_gender_woman_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        xcpVar._gender_nonbinary = (VLinear) viewGroup.getChildAt(4);
        xcpVar._gender_nonbinary_gender_nonbinary_text = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        xcpVar._gender_nonbinary_gender_nonbinary_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        xcpVar._gender_everyone = (VLinear) viewGroup.getChildAt(5);
        xcpVar._gender_everyone_gender_everyone_text = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        xcpVar._gender_everyone_gender_everyone_check = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        xcpVar._show_cis = (ConstraintLayout) viewGroup.getChildAt(7);
        xcpVar._show_cis_show_cis_title = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        xcpVar._show_cis_show_cis_desc = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        xcpVar._show_cis_show_cis_switch = (VSwitch) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        xcpVar._save_ = (VButton) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m215172b(xcp xcpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125502L5, viewGroup, false);
        m215171a(xcpVar, viewInflate);
        return viewInflate;
    }
}
