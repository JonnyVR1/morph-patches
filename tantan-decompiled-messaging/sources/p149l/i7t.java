package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p046p1.mobile.putong.live.livingroom.view.AutoRefreshTextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i7t {
    /* JADX INFO: renamed from: a */
    public static void m134922a(LiveNewGiftWallEntranceView liveNewGiftWallEntranceView, View view) {
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
