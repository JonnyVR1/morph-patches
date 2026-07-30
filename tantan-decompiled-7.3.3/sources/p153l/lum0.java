package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzFlowTagsView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lum0 {
    /* JADX INFO: renamed from: a */
    public static void m155948a(kum0 kum0Var, View view) {
        kum0Var._voice_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kum0Var._vb_report = (VImage) viewGroup.getChildAt(0);
        kum0Var._vb_zoom = (VImage) viewGroup.getChildAt(1);
        kum0Var._vb_svg_bg = (SVGAnimationView) viewGroup.getChildAt(2);
        kum0Var._vb_peer_avatar = (VDraweeView) viewGroup.getChildAt(3);
        kum0Var._vb_peer_name = (VText) viewGroup.getChildAt(4);
        kum0Var._vb_peer_info = (VText) viewGroup.getChildAt(5);
        kum0Var._vb_peer_region = (VText) viewGroup.getChildAt(6);
        kum0Var._vb_mee_avatar = (VDraweeView) viewGroup.getChildAt(7);
        kum0Var._vb_me_name = (VText) viewGroup.getChildAt(8);
        kum0Var._vb_peer_tag_root = (VLinear) viewGroup.getChildAt(9);
        kum0Var._vb_peer_tag_root_vb_tag = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        kum0Var._vb_peer_tag_root_tags = (BuzzFlowTagsView) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        kum0Var._vb_desc = (VText) viewGroup.getChildAt(10);
        kum0Var._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(11);
        kum0Var._progress_root = (FrameLayout) viewGroup.getChildAt(12);
        kum0Var._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        kum0Var._countdown_time = (VText) viewGroup.getChildAt(13);
        kum0Var._vb_control = (VoiceBuzzCallControlView) viewGroup.getChildAt(14);
    }

    /* JADX INFO: renamed from: b */
    public static View m155949b(kum0 kum0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136465H, viewGroup, false);
        m155948a(kum0Var, viewInflate);
        return viewInflate;
    }
}
