package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f290 {
    /* JADX INFO: renamed from: a */
    public static void m6369a(PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePromotionBottomView._divider = viewGroup.getChildAt(0);
        privilegeEntrancePromotionBottomView._promotion_desc_layout = viewGroup.getChildAt(1);
        privilegeEntrancePromotionBottomView._promotion_desc_left = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeEntrancePromotionBottomView._promotion_icon = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privilegeEntrancePromotionBottomView._promotion_desc = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privilegeEntrancePromotionBottomView._promotion_tip = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        privilegeEntrancePromotionBottomView._goto_buy = viewGroup.getChildAt(2);
        privilegeEntrancePromotionBottomView._buy_tip = (TextView) viewGroup.getChildAt(3);
    }
}
