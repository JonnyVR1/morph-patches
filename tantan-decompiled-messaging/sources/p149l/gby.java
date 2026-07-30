package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.settlein.MemberManagerSettleItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gby {
    /* JADX INFO: renamed from: a */
    public static void m125348a(MemberManagerSettleItemView memberManagerSettleItemView, View view) {
        memberManagerSettleItemView.f53738d = (MemberManagerSettleItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberManagerSettleItemView.f53739e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberManagerSettleItemView.f53740f = (VText) viewGroup.getChildAt(1);
        memberManagerSettleItemView.f53741g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        memberManagerSettleItemView.f53742h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        memberManagerSettleItemView.f53743i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        memberManagerSettleItemView.f53744j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        memberManagerSettleItemView.f53745k = (VText) viewGroup.getChildAt(3);
        memberManagerSettleItemView.f53746l = (VText) viewGroup.getChildAt(4);
        memberManagerSettleItemView.f53747m = (VText) viewGroup.getChildAt(5);
    }
}
