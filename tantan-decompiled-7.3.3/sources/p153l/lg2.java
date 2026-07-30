package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzCircleCountdownView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lg2 {
    /* JADX INFO: renamed from: a */
    public static void m154057a(kg2 kg2Var, View view) {
        kg2Var._search_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kg2Var._stop_search = (VImage) viewGroup.getChildAt(0);
        kg2Var._buzz_search_anim = (VDraweeView) viewGroup.getChildAt(1);
        kg2Var._process_circle = (BuzzCircleCountdownView) viewGroup.getChildAt(2);
        kg2Var._search_peer_avatar = (VDraweeView) viewGroup.getChildAt(3);
        kg2Var._bundle_anim = (SVGAnimationView) viewGroup.getChildAt(4);
        kg2Var._vb_peer_name = (VText) viewGroup.getChildAt(5);
        kg2Var._vb_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        kg2Var._peer_region = (VImage) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        kg2Var._connect_anim = (SVGAnimationView) viewGroup.getChildAt(7);
        kg2Var._refuse_buzz = (VText) viewGroup.getChildAt(8);
        kg2Var._accept_buzz = (VText) viewGroup.getChildAt(9);
        kg2Var._buzz_marquee = (ViewStub) viewGroup.getChildAt(10);
        kg2Var._search_buzz_desc = (VText) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m154058b(kg2 kg2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136467b, viewGroup, false);
        m154057a(kg2Var, viewInflate);
        return viewInflate;
    }
}
