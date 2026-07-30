package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePrivilegeVoiceView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mgb0 {
    /* JADX INFO: renamed from: a */
    public static void m158189a(PurchasePrivilegeVoiceView purchasePrivilegeVoiceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchasePrivilegeVoiceView._voice_bg_anim = (SVGAnimationView) viewGroup.getChildAt(0);
        purchasePrivilegeVoiceView._guideline_l = (Guideline) viewGroup.getChildAt(1);
        purchasePrivilegeVoiceView._guideline_r = (Guideline) viewGroup.getChildAt(2);
        purchasePrivilegeVoiceView._avatar_left_container = (FrameLayout) viewGroup.getChildAt(3);
        purchasePrivilegeVoiceView._avatar_left = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        purchasePrivilegeVoiceView._avatar_right_container = (FrameLayout) viewGroup.getChildAt(4);
        purchasePrivilegeVoiceView._avatar_right = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        purchasePrivilegeVoiceView._voice_anim_container = (VLinear) viewGroup.getChildAt(5);
        purchasePrivilegeVoiceView._voice_anim_ic = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        purchasePrivilegeVoiceView._voice_anim = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
