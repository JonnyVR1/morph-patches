package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemInviteChallengeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c5q {
    /* JADX INFO: renamed from: a */
    public static void m5864a(ItemInviteChallengeView itemInviteChallengeView, View view) {
        itemInviteChallengeView.a = (ItemInviteChallengeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteChallengeView.b = viewGroup.getChildAt(0);
        itemInviteChallengeView.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemInviteChallengeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemInviteChallengeView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemInviteChallengeView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
