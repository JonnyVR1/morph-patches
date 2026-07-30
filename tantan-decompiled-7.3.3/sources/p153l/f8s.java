package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p151v.VImage;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f8s {
    /* JADX INFO: renamed from: a */
    public static void m124553a(LiveCustomStickerPickView liveCustomStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCustomStickerPickView.f49487a = viewGroup.getChildAt(0);
        liveCustomStickerPickView.f49488b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCustomStickerPickView.f49489c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCustomStickerPickView.f49490d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCustomStickerPickView.f49491e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCustomStickerPickView.f49492f = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveCustomStickerPickView.f49493g = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveCustomStickerPickView.f49494h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveCustomStickerPickView.f49495i = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        liveCustomStickerPickView.f49496j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
    }
}
