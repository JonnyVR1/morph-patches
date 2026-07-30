package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gby {
    /* JADX INFO: renamed from: a */
    public static void m13716a(MemberManagerSettleItemView memberManagerSettleItemView, View view) {
        memberManagerSettleItemView.d = (MemberManagerSettleItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberManagerSettleItemView.e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberManagerSettleItemView.f = viewGroup.getChildAt(1);
        memberManagerSettleItemView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberManagerSettleItemView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        memberManagerSettleItemView.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        memberManagerSettleItemView.j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        memberManagerSettleItemView.k = viewGroup.getChildAt(3);
        memberManagerSettleItemView.l = viewGroup.getChildAt(4);
        memberManagerSettleItemView.m = viewGroup.getChildAt(5);
    }
}
