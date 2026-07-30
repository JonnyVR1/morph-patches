package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.AutoVisibleEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkScoreView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkTimeView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFirstGiftView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesContainerView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesResultView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hc80 {
    /* JADX INFO: renamed from: a */
    public static void m134449a(PkView pkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkView.f52387a = (LivePkScoreView) viewGroup.getChildAt(0);
        pkView.f52388b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pkView.f52389c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkView.f52390d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pkView.f52391e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        pkView.f52392f = (LivePkTimeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        pkView.f52393g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        pkView.f52394h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        pkView.f52395i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        pkView.f52396j = (VImage) viewGroup.getChildAt(2);
        pkView.f52397k = (ConstraintLayout) viewGroup.getChildAt(3);
        pkView.f52398l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pkView.f52399m = (Space) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pkView.f52400n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        pkView.f52401o = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        pkView.f52402p = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        pkView.f52403q = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        pkView.f52404r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        pkView.f52405s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pkView.f52406t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkView.f52407u = (PkWinTimesResultView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkView.f52408v = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        pkView.f52409w = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        pkView.f52410x = (PkFirstGiftView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        pkView.f52411y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        pkView.f52412z = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        pkView.f52370A = (PkWinTimesResultView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkView.f52371B = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        pkView.f52372C = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        pkView.f52373D = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        pkView.f52374E = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        pkView.f52375F = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(3);
        pkView.f52376G = (PkWinTimesContainerView) viewGroup.getChildAt(5);
        pkView.f52377H = (PkBountyView) viewGroup.getChildAt(6);
        pkView.f52378I = (AutoVisibleEffectPlayer) viewGroup.getChildAt(7);
        pkView.f52379J = (VButton) viewGroup.getChildAt(8);
        pkView.f52380K = (VImage) viewGroup.getChildAt(9);
    }
}
