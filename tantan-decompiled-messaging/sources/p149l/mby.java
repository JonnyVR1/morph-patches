package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mby {
    /* JADX INFO: renamed from: a */
    public static void m153977a(MemberOnLineItemView memberOnLineItemView, View view) {
        memberOnLineItemView.f53699d = (MemberOnLineItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberOnLineItemView.f53700e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberOnLineItemView.f53701f = (LiveGradientTextView) viewGroup.getChildAt(1);
        memberOnLineItemView.f53702g = viewGroup.getChildAt(2);
        memberOnLineItemView.f53703h = (VText) viewGroup.getChildAt(3);
        memberOnLineItemView.f53704i = (VDraweeView) viewGroup.getChildAt(4);
        memberOnLineItemView.f53705j = (VDraweeView) viewGroup.getChildAt(5);
        memberOnLineItemView.f53706k = (VText) viewGroup.getChildAt(6);
    }
}
