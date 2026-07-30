package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zpl0 {
    /* JADX INFO: renamed from: a */
    public static void m219677a(VirtualFansNormalItemView virtualFansNormalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansNormalItemView.f52236d = (VText) viewGroup.getChildAt(0);
        virtualFansNormalItemView.f52237e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        virtualFansNormalItemView.f52238f = (VDraweeView) viewGroup.getChildAt(2);
        virtualFansNormalItemView.f52239g = (VText) viewGroup.getChildAt(3);
        virtualFansNormalItemView.f52240h = (LiveGenderMedalView) viewGroup.getChildAt(4);
        virtualFansNormalItemView.f52241i = (VText) viewGroup.getChildAt(5);
    }
}
