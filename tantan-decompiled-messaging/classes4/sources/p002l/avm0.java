package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class avm0 {
    /* JADX INFO: renamed from: a */
    public static void m10077a(VoiceCardGiftWallView voiceCardGiftWallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardGiftWallView.a = viewGroup.getChildAt(0);
        voiceCardGiftWallView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardGiftWallView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardGiftWallView.d = viewGroup.getChildAt(2);
        voiceCardGiftWallView.e = viewGroup.getChildAt(3);
    }
}
