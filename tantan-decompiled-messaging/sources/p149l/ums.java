package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ums {
    /* JADX INFO: renamed from: a */
    public static void m194404a(LiveGiftWallNewGiftItemView liveGiftWallNewGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallNewGiftItemView.f49695a = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftWallNewGiftItemView.f49696b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveGiftWallNewGiftItemView.f49697c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveGiftWallNewGiftItemView.f49698d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveGiftWallNewGiftItemView.f49699e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        liveGiftWallNewGiftItemView.f49700f = (LiveGiftFiveStarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
