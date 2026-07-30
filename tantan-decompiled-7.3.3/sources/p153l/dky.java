package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dky {
    /* JADX INFO: renamed from: a */
    public static void m116691a(MemberManagerSettleItemView memberManagerSettleItemView, View view) {
        memberManagerSettleItemView.f54586d = (MemberManagerSettleItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberManagerSettleItemView.f54587e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberManagerSettleItemView.f54588f = (VText) viewGroup.getChildAt(1);
        memberManagerSettleItemView.f54589g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberManagerSettleItemView.f54590h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        memberManagerSettleItemView.f54591i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        memberManagerSettleItemView.f54592j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        memberManagerSettleItemView.f54593k = (VText) viewGroup.getChildAt(3);
        memberManagerSettleItemView.f54594l = (VText) viewGroup.getChildAt(4);
        memberManagerSettleItemView.f54595m = (VText) viewGroup.getChildAt(5);
    }
}
