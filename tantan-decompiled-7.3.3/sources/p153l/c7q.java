package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c7q {
    /* JADX INFO: renamed from: a */
    public static void m108323a(ItemInviteChallengeView itemInviteChallengeView, View view) {
        itemInviteChallengeView.f26537a = (ItemInviteChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteChallengeView.f26538b = (VLinear) viewGroup.getChildAt(0);
        itemInviteChallengeView.f26539c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemInviteChallengeView.f26540d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemInviteChallengeView.f26541e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemInviteChallengeView.f26542f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
