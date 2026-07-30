package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pkn0 {
    /* JADX INFO: renamed from: a */
    public static void m172614a(VoiceGiftWallLightItemView voiceGiftWallLightItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallLightItemView.f54012a = (TextView) viewGroup.getChildAt(1);
        voiceGiftWallLightItemView.f54013b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceGiftWallLightItemView.f54014c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceGiftWallLightItemView.f54015d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
