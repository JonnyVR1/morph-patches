package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view.VoiceBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzFlowTagsView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hlm0 {
    /* JADX INFO: renamed from: a */
    public static void m131677a(glm0 glm0Var, View view) {
        glm0Var._voice_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        glm0Var._vb_report = (VImage) viewGroup.getChildAt(0);
        glm0Var._vb_zoom = (VImage) viewGroup.getChildAt(1);
        glm0Var._vb_svg_bg = (SVGAnimationView) viewGroup.getChildAt(2);
        glm0Var._vb_peer_avatar = (VDraweeView) viewGroup.getChildAt(3);
        glm0Var._vb_peer_name = (VText) viewGroup.getChildAt(4);
        glm0Var._vb_peer_info = (VText) viewGroup.getChildAt(5);
        glm0Var._vb_peer_region = (VText) viewGroup.getChildAt(6);
        glm0Var._vb_mee_avatar = (VDraweeView) viewGroup.getChildAt(7);
        glm0Var._vb_me_name = (VText) viewGroup.getChildAt(8);
        glm0Var._vb_peer_tag_root = (VLinear) viewGroup.getChildAt(9);
        glm0Var._vb_peer_tag_root_vb_tag = (VText) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        glm0Var._vb_peer_tag_root_tags = (BuzzFlowTagsView) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
        glm0Var._vb_desc = (VText) viewGroup.getChildAt(10);
        glm0Var._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(11);
        glm0Var._progress_root = (FrameLayout) viewGroup.getChildAt(12);
        glm0Var._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
        glm0Var._countdown_time = (VText) viewGroup.getChildAt(13);
        glm0Var._vb_control = (VoiceBuzzCallControlView) viewGroup.getChildAt(14);
    }

    /* JADX INFO: renamed from: b */
    public static View m131678b(glm0 glm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106023H, viewGroup, false);
        m131677a(glm0Var, viewInflate);
        return viewInflate;
    }
}
