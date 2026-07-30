package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzCircleCountdownView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eg2 {
    /* JADX INFO: renamed from: a */
    public static void m116116a(dg2 dg2Var, View view) {
        dg2Var._search_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dg2Var._stop_search = (VImage) viewGroup.getChildAt(0);
        dg2Var._buzz_search_anim = (VDraweeView) viewGroup.getChildAt(1);
        dg2Var._process_circle = (BuzzCircleCountdownView) viewGroup.getChildAt(2);
        dg2Var._search_peer_avatar = (VDraweeView) viewGroup.getChildAt(3);
        dg2Var._bundle_anim = (SVGAnimationView) viewGroup.getChildAt(4);
        dg2Var._vb_peer_name = (VText) viewGroup.getChildAt(5);
        dg2Var._vb_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        dg2Var._peer_region = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        dg2Var._connect_anim = (SVGAnimationView) viewGroup.getChildAt(7);
        dg2Var._refuse_buzz = (VText) viewGroup.getChildAt(8);
        dg2Var._accept_buzz = (VText) viewGroup.getChildAt(9);
        dg2Var._buzz_marquee = (ViewStub) viewGroup.getChildAt(10);
        dg2Var._search_buzz_desc = (VText) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m116117b(dg2 dg2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106025b, viewGroup, false);
        m116116a(dg2Var, viewInflate);
        return viewInflate;
    }
}
