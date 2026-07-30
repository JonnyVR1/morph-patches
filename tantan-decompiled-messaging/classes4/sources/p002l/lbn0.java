package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lbn0 {
    /* JADX INFO: renamed from: a */
    public static void m17124a(VoiceGiftWallLightItemView voiceGiftWallLightItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallLightItemView.a = (TextView) viewGroup.getChildAt(1);
        voiceGiftWallLightItemView.b = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceGiftWallLightItemView.c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceGiftWallLightItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
