package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class s5u {
    /* JADX INFO: renamed from: a */
    public static void m182378a(LiveStickerContainer liveStickerContainer, View view) {
        liveStickerContainer.f48666a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveStickerContainer.f48667b = viewGroup.getChildAt(0);
        liveStickerContainer.f48668c = (LinearLayout) viewGroup.getChildAt(1);
        liveStickerContainer.f48669d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveStickerContainer.f48670e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182379b(LiveStickerContainer liveStickerContainer, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168217V5, viewGroup, false);
        m182378a(liveStickerContainer, viewInflate);
        return viewInflate;
    }
}
