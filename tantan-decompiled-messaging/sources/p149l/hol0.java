package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.background.LiveMediaBgView;
import com.p046p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class hol0 {
    /* JADX INFO: renamed from: a */
    public static void m132223a(VirtualBgView virtualBgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualBgView.f52180d = (VDraweeView) viewGroup.getChildAt(0);
        virtualBgView.f52181e = (AnimEffectPlayer) viewGroup.getChildAt(1);
        virtualBgView.f52182f = (LiveMediaBgView) viewGroup.getChildAt(2);
        virtualBgView.f52183g = (VImage) viewGroup.getChildAt(3);
    }
}
