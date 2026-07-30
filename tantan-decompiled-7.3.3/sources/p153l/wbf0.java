package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wbf0 {
    /* JADX INFO: renamed from: a */
    public static void m205716a(SignInMainFrame signInMainFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMainFrame.f50157a = (VImage) viewGroup.getChildAt(0);
        signInMainFrame.f50158b = (VImage) viewGroup.getChildAt(1);
        signInMainFrame.f50159c = (LinearLayout) viewGroup.getChildAt(2);
        signInMainFrame.f50160d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        signInMainFrame.f50161e = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        signInMainFrame.f50162f = (VText) viewGroup.getChildAt(3);
        signInMainFrame.f50163g = (RecyclerView) viewGroup.getChildAt(4);
    }
}
