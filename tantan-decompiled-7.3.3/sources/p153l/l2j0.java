package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l2j0 {
    /* JADX INFO: renamed from: a */
    public static void m152624a(k2j0 k2j0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k2j0Var._boost_container = (FrameLayout) viewGroup.getChildAt(0);
        k2j0Var._fl_boost_anim = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        k2j0Var._fl_boost_anim_round = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        k2j0Var._fl_boost_anim_status = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        k2j0Var._boost_svga_particle = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        k2j0Var._boost_svga = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        k2j0Var._user_image = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        k2j0Var._boost_odiamond_svga = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m152625b(k2j0 k2j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151925M1, viewGroup, true);
        m152624a(k2j0Var, viewInflate);
        return viewInflate;
    }
}
