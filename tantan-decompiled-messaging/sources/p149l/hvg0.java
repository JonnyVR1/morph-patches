package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.SummonFansItemView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hvg0 {
    /* JADX INFO: renamed from: a */
    public static void m133167a(SummonFansItemView summonFansItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        summonFansItemView.f48542a = (BottomViewGroup) viewGroup.getChildAt(0);
        summonFansItemView.f48543b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        summonFansItemView.f48544c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        summonFansItemView.f48545d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        summonFansItemView.f48546e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        summonFansItemView.f48547f = (VText) viewGroup.getChildAt(1);
        summonFansItemView.f48548g = (TextView) viewGroup.getChildAt(2);
    }
}
