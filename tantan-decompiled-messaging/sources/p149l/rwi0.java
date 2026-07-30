package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rwi0 {
    /* JADX INFO: renamed from: a */
    public static void m181393a(TopPicksItemView topPicksItemView, View view) {
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
