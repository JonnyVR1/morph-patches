package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeCard;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l190 {
    /* JADX INFO: renamed from: a */
    public static void m152466a(PrivilegeCard privilegeCard, View view) {
        privilegeCard.f38297d = (PrivilegeCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeCard.f38298e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeCard.f38299f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeCard.f38300g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privilegeCard.f38301h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeCard.f38302i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeCard.f38303j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegeCard.f38304k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegeCard.f38305l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        privilegeCard.f38306m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeCard.f38307n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        privilegeCard.f38308o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        privilegeCard.f38309p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        privilegeCard.f38310q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        privilegeCard.f38311r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        privilegeCard.f38312s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
        privilegeCard.f38313t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(2);
        privilegeCard.f38314u = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeCard.f38315v = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
