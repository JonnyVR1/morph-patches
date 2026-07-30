package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.LiveStrokeTextView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.CommonGiftCountDownView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlLiveCountdownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xtn {
    /* JADX INFO: renamed from: a */
    public static void m26112a(IntlLiveCountdownView intlLiveCountdownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveCountdownView.f7057a = viewGroup.getChildAt(0);
        intlLiveCountdownView.f7058b = viewGroup.getChildAt(1);
        intlLiveCountdownView.f7059c = (LiveStrokeTextView) viewGroup.getChildAt(2);
        intlLiveCountdownView.f7060d = (CommonGiftCountDownView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlLiveCountdownView.f7061e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlLiveCountdownView.f7062f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        intlLiveCountdownView.f7063g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        intlLiveCountdownView.f7064h = (FrameLayout) viewGroup.getChildAt(4);
        intlLiveCountdownView.f7065i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlLiveCountdownView.f7066j = viewGroup.getChildAt(5);
    }
}
