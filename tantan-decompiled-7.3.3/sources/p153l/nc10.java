package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveWaveVoiceView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallCellTopView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nc10 {
    /* JADX INFO: renamed from: a */
    public static void m162476a(MultiCallCellTopView multiCallCellTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallCellTopView.f52236d = (VFrame) viewGroup.getChildAt(0);
        multiCallCellTopView.f52237e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        multiCallCellTopView.f52238f = (LiveWaveVoiceView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        multiCallCellTopView.f52239g = (VLinear) viewGroup.getChildAt(1);
        multiCallCellTopView.f52240h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        multiCallCellTopView.f52241i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        multiCallCellTopView.f52242j = (VLinear) viewGroup.getChildAt(2);
        multiCallCellTopView.f52243k = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        multiCallCellTopView.f52244l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        multiCallCellTopView.f52245m = (VText) viewGroup.getChildAt(3);
        multiCallCellTopView.f52246n = (VText) viewGroup.getChildAt(4);
        multiCallCellTopView.f52247o = (VImage) viewGroup.getChildAt(5);
        multiCallCellTopView.f52248p = viewGroup.getChildAt(6);
        multiCallCellTopView.f52249q = (VText) viewGroup.getChildAt(7);
        multiCallCellTopView.f52250r = (VImage) viewGroup.getChildAt(8);
        multiCallCellTopView.f52251s = (VText) viewGroup.getChildAt(9);
        multiCallCellTopView.f52252t = (VText) viewGroup.getChildAt(10);
        multiCallCellTopView.f52253u = (Space) viewGroup.getChildAt(11);
        multiCallCellTopView.f52254v = (AnimEffectPlayer) viewGroup.getChildAt(12);
        multiCallCellTopView.f52255w = (VDraweeView) viewGroup.getChildAt(13);
        multiCallCellTopView.f52256x = (VText) viewGroup.getChildAt(14);
    }
}
