package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ht80 {
    /* JADX INFO: renamed from: a */
    public static void m7072a(PrivilegeCard privilegeCard, View view) {
        privilegeCard.d = (PrivilegeCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeCard.e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeCard.f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeCard.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privilegeCard.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeCard.i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeCard.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegeCard.k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegeCard.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        privilegeCard.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeCard.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        privilegeCard.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        privilegeCard.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        privilegeCard.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        privilegeCard.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        privilegeCard.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        privilegeCard.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        privilegeCard.u = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeCard.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
