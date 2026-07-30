package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mby {
    /* JADX INFO: renamed from: a */
    public static void m17812a(MemberOnLineItemView memberOnLineItemView, View view) {
        memberOnLineItemView.d = (MemberOnLineItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberOnLineItemView.e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberOnLineItemView.f = viewGroup.getChildAt(1);
        memberOnLineItemView.g = viewGroup.getChildAt(2);
        memberOnLineItemView.h = viewGroup.getChildAt(3);
        memberOnLineItemView.i = viewGroup.getChildAt(4);
        memberOnLineItemView.j = viewGroup.getChildAt(5);
        memberOnLineItemView.k = viewGroup.getChildAt(6);
    }
}
