package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLineItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jky {
    /* JADX INFO: renamed from: a */
    public static void m145935a(MemberOnLineItemView memberOnLineItemView, View view) {
        memberOnLineItemView.f54547d = (MemberOnLineItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberOnLineItemView.f54548e = (CommonAnimMaskAvatarView) viewGroup.getChildAt(0);
        memberOnLineItemView.f54549f = (LiveGradientTextView) viewGroup.getChildAt(1);
        memberOnLineItemView.f54550g = viewGroup.getChildAt(2);
        memberOnLineItemView.f54551h = (VText) viewGroup.getChildAt(3);
        memberOnLineItemView.f54552i = (VDraweeView) viewGroup.getChildAt(4);
        memberOnLineItemView.f54553j = (VDraweeView) viewGroup.getChildAt(5);
        memberOnLineItemView.f54554k = (VText) viewGroup.getChildAt(6);
    }
}
