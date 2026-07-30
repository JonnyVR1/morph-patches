package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.VoiceBottomGiftView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hkm0 {
    /* JADX INFO: renamed from: a */
    public static void m131576a(VoiceBottomGiftView voiceBottomGiftView, View view) {
        voiceBottomGiftView.f48555d = (VoiceBottomGiftView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceBottomGiftView.f48556e = (VDraweeView) viewGroup.getChildAt(0);
        voiceBottomGiftView.f48557f = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceBottomGiftView.f48558g = viewGroup.getChildAt(2);
        voiceBottomGiftView.f48559h = (TextView) viewGroup.getChildAt(3);
        voiceBottomGiftView.f48560i = (VText) viewGroup.getChildAt(4);
    }
}
