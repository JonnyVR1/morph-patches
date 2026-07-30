package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.category.LiveGiftWallCategoryItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rls {
    /* JADX INFO: renamed from: a */
    public static void m22074a(LiveGiftWallCategoryItemView liveGiftWallCategoryItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallCategoryItemView._bg = viewGroup.getChildAt(0);
        liveGiftWallCategoryItemView._unlock_mask = viewGroup.getChildAt(1);
        liveGiftWallCategoryItemView._item_svga_bg = viewGroup.getChildAt(2);
        liveGiftWallCategoryItemView._user_icon_bg = viewGroup.getChildAt(3);
        liveGiftWallCategoryItemView._user_icon = viewGroup.getChildAt(4);
        liveGiftWallCategoryItemView._item_icon = viewGroup.getChildAt(5);
        liveGiftWallCategoryItemView._item_title = (TextView) viewGroup.getChildAt(6);
        liveGiftWallCategoryItemView._gift_five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(7);
    }
}
