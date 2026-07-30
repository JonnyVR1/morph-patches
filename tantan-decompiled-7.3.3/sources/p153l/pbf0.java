package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInCycleSignView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pbf0 {
    /* JADX INFO: renamed from: a */
    public static void m171510a(SignInCycleSignView signInCycleSignView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInCycleSignView.f50147a = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        signInCycleSignView.f50148b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        signInCycleSignView.f50149c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        signInCycleSignView.f50150d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        signInCycleSignView.f50151e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
