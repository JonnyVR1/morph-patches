package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.category.LiveGiftWallCategoryItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class sns {
    /* JADX INFO: renamed from: a */
    public static void m187000a(LiveGiftWallCategoryItemView liveGiftWallCategoryItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallCategoryItemView._bg = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftWallCategoryItemView._unlock_mask = viewGroup.getChildAt(1);
        liveGiftWallCategoryItemView._item_svga_bg = (SVGAnimationView) viewGroup.getChildAt(2);
        liveGiftWallCategoryItemView._user_icon_bg = viewGroup.getChildAt(3);
        liveGiftWallCategoryItemView._user_icon = (VDraweeView) viewGroup.getChildAt(4);
        liveGiftWallCategoryItemView._item_icon = (VDraweeView) viewGroup.getChildAt(5);
        liveGiftWallCategoryItemView._item_title = (TextView) viewGroup.getChildAt(6);
        liveGiftWallCategoryItemView._gift_five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(7);
    }
}
