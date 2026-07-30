package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hti0 {
    /* JADX INFO: renamed from: a */
    public static void m132867a(gti0 gti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gti0Var._boost_container = (FrameLayout) viewGroup.getChildAt(0);
        gti0Var._fl_boost_anim = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gti0Var._fl_boost_anim_round = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gti0Var._fl_boost_anim_status = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        gti0Var._boost_svga_particle = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gti0Var._boost_svga = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        gti0Var._user_image = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        gti0Var._boost_odiamond_svga = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m132868b(gti0 gti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121317M1, viewGroup, true);
        m132867a(gti0Var, viewInflate);
        return viewInflate;
    }
}
