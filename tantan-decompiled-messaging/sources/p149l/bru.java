package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatTrayBackground;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class bru {
    /* JADX INFO: renamed from: a */
    public static void m103600a(LiveVChatTrayBackground liveVChatTrayBackground, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatTrayBackground.f45260a = viewGroup.getChildAt(0);
        liveVChatTrayBackground.f45261b = (VDraweeView) viewGroup.getChildAt(1);
        liveVChatTrayBackground.f45262c = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
