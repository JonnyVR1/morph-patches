package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceFastGiftView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class afn0 {
    /* JADX INFO: renamed from: a */
    public static void m97521a(VoiceFastGiftView voiceFastGiftView, View view) {
        voiceFastGiftView.f53762d = (VoiceFastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFastGiftView.f53763e = (VText) viewGroup.getChildAt(0);
        voiceFastGiftView.f53764f = (VDraweeView) viewGroup.getChildAt(1);
        voiceFastGiftView.f53765g = (FastGiftCountDownView) viewGroup.getChildAt(2);
        voiceFastGiftView.f53766h = (VText) viewGroup.getChildAt(3);
        voiceFastGiftView.f53767i = viewGroup.getChildAt(4);
    }
}
