package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p3f0 {
    /* JADX INFO: renamed from: a */
    public static void m167244a(SignInMainFrame signInMainFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMainFrame.f49309a = (VImage) viewGroup.getChildAt(0);
        signInMainFrame.f49310b = (VImage) viewGroup.getChildAt(1);
        signInMainFrame.f49311c = (LinearLayout) viewGroup.getChildAt(2);
        signInMainFrame.f49312d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        signInMainFrame.f49313e = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        signInMainFrame.f49314f = (VText) viewGroup.getChildAt(3);
        signInMainFrame.f49315g = (RecyclerView) viewGroup.getChildAt(4);
    }
}
