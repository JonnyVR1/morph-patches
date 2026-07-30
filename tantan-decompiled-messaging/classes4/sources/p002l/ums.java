package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ums {
    /* JADX INFO: renamed from: a */
    public static void m23563a(LiveGiftWallNewGiftItemView liveGiftWallNewGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallNewGiftItemView.f5737a = viewGroup.getChildAt(0);
        liveGiftWallNewGiftItemView.f5738b = viewGroup.getChildAt(1);
        liveGiftWallNewGiftItemView.f5739c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveGiftWallNewGiftItemView.f5740d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveGiftWallNewGiftItemView.f5741e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        liveGiftWallNewGiftItemView.f5742f = (LiveGiftFiveStarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
