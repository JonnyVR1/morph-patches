package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class ctu {
    /* JADX INFO: renamed from: a */
    public static void m112553a(LiveVChatTrayBackground liveVChatTrayBackground, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatTrayBackground.f46108a = viewGroup.getChildAt(0);
        liveVChatTrayBackground.f46109b = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatTrayBackground.f46110c = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
