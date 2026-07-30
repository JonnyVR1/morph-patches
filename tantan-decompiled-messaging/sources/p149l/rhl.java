package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardSecondOrThirdView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rhl {
    /* JADX INFO: renamed from: a */
    public static void m179387a(HourBoardSecondOrThirdView hourBoardSecondOrThirdView, View view) {
        hourBoardSecondOrThirdView._root = (HourBoardSecondOrThirdView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hourBoardSecondOrThirdView._bg = viewGroup.getChildAt(0);
        hourBoardSecondOrThirdView._rank_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        hourBoardSecondOrThirdView._avatar = (VDraweeView) viewGroup.getChildAt(2);
        hourBoardSecondOrThirdView._crown = (VImage) viewGroup.getChildAt(3);
        hourBoardSecondOrThirdView._avatar_bottom = viewGroup.getChildAt(4);
        hourBoardSecondOrThirdView._living = (LivingNewTagView) viewGroup.getChildAt(5);
        hourBoardSecondOrThirdView._name = (VText) viewGroup.getChildAt(6);
        hourBoardSecondOrThirdView._heart = (VText) viewGroup.getChildAt(7);
        hourBoardSecondOrThirdView._rank = (VText) viewGroup.getChildAt(8);
        hourBoardSecondOrThirdView._rank_icon = (VImage) viewGroup.getChildAt(9);
    }
}
