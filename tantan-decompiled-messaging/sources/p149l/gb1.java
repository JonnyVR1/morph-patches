package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.AudioMatchPrivilegeView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class gb1 {
    /* JADX INFO: renamed from: a */
    public static void m125113a(AudioMatchPrivilegeView audioMatchPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioMatchPrivilegeView.f34995d = (SVGAnimationView) viewGroup.getChildAt(0);
        audioMatchPrivilegeView.f34996e = (Guideline) viewGroup.getChildAt(1);
        audioMatchPrivilegeView.f34997f = (Guideline) viewGroup.getChildAt(2);
        audioMatchPrivilegeView.f34998g = (FrameLayout) viewGroup.getChildAt(3);
        audioMatchPrivilegeView.f34999h = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        audioMatchPrivilegeView.f35000i = (FrameLayout) viewGroup.getChildAt(4);
        audioMatchPrivilegeView.f35001j = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        audioMatchPrivilegeView.f35002k = (VLinear) viewGroup.getChildAt(5);
        audioMatchPrivilegeView.f35003l = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        audioMatchPrivilegeView.f35004m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
