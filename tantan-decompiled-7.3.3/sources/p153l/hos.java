package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftWallSkinSelectItemView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class hos {
    /* JADX INFO: renamed from: a */
    public static void m136460a(gos gosVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gosVar._shadow = viewGroup.getChildAt(0);
        gosVar._bg = viewGroup.getChildAt(1);
        gosVar._image_bg = (VDraweeView) viewGroup.getChildAt(2);
        gosVar._title = (TextView) viewGroup.getChildAt(3);
        gosVar._sub_title_image = (VDraweeView) viewGroup.getChildAt(4);
        gosVar._gift_tray = (VDraweeView) viewGroup.getChildAt(5);
        gosVar._gift_tray_svga = (SVGAnimationView) viewGroup.getChildAt(6);
        gosVar._back_bt = (VImage) viewGroup.getChildAt(7);
        gosVar._gift_img = (VDraweeView) viewGroup.getChildAt(8);
        gosVar._five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(9);
        gosVar._gift_source = (TextView) viewGroup.getChildAt(10);
        gosVar._card_bg = (ConstraintLayout) viewGroup.getChildAt(11);
        gosVar._named_user_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(0);
        gosVar._named_user_name = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(1);
        gosVar._named_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(2);
        gosVar._line = ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(3);
        gosVar._star_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(4);
        gosVar._user_icon1 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(5);
        gosVar._user_icon2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(6);
        gosVar._user_icon3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(7);
        gosVar._user_icon4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(8);
        gosVar._user_icon5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(11)).getChildAt(9);
        gosVar._card_bg_normal = (ConstraintLayout) viewGroup.getChildAt(12);
        gosVar._normal_hint = (TextView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        gosVar._line_normal = ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
        gosVar._user_normal_icon1 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(2);
        gosVar._user_normal_icon2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(3);
        gosVar._user_normal_icon3 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(4);
        gosVar._user_normal_icon4 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(5);
        gosVar._user_normal_icon5 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(6);
        gosVar._gifts_title = (TextView) viewGroup.getChildAt(13);
        gosVar._gift_item1 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(14);
        gosVar._gift_item2 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(15);
        gosVar._gift_item3 = (LiveGiftWallSkinSelectItemView) viewGroup.getChildAt(16);
        gosVar._progress_text = (TextView) viewGroup.getChildAt(17);
        gosVar._bt = (TextView) viewGroup.getChildAt(18);
    }
}
