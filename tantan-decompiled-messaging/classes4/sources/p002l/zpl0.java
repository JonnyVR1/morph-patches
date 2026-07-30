package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zpl0 {
    /* JADX INFO: renamed from: a */
    public static void m27500a(VirtualFansNormalItemView virtualFansNormalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansNormalItemView.d = viewGroup.getChildAt(0);
        virtualFansNormalItemView.e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        virtualFansNormalItemView.f = viewGroup.getChildAt(2);
        virtualFansNormalItemView.g = viewGroup.getChildAt(3);
        virtualFansNormalItemView.h = (LiveGenderMedalView) viewGroup.getChildAt(4);
        virtualFansNormalItemView.i = viewGroup.getChildAt(5);
    }
}
