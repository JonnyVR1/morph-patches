package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class u310 {
    /* JADX INFO: renamed from: a */
    public static void m191560a(MultiCallBottomMenuView multiCallBottomMenuView, View view) {
        multiCallBottomMenuView.f48516a = (MultiCallBottomMenuView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallBottomMenuView.f48517b = (VDraweeView) viewGroup.getChildAt(0);
        multiCallBottomMenuView.f48518c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        multiCallBottomMenuView.f48519d = viewGroup.getChildAt(2);
        multiCallBottomMenuView.f48520e = (TextView) viewGroup.getChildAt(3);
    }
}
