package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kan0 {
    /* JADX INFO: renamed from: a */
    public static void m16584a(VoiceGiftWallBriefView voiceGiftWallBriefView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallBriefView.d = viewGroup.getChildAt(0);
        voiceGiftWallBriefView.e = viewGroup.getChildAt(1);
        voiceGiftWallBriefView.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceGiftWallBriefView.g = viewGroup.getChildAt(2);
        voiceGiftWallBriefView.h = viewGroup.getChildAt(3);
    }
}
