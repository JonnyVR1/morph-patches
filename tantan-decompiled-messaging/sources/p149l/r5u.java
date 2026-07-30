package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r5u {
    /* JADX INFO: renamed from: a */
    public static void m177957a(LiveStickerContainer liveStickerContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f48671f = (FrameLayout) viewGroup.getChildAt(0);
        liveStickerContainer.f48672g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
