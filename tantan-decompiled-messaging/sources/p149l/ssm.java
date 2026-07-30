package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ssm {
    /* JADX INFO: renamed from: a */
    public static void m185756a(InputCallButton inputCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        inputCallButton.f48513a = (VDraweeView) viewGroup.getChildAt(0);
        inputCallButton.f48514b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        inputCallButton.f48515c = viewGroup.getChildAt(2);
    }
}
