package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.background.LiveMediaBgView;
import com.p051p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class lxl0 {
    /* JADX INFO: renamed from: a */
    public static void m156205a(VirtualBgView virtualBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualBgView.f53028d = (VDraweeView) viewGroup.getChildAt(0);
        virtualBgView.f53029e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        virtualBgView.f53030f = (LiveMediaBgView) viewGroup.getChildAt(2);
        virtualBgView.f53031g = (VImage) viewGroup.getChildAt(3);
    }
}
