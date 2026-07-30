package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.TrayBackground;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class tij0 {
    /* JADX INFO: renamed from: a */
    public static void m191335a(TrayBackground trayBackground, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        trayBackground.f52943a = viewGroup.getChildAt(0);
        trayBackground.f52944b = (VDraweeView) viewGroup.getChildAt(1);
        trayBackground.f52945c = (AnimEffectPlayer) viewGroup.getChildAt(2);
    }
}
