package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetLikedItemView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ceo {
    /* JADX INFO: renamed from: a */
    public static void m106333a(IntlMeetLikedItemView intlMeetLikedItemView, View view) {
        intlMeetLikedItemView._root = (IntlMeetLikedItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikedItemView._divider = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetLikedItemView._header_pic = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView._content = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView._title_big = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        intlMeetLikedItemView._pic_tag_big = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        intlMeetLikedItemView._pic_tag_big_pic_verify_logo = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView._pic_tag_big_svip_tag = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView._like = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        intlMeetLikedItemView._subtitle = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        intlMeetLikedItemView._action_btn = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        intlMeetLikedItemView._image = (VDraweeView) view.findViewById(x4c0.f191002m);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlMeetLikedItemView._maskView = viewGroup2.getChildAt(1);
        intlMeetLikedItemView._match = (VLinear) viewGroup2.getChildAt(2);
        intlMeetLikedItemView._match_icon = (VImage) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(0);
        intlMeetLikedItemView._match_remaining_switch = (LetterRemainingSwitcherView) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
    }
}
