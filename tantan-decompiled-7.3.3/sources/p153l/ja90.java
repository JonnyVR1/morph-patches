package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ja90 {
    /* JADX INFO: renamed from: a */
    public static void m144012a(PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntrancePromotionBottomView._divider = viewGroup.getChildAt(0);
        privilegeEntrancePromotionBottomView._promotion_desc_layout = (VLinear_FillerMeasure) viewGroup.getChildAt(1);
        privilegeEntrancePromotionBottomView._promotion_desc_left = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeEntrancePromotionBottomView._promotion_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privilegeEntrancePromotionBottomView._promotion_desc = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        privilegeEntrancePromotionBottomView._promotion_tip = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        privilegeEntrancePromotionBottomView._goto_buy = (VText) viewGroup.getChildAt(2);
        privilegeEntrancePromotionBottomView._buy_tip = (TextView) viewGroup.getChildAt(3);
    }
}
