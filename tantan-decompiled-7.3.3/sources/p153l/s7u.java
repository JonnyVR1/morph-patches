package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s7u {
    /* JADX INFO: renamed from: a */
    public static void m185036a(LiveStickerContainer liveStickerContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f49519f = (FrameLayout) viewGroup.getChildAt(0);
        liveStickerContainer.f49520g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
