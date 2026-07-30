package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.AudioMatchPrivilegeView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class nb1 {
    /* JADX INFO: renamed from: a */
    public static void m162108a(AudioMatchPrivilegeView audioMatchPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioMatchPrivilegeView.f35843d = (SVGAnimationView) viewGroup.getChildAt(0);
        audioMatchPrivilegeView.f35844e = (Guideline) viewGroup.getChildAt(1);
        audioMatchPrivilegeView.f35845f = (Guideline) viewGroup.getChildAt(2);
        audioMatchPrivilegeView.f35846g = (FrameLayout) viewGroup.getChildAt(3);
        audioMatchPrivilegeView.f35847h = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        audioMatchPrivilegeView.f35848i = (FrameLayout) viewGroup.getChildAt(4);
        audioMatchPrivilegeView.f35849j = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        audioMatchPrivilegeView.f35850k = (VLinear) viewGroup.getChildAt(5);
        audioMatchPrivilegeView.f35851l = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        audioMatchPrivilegeView.f35852m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
