package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardSecondOrThirdView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vpl0 {
    /* JADX INFO: renamed from: a */
    public static void m199279a(VirtualFansBoardSecondOrThirdView virtualFansBoardSecondOrThirdView, View view) {
        virtualFansBoardSecondOrThirdView._root = (VirtualFansBoardSecondOrThirdView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansBoardSecondOrThirdView._bg = viewGroup.getChildAt(0);
        virtualFansBoardSecondOrThirdView._rank_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        virtualFansBoardSecondOrThirdView._avatar = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        virtualFansBoardSecondOrThirdView._crown = (VImage) viewGroup.getChildAt(3);
        virtualFansBoardSecondOrThirdView._avatar_bottom = viewGroup.getChildAt(4);
        virtualFansBoardSecondOrThirdView._living = (LivingNewTagView) viewGroup.getChildAt(5);
        virtualFansBoardSecondOrThirdView._name = (VText) viewGroup.getChildAt(6);
        virtualFansBoardSecondOrThirdView._heart = (VText) viewGroup.getChildAt(7);
    }
}
