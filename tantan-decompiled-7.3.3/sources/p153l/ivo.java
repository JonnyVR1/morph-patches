package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ivo {
    /* JADX INFO: renamed from: a */
    public static void m142345a(hvo hvoVar, View view) {
        hvoVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hvoVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        hvoVar._loading_block = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hvoVar._scroll = (VScroll) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hvoVar._full_name = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        hvoVar._full_name_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        hvoVar._birthdate = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        hvoVar._birthdate_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        hvoVar._my_gender = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        hvoVar._my_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        hvoVar._blood_type = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        hvoVar._blood_type_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        hvoVar._profile_type = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        hvoVar._profile_type_profile_check = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(5)).getChildAt(2);
        hvoVar._add_emoji = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(8);
        hvoVar._add_emoji_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(8)).getChildAt(0);
        hvoVar._add_emoji_emoji = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(8)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m142346b(hvo hvoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125542Nd, viewGroup, false);
        m142345a(hvoVar, viewInflate);
        return viewInflate;
    }
}
