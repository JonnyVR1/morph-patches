package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleSignView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i3f0 {
    /* JADX INFO: renamed from: a */
    public static void m134210a(SignInCycleSignView signInCycleSignView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInCycleSignView.f49299a = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        signInCycleSignView.f49300b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        signInCycleSignView.f49301c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInCycleSignView.f49302d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        signInCycleSignView.f49303e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
