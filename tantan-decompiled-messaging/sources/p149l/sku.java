package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;

/* JADX INFO: loaded from: classes13.dex */
public class sku {
    /* JADX INFO: renamed from: a */
    public static void m184618a(LiveVChatGiftLayer liveVChatGiftLayer, View view) {
        liveVChatGiftLayer.f45084a = (LiveVChatGiftLayer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatGiftLayer.f45085b = (MomoLayUpSVGAImageView) viewGroup.getChildAt(0);
        liveVChatGiftLayer.f45086c = (VideoEffectPlayer) viewGroup.getChildAt(1);
        liveVChatGiftLayer.f45087d = (XEGiftView) viewGroup.getChildAt(2);
    }
}
