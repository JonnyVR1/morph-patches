package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.p051p1.mobile.putong.core.newui.profile.newme.DatingViewLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.AgeRangeSeekBar;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e9c {
    /* JADX INFO: renamed from: a */
    public static void m119882a(DatingViewLayout datingViewLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        datingViewLayout._my_location = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        datingViewLayout._my_location_location_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        datingViewLayout._my_location_current = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        datingViewLayout._ll_no_location_permission_tips = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        datingViewLayout._ll_no_location_permission_tips_text = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        datingViewLayout._base_setting = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        datingViewLayout._distance_info_base = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        datingViewLayout._distance_text_base = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        datingViewLayout._distance_bar_ll_base = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        datingViewLayout._search_distance_base = (SeekBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        datingViewLayout._auto_distance_base = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        datingViewLayout._show_gender_base = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        datingViewLayout._show_gender_base_text_base = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        datingViewLayout._age_fl_base = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        datingViewLayout._age_text_base = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(1);
        datingViewLayout._age_bar_ll_base = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        datingViewLayout._show_ages_base = (AgeRangeSeekBar) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119883b(DatingViewLayout datingViewLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125355C5, viewGroup, true);
        m119882a(datingViewLayout, viewInflate);
        return viewInflate;
    }
}
