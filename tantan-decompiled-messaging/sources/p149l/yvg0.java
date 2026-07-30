package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;

/* JADX INFO: loaded from: classes4.dex */
public class yvg0 {
    /* JADX INFO: renamed from: a */
    public static void m216216a(SuperGodEffectContainer superGodEffectContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superGodEffectContainer._svga_img = (AnimEffectPlayer) viewGroup.getChildAt(0);
        superGodEffectContainer._video_player = (VideoEffectPlayer) viewGroup.getChildAt(1);
        superGodEffectContainer._gift_view = (XEGiftView) viewGroup.getChildAt(2);
    }
}
