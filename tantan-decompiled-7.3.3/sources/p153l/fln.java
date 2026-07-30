package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.C9053a;
import p151v.VButton;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fln {
    /* JADX INFO: renamed from: a */
    public static void m126160a(C9053a c9053a, View view) {
        c9053a._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c9053a._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        c9053a._gender = (VLinear) viewGroup.getChildAt(2);
        c9053a._male = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c9053a._male_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c9053a._male_gender_ic_male_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c9053a._male_gender_tv_male_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c9053a._male_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        c9053a._female = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c9053a._female_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        c9053a._female_gender_ic_female_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c9053a._female_gender_tv_female_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        c9053a._female_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        c9053a._nonbinary = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        c9053a._nonbinary_gender = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        c9053a._nonbinary_gender_ic_nonbinary_gender_icon = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        c9053a._nonbinary_gender_tv_nonbinary_gender_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        c9053a._nonbinary_ic = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        c9053a._add_more_gender_entrance = (ConstraintLayout) viewGroup.getChildAt(3);
        c9053a._add_more_gender_entrance_tv_more_gender = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        c9053a._add_more_gender_entrance_tv_more_gender_add = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        c9053a._add_more_gender_entrance_ic_more_gender = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        c9053a._save_ = (VButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m126161b(C9053a c9053a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125518M5, viewGroup, false);
        m126160a(c9053a, viewInflate);
        return viewInflate;
    }
}
