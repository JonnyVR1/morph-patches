package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ec10 {
    /* JADX INFO: renamed from: a */
    public static void m120290a(MultiCallBottomMenuView multiCallBottomMenuView, View view) {
        multiCallBottomMenuView.f49364a = (MultiCallBottomMenuView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallBottomMenuView.f49365b = (VDraweeView) viewGroup.getChildAt(0);
        multiCallBottomMenuView.f49366c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        multiCallBottomMenuView.f49367d = viewGroup.getChildAt(2);
        multiCallBottomMenuView.f49368e = (TextView) viewGroup.getChildAt(3);
    }
}
