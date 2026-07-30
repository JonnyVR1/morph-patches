package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkWinTimesViewInternal;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.AutoVisibleEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkCursorView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkDecorateView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkMagnetCardView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkScoreView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkFirstGiftView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a480 {
    /* JADX INFO: renamed from: a */
    public static void m94829a(PkViewInternal pkViewInternal, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkViewInternal.f51597a = (LivePkDecorateView) viewGroup.getChildAt(0);
        pkViewInternal.f51598b = (LivePkScoreView) viewGroup.getChildAt(1);
        pkViewInternal.f51599c = (LivePkCursorView) viewGroup.getChildAt(2);
        pkViewInternal.f51600d = (LivePkMagnetCardView) viewGroup.getChildAt(3);
        pkViewInternal.f51601e = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pkViewInternal.f51602f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pkViewInternal.f51603g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        pkViewInternal.f51604h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        pkViewInternal.f51605i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        pkViewInternal.f51606j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        pkViewInternal.f51607k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(2);
        pkViewInternal.f51609l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(3);
        pkViewInternal.f51610m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        pkViewInternal.f51611n = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        pkViewInternal.f51612o = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        pkViewInternal.f51613p = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        pkViewInternal.f51615q = (VImage) viewGroup.getChildAt(6);
        pkViewInternal.f51616r = (ConstraintLayout) viewGroup.getChildAt(7);
        pkViewInternal.f51617s = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        pkViewInternal.f51618t = (Space) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        pkViewInternal.f51619u = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        pkViewInternal.f51620v = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(3);
        pkViewInternal.f51621w = (VImage) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(4);
        pkViewInternal.f51622x = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5);
        pkViewInternal.f51623y = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f51624z = (PkWinTimesViewInternal) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f51568A = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f51569B = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f51570C = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(2);
        pkViewInternal.f51571D = (PkFirstGiftView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        pkViewInternal.f51572E = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        pkViewInternal.f51574F = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(4);
        pkViewInternal.f51576G = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        pkViewInternal.f51578H = (PkWinTimesViewInternal) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f51580I = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f51582J = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(1);
        pkViewInternal.f51584K = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(2);
        pkViewInternal.f51585L = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(3);
        pkViewInternal.f51586M = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(4);
        pkViewInternal.f51587N = (PkBountyView) viewGroup.getChildAt(9);
        pkViewInternal.f51588O = (AutoVisibleEffectPlayer) viewGroup.getChildAt(10);
        pkViewInternal.f51589P = (VButton) viewGroup.getChildAt(11);
        pkViewInternal.f51590Q = (VText) viewGroup.getChildAt(12);
        pkViewInternal.f51591R = (AnimEffectPlayer) viewGroup.getChildAt(13);
        pkViewInternal.f51592S = (VImage) viewGroup.getChildAt(14);
    }
}
