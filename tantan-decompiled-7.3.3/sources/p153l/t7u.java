package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class t7u {
    /* JADX INFO: renamed from: a */
    public static void m189635a(LiveStickerContainer liveStickerContainer, View view) {
        liveStickerContainer.f49514a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f49515b = viewGroup.getChildAt(0);
        liveStickerContainer.f49516c = (LinearLayout) viewGroup.getChildAt(1);
        liveStickerContainer.f49517d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerContainer.f49518e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m189636b(LiveStickerContainer liveStickerContainer, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198949V5, viewGroup, false);
        m189635a(liveStickerContainer, viewInflate);
        return viewInflate;
    }
}
