package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v5j0 {
    /* JADX INFO: renamed from: a */
    public static void m199888a(TopPicksItemView topPicksItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topPicksItemView._image = (VDraweeView) viewGroup.getChildAt(0);
        topPicksItemView._bg = viewGroup.getChildAt(1);
        topPicksItemView._instant_match_btn = (VImage) viewGroup.getChildAt(2);
        topPicksItemView._personal_info = (VLinear) viewGroup.getChildAt(3);
        topPicksItemView._personal_info_info_first_line = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        topPicksItemView._personal_info_info_second_line = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        topPicksItemView._personal_info_info_second_line_age = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        topPicksItemView._personal_info_action_btn = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        topPicksItemView._top_container = (VRelative) viewGroup.getChildAt(4);
        topPicksItemView._top_container_active_time = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        topPicksItemView._top_container_chat_master = (RoundTextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        topPicksItemView._top_container_verification_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
