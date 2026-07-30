package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.common.signin.medal.MedalProgressView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class u3f0 {
    /* JADX INFO: renamed from: a */
    public static void m191574a(SignInMedalFrame signInMedalFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMedalFrame.f49343a = (DialogTitleBar) viewGroup.getChildAt(0);
        signInMedalFrame.f49344b = (FrameLayout) viewGroup.getChildAt(1);
        signInMedalFrame.f49345c = (VPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        signInMedalFrame.f49346d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInMedalFrame.f49347e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        signInMedalFrame.f49348f = (RecyclerView) viewGroup.getChildAt(2);
        signInMedalFrame.f49349g = (FrameLayout) viewGroup.getChildAt(4);
        signInMedalFrame.f49350h = (MedalProgressView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        signInMedalFrame.f49351i = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        signInMedalFrame.f49352j = (VText) viewGroup.getChildAt(5);
    }
}
