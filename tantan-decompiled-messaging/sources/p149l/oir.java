package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.home.member.likeme.LikeMeFilterView;
import com.p046p1.mobile.putong.core.p053ui.view.LikersFilterItemView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oir {
    /* JADX INFO: renamed from: a */
    public static void m164547a(LikersFilterItemView likersFilterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersFilterItemView._like_me_filter = (LikeMeFilterView) viewGroup.getChildAt(0);
        likersFilterItemView._shadow = (VLinear) viewGroup.getChildAt(1);
        likersFilterItemView._filter = (VIcon) viewGroup.getChildAt(2);
        likersFilterItemView._filter_tip = (VLinear) viewGroup.getChildAt(3);
        likersFilterItemView._filter_tip_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
