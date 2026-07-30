package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceFastGiftView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w5n0 {
    /* JADX INFO: renamed from: a */
    public static void m201659a(VoiceFastGiftView voiceFastGiftView, View view) {
        voiceFastGiftView.f52914d = (VoiceFastGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceFastGiftView.f52915e = (VText) viewGroup.getChildAt(0);
        voiceFastGiftView.f52916f = (VDraweeView) viewGroup.getChildAt(1);
        voiceFastGiftView.f52917g = (FastGiftCountDownView) viewGroup.getChildAt(2);
        voiceFastGiftView.f52918h = (VText) viewGroup.getChildAt(3);
        voiceFastGiftView.f52919i = viewGroup.getChildAt(4);
    }
}
