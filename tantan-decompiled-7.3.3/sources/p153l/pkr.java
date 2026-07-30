package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.home.member.likeme.LikeMeFilterView;
import com.p051p1.mobile.putong.core.p058ui.view.LikersFilterItemView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pkr {
    /* JADX INFO: renamed from: a */
    public static void m172753a(LikersFilterItemView likersFilterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersFilterItemView._like_me_filter = (LikeMeFilterView) viewGroup.getChildAt(0);
        likersFilterItemView._shadow = (VLinear) viewGroup.getChildAt(1);
        likersFilterItemView._filter = (VIcon) viewGroup.getChildAt(2);
        likersFilterItemView._filter_tip = (VLinear) viewGroup.getChildAt(3);
        likersFilterItemView._filter_tip_title = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
