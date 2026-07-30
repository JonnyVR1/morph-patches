package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveStrokeTextView;
import com.p1.mobile.putong.live.livingroom.voice.intl.pk.VoicePkTimeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y7o0 {
    /* JADX INFO: renamed from: a */
    public static void m26435a(VoicePkTimeView voicePkTimeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voicePkTimeView.d = viewGroup.getChildAt(0);
        voicePkTimeView.e = viewGroup.getChildAt(1);
        voicePkTimeView.f = viewGroup.getChildAt(2);
        voicePkTimeView.g = viewGroup.getChildAt(3);
        voicePkTimeView.h = (LiveStrokeTextView) viewGroup.getChildAt(4);
        voicePkTimeView.i = viewGroup.getChildAt(5);
    }
}
