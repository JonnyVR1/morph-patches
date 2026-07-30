package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveCustomStickerPickView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e6s {
    /* JADX INFO: renamed from: a */
    public static void m12249a(LiveCustomStickerPickView liveCustomStickerPickView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCustomStickerPickView.f4681a = viewGroup.getChildAt(0);
        liveCustomStickerPickView.f4682b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveCustomStickerPickView.f4683c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCustomStickerPickView.f4684d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCustomStickerPickView.f4685e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCustomStickerPickView.f4686f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        liveCustomStickerPickView.f4687g = (GiftDialogIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        liveCustomStickerPickView.f4688h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        liveCustomStickerPickView.f4689i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        liveCustomStickerPickView.f4690j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
    }
}
