package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetSubTabItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pns {
    /* JADX INFO: renamed from: a */
    public static void m20514a(LiveGiftWallSetSubTabItemView liveGiftWallSetSubTabItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallSetSubTabItemView._item_icon = viewGroup.getChildAt(0);
        liveGiftWallSetSubTabItemView._user_icon = viewGroup.getChildAt(1);
        liveGiftWallSetSubTabItemView._item_title = (TextView) viewGroup.getChildAt(2);
        liveGiftWallSetSubTabItemView._five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(3);
        liveGiftWallSetSubTabItemView._line = viewGroup.getChildAt(4);
    }
}
