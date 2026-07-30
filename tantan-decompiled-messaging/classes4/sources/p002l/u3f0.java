package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.common.signin.medal.MedalProgressView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u3f0 {
    /* JADX INFO: renamed from: a */
    public static void m23276a(SignInMedalFrame signInMedalFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMedalFrame.f5385a = viewGroup.getChildAt(0);
        signInMedalFrame.f5386b = (FrameLayout) viewGroup.getChildAt(1);
        signInMedalFrame.f5387c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        signInMedalFrame.f5388d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInMedalFrame.f5389e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        signInMedalFrame.f5390f = viewGroup.getChildAt(2);
        signInMedalFrame.f5391g = (FrameLayout) viewGroup.getChildAt(4);
        signInMedalFrame.f5392h = (MedalProgressView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        signInMedalFrame.f5393i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        signInMedalFrame.f5394j = viewGroup.getChildAt(5);
    }
}
