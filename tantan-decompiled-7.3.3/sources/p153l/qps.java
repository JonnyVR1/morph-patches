package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set.LiveGiftWallSetSubTabItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class qps {
    /* JADX INFO: renamed from: a */
    public static void m177471a(LiveGiftWallSetSubTabItemView liveGiftWallSetSubTabItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallSetSubTabItemView._item_icon = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftWallSetSubTabItemView._user_icon = (VDraweeView) viewGroup.getChildAt(1);
        liveGiftWallSetSubTabItemView._item_title = (TextView) viewGroup.getChildAt(2);
        liveGiftWallSetSubTabItemView._five_star = (LiveGiftFiveStarView) viewGroup.getChildAt(3);
        liveGiftWallSetSubTabItemView._line = viewGroup.getChildAt(4);
    }
}
