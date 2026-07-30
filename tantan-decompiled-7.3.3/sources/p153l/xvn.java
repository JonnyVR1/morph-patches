package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class xvn {
    /* JADX INFO: renamed from: a */
    public static void m213236a(IntlLiveCountdownView intlLiveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveCountdownView.f51863a = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveCountdownView.f51864b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        intlLiveCountdownView.f51865c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        intlLiveCountdownView.f51866d = (CommonGiftCountDownView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlLiveCountdownView.f51867e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlLiveCountdownView.f51868f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        intlLiveCountdownView.f51869g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        intlLiveCountdownView.f51870h = (FrameLayout) viewGroup.getChildAt(4);
        intlLiveCountdownView.f51871i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlLiveCountdownView.f51872j = (AnimEffectPlayer) viewGroup.getChildAt(5);
    }
}
