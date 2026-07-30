package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jbn0 {
    /* JADX INFO: renamed from: a */
    public static void m140803a(VoiceGiftWallItemView voiceGiftWallItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallItemView.f53168d = (RelativeLayout) viewGroup.getChildAt(0);
        voiceGiftWallItemView.f53169e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceGiftWallItemView.f53170f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceGiftWallItemView.f53171g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceGiftWallItemView.f53172h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceGiftWallItemView.f53173i = (VText) viewGroup.getChildAt(1);
    }
}
