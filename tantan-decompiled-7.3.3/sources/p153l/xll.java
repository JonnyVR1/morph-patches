package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.HourTopBroadcastView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xll {
    /* JADX INFO: renamed from: a */
    public static void m211663a(HourTopBroadcastView hourTopBroadcastView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hourTopBroadcastView.f50818a = (VDraweeView) viewGroup.getChildAt(0);
        hourTopBroadcastView.f50819b = (FrameLayout) viewGroup.getChildAt(1);
        hourTopBroadcastView.f50820c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hourTopBroadcastView.f50821d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hourTopBroadcastView.f50822e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        hourTopBroadcastView.f50823f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        hourTopBroadcastView.f50824g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }
}
