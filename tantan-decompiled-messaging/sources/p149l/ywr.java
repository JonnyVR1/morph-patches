package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ywr {
    /* JADX INFO: renamed from: a */
    public static void m216411a(LiveBgView liveBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBgView.f47883a = (VDraweeView) viewGroup.getChildAt(0);
        liveBgView.f47884b = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
