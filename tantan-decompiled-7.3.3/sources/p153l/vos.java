package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.LiveGiftWallNewGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class vos {
    /* JADX INFO: renamed from: a */
    public static void m202169a(LiveGiftWallNewGiftItemView liveGiftWallNewGiftItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGiftWallNewGiftItemView.f50543a = (VDraweeView) viewGroup.getChildAt(0);
        liveGiftWallNewGiftItemView.f50544b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveGiftWallNewGiftItemView.f50545c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        liveGiftWallNewGiftItemView.f50546d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        liveGiftWallNewGiftItemView.f50547e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        liveGiftWallNewGiftItemView.f50548f = (LiveGiftFiveStarView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
