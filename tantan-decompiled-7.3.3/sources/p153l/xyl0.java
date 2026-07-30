package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansBoardFirstView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xyl0 {
    /* JADX INFO: renamed from: a */
    public static void m213632a(VirtualFansBoardFirstView virtualFansBoardFirstView, View view) {
        virtualFansBoardFirstView._root = (VirtualFansBoardFirstView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansBoardFirstView._bg = viewGroup.getChildAt(0);
        virtualFansBoardFirstView._rank_svga = (AnimEffectPlayer) viewGroup.getChildAt(1);
        virtualFansBoardFirstView._avatar = (CommonMaskAvatarView) viewGroup.getChildAt(2);
        virtualFansBoardFirstView._crown = (VImage) viewGroup.getChildAt(3);
        virtualFansBoardFirstView._avatar_bottom = viewGroup.getChildAt(4);
        virtualFansBoardFirstView._living = (LivingNewTagView) viewGroup.getChildAt(5);
        virtualFansBoardFirstView._name = (VText) viewGroup.getChildAt(6);
        virtualFansBoardFirstView._heart = (VText) viewGroup.getChildAt(7);
    }
}
