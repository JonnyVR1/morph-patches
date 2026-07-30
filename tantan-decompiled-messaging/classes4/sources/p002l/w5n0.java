package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView;
import com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceFastGiftView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w5n0 {
    /* JADX INFO: renamed from: a */
    public static void m24327a(VoiceFastGiftView voiceFastGiftView, View view) {
        voiceFastGiftView.d = (VoiceFastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFastGiftView.e = viewGroup.getChildAt(0);
        voiceFastGiftView.f = viewGroup.getChildAt(1);
        voiceFastGiftView.g = (FastGiftCountDownView) viewGroup.getChildAt(2);
        voiceFastGiftView.h = viewGroup.getChildAt(3);
        voiceFastGiftView.i = viewGroup.getChildAt(4);
    }
}
