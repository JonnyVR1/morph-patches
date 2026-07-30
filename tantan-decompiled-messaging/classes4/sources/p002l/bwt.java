package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.RoundImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bwt {
    /* JADX INFO: renamed from: a */
    public static void m10634a(LiveSignInProgressView liveSignInProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignInProgressView.f5407a = (RoundImageView) viewGroup.getChildAt(0);
        liveSignInProgressView.f5408b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSignInProgressView.f5409c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
