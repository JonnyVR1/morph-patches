package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceLiveHourTopBroadcastView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rzn0 {
    /* JADX INFO: renamed from: a */
    public static void m183803a(VoiceLiveHourTopBroadcastView voiceLiveHourTopBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHourTopBroadcastView.f50892a = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveHourTopBroadcastView.f50893b = (FrameLayout) viewGroup.getChildAt(1);
        voiceLiveHourTopBroadcastView.f50894c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveHourTopBroadcastView.f50895d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceLiveHourTopBroadcastView.f50896e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
