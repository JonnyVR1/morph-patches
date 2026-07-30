package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveWaveVoiceView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallCellTopView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d410 {
    /* JADX INFO: renamed from: a */
    public static void m109968a(MultiCallCellTopView multiCallCellTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallCellTopView.f51388d = (VFrame) viewGroup.getChildAt(0);
        multiCallCellTopView.f51389e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        multiCallCellTopView.f51390f = (LiveWaveVoiceView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        multiCallCellTopView.f51391g = (VLinear) viewGroup.getChildAt(1);
        multiCallCellTopView.f51392h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        multiCallCellTopView.f51393i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        multiCallCellTopView.f51394j = (VLinear) viewGroup.getChildAt(2);
        multiCallCellTopView.f51395k = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        multiCallCellTopView.f51396l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        multiCallCellTopView.f51397m = (VText) viewGroup.getChildAt(3);
        multiCallCellTopView.f51398n = (VText) viewGroup.getChildAt(4);
        multiCallCellTopView.f51399o = (VImage) viewGroup.getChildAt(5);
        multiCallCellTopView.f51400p = viewGroup.getChildAt(6);
        multiCallCellTopView.f51401q = (VText) viewGroup.getChildAt(7);
        multiCallCellTopView.f51402r = (VImage) viewGroup.getChildAt(8);
        multiCallCellTopView.f51403s = (VText) viewGroup.getChildAt(9);
        multiCallCellTopView.f51404t = (VText) viewGroup.getChildAt(10);
        multiCallCellTopView.f51405u = (Space) viewGroup.getChildAt(11);
        multiCallCellTopView.f51406v = (AnimEffectPlayer) viewGroup.getChildAt(12);
        multiCallCellTopView.f51407w = (VDraweeView) viewGroup.getChildAt(13);
        multiCallCellTopView.f51408x = (VText) viewGroup.getChildAt(14);
    }
}
