package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.HourTopBroadcastView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gjl {
    /* JADX INFO: renamed from: a */
    public static void m126547a(HourTopBroadcastView hourTopBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourTopBroadcastView.f49970a = (VDraweeView) viewGroup.getChildAt(0);
        hourTopBroadcastView.f49971b = (FrameLayout) viewGroup.getChildAt(1);
        hourTopBroadcastView.f49972c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hourTopBroadcastView.f49973d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hourTopBroadcastView.f49974e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        hourTopBroadcastView.f49975f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        hourTopBroadcastView.f49976g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }
}
