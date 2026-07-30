package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.AutoVisibleEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkScoreView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkTimeView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFirstGiftView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesContainerView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesResultView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b480 {
    /* JADX INFO: renamed from: a */
    public static void m100216a(PkView pkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkView.f51539a = (LivePkScoreView) viewGroup.getChildAt(0);
        pkView.f51540b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pkView.f51541c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkView.f51542d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pkView.f51543e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        pkView.f51544f = (LivePkTimeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        pkView.f51545g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        pkView.f51546h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        pkView.f51547i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        pkView.f51548j = (VImage) viewGroup.getChildAt(2);
        pkView.f51549k = (ConstraintLayout) viewGroup.getChildAt(3);
        pkView.f51550l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pkView.f51551m = (Space) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pkView.f51552n = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        pkView.f51553o = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        pkView.f51554p = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        pkView.f51555q = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(5);
        pkView.f51556r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        pkView.f51557s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pkView.f51558t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkView.f51559u = (PkWinTimesResultView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkView.f51560v = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        pkView.f51561w = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(2);
        pkView.f51562x = (PkFirstGiftView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        pkView.f51563y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        pkView.f51564z = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        pkView.f51522A = (PkWinTimesResultView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkView.f51523B = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        pkView.f51524C = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        pkView.f51525D = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        pkView.f51526E = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        pkView.f51527F = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(3);
        pkView.f51528G = (PkWinTimesContainerView) viewGroup.getChildAt(5);
        pkView.f51529H = (PkBountyView) viewGroup.getChildAt(6);
        pkView.f51530I = (AutoVisibleEffectPlayer) viewGroup.getChildAt(7);
        pkView.f51531J = (VButton) viewGroup.getChildAt(8);
        pkView.f51532K = (VImage) viewGroup.getChildAt(9);
    }
}
