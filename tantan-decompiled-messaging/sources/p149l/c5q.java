package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c5q {
    /* JADX INFO: renamed from: a */
    public static void m105353a(ItemInviteChallengeView itemInviteChallengeView, View view) {
        itemInviteChallengeView.f25795a = (ItemInviteChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteChallengeView.f25796b = (VLinear) viewGroup.getChildAt(0);
        itemInviteChallengeView.f25797c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemInviteChallengeView.f25798d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemInviteChallengeView.f25799e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemInviteChallengeView.f25800f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
