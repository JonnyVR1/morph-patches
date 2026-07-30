package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkWinTimesViewInternal;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.AutoVisibleEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkCursorView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkDecorateView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkMagnetCardView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkScoreView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkFirstGiftView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gc80 {
    /* JADX INFO: renamed from: a */
    public static void m129860a(PkViewInternal pkViewInternal, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkViewInternal.f52445a = (LivePkDecorateView) viewGroup.getChildAt(0);
        pkViewInternal.f52446b = (LivePkScoreView) viewGroup.getChildAt(1);
        pkViewInternal.f52447c = (LivePkCursorView) viewGroup.getChildAt(2);
        pkViewInternal.f52448d = (LivePkMagnetCardView) viewGroup.getChildAt(3);
        pkViewInternal.f52449e = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pkViewInternal.f52450f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pkViewInternal.f52451g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        pkViewInternal.f52452h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(0);
        pkViewInternal.f52453i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        pkViewInternal.f52454j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        pkViewInternal.f52455k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(2);
        pkViewInternal.f52457l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2)).getChildAt(3);
        pkViewInternal.f52458m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        pkViewInternal.f52459n = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        pkViewInternal.f52460o = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        pkViewInternal.f52461p = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(3);
        pkViewInternal.f52463q = (VImage) viewGroup.getChildAt(6);
        pkViewInternal.f52464r = (ConstraintLayout) viewGroup.getChildAt(7);
        pkViewInternal.f52465s = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        pkViewInternal.f52466t = (Space) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        pkViewInternal.f52467u = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        pkViewInternal.f52468v = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(3);
        pkViewInternal.f52469w = (VImage) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(4);
        pkViewInternal.f52470x = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5);
        pkViewInternal.f52471y = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f52472z = (PkWinTimesViewInternal) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f52416A = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f52417B = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f52418C = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(2);
        pkViewInternal.f52419D = (PkFirstGiftView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        pkViewInternal.f52420E = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        pkViewInternal.f52422F = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0)).getChildAt(4);
        pkViewInternal.f52424G = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0);
        pkViewInternal.f52426H = (PkWinTimesViewInternal) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkViewInternal.f52428I = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkViewInternal.f52430J = (RecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(1);
        pkViewInternal.f52432K = (AutoVisibleEffectPlayer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(2);
        pkViewInternal.f52433L = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(3);
        pkViewInternal.f52434M = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1)).getChildAt(4);
        pkViewInternal.f52435N = (PkBountyView) viewGroup.getChildAt(9);
        pkViewInternal.f52436O = (AutoVisibleEffectPlayer) viewGroup.getChildAt(10);
        pkViewInternal.f52437P = (VButton) viewGroup.getChildAt(11);
        pkViewInternal.f52438Q = (VText) viewGroup.getChildAt(12);
        pkViewInternal.f52439R = (AnimEffectPlayer) viewGroup.getChildAt(13);
        pkViewInternal.f52440S = (VImage) viewGroup.getChildAt(14);
    }
}
