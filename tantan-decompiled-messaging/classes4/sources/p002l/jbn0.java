package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jbn0 {
    /* JADX INFO: renamed from: a */
    public static void m15826a(VoiceGiftWallItemView voiceGiftWallItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallItemView.d = (RelativeLayout) viewGroup.getChildAt(0);
        voiceGiftWallItemView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceGiftWallItemView.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceGiftWallItemView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceGiftWallItemView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceGiftWallItemView.i = viewGroup.getChildAt(1);
    }
}
