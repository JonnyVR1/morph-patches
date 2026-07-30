package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class s5u {
    /* JADX INFO: renamed from: a */
    public static void m22210a(LiveStickerContainer liveStickerContainer, View view) {
        liveStickerContainer.f4708a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f4709b = viewGroup.getChildAt(0);
        liveStickerContainer.f4710c = (LinearLayout) viewGroup.getChildAt(1);
        liveStickerContainer.f4711d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerContainer.f4712e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m22211b(LiveStickerContainer liveStickerContainer, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19713V5, viewGroup, false);
        m22210a(liveStickerContainer, viewInflate);
        return viewInflate;
    }
}
