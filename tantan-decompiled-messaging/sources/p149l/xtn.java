package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class xtn {
    /* JADX INFO: renamed from: a */
    public static void m211004a(IntlLiveCountdownView intlLiveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveCountdownView.f51015a = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveCountdownView.f51016b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        intlLiveCountdownView.f51017c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        intlLiveCountdownView.f51018d = (CommonGiftCountDownView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlLiveCountdownView.f51019e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlLiveCountdownView.f51020f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        intlLiveCountdownView.f51021g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        intlLiveCountdownView.f51022h = (FrameLayout) viewGroup.getChildAt(4);
        intlLiveCountdownView.f51023i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlLiveCountdownView.f51024j = (AnimEffectPlayer) viewGroup.getChildAt(5);
    }
}
