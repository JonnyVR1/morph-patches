package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p147v.VImage;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class e6s {
    /* JADX INFO: renamed from: a */
    public static void m115112a(LiveCustomStickerPickView liveCustomStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCustomStickerPickView.f48639a = viewGroup.getChildAt(0);
        liveCustomStickerPickView.f48640b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCustomStickerPickView.f48641c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCustomStickerPickView.f48642d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCustomStickerPickView.f48643e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCustomStickerPickView.f48644f = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveCustomStickerPickView.f48645g = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveCustomStickerPickView.f48646h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveCustomStickerPickView.f48647i = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        liveCustomStickerPickView.f48648j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
    }
}
