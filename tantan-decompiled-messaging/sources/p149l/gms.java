package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftWallSkinSelectItemView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class gms {
    /* JADX INFO: renamed from: a */
    public static void m127054a(fms fmsVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fmsVar._shadow = viewGroup.getChildAt(0);
        fmsVar._bg = viewGroup.getChildAt(1);
        fmsVar._image_bg = (VDraweeView) viewGroup.getChildAt(2);
        fmsVar._title = (TextView) viewGroup.getChildAt(3);
        fmsVar._sub_title_image = (VDraweeView) viewGroup.getChildAt(4);
        fmsVar._gift_tray = (VDraweeView) viewGroup.getChildAt(5);
        fmsVar._gift_tray_svga = (SVGAnimationView) viewGroup.getChildAt(6);
        fmsVar._back_bt = (VImage) viewGroup.getChildAt(7);
        fmsVar._gift_img = (VDraweeView) viewGroup.getChildAt(8);
        fmsVar._five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(9);
        fmsVar._gift_source = (TextView) viewGroup.getChildAt(10);
        fmsVar._card_bg = (ConstraintLayout) viewGroup.getChildAt(11);
        fmsVar._named_user_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        fmsVar._named_user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        fmsVar._named_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(2);
        fmsVar._line = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(3);
        fmsVar._star_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(4);
        fmsVar._user_icon1 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(5);
        fmsVar._user_icon2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(6);
        fmsVar._user_icon3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(7);
        fmsVar._user_icon4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(8);
        fmsVar._user_icon5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(9);
        fmsVar._card_bg_normal = (ConstraintLayout) viewGroup.getChildAt(12);
        fmsVar._normal_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        fmsVar._line_normal = ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
        fmsVar._user_normal_icon1 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(2);
        fmsVar._user_normal_icon2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(3);
        fmsVar._user_normal_icon3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(4);
        fmsVar._user_normal_icon4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(5);
        fmsVar._user_normal_icon5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(6);
        fmsVar._gifts_title = (TextView) viewGroup.getChildAt(13);
        fmsVar._gift_item1 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(14);
        fmsVar._gift_item2 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(15);
        fmsVar._gift_item3 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(16);
        fmsVar._progress_text = (TextView) viewGroup.getChildAt(17);
        fmsVar._bt = (TextView) viewGroup.getChildAt(18);
    }
}
