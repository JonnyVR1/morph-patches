package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;

/* JADX INFO: loaded from: classes9.dex */
public class tmu {
    /* JADX INFO: renamed from: a */
    public static void m191858a(LiveVChatGiftLayer liveVChatGiftLayer, View view) {
        liveVChatGiftLayer.f45932a = (LiveVChatGiftLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftLayer.f45933b = (MomoLayUpSVGAImageView) viewGroup.getChildAt(0);
        liveVChatGiftLayer.f45934c = (VideoEffectPlayer) viewGroup.getChildAt(1);
        liveVChatGiftLayer.f45935d = (XEGiftView) viewGroup.getChildAt(2);
    }
}
