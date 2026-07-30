package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r5u {
    /* JADX INFO: renamed from: a */
    public static void m21780a(LiveStickerContainer liveStickerContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f4713f = (FrameLayout) viewGroup.getChildAt(0);
        liveStickerContainer.f4714g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
