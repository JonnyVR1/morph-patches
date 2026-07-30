package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q4t {
    /* JADX INFO: renamed from: a */
    public static void m175257a(LiveMemberItem liveMemberItem, View view) {
        liveMemberItem.f50048a = (LiveMemberItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveMemberItem.f50049b = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveMemberItem.f50050c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveMemberItem.f50051d = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveMemberItem.f50052e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        liveMemberItem.f50053f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveMemberItem.f50054g = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        liveMemberItem.f50055h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveMemberItem.f50056i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        liveMemberItem.f50057j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        liveMemberItem.f50058k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveMemberItem.f50059l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        liveMemberItem.f50060m = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        liveMemberItem.f50061n = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        liveMemberItem.f50062o = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        liveMemberItem.f50063p = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        liveMemberItem.f50064q = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        liveMemberItem.f50065r = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(8);
        liveMemberItem.f50066s = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        liveMemberItem.f50067t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveMemberItem.f50068u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        liveMemberItem.f50069v = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        liveMemberItem.f50070w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        liveMemberItem.f50071x = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        liveMemberItem.f50072y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        liveMemberItem.f50073z = (CommonMedalView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        liveMemberItem.f50042A = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        liveMemberItem.f50043B = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        liveMemberItem.f50044C = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        liveMemberItem.f50045D = (LinearLayout) viewGroup.getChildAt(1);
    }
}
