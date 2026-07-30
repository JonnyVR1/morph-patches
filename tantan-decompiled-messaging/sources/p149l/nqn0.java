package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.VoiceLiveHourTopBroadcastView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nqn0 {
    /* JADX INFO: renamed from: a */
    public static void m160650a(VoiceLiveHourTopBroadcastView voiceLiveHourTopBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveHourTopBroadcastView.f50044a = (VDraweeView) viewGroup.getChildAt(0);
        voiceLiveHourTopBroadcastView.f50045b = (FrameLayout) viewGroup.getChildAt(1);
        voiceLiveHourTopBroadcastView.f50046c = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceLiveHourTopBroadcastView.f50047d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        voiceLiveHourTopBroadcastView.f50048e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
