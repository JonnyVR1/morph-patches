package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class lrp {
    /* JADX INFO: renamed from: a */
    public static void m155633a(krp krpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        krpVar.f128492x = viewGroup.getChildAt(0);
        krpVar.f128493y = (FrameLayout) viewGroup.getChildAt(1);
        krpVar.f128494z = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        krpVar.f128490A = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        krpVar.f128491B = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
