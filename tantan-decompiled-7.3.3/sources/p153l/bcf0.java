package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.common.signin.medal.MedalProgressView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bcf0 {
    /* JADX INFO: renamed from: a */
    public static void m103505a(SignInMedalFrame signInMedalFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMedalFrame.f50191a = (DialogTitleBar) viewGroup.getChildAt(0);
        signInMedalFrame.f50192b = (FrameLayout) viewGroup.getChildAt(1);
        signInMedalFrame.f50193c = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        signInMedalFrame.f50194d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInMedalFrame.f50195e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        signInMedalFrame.f50196f = (RecyclerView) viewGroup.getChildAt(2);
        signInMedalFrame.f50197g = (FrameLayout) viewGroup.getChildAt(4);
        signInMedalFrame.f50198h = (MedalProgressView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        signInMedalFrame.f50199i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        signInMedalFrame.f50200j = (VText) viewGroup.getChildAt(5);
    }
}
