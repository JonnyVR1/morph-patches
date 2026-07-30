package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dzl0 {
    /* JADX INFO: renamed from: a */
    public static void m118750a(VirtualFansNormalItemView virtualFansNormalItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualFansNormalItemView.f53084d = (VText) viewGroup.getChildAt(0);
        virtualFansNormalItemView.f53085e = (CommonMaskAvatarView) viewGroup.getChildAt(1);
        virtualFansNormalItemView.f53086f = (VDraweeView) viewGroup.getChildAt(2);
        virtualFansNormalItemView.f53087g = (VText) viewGroup.getChildAt(3);
        virtualFansNormalItemView.f53088h = (LiveGenderMedalView) viewGroup.getChildAt(4);
        virtualFansNormalItemView.f53089i = (VText) viewGroup.getChildAt(5);
    }
}
