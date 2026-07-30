package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.VoiceBottomGiftView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ltm0 {
    /* JADX INFO: renamed from: a */
    public static void m155801a(VoiceBottomGiftView voiceBottomGiftView, View view) {
        voiceBottomGiftView.f49403d = (VoiceBottomGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBottomGiftView.f49404e = (VDraweeView) viewGroup.getChildAt(0);
        voiceBottomGiftView.f49405f = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceBottomGiftView.f49406g = viewGroup.getChildAt(2);
        voiceBottomGiftView.f49407h = (TextView) viewGroup.getChildAt(3);
        voiceBottomGiftView.f49408i = (VText) viewGroup.getChildAt(4);
    }
}
