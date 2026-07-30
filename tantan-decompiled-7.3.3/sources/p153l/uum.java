package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class uum {
    /* JADX INFO: renamed from: a */
    public static void m198210a(InputCallButton inputCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        inputCallButton.f49361a = (VDraweeView) viewGroup.getChildAt(0);
        inputCallButton.f49362b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        inputCallButton.f49363c = viewGroup.getChildAt(2);
    }
}
