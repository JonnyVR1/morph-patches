package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class d740 {
    /* JADX INFO: renamed from: a */
    public static void m6079a(NewPrivilegeCard newPrivilegeCard, View view) {
        newPrivilegeCard.d = (NewPrivilegeCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPrivilegeCard.e = viewGroup.getChildAt(0);
        newPrivilegeCard.f = viewGroup.getChildAt(1);
        newPrivilegeCard.g = viewGroup.getChildAt(2);
        newPrivilegeCard.h = (FrameLayout) viewGroup.getChildAt(3);
        newPrivilegeCard.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newPrivilegeCard.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        newPrivilegeCard.k = viewGroup.getChildAt(4);
        newPrivilegeCard.l = viewGroup.getChildAt(5);
        newPrivilegeCard.m = viewGroup.getChildAt(6);
        newPrivilegeCard.n = viewGroup.getChildAt(7);
    }
}
