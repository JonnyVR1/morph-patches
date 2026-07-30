package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class zyr {
    /* JADX INFO: renamed from: a */
    public static void m222150a(LiveBgView liveBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBgView.f48731a = (VDraweeView) viewGroup.getChildAt(0);
        liveBgView.f48732b = (AnimEffectPlayer) viewGroup.getChildAt(1);
    }
}
