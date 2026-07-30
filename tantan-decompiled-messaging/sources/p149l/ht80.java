package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeCard;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ht80 {
    /* JADX INFO: renamed from: a */
    public static void m132861a(PrivilegeCard privilegeCard, View view) {
        privilegeCard.f37449d = (PrivilegeCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeCard.f37450e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeCard.f37451f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeCard.f37452g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privilegeCard.f37453h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeCard.f37454i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeCard.f37455j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegeCard.f37456k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegeCard.f37457l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        privilegeCard.f37458m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeCard.f37459n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        privilegeCard.f37460o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        privilegeCard.f37461p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        privilegeCard.f37462q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        privilegeCard.f37463r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        privilegeCard.f37464s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        privilegeCard.f37465t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        privilegeCard.f37466u = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeCard.f37467v = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
