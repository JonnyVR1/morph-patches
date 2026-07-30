package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.TrayBackground;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class p9j0 {
    /* JADX INFO: renamed from: a */
    public static void m167865a(TrayBackground trayBackground, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        trayBackground.f52095a = viewGroup.getChildAt(0);
        trayBackground.f52096b = (VDraweeView) viewGroup.getChildAt(1);
        trayBackground.f52097c = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
