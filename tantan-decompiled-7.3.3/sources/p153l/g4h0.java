package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;

/* JADX INFO: loaded from: classes4.dex */
public class g4h0 {
    /* JADX INFO: renamed from: a */
    public static void m128881a(SuperGodEffectContainer superGodEffectContainer, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superGodEffectContainer._svga_img = (AnimEffectPlayer) viewGroup.getChildAt(0);
        superGodEffectContainer._video_player = (VideoEffectPlayer) viewGroup.getChildAt(1);
        superGodEffectContainer._gift_view = (XEGiftView) viewGroup.getChildAt(2);
    }
}
