package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p051p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j9t {
    /* JADX INFO: renamed from: a */
    public static void m143951a(LiveNewGiftWallEntranceView liveNewGiftWallEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveNewGiftWallEntranceView._title = (AutoRefreshTextView) viewGroup.getChildAt(0);
        liveNewGiftWallEntranceView._title_second = (VText) viewGroup.getChildAt(1);
        liveNewGiftWallEntranceView._arrow = (VImage) viewGroup.getChildAt(2);
        liveNewGiftWallEntranceView._icon3 = (VDraweeView) viewGroup.getChildAt(3);
        liveNewGiftWallEntranceView._five_star_icon3 = (ImageView) viewGroup.getChildAt(4);
        liveNewGiftWallEntranceView._icon2 = (VDraweeView) viewGroup.getChildAt(5);
        liveNewGiftWallEntranceView._five_star_icon2 = (ImageView) viewGroup.getChildAt(6);
        liveNewGiftWallEntranceView._icon1 = (VDraweeView) viewGroup.getChildAt(7);
        liveNewGiftWallEntranceView._five_star_icon1 = (ImageView) viewGroup.getChildAt(8);
    }
}
