package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class p3h0 {
    /* JADX INFO: renamed from: a */
    public static void m170492a(SummonFansItemView summonFansItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        summonFansItemView.f49390a = (BottomViewGroup) viewGroup.getChildAt(0);
        summonFansItemView.f49391b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        summonFansItemView.f49392c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        summonFansItemView.f49393d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        summonFansItemView.f49394e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        summonFansItemView.f49395f = (VText) viewGroup.getChildAt(1);
        summonFansItemView.f49396g = (TextView) viewGroup.getChildAt(2);
    }
}
